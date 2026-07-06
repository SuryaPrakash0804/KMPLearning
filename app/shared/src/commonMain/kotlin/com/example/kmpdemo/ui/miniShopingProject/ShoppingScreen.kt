package com.example.kmpdemo.ui.miniShopingProject

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kmpdemo.ui.miniShopingProject.model.ProductList

@Composable
@Preview(showSystemUi = true)
fun ShoppingScreen(){

    var count by remember { mutableStateOf(0) }
    var price by remember { mutableStateOf(0.0) }


    val products = Array(20) {

        ProductList(

            id = it,

            name = "Product ${it + 1}",

            price = 100.0 + it,
            inStock = if (it % 2 == 0) false else true

        )

    }



    Column(modifier = Modifier.fillMaxSize().padding(10.dp)) {

        Row(modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Shopping Store",
                modifier = Modifier.fillMaxWidth(.5f),
                color = Color.Red
            )

            Text(text = "Item Added: $count with $price",
                modifier = Modifier.fillMaxWidth(),
                color = Color.Green
            )

        }


        LazyColumn(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(8.dp)) {
            items(products) { pro ->
                CardItem(product = pro, onItemClick = {
                    count++
                    price += pro.price
                })
            }
        }

    }





}



@Composable
fun CardItem(product: ProductList, onItemClick: () -> Unit){

    Card(modifier = Modifier.fillMaxWidth(), // Card ko hamesha list me fillMaxWidth dete hain
        shape = RoundedCornerShape(10.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 5.dp))
    {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.LightGray) // Background yahan bilkul sahi lag raha hai
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Column(modifier = Modifier.weight(.6f)) {
                Text(text = "${product.name} Price: ${product.price}",
                    color = Color.Black,
                    modifier = Modifier.padding(horizontal = 10.dp).fillMaxWidth(.5f))
                Text(text = "In Stock: ${product.inStock}",
                    color = Color.Black,
                    modifier = Modifier.padding(horizontal = 10.dp).fillMaxWidth())
            }


            if (product.inStock) {
                Button(
                    modifier = Modifier.weight(.4f),
                    onClick = {
                    onItemClick()
                },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4CAF50)),
                ){
                    Text(text = "Add to Cart")
                }
            }

        }

    }
}