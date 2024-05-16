package com.example.myapp.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import com.google.firebase.auth.FirebaseAuth

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
            .background(color = Color(0xffd4e9c0))
            .verticalScroll(rememberScrollState())  //使介面可滾動
    ) {
        Image(
            painter = painterResource(id = R.drawable.red_cycle),
            contentDescription = "red_cycle",
            modifier = Modifier
                .align(Alignment.TopStart) // 對齊左上角
                .offset(y = (-64).dp)
                .requiredHeight(455.dp)
                .fillMaxWidth()
        )

        Image(
            painter = painterResource(id = R.drawable.yellow_cycle),
            contentDescription = "yellow_cycle",
            modifier = Modifier
                .align(Alignment.TopStart) // 對齊左下角
                .fillMaxWidth()
                .requiredHeight(255.dp) // 黃色圖片高度為紅色圖片高度的2/3
                .aspectRatio(1f) // 黃色圖片寬高比例為1:1
        )
        Image(
            painter = painterResource(id = R.drawable.raccon),
            contentDescription = "raccon",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 48.dp,
                    y = 126.dp
                )
                .requiredWidth(width = 300.dp)
                .requiredHeight(height = 255.dp)
        )

        TextButton(
            onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            modifier = modifier
                .requiredSize(size = 56.dp)
                .offset(x = 300.dp, y = 5.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 56.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.shootdart_icon),
                    contentDescription = "Vector",
                    modifier = Modifier
                        .fillMaxSize())}
        }

        TextButton(
            onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            modifier = modifier
                .requiredSize(size = 64.dp)
                .rotate(degrees = -21.75f)
                .offset(x = 5.dp, y = 5.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 64.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.candy_icon),
                    contentDescription = "Vector",
                    modifier = Modifier
                        .fillMaxSize()
                        .rotate(degrees = -21.75f))
            }
        }

        val containerColor1 = Color(0xfffafca3)
        if(errorEmail){
            Text(
                text = "輸入帳號",
                color = Color.Red,
                modifier = Modifier.padding(end = 100.dp)
            )
        }
        OutlinedTextField(
            label = {Text(text = "帳號")},
            value = email,
            onValueChange = {email= it},
            colors = TextFieldDefaults.colors(
                focusedContainerColor = containerColor1,
                unfocusedContainerColor = containerColor1,
                disabledContainerColor = containerColor1,
            ),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 100.dp, y = 423.dp)
                .requiredWidth(width = 210.dp)
                .requiredHeight(height = 63.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .border(1.dp, Color.Black, RoundedCornerShape(20.dp))
        )
        val containerColor = Color(0xfffafca3)
        var passwordVisible by remember { mutableStateOf(false) } // 添加一个状态来跟踪密码的可见性
        if (errorPassword) {
            Text(
                text = "輸入密碼",
                color = Color.Red,
                modifier = Modifier
            )
        }

        OutlinedTextField(
            label = { Text(text = "密碼") },
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
                IconButton(onClick = { passwordVisible = !passwordVisible },
                    modifier = Modifier.size(24.dp)
                )
                {
                    Icon(painter = painterResource(id = image), contentDescription = null)
                }
            },
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 100.dp, y = 515.dp)
                .requiredWidth(width = 210.dp)
                .requiredHeight(height = 63.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .border(1.dp, Color.Black, RoundedCornerShape(20.dp))
        )
        Box(
            modifier = Modifier
                .requiredSize(size = 80.dp)
        ) {
            TextButton(
                onClick = {
                    if (email.isNotEmpty()) {
                        errorEmail = false
                        if (password.isNotEmpty()) {
                            errorPassword = false
                            vm.login(email, password)
                        } else {
                            errorPassword = true
                        }
                    } else {
                        errorEmail = true
                    }
                },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 161.dp, y = 613.dp)
                    .requiredSize(size = 80.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.enter_button),
                    contentDescription = "Enter button",
                    modifier = Modifier
                        .requiredSize(size = 80.dp)
                        .clip(shape = CircleShape)
                        .border(0.dp, Color.Transparent, CircleShape)
                )
                if (vm.signedIn.value) {
                    navController.navigate(DestinationScreen.Main.route)
                }
            }
            TextButton(
                onClick = { navController.navigate(DestinationScreen.Register.route) },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 161.dp, y = 683.dp)
                    .requiredSize(size = 100.dp)
            ) {

                Image(
                    painter = painterResource(id = R.drawable.register_button1),
                    contentDescription = "Enter button",
                    modifier = Modifier
                        .requiredSize(size = 80.dp)
                        .clip(shape = CircleShape)
                        .border(0.dp, Color.Transparent, CircleShape)
                )

            }
        }}}


//@Preview(widthDp = 360, heightDp = 800)
//@Composable
//fun LoginScreenPreview() {
//    val navController = rememberNavController()
//    val auth = FirebaseAuth.getInstance()
//    val vm = remember { HomeViewModel(auth) }
//
//    LoginScreen(navController = navController, vm = vm, modifier = Modifier)
//}
