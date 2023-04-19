package com.cat_info_about.random_facts

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.cat_info_about.random_facts.data.network.model.CatFactModel
import com.cat_info_about.random_facts.ui.navigation.Navigation
import com.cat_info_about.random_facts.ui.navigation.Screen
import com.cat_info_about.random_facts.ui.screens.cat_facts_screen.CatCardItem
import com.cat_info_about.random_facts.ui.screens.cat_facts_screen.viewmodels.CatFactsViewModel
import com.cat_info_about.random_facts.ui.theme.BlueBackground
import kotlinx.coroutines.launch

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()
    val navController = rememberNavController()
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(BlueBackground)
                    .padding(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = { coroutineScope.launch { scaffoldState.drawerState.open() } }) {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_menu_24),
                        contentDescription = ""
                    )
                }
                Text(text = "Facts about cats", style = MaterialTheme.typography.h1)
            }
        },
        drawerContent = {
            DrawerBody(navController = navController) {
                coroutineScope.launch { scaffoldState.drawerState.close() }
            }
        }
        ,
        drawerGesturesEnabled = true,
    ) {
        Navigation(navController = navController, scaffoldState = scaffoldState)
    }
}

@Composable
fun DrawerHeader(imageDrawableId: Int) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 22.dp),
        horizontalArrangement = Arrangement.Center,
    ) {
        Image(
            painter = painterResource(id = imageDrawableId), contentDescription = "",
            modifier = Modifier
                .size(164.dp)
                .clip(CircleShape), contentScale = ContentScale.Crop
        )
    }
}

@Composable
private fun DrawerMenuItem(
    iconDrawableId: Int,
    text: String,
    onItemClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onItemClick() }
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(
            painter = painterResource(iconDrawableId),
            contentDescription = null,
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(text = text)
    }
}

@Composable
fun DrawerBody(navController: NavController, closeNavDrawer: () -> Unit) {
    Column {
        DrawerHeader(R.drawable.cat_img)
        DrawerMenuItem(
            iconDrawableId = R.drawable.baseline_home_24,
            text = "Home",
            onItemClick = {
                navController.navigate(Screen.RandomFactsScreen.route)
                closeNavDrawer()
            }
        )
        DrawerMenuItem(
            iconDrawableId = R.drawable.baseline_favorite_24,
            text = "Saved",
            onItemClick = {
                navController.navigate(Screen.SavedFactsScreen.route)
                closeNavDrawer()
            }
        )
    }
}
