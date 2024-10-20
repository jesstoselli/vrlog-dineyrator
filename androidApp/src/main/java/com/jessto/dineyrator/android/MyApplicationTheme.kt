package com.jessto.dineyrator.android

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyApplicationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val lightGreen = Color(0xFF1FA679)
    val green = Color(0xFF0E6F4F)
    val darkGreen = Color(0xFF073E2C)
    val chartreuse = Color(0xFFAFD041)
    val offWhite = Color(0xFFF7F7F7)
    val black = Color(0xFF1D1D1D)


    val typography = Typography(
        bodyMedium = TextStyle(
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp
        )
    )
    val shapes = Shapes(
        small = RoundedCornerShape(4.dp),
        medium = RoundedCornerShape(4.dp),
        large = RoundedCornerShape(0.dp)
    )

    MaterialTheme(
        colorScheme = lightColorScheme(
            primary = green,
            secondary = chartreuse,
            tertiary = lightGreen,
            onPrimary = offWhite,
            background = darkGreen,
            onBackground = black
        ),
        typography = typography,
        shapes = shapes,
        content = content
    )
}
