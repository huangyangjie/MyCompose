package com.example.mycompose.screens

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.mycompose.component.TopView
import com.example.mycompose.navigation.Routes
import com.example.mycompose.viewmodels.SharedViewModel
import kotlinx.coroutines.launch

@Composable
fun ProfileScreen(
    navController: NavHostController, query: String? = null, page: String? = null
) {
    val viewModel: SharedViewModel = hiltViewModel()
    val scope = rememberCoroutineScope()

    Scaffold(topBar = {
        TopView("个人中心") {
            navController.popBackStack()
        }
    }) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues), verticalArrangement = Arrangement.Center
        ) {
            Text("query: $query")
            Text("page: $page")
            Text("个人中心${viewModel.count}", style = MaterialTheme.typography.titleLarge)
            Spacer(modifier = Modifier.height(24.dp))
            Button(
                onClick = {
                    viewModel.count++
                }) {
                Text("count添加")
            }
            Button(
                onClick = {
                    val age = navController.previousBackStackEntry?.savedStateHandle?.get<String>("age")
                    Log.e("previousBackStackEntry:", "ProfileScreen age:$age")
                    navController.previousBackStackEntry?.savedStateHandle?.set("new_age", "180")
                    navController.popBackStack()
                }) {
                Text("返回上一个页面")
            }
            Button(
                onClick = {
                    navController.popBackStack(Routes.Home.path, inclusive = false)
                }) {
                Text("返回首页")
            }
            Button(
                onClick = {
                    scope.launch {
                        viewModel.userModule.add()
                    }
                }) {
                Text("userModule ${viewModel.userModule.getNumData()}")
            }
        }
    }

}