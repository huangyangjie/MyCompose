package com.example.mycompose.component

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import kotlin.random.Random

data class WaterfallItem(
    val id: Int, val title: String, val imageUrl: String, val aspectRatio: Float // 宽高比（宽度/高度）
)

@SuppressLint("ConfigurationScreenWidthHeight")
@Composable
fun WaterFall() {
    val screenWidth = LocalConfiguration.current.screenWidthDp
    val columnCount by remember {
        derivedStateOf {
            when (screenWidth) {
                in 0..600 -> 2
                in 601..1000 -> 3
                else -> 4
            }
        }
    }
    val items = remember { getWaterFallItems() }
    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Fixed(columnCount),
        modifier = Modifier.fillMaxSize(),
    ) {
        items(items.size) { index ->
            WaterfallGridItem(item = items[index])
        }
    }
}

@Composable
fun WaterfallGridItem(item: WaterfallItem) {
    Box(modifier = Modifier) {
        AsyncImage(
            model = item.imageUrl,
            contentDescription = item.title,
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(item.aspectRatio) // 只应用一次
        )
        Text(
            text = item.title,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White.copy(alpha = 0.5f))
                .align(Alignment.BottomEnd)
                .padding(10.dp)
        )
    }
}


fun getWaterFallItems(): List<WaterfallItem> {
    val dataList = mutableListOf<WaterfallItem>().apply {
        repeat(1000) {
            // 生成更随机的宽高比，创造不同高度的效果
            val width = Random.nextInt(200, 400)
            val height = Random.nextInt(200, 600)
            val aspectRatio = width.toFloat() / height.toFloat()
            val url = "https://picsum.photos/${width}/${height}?random=${it + 2}"
            add(
                WaterfallItem(
                    id = it, title = "Item $it", imageUrl = url, aspectRatio = aspectRatio
                )
            )
        }
    }

    return dataList
}
