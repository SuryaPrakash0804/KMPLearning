package com.example.kmpdemo.ui.Day10Practice

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow

class HomeScreen(val name: String,val email: String): Screen {
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow

        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally){
            Text(text = "Welcome $name", modifier = Modifier.fillMaxWidth(), color = Color.Red)
            Text(text = "Email $email", modifier = Modifier.fillMaxWidth(), color = Color.Green)

            Button(onClick = {navigator.pop()}) {
                Text(text = "Back")
            }
        }

    }
}