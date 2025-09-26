package com.example.mycompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.mycompose.navigation.AppNavHost
import com.example.mycompose.ui.theme.MyComposeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var isDarkTheme by rememberSaveable { mutableStateOf(false) }
            MyComposeTheme (darkTheme=isDarkTheme){
                val navController = rememberNavController();
                AppNavHost(navController, Modifier)
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyComposeTheme {
        val navController = rememberNavController();
        AppNavHost(navController, Modifier)
    }
}