package com.example.mycompose.component

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Layout
import com.example.mycompose.ui.theme.MyComposeTheme

@Composable
fun MyOwnColumn (
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
){
    Layout (modifier= modifier, content = content){ measures, constraints ->
       val placeables = measures.map{
            it.measure(constraints)
        }
        var yPosition = 0
        layout(constraints.maxWidth,constraints.maxHeight){
            placeables.forEach { it->
                it.placeRelative(x = 0, y = yPosition)
                yPosition += it.height
            }
        }
    }
}

@Composable
fun MyOwnColumnView (modifier: Modifier = Modifier){
    MyComposeTheme {
        MyOwnColumn(modifier) {
            Text("MyOwnColumn")
            Text("MyOwnColumn1")
            Text("MyOwnColumn12")
            Text("MyOwnColumn123")
            Text("MyOwnColumn1234")
        }
    }
}