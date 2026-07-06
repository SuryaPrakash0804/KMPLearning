package com.example.kmpdemo.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ManageCartExample() {
    var count by remember { mutableStateOf(0) }
    // KMP ke liye sabse safe aur light-weight list generation bina kisi variable conflict ke
     val productList = Array(100) { "Product Number ${it + 1}" }

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)
    ) {

        Row(modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp)) {
            Text(
                text = "Item Added: $count",
                modifier = Modifier.fillMaxWidth(), // fillMaxSize ko badal kar fillMaxWidth kiya
                color = Color.Black,
                style = MaterialTheme.typography.titleLarge
            )
        }
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(8.dp) // Items ke beech thoda gap dene ke liye
        ) {
            items(productList) { l ->
                CartItem(item = l, addItemToCart = {
                    count++ // State perfectly update hogi aur UI refresh hoga
                })
            }

        }
    }
}

@Composable
fun CartItem(item: String, addItemToCart: () -> Unit) {
    Card(
        modifier = Modifier.fillMaxWidth(), // Card ko hamesha list me fillMaxWidth dete hain
        shape = RoundedCornerShape(10.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 5.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.LightGray) // Background yahan bilkul sahi lag raha hai
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = item,
                modifier = Modifier.padding(10.dp).weight(0.7f),
                color = Color.Black
            )

            Button(
                onClick = {
                    addItemToCart() // Brackets lagane se lambda sahi se invoke hoga
                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4CAF50)),
                modifier = Modifier.padding(4.dp).weight(0.3f)
            ) {
                Text("Add")
            }
        }
    }
}
