package com.example.mycompose.navigation

sealed class Routes(val path: String) {
    object Home : Routes("home")
    object Detail: Routes("detail")
    object Profile : Routes("profile")
}