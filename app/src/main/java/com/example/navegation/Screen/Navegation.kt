package com.example.navegation.Screen






import androidx.compose.runtime.*
import androidx.compose.runtime.Composable
import androidx.navigation.compose.*


@Composable
fun Navegacion() {
    val navController = rememberNavController()
    val userList = remember { mutableStateListOf<Dato>() }

    NavHost(navController = navController, startDestination = "screen_a") {
        composable("screen_a") {
            ScreenA(navController, userList)
        }
        composable("screen_b") {
            ScreenB(navController, userList)
        }
    }
}
