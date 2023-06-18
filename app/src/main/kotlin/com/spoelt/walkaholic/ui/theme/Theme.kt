package com.spoelt.walkaholic.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val DarkColorScheme = darkColorScheme(
    primary = PurplePristine,
    onPrimary = White,
    secondary = GoldenYellow,
    onSecondary = Black,
    tertiary = DeepSkyBlue,
    onTertiary = White,
    surface = Black,
    onSurface = White,
    background = Black,
    onBackground = White
)

private val LightColorScheme = lightColorScheme(
    primary = DarkPurple,
    onPrimary = White,
    secondary = Gold,
    onSecondary = Black,
    tertiary = SkyBlue,
    onTertiary = White,
    surface = White,
    onSurface = Black,
    background = White,
    onBackground = Black
)

@Composable
fun WalkaholicTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}