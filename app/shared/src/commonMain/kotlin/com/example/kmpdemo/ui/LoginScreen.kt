package com.example.kmpdemo.ui

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kmpdemo.app.shared.generated.resources.Res
import kmpdemo.app.shared.generated.resources.splash_logo
import org.jetbrains.compose.resources.painterResource
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.OutlinedTextField


@Composable
@Preview
fun LoginScreen() {
    var name by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    Column( horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
            .padding(20.dp)
            .background(Color.Gray)
    ) {


        Text(
            "Please Enter Name",
            color = Color.Black,
            modifier = Modifier.padding(10.dp)
        )

        TextField(value = name, onValueChange = {
            name = it
        },
            modifier = Modifier.padding(10.dp)
        )

        Text(
            "Please Enter Email",
            color = Color.Black,
            modifier = Modifier.padding(10.dp)
        )

        TextField(value = email, onValueChange = {
            email = it
        },
            modifier = Modifier.padding(10.dp))
        Text(
            "Please Enter Password",
            color = Color.Black,
            modifier = Modifier.padding(10.dp)
        )
        TextField(value = password, onValueChange = {
            password = it
        },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.padding(10.dp))


        OutlinedTextField(

            value = name,
            label = { Text("Please Enter your name") },

            onValueChange = {

                name = it

            }

        )

       Button(onClick = {

       }, modifier = Modifier.padding(10.dp)) {
           Text("Login")
       }

    }
}





@Composable
@Preview
fun ProfileScreen(){
    Row (modifier = Modifier.fillMaxWidth().padding(10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ){
        Image(
            painter = painterResource( Res.drawable.splash_logo),
            modifier = Modifier.size(100.dp).clip(CircleShape),
            contentDescription = null,
            contentScale = androidx.compose.ui.layout.ContentScale.Crop
        )

        Spacer(modifier = Modifier.width(10.dp))

        Column(modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,) {

            Text("Name: John Doe",
                modifier = Modifier.padding(10.dp))

            Text("Email: john.hessin.clarke@examplepetstore.com",
                modifier = Modifier.padding(10.dp))

        }
    }
}





@Composable
@Preview
fun BulbExampleScreen(){

    var isBulbOn by remember { mutableStateOf(false) }

    val bulbColor by animateColorAsState(
        targetValue = if (isBulbOn) Color.Yellow else Color.Gray
    )

    Column (modifier = Modifier.fillMaxSize().padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){

    }
}


//
//@Composable
//@Preview
//fun ManageCartExample(){
//
//    var count by remember { mutableStateOf(0) }
//
// //   val productList = Array(100) { it->"Product Number ${it + 1}" }
//
//    val productList = mutableListOf<String>().apply {
//        for (i in 1..100) {
//            add("Product Number $i")
//        }
//    }
//
//    val productList2 = remember {
//        List(100) { "Product Number ${it + 1}" }
//    }
//
//    Column(modifier = Modifier.fillMaxSize()) {
//
//        Row(modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp),) {
//            Text("Item Added: $count",
//                modifier = Modifier.fillMaxSize(),
//                color = Color.Black)
//
//        }
//
//        LazyColumn(modifier = Modifier.fillMaxSize().padding(vertical = 10.dp)) {
//            items(productList) { lItem -> // Yahan 'items' use kiya
//                CartItem(item = lItem, addItemToCart = {
//                    count++ // Parent state update ho rahi hai
//                })
//            }
//        }
//    }
//
//}
//
//
//
//@Composable
//fun CartItem(item: String,addItemToCart:() -> Unit){
//    Card(modifier = Modifier.fillMaxSize().background(Color.LightGray),
//        shape = RoundedCornerShape(10.dp),
//        elevation = CardDefaults.cardElevation(defaultElevation = 5.dp)) {
//        Row(modifier = Modifier.fillMaxWidth(),
//            verticalAlignment = Alignment.CenterVertically,){
//            Text(item,
//                modifier = Modifier.padding(10.dp).weight(0.7f),
//                color = Color.Black)
//
//            Button(onClick = {
//                // Handle add to cart action
//                addItemToCart()
//            },
//                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4CAF50)),
//                modifier = Modifier.padding(4.dp).weight(0.3f)) {
//                Text("Add to Cart")
//            }
//        }
//    }
//
//}





