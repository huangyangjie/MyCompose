package com.example.mycompose.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


@Composable
fun StaggeredGrid(
    modifier: Modifier = Modifier
) {
    Chip(modifier,"1")
    Chip(modifier,"1")
    Chip(modifier,"1")
    Chip(modifier,"1")
    Chip(modifier,"1")
    Chip(modifier,"1")
    Chip(modifier,"1")
    Chip(modifier,"1")
    Chip(modifier,"1")
    Chip(modifier,"1")
    Chip(modifier,"1")
    Chip(modifier,"1")
    Chip(modifier,"1")
    Chip(modifier,"1")
    Chip(modifier,"1")
    Chip(modifier,"1")
    Chip(modifier,"1")
    Chip(modifier,"1")
    Chip(modifier,"1")
    Chip(modifier,"1")
    Chip(modifier,"1")
    Chip(modifier,"1")
    Chip(modifier,"1")
    Chip(modifier,"1")
    Chip(modifier,"1")
}

@Composable
fun Chip(
    modifier: Modifier = Modifier, text: String
) {
    Card(modifier = modifier, border = BorderStroke(color = Color.Black, width = Dp.Hairline), shape = RoundedCornerShape(8.dp)) {
        Row (modifier = Modifier.padding(start = 8.dp, top = 4.dp, end = 8.dp, bottom = 4.dp), verticalAlignment = Alignment.CenterVertically){
            Box(modifier= Modifier.size(16.dp,16.dp).background(color = MaterialTheme.colorScheme.secondary))
            Spacer(modifier= Modifier.width(4.dp))
            Text(text = text)
        }
    }
}