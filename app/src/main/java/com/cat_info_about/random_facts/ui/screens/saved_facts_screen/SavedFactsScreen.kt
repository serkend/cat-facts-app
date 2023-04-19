package com.cat_info_about.random_facts.ui.screens.saved_facts_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.cat_info_about.random_facts.R
import com.cat_info_about.random_facts.data.database.model.CatFactEntity
import com.cat_info_about.random_facts.ui.components.NetworkErrorSnackbar
import com.cat_info_about.random_facts.ui.screens.saved_facts_screen.states.SavedCatFactsState
import com.cat_info_about.random_facts.ui.screens.saved_facts_screen.viewmodels.SavedCatFactsViewModel
import com.cat_info_about.random_facts.ui.theme.BlueBackground

@Composable
fun SavedFactsScreen(
    scaffoldState: ScaffoldState,
    viewModel: SavedCatFactsViewModel
) {
    when (val uiState = viewModel.uiStateFlow.collectAsState().value) {
        is SavedCatFactsState.Success -> {
            SavedFactsContent(uiState.data, viewModel)
        }
        is SavedCatFactsState.Error -> {
            NetworkErrorSnackbar(scaffoldState = scaffoldState)
        }
        SavedCatFactsState.Loading -> {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator(modifier = Modifier.size(64.dp), color = BlueBackground)
            }
        }
    }
}

@Composable
fun SavedFactsContent(
    facts: List<CatFactEntity>,
    viewModel: SavedCatFactsViewModel
) {
    if (facts.isEmpty()) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text(
                text = stringResource(R.string.empty),
                color = Color.Gray,
                style = MaterialTheme.typography.h1
            )
        }
    } else {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.background),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            itemsIndexed(facts) { index, item ->
                SavedCatCardItem(index + 1, item, viewModel)
            }
        }
    }
}

@Composable
fun SavedCatCardItem(factNum: Int, fact: CatFactEntity, viewModel: SavedCatFactsViewModel) {
    Card(
        modifier = Modifier.padding(start = 12.dp, end = 12.dp, bottom = 6.dp, top = 6.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = stringResource(id = R.string.fact_num, factNum),
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(BlueBackground)
                    .padding(12.dp),
                style = MaterialTheme.typography.h1
            )
            Text(
                text = fact.text,
                color = MaterialTheme.colors.onSurface,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colors.surface)
                    .padding(18.dp)
            )
            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 12.dp)
            )
            IconButton(
                onClick = { viewModel.deleteFact(fact) },
                modifier = Modifier.align(Alignment.End)
            ) {
                Icon(
                    imageVector = Icons.Outlined.Favorite,
                    tint = Color.Red,
                    contentDescription = stringResource(id = R.string.add_to_favorite)
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}
