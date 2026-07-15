package com.example.kmpdemo.ui.Day10Practice

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import kmpdemo.app.shared.generated.resources.Res
import kmpdemo.app.shared.generated.resources.app_name
import kmpdemo.app.shared.generated.resources.splash_logo
import kmpdemo.app.shared.generated.resources.welcome
import kmpdemo.app.shared.generated.resources.woman
import kotlinx.coroutines.delay
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource





class SplashScreen: Screen {





    @Composable
    override fun Content() {

        val navigator = LocalNavigator.currentOrThrow

        LaunchedEffect(Unit) {
            delay(2000)
            navigator.replace(LoginScreen())
        }


        Column(modifier = Modifier.fillMaxSize().background(Color.White),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            val painter= painterResource((Res.drawable.woman))

            Box(modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center){

                Image(painter = painter,
                    contentDescription = null,
                    modifier = Modifier.fillMaxWidth()
                        .height(250.dp),
                    alignment = Alignment.Center
                )



            }

            Text(text = stringResource(Res.string.welcome),
                color = Color.Black,
            )

            Text(text= stringResource(Res.string.app_name),
                color = Color.Red,
            )



//        Column(modifier = Modifier.fillMaxWidth(),
//            horizontalAlignment = Alignment.CenterHorizontally) {
//            Text(text= stringResource(Res.string.app_name),
//                color = Color.Red,
//            )
//
//            Text(text = stringResource(Res.string.welcome),
//                color = Color.Black,
//            )
//
//        }




        }
    }

}