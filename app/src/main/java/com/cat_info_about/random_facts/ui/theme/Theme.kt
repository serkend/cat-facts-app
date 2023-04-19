package com.cat_info_about.random_facts.ui.theme

import android.annotation.SuppressLint
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController

private val DarkColorPalette = darkColors(
    primary = LightGreen,
    primaryVariant = LightGreen,
    secondary = Color.White,
    secondaryVariant = Color.White
)

@SuppressLint("ConflictingOnColor")
private val LightColorPalette = lightColors(
    primary = LightGreen,
    primaryVariant = LightGreen,
    secondary = Color.White,
    secondaryVariant = Color.White,
    background = LightGray,
    surface = Color.White,
    onSurface = Color.Black,
    onBackground = Color.White
)

@Composable
fun RandomFactsAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    val systemUiController = rememberSystemUiController()
    systemUiController.setStatusBarColor(BlueBackground)

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}