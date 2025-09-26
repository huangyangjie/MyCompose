package com.example.mycompose.screens

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.mycompose.component.CustomView
import com.example.mycompose.component.TopView
import com.example.mycompose.navigation.Routes
import com.example.mycompose.viewmodels.SharedViewModel


@SuppressLint("UnrememberedMutableState")
@Composable
fun DetailScreen(
    navController: NavHostController
) {
    var show by mutableStateOf(false)
    val viewModel: SharedViewModel = hiltViewModel()
    val user = requireNotNull(navController.currentBackStackEntry?.arguments?.getString("user"))
    val age = requireNotNull(navController.currentBackStackEntry?.arguments?.getString("age"))
    val birthday = requireNotNull(navController.currentBackStackEntry?.arguments?.getString("birthday"))



    LaunchedEffect(user, age, birthday) {
        Log.e("ProfileScreen", "LaunchedEffect Received params: user=$user, age=$age, birthday=$birthday")
        navController.currentBackStackEntry?.savedStateHandle?.getStateFlow("new_age", "")?.collect {
            Log.e("ProfileScreen", "返回的结果 Received params: new_age=$it")
            navController.currentBackStackEntry?.savedStateHandle?.remove<String>("new_age")
        }
    }
    DisposableEffect(Unit) {
        Log.e("DisposableEffect", "DisposableEffect DetailScreen----------------")
        onDispose {
            Log.e("DisposableEffect", "DetailScreen onDispose")
        }
    }
    SideEffect {
        Log.e("SideEffect", "common DetailScreen----------------")
    }


    Scaffold(
        topBar = {
            TopView(title = "详情", onBack = {
                navController.popBackStack()
            })
        }) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding), verticalArrangement = Arrangement.Center
        ) {
            if (show) {
                CustomView()
            }
            Text("用户: $user")
            Text("年龄: $age")
            Text("生日: $birthday")
            Text("详情页${viewModel.count}")
            Spacer(modifier = Modifier.height(24.dp))
            Button(
                onClick = {

                }) {
                Text("返回首页")
            }
            Button(onClick = {
                viewModel.count++
            }) {
                Text("添加")
            }
            Button(
                onClick = {
                    navController.navigate("${Routes.Profile.path}?query=android&page=12")
                }) {
                Text("去关于页面")
            }
            Button(
                onClick = {
                    viewModel.userModule.num++
                }) {
                Text("userModule ${viewModel.userModule.num}")
            }
            Button(
                onClick = {
                    show = !show
                }) {
                Text("show customsView")
            }
        }
    }
}