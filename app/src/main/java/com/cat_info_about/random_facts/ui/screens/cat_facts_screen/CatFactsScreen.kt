package com.cat_info_about.random_facts.ui.screens.cat_facts_screen

import androidx.compose.animation.AnimatedContentScope.SlideDirection.Companion.End
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.cat_info_about.random_facts.R
import com.cat_info_about.random_facts.data.network.mapper.Mapper
import com.cat_info_about.random_facts.data.network.model.CatFactModel
import com.cat_info_about.random_facts.ui.components.NetworkErrorSnackbar
import com.cat_info_about.random_facts.ui.screens.cat_facts_screen.states.CatFactsState
import com.cat_info_about.random_facts.ui.screens.cat_facts_screen.viewmodels.CatFactsViewModel
import com.cat_info_about.random_facts.ui.theme.BlueBackground

@Composable
fun RandomFactsScreen(
    scaffoldState: ScaffoldState,
    viewModel: CatFactsViewModel
) {
    when (val uiState = viewModel.uiStateFlow.collectAsState().value) {
        is CatFactsState.Success -> {
            FactsContent(uiState.data, viewModel)
        }
        is CatFactsState.Error -> {
            NetworkErrorSnackbar(scaffoldState = scaffoldState)
        }
        CatFactsState.Loading -> {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                CircularProgressIndicator(modifier = Modifier.size(64.dp), color = BlueBackground)
            }
        }
    }
}

@Composable
fun FactsContent(
    facts: List<CatFactModel>,
    viewModel: CatFactsViewModel
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        itemsIndexed(facts) { index, item ->
            CatCardItem(index + 1, item, viewModel)
        }
    }
}

@Composable
fun CatCardItem(factNum: Int, fact: CatFactModel, viewModel: CatFactsViewModel) {
    var savedState by remember {
        mutableStateOf(viewModel.checkIfFactIsSaved(fact))
    }
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
                    .padding(top = 12.dp, bottom = 8.dp)
            )
            IconButton(
                onClick = {
                    if (!savedState) {
                        viewModel.insertFact(fact)
                    } else {
                        viewModel.deleteFact(fact)
                    }
                    savedState = !savedState
                },
                modifier = Modifier.align(Alignment.End)
            ) {
                Icon(
                    imageVector = if (savedState)
                        Icons.Filled.Favorite else Icons.Outlined.FavoriteBorder,
                    tint = Color.Red,
                    contentDescription = stringResource(R.string.add_to_favorite)
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}


