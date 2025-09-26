package com.example.mycompose.navigation

import android.R.attr.defaultValue
import android.R.attr.type
import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navDeepLink
import com.example.mycompose.screens.DetailScreen
import com.example.mycompose.screens.HomeScreen
import com.example.mycompose.screens.ProfileScreen

@Composable
fun AppNavHost(navController: NavHostController, modifier: Modifier) {
    NavHost(
        navController = navController, startDestination = Routes.Home.path, modifier = modifier
    ) {
        composable(Routes.Home.path) {
            HomeScreen(navController)
        }
        // 详情页（带参数）
        composable("${Routes.Detail.path}/{user}/{age}/{birthday}")  { backStackEntry ->
            DetailScreen(navController)
        }
        // 个人页（深层链接示例）
        composable(
            route = "${Routes.Profile.path}?query={query}&page={page}",
            deepLinks = listOf(navDeepLink { uriPattern = "app://profile" })
        ) { backStackEntry ->
            val query = backStackEntry.arguments?.getString("query")
            val page = backStackEntry.arguments?.getString("page")
            ProfileScreen(navController, query, page)
        }

    }
}