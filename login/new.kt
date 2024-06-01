package com.example.myapp.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.myapp.DestinationScreen
import com.example.myapp.HomeViewModel
import com.example.myapp.R

@Composable
fun LoginScreen(
    navController: NavController,
    vm: HomeViewModel,
    modifier: Modifier = Modifier
) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var errorEmail by remember { mutableStateOf(false) }
    var errorPassword by remember { mutableStateOf(false) }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.White)
            .verticalScroll(rememberScrollState())  // Make the screen scrollable
    ) {
        Image(
            painter = painterResource(id = R.drawable.laying_doodle),
            contentDescription = "laying_doodle",
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 1.dp, y = 91.dp)
                .requiredWidth(320.dp)
                .requiredHeight(240.dp)
                .rotate(degrees = -16.54f)
        )

        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 1.dp, y = 262.dp)
                .requiredWidth(360.dp)
                .requiredHeight(498.dp)
                .clip(shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp))
                .background(color = Color(0xffb4cfe2))
        )

        Text(
            text = "LOGIN",
            color = Color.Black,
            style = MaterialTheme.typography.displaySmall,
            modifier = Modifier
                .align(Alignment.Center)
                .offset(x = (-91.5).dp, y = (-76.5).dp)
        )

        val containerColor1 = Color(0xffb4cfe2)
        if (errorEmail) {
            Text(
                text = "Please enter account",
                color = Color.Red,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .padding(start = 49.dp, top = 360.dp)
            )
        }

        OutlinedTextField(
            label = { Text(text = "Account") },
            value = email,
            onValueChange = { email = it },
            colors = TextFieldDefaults.colors(
                focusedContainerColor = containerColor1,
                unfocusedContainerColor = containerColor1,
                disabledContainerColor = containerColor1
            ),
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 49.dp, y = 377.dp)
                .requiredWidth(255.dp)
                .requiredHeight(46.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .border(1.dp, Color.Black, RoundedCornerShape(20.dp))
        )

        val containerColor = Color(0xffb4cfe2)
        var passwordVisible by remember { mutableStateOf(false) }
        if (errorPassword) {
            Text(
                text = "Please enter password",
                color = Color.Red,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .padding(start = 49.dp, top = 429.dp)
            )
        }

        OutlinedTextField(
            label = { Text(text = "Password") },
            value = password,
            onValueChange = { password = it },
            colors = TextFieldDefaults.colors(
                focusedContainerColor = containerColor,
                unfocusedContainerColor = containerColor,
                disabledContainerColor = containerColor
            ),
            visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            trailingIcon = {
                val image = if (passwordVisible) R.drawable.ic_visibility else R.drawable.ic_visibility_off
                IconButton(onClick = { passwordVisible = !passwordVisible }, modifier = Modifier.size(24.dp)) {
                    Icon(painter = painterResource(id = image), contentDescription = null)
                }
            },
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 49.dp, y = 449.dp)
                .requiredWidth(255.dp)
                .requiredHeight(46.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .border(1.dp, Color.Black, RoundedCornerShape(20.dp))
        )

        TextButton(
            onClick = { /* Implement login functionality */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 240.dp, y = 521.dp)
                .requiredWidth(100.dp)
                .requiredHeight(46.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.login_button),
                contentDescription = "Enter button",
                modifier = Modifier
                    .requiredSize(80.dp)
                    .clip(shape = CircleShape)
                    .border(0.dp, Color.Transparent, CircleShape)
            )
        }

        TextButton(
            onClick = { /* Implement forget password functionality */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 49.dp, y = 571.dp)
                .requiredWidth(100.dp)
                .requiredHeight(46.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.forget_password),
                contentDescription = "Forgot Password button",
                modifier = Modifier
                    .requiredSize(80.dp)
                    .clip(shape = CircleShape)
                    .border(0.dp, Color.Transparent, CircleShape)
            )
        }

        TextButton(
            onClick = { navController.navigate(DestinationScreen.Register.route) },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 49.dp, y = 621.dp)
                .requiredWidth(100.dp)
                .requiredHeight(46.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.sign_up),
                contentDescription = "Sign Up button",
                modifier = Modifier
                    .requiredSize(80.dp)
                    .clip(shape = CircleShape)
                    .border(0.dp, Color.Transparent, CircleShape)
            )
        }
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun LoginPreview() {
    val navController = rememberNavController()
    val vm = HomeViewModel()
    LoginScreen(navController = navController, vm = homeViewModel)
}

