package com.example.kmpdemo

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import com.example.kmpdemo.ui.Day10Practice.SplashScreen
import com.example.kmpdemo.ui.miniShopingProject.ShoppingScreen

@Composable
@Preview(showSystemUi = true)
fun App() {
    MaterialTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .systemBarsPadding()
        ) {
            Navigator( SplashScreen()){
                    navigator ->
                SlideTransition(navigator)
            }
        }
    }
}






//enum class Screens{
//    Splash,
//    Login,
//    SignUp,
//    ShoppingScreen,
//    HomeScreen
//}