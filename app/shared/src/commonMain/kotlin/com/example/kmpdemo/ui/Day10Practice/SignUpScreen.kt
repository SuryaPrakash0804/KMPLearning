package com.example.kmpdemo.ui.Day10Practice

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.example.kmpdemo.ui.Day10Practice.viewModel.LoginSignUpViewModel
import com.example.kmpdemo.ui.theme.MyappColor_Main_Bg
import kmpdemo.app.shared.generated.resources.Res
import kmpdemo.app.shared.generated.resources.woman
import org.jetbrains.compose.resources.painterResource

class SignUpScreen : Screen {

    @Composable
    override fun Content() {

        val navigator=LocalNavigator.currentOrThrow
//        var userName by remember { mutableStateOf("") }
//        var email by remember { mutableStateOf("")}
//        var password by remember { mutableStateOf("")}


        val viewModel = remember { LoginSignUpViewModel() }

        val email by viewModel.email.collectAsState()

        val userName by viewModel.name.collectAsState()
        val password by viewModel.password.collectAsState()


        Column(modifier = Modifier.fillMaxSize().background(color = MyappColor_Main_Bg),
            horizontalAlignment = Alignment.CenterHorizontally) {

            val painter= painterResource((Res.drawable.woman))

            Image(painter = painter,
                contentDescription = null,
                modifier = Modifier.padding(top = 80.dp).height(100.dp).width(100.dp),
                alignment = Alignment.Center
            )

            Text(text = "SignUp",
                modifier = Modifier.padding(top = 30.dp),
                fontSize = 16.sp, fontFamily = FontFamily.Serif, color = Color.Black,
                fontStyle = FontStyle.Italic)


            OutlinedTextField(
                label = {
                    Text("UserName")
                },
                value = userName,
                onValueChange = { name->
                    viewModel.updateName(name)
                },
                modifier = Modifier.padding(10.dp)

            )

            OutlinedTextField(
                label = {Text("Email")},
                value = email,
                onValueChange = { email->
                    viewModel.updateEmail(email)
                },
                modifier = Modifier.padding(10.dp)

            )

            OutlinedTextField(
                label = {Text("Password")},
                value = password,
                onValueChange = { name->
                    viewModel.updatePassword(name)
                },
                modifier = Modifier.padding(10.dp),
                visualTransformation = PasswordVisualTransformation()
            )

            ElevatedButton(onClick = {
                navigator.push(HomeScreen(userName,email))
            },
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.padding(top = 20.dp).fillMaxWidth(.7f)
            ) {
                Text(text = "SignUp")
            }


        }
    }
}