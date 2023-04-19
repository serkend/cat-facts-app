package com.cat_info_about.random_facts.ui.navigation

sealed class Screen(val route: String) {
    object RandomFactsScreen : Screen("RandomFactsScreen")
    object SavedFactsScreen : Screen("SavedFactsScreen")
}