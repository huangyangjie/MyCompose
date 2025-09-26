package com.example.mycompose.extended

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.FirstBaseline
import androidx.compose.ui.layout.layout
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.mycompose.ui.theme.MyComposeTheme

@SuppressLint("SuspiciousModifierThen")
fun Modifier.firstBaseLineToTop(
    firstBaseLineToTop: Dp
) = this.then(
    layout { measurable, constraints ->
        val placeable = measurable.measure(constraints)
        val firstBaseLine = placeable[FirstBaseline]

        val y = firstBaseLineToTop.roundToPx() - firstBaseLine
        val height = placeable.height + y
        layout(placeable.width, height) {
            placeable.placeRelative(0, y)
        }
    });

@Composable
fun TextWithPaddingToBaseline() {
    MyComposeTheme {
        Text(
            "firstBaseLineToTop", modifier = Modifier
                .fillMaxWidth()
                .firstBaseLineToTop(90.dp)
                .background(Color.Red),
            textAlign = TextAlign.Center
        )
    }
}