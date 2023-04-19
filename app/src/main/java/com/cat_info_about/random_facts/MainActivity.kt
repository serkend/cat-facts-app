package com.cat_info_about.random_facts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.rememberScaffoldState
import com.cat_info_about.random_facts.ui.navigation.Navigation
import com.cat_info_about.random_facts.ui.theme.RandomFactsAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RandomFactsAppTheme {
                MainScreen()
            }
        }
    }
}
