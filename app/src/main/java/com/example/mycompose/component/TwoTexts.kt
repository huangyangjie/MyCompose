package com.example.mycompose.component

import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun TwoTexts(modifier: Modifier = Modifier) {
    Row(modifier = modifier.height(IntrinsicSize.Min).wrapContentHeight(Alignment.Top)) {
        Text(
            text = "Hello", modifier = Modifier
                .wrapContentWidth(Alignment.CenterHorizontally)
                .weight(2f)
        )
        VerticalDivider(modifier = Modifier.fillMaxHeight())
        Text(
            text = "no Hello", modifier = Modifier
                .wrapContentWidth(Alignment.CenterHorizontally)
                .weight(1f)
        )
    }


}