package com.cat_info_about.random_facts.ui.components

import androidx.compose.material.ScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.res.stringResource
import com.cat_info_about.random_facts.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun NetworkErrorSnackbar(scaffoldState: ScaffoldState) {
    val coroutineScope: CoroutineScope = rememberCoroutineScope()
    val checkInternet = stringResource(R.string.check_internet)
    LaunchedEffect(key1 = Unit) {
        coroutineScope.launch {
            scaffoldState.snackbarHostState.showSnackbar(
                message = checkInternet
            )
        }
    }
}