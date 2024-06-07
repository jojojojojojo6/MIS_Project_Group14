package com.example.a0601

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.White)
            .verticalScroll(rememberScrollState()) //使介面可滾動
    ) {
        var passwordVisible = true//先假設在這（密碼可見）
        Image(//趴著的小人
            painter = painterResource(id = R.drawable.laying_doodle),
            contentDescription = "laying_doodle",
            modifier = Modifier
                .requiredWidth(width = 374.dp)
                .requiredHeight(height = 312.dp)
                .offset(y = 100.dp)
                .rotate(degrees = -3.54f)
        )
        Image(//藍色區塊
            painter = painterResource(id = R.drawable.blue_rectangle),
            contentDescription = "blue_rectangle",
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(y = 230.dp)
                .fillMaxWidth()
                .requiredHeight(height = 680.dp)
                .clip(RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp))
        )
        Text(//登入標題
            text = "登入",
            color = Color.Black,
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold,
            modifier = modifier
                .align(Alignment.TopCenter)
                .offset(y= 300.dp)
        )
        Box(//帳號框框
            modifier = modifier
                .requiredWidth(width = 210.dp)
                .requiredHeight(height = 0.dp)
                .align(Alignment.TopCenter)
                .offset(
                    y = 400.dp
                )

        ){
            val containerColor = Color.White
            var text by remember { mutableStateOf("") }
            OutlinedTextField(
                value = text,
                onValueChange = {text = it},
                label = {Text("帳號", color = Color.Black.copy(alpha = 0.31f))},
                colors = OutlinedTextFieldDefaults.colors(
                    focusedContainerColor = containerColor,
                    unfocusedContainerColor = containerColor,
                    disabledContainerColor = Color.Transparent,
                    unfocusedBorderColor = Color.White,
                    focusedBorderColor = Color.White),
                modifier = Modifier
                    .requiredWidth(width = 210.dp)
                    .requiredHeight(height = 60.dp),
                shape = RoundedCornerShape(15.dp),
            )
        }

        Box(//密碼框框
            modifier = modifier
                .requiredWidth(width = 210.dp)
                .requiredHeight(height = 0.dp)
                .align(Alignment.TopCenter)
                .offset(
                    y = 480.dp
                )

        ){
            val containerColor = Color.White
            var text by remember { mutableStateOf("") }
            OutlinedTextField(
                value = text,
                onValueChange = {text = it},
                label = {Text("密碼", color = Color.Black.copy(alpha = 0.31f))},
                visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                trailingIcon = {
                    val image = if (passwordVisible) R.drawable.ic_visibility else R.drawable.ic_visibility_off
                    IconButton(onClick = { passwordVisible = !passwordVisible },
                        modifier = Modifier.size(54.dp))
                    {
                        Icon(painter = painterResource(id = image), contentDescription = null)
                    }
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedContainerColor = containerColor,
                    unfocusedContainerColor = containerColor,
                    disabledContainerColor = Color.Transparent,
                    unfocusedBorderColor = Color.White,
                    focusedBorderColor = Color.White),
                modifier = Modifier
                    .requiredWidth(width = 210.dp)
                    .requiredHeight(height = 60.dp),
                shape = RoundedCornerShape(15.dp),
            )
        }

        Button(//登入按鈕
            onClick = { },
            shape = RoundedCornerShape(80.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
            modifier = Modifier
                .requiredWidth(width = 100.dp)
                .requiredHeight(height = 50.dp)
                .align(Alignment.TopCenter)
                .offset(
                    x = 120.dp, y = 540.dp
                )
        ){Text(text = "登入",color = Color.White)}//登入按鈕

        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            modifier = Modifier
                .align(Alignment.Center)
                .offset(x = 0.5.dp, y = 221.5.dp)
        ) {Text(text = "註冊", color = Color.Black)}//註冊按鈕
        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            modifier = Modifier
                .align(Alignment.Center)
                .offset(x = 8.dp, y = 248.5.dp)
        ) {Text(text = "忘記密碼？", color = Color.Black)}//忘記密碼按鈕

    }
}

@Preview
@Composable
private fun LoginPreview() {
    LoginScreen()
}
