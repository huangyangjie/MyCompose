package com.example.mycompose.screens

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.mycompose.navigation.Routes
import com.example.mycompose.ui.theme.Pink80
import com.example.mycompose.viewmodels.SharedViewModel
import kotlinx.coroutines.launch

@Composable
fun HomeScreen(navController: NavHostController) {
    val snackbarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()
    val viewModel: SharedViewModel = hiltViewModel()
    var isDarkTheme by rememberSaveable { mutableStateOf(false) }
    Scaffold(
        snackbarHost = {
            SnackbarHost(hostState = snackbarHostState)
        }) { padding ->
        Row(modifier = Modifier.padding(padding)) {
            Column(
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.background)
                    .fillMaxWidth(0.5f),
                verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally
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
                    onClick = {
                        scope.launch { snackbarHostState.showSnackbar("这是一条消息") }
                    },
                ) {
                    Text("弹出snackbar")
                }
                Button(
                    onClick = {
                        viewModel.userModule.num++
                    }) {
                    Text("userModule ${viewModel.userModule.num}")
                }
                Button(onClick = {
                    Log.e("HomeScreen", "isDarkTheme: $isDarkTheme")
                    isDarkTheme = !isDarkTheme
                }) {
                    Text("修改主题", color = Pink80)
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
            }
            LazyColumn(modifier = Modifier.fillMaxWidth(0.5F)) {
                items(viewModel.bannerList.size, key = { index ->
                    viewModel.bannerList[index].id
                }) { item ->
                    Text(text = viewModel.bannerList[item].name)
                }
            }
        }
    }
}