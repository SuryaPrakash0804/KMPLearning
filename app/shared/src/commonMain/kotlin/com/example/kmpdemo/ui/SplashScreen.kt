package com.example.kmpdemo.ui

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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key.Companion.R
import androidx.compose.ui.layout.ContentScale

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kmpdemo.app.shared.generated.resources.Res
import kmpdemo.app.shared.generated.resources.home_logo1
import kmpdemo.app.shared.generated.resources.splash_logo


import org.jetbrains.compose.resources.painterResource


@Preview(showBackground = true)
@Composable
fun SplashScreen() {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    ){
        val painter = painterResource(Res.drawable.home_logo1)
        Box(modifier = Modifier.fillMaxSize()
            .background(Color(0xFFE9E2D6)),
            contentAlignment = Alignment.Center
        ){

            Image(painter = painter,
                contentDescription = null,

                modifier = Modifier.fillMaxWidth(0.9f)
                    .height(240.dp)
                    .padding(5.dp),

                alignment = Alignment.Center,
                contentScale = ContentScale.Fit



            )

        }


    }
}