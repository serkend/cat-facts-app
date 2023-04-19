package com.cat_info_about.random_facts.ui.navigation

import androidx.compose.material.ScaffoldState
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.cat_info_about.random_facts.ui.screens.cat_facts_screen.RandomFactsScreen
import com.cat_info_about.random_facts.ui.screens.cat_facts_screen.viewmodels.CatFactsViewModel
import com.cat_info_about.random_facts.ui.screens.saved_facts_screen.SavedFactsScreen
import com.cat_info_about.random_facts.ui.screens.saved_facts_screen.viewmodels.SavedCatFactsViewModel

@Composable
fun Navigation(
    navController: NavHostController,
    startDestination: String = Screen.RandomFactsScreen.route,
    scaffoldState: ScaffoldState
) {
    val viewModel: CatFactsViewModel = hiltViewModel()
    val savedViewModel: SavedCatFactsViewModel = hiltViewModel()

    NavHost(navController = navController, startDestination = startDestination) {
        composable(Screen.RandomFactsScreen.route) {
            RandomFactsScreen(
                scaffoldState = scaffoldState,
                viewModel = viewModel
            )
        }
        composable(Screen.SavedFactsScreen.route) {
            SavedFactsScreen(
                scaffoldState = scaffoldState,
                viewModel = savedViewModel
            )
        }
    }
}