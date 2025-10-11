package com.example.mycompose.component

import android.annotation.SuppressLint
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
import androidx.compose.ui.Modifier
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
    Column(modifier = Modifier) {
        AsyncImage(
            model = item.imageUrl, contentDescription = item.title,
            modifier = Modifier
                .aspectRatio(item.aspectRatio)
                .fillMaxWidth()
        )
        Text(
            text = item.title, modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        )
    }
}

fun getWaterFallItems(): List<WaterfallItem> {
    val dataList = mutableListOf<WaterfallItem>().apply {
        repeat(1000) {
            val url = "https://picsum.photos/${Random.nextInt(200, 300)}/${Random.nextInt(200, 700)}?random=${it + 2}"
            add(
                WaterfallItem(
                    id = it, title = "Item $it",
                    imageUrl = url, aspectRatio = 1f
                )
            )
        }
    }

    return dataList
}
