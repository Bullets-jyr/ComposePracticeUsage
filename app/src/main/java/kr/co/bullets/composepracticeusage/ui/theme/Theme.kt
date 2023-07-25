package kr.co.bullets.composepracticeusage.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import kr.co.bullets.composepracticeusage.ui.theme.color.*

//private val DarkColorPalette = darkColors(
//    primary = Purple200,
//    primaryVariant = Purple700,
//    secondary = Teal200
//)
//
//private val LightColorPalette = lightColors(
//    primary = Purple500,
//    primaryVariant = Purple700,
//    secondary = Teal200
//
//    /* Other default colors to override
//    background = Color.White,
//    surface = Color.White,
//    onPrimary = Color.White,
//    onSecondary = Color.Black,
//    onBackground = Color.Black,
//    onSurface = Color.Black,
//    */
//)

private val LocalColors = staticCompositionLocalOf { ColorSet.Red.LightColors }

@Composable
fun ComposePracticeUsageTheme(
    myColors: ColorSet = ColorSet.Red,
    typography: Typography = Typography,
    shapes: Shapes = Shapes,
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
//        DarkColorPalette
        myColors.DarkColors
    } else {
//        LightColorPalette
        myColors.LightColors
    }

    CompositionLocalProvider(LocalColors provides colors) {
        MaterialTheme(
            colors = colors.material,
            typography = typography,
            shapes = shapes,
            content = content
        )
    }
}