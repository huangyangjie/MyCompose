package com.example.mycompose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavHostController
import com.example.mycompose.component.TopView
import com.example.mycompose.component.MyOwnColumnView
import com.example.mycompose.component.StaggeredGrid
import com.example.mycompose.navigation.Routes
import com.example.mycompose.viewmodels.SharedViewModel
import kotlinx.coroutines.launch

@Composable
fun HomeScreen(navController: NavHostController, viewModel: SharedViewModel = hiltViewModel()) {
    val snackbarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()
    val bannerList by viewModel.bannerFlow.collectAsState()
    val num by viewModel.userModule.numState.collectAsStateWithLifecycle(
        initialValue = viewModel.userModule.getNumData()
    )


    Scaffold(topBar = {
        TopView("首页") { }
    }, snackbarHost = {
        SnackbarHost(hostState = snackbarHostState)
    }, floatingActionButton = {
        IconButton(onClick = {
            scope.launch { snackbarHostState.showSnackbar("这是一条消息") }
        }) {
            Icon(imageVector = Icons.Default.Add, contentDescription = null)
        }
    }) { padding ->
        Row(modifier = Modifier.padding(padding)) {
            Column(
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.background)
                    .fillMaxWidth(0.5f), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("首页${viewModel.count}", style = MaterialTheme.typography.headlineMedium)
                Spacer(modifier = Modifier.height(16.dp))
                Button(
                    onClick = {
                        navController.navigate("${Routes.Detail.path}/John/25/2012-12-12")
                    },
                ) {
                    Text("查看详情", color = MaterialTheme.colorScheme.onTertiary)
                }
                Button(
                    onClick = {},
                ) {
                    Text("弹出snackbar")
                }
                Button(
                    onClick = {
                        scope.launch {
                            viewModel.userModule.add()
                        }
                    }) {
                    Text("userModule $num")
                }

                Surface(
                    color = Color.White,
                    shadowElevation = 8.dp,
                ) {
                    Text("Hello Surface")
                }
                Button(onClick = { viewModel.getBanner() }) {
                    Text("获取banner")
                }
//                MyOwnColumnView(modifier = Modifier.padding(20.dp))
                StaggeredGrid()
            }
            LazyColumn(modifier = Modifier.fillMaxWidth(0.5F)) {
                items(bannerList.size, key = { index ->
                    bannerList[index].id
                }) { item ->
                    Text(text = bannerList[item].name)
                }
            }


        }
    }
}