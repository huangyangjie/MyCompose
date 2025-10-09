package com.example.mycompose.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet

@Composable
fun MyConstraintLayout() {
    val show = true

    BoxWithConstraints(modifier = Modifier.fillMaxSize()){
        // 访问约束信息
        val maxWidth = this.maxWidth
        val maxHeight = this.maxHeight
        val minWidth = this.minWidth
        val minHeight = this.minHeight
        val constraints= this.constraints
        val constraintSet = createConstrantsSet(20.dp)
        ConstraintLayout(
            modifier = Modifier.width(maxHeight).height(maxHeight),
            constraintSet = constraintSet
        ) {
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .background(Color.Red)
                    .layoutId("box1")
            )

            Box(
                modifier = Modifier
                    .size(110.dp)
                    .background(Color.Green)
                    .layoutId("box2")
            )
            if (show) {
                Box(
                    modifier = Modifier
                        .size(120.dp)
                        .background(Color.Black)
                        .layoutId("box3")
                )
            }
        }
    }
}

private fun createConstrantsSet(margin: Dp): ConstraintSet {
    return ConstraintSet {
        val box1 = createRefFor("box1")
        val box2 = createRefFor("box2")
        val box3 = createRefFor("box3")
        constrain(box1) {
            top.linkTo(parent.top, margin = margin)
            end.linkTo(parent.end)
        }
        constrain(box2) {
            top.linkTo(box1.bottom)
        }
        constrain(box3) {
            top.linkTo(box2.bottom)
            bottom.linkTo(parent.bottom)
        }
    }
}