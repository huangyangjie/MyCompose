package com.example.mycompose.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.mycompose.utils.LogTools
import kotlin.math.max

val list = listOf(
    "你好",
    "德国",
    "斯洛文尼亚",
    "中国",
    "美利坚合众国",
    "查看各个访问量",
    "并将统计信息输出到/pv.html文件里面",
    "之保留30天的信息",
    "其他IP的403",
    "nginx",
    "将pv.sh加入定时任务",
    "最后",
    "你好",
    "!",
    "2222"
)

@Composable
fun StaggeredGrid(
    modifier: Modifier = Modifier, rows: Int = 3, content: @Composable () -> Unit
) {
    Layout(modifier = modifier, content = content) { measurables, constraints ->
        val rowWidths = IntArray(rows) { 0 }
        val rowHeights = IntArray(rows) { 0 }
        val placeables = measurables.mapIndexed { index, measurable ->
            val placeable = measurable.measure(constraints)
            val row = index % rows
            rowWidths[row] += placeable.width
            rowHeights[row] = max(rowHeights[row], placeable.height)
            placeable
        }
        val width = rowWidths.maxOrNull() ?: constraints.minWidth
        val height = rowHeights.sumOf { it }
        val rowY = IntArray(rows) { 0 }
        for (i in 1 until rows) {
            rowY[i] = rowY[i - 1] + rowHeights[i - 1]
        }
        LogTools.e("rowY1:${rowY[0]}")
        LogTools.e("rowY2:${rowY[1]}")
        LogTools.e("rowY3:${rowY[2]}")
        layout(width, height) {
            var rowX = IntArray(rows) { 0 }
            placeables.forEachIndexed { index, placeable ->
                var row = index % rows
                placeable.placeRelative(x = rowX[row], y = rowY[row])
                rowX[row] += placeable.width
            }
        }
    }
}

@Composable
fun Chip(
    modifier: Modifier = Modifier, text: String
) {
    Card(modifier = modifier, border = BorderStroke(color = Color.Black, width = Dp.Hairline), shape = RoundedCornerShape(8.dp)) {
        Row(modifier = Modifier.padding(start = 8.dp, top = 4.dp, end = 8.dp, bottom = 4.dp), verticalAlignment = Alignment.CenterVertically) {
            Box(
                modifier = Modifier
                    .size(16.dp, 16.dp)
                    .background(color = MaterialTheme.colorScheme.secondary)
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(text = text)
        }
    }
}

@Composable
fun StaggeredGridBodyContent(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .background(color = Color.LightGray)
            .padding(16.dp)
            .horizontalScroll(rememberScrollState())
    ) {
        StaggeredGrid(modifier = modifier) {
            for (item in list) {
                Chip(text = item, modifier = Modifier.padding(4.dp))
            }
        }

    }
}