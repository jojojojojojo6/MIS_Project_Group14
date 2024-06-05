package com.example.a0601

import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(@StringRes modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.White)
            .verticalScroll(rememberScrollState())
    ) {
        var passwordVisible = false//先假設在這
        Image(
            painter = painterResource(id = R.drawable.laying_doodle),
            contentDescription = "laying_doodle",
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 1.dp, y = 91.dp)
                .width(350.dp)
                .height(320.dp)
                .rotate(degrees = -3.54f)
        )
        Image(
            painter = painterResource(id = R.drawable.blue_rectangle),
            contentDescription = "blue_rectangle",
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 1.dp, y = 222.dp)
                .width(360.dp)
                .height(615.dp)
                .clip(RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp))
        )
        Text(
            text = "LOGIN",
            color = Color.Black,
            style = MaterialTheme.typography.displayMedium,
            modifier = Modifier
                .align(Alignment.Center)
                .offset(x = (-91.5).dp, y = (-76.5).dp)
        )
        TextField(
            value = "",
            onValueChange = {},
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.White,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent
            ),
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 49.dp, y = 377.dp)
                .width(255.dp)
                .height(46.dp)
                .clip(RoundedCornerShape(15.dp))
        )
        Text(
            text = "account",
            color = Color.Black.copy(alpha = 0.31f),
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .align(Alignment.Center)
                .offset(x = (-71.5).dp, y = 0.dp)
        )
        TextField(
            value = "",
            onValueChange = {},
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.White,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent
            ),
            visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            trailingIcon = {

                val image = if (passwordVisible) R.drawable.ic_visibility else R.drawable.ic_visibility_off
                IconButton(onClick = { passwordVisible = !passwordVisible },
                    modifier = Modifier.size(54.dp)
                )
                {
                    Icon(painter = painterResource(id = image), contentDescription = null)
                }
            },
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 49.dp, y = 449.dp)
                .width(255.dp)
                .height(46.dp)
                .clip(RoundedCornerShape(15.dp))
        )
        Text(
            text = "password",
            color = Color.Black.copy(alpha = 0.31f),
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .align(Alignment.Center)
                .offset(x = (-62.5).dp, y = 72.dp)
        )
        Button(
            onClick = { },
            shape = RoundedCornerShape(80.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 240.dp, y = 521.dp)
                .width(100.dp)
                .height(50.dp)
        ){}
        Text(
            text = "log in",
            color = Color.White,
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .align(Alignment.Center)
                .offset(x = 110.dp, y = 146.dp)
        )
        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            modifier = Modifier
                .align(Alignment.Center)
                .offset(x = 0.5.dp, y = 221.5.dp)
        ) {Text(text = "Sign up", color = Color.Black)}
        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            modifier = Modifier
                .align(Alignment.Center)
                .offset(x = 0.5.dp, y = 248.5.dp)
        ) {Text(text = "Forget password？", color = Color.Black)}

    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun LoginPreview() {
    LoginScreen()
}
