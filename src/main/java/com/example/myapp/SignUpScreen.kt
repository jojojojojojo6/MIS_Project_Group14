package com.example.myapp

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextField
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun SignUpScreen(
    authViewModel: AuthViewModel,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmpassword by remember { mutableStateOf("") }

    Box(
        modifier = modifier
            .requiredWidth(width = 390.dp)
            .requiredHeight(height = 844.dp)
            .background(color = Color.White)
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 22.dp,
                    y = 69.dp)
                .requiredWidth(width = 347.dp)
                .requiredHeight(height = 733.dp)
        ) {
            Text(
                text = "SIGN UP",
                color = Color.Black,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.headlineLarge,
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(x = 0.dp,
                        y = 0.dp)
                    .requiredWidth(width = 347.dp))
            Text(
                text = "Create Your Account To Embark On Your Educational Adventure",
                color = Color(0xff6c6c6c),
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 16.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(x = 0.dp,
                        y = 61.dp)
                    .requiredWidth(width = 319.dp)
                    .requiredHeight(height = 65.dp))
            Button(
                onClick = {
                    onClick()
                    authViewModel.signUp(name, email, password, confirmpassword)

                },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
                contentPadding = PaddingValues(all = 15.dp),
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(x = (-0.5).dp,
                        y = 475.dp)
                    .requiredWidth(width = 320.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .requiredWidth(width = 320.dp)
                ) {
                    Text(
                        text = "SIGN UP ",
                        color = Color.White,
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium))
                }
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(x = (-0.5).dp,
                        y = 652.dp)
                    .requiredWidth(width = 320.dp)
                    .requiredHeight(height = 45.dp)
                    .clip(shape = RoundedCornerShape(5.dp))
                    .border(border = BorderStroke(1.dp, Color.Black),
                        shape = RoundedCornerShape(5.dp))
                    .padding(all = 15.dp)
            ) {
                Text(
                    text = "Sign Up With Google",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium))
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(x = (-0.5).dp,
                        y = 590.dp)
                    .requiredWidth(width = 320.dp)
                    .requiredHeight(height = 45.dp)
                    .clip(shape = RoundedCornerShape(5.dp))
                    .border(border = BorderStroke(1.dp, Color.Black),
                        shape = RoundedCornerShape(5.dp))
                    .padding(all = 15.dp)
            ) {
                Text(
                    text = "Sign Up With Facebook",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium))
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 13.dp,
                        y = 216.dp)
                    .requiredWidth(width = 320.dp)
                    .requiredHeight(height = 61.dp)
            ) {
                Text(
                    text = "Email Here",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Medium))
                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    label = {
                        Text(
                            text = "youremail@gmail.com",
                            color = Color(0xff6c6c6c),
                            style = TextStyle(
                                fontSize = 12.sp))
                    },
                    modifier = Modifier
                        .align(alignment = Alignment.TopCenter)
                        .offset(x = 0.dp,
                            y = 26.dp)
                        .requiredWidth(width = 320.dp)
                        .clip(shape = RoundedCornerShape(5.dp))
                        .padding(all = 10.dp))
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 13.dp,
                        y = 134.dp)
                    .requiredWidth(width = 320.dp)
                    .requiredHeight(height = 61.dp)
            ) {
                Text(
                    text = "Full Name",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Medium))
                OutlinedTextField(
                    value = name,
                    onValueChange = {name = it},
                    label = {
                        Text(
                            text = "Sidra Idrees",
                            color = Color(0xff6c6c6c),
                            style = TextStyle(
                                fontSize = 12.sp))
                    },
                    modifier = Modifier
                        .align(alignment = Alignment.TopCenter)
                        .offset(x = 0.dp,
                            y = 26.dp)
                        .requiredWidth(width = 320.dp)
                        .clip(shape = RoundedCornerShape(5.dp))
                        .padding(all = 10.dp))
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 13.dp,
                        y = 298.dp)
                    .requiredWidth(width = 320.dp)
                    .requiredHeight(height = 61.dp)
            ) {
                Text(
                    text = "Password",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Medium))
                OutlinedTextField(
                    value = password,
                    onValueChange = {password = it},
                    label = {
                        Text(
                            text = "*************************",
                            color = Color(0xff6c6c6c),
                            style = TextStyle(
                                fontSize = 12.sp),
                            modifier = Modifier
                                .requiredHeight(height = 8.dp))
                    },
                    modifier = Modifier
                        .align(alignment = Alignment.TopCenter)
                        .offset(x = 0.dp,
                            y = 26.dp)
                        .requiredWidth(width = 320.dp)
                        .requiredHeight(height = 35.dp)
                        .clip(shape = RoundedCornerShape(5.dp))
                        .padding(all = 10.dp))
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 13.dp,
                        y = 380.dp)
                    .requiredWidth(width = 320.dp)
                    .requiredHeight(height = 61.dp)
            ) {
                Text(
                    text = "Confirm Password",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Medium))
                OutlinedTextField(
                    value = confirmpassword,
                    onValueChange = {confirmpassword = it},
                    label = {
                        Text(
                            text = "*************************",
                            color = Color(0xff6c6c6c),
                            style = TextStyle(
                                fontSize = 12.sp),
                            modifier = Modifier
                                .requiredHeight(height = 8.dp))
                    },
                    modifier = Modifier
                        .align(alignment = Alignment.TopCenter)
                        .offset(x = 0.dp,
                            y = 26.dp)
                        .requiredWidth(width = 320.dp)
                        .requiredHeight(height = 35.dp)
                        .clip(shape = RoundedCornerShape(5.dp))
                        .padding(all = 10.dp))
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 35.dp,
                        y = 556.dp)
                    .requiredWidth(width = 276.dp)
                    .requiredHeight(height = 18.dp)
            ) {
                Text(
                    text = "Or Sign Up with",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 14.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopCenter)
                        .offset(x = 4.dp,
                            y = 0.dp))
                Divider(
                    color = Color(0xff6c6c6c),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 9.dp)
                        .requiredWidth(width = 75.dp)
                        .rotate(degrees = -180f))
                Divider(
                    color = Color(0xff6c6c6c),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 201.dp,
                            y = 9.dp)
                        .requiredWidth(width = 75.dp)
                        .rotate(degrees = -180f))
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 61.dp,
                        y = 718.dp)
                    .requiredWidth(width = 225.dp)
                    .requiredHeight(height = 15.dp)
            ) {
                Text(
                    textDecoration = TextDecoration.Underline,
                    text = buildAnnotatedString {
                        withStyle(style = SpanStyle(
                            color = Color(0xff6c6c6c),
                            fontSize = 12.sp)) {append("Already have an  Account? ")}
                        withStyle(style = SpanStyle(
                            color = Color.Black,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold)) {append("Sign In here")}},
                    modifier = Modifier
                        .align(alignment = Alignment.TopCenter)
                        .offset(x = 0.dp,
                            y = 0.dp))
            }
        }
        Icon(
            painter = painterResource(id = R.drawable.vector),
            contentDescription = "arrow-left-line",
            tint = Color(0xff00434c),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 21.dp,
                    y = 45.dp))
    }
}

@Preview(widthDp = 390, heightDp = 844)
@Composable
private fun SignUpScreenPreview() {
    //SignUpScreen(Modifier, {})

}