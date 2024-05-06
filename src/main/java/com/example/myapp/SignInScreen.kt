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
import androidx.compose.material3.TextField
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle


@Composable
fun SignInScreen(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
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
                    y = 128.dp)
                .requiredWidth(width = 347.dp)
                .requiredHeight(height = 660.dp)
        ) {
            Text(
                text = "SIGN IN",
                color = Color.Black,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.headlineLarge,
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(x = 0.dp,
                        y = 0.dp)
                    .requiredWidth(width = 347.dp))
            Text(
                text = "Sign In To Access Your Personalized Learning Journey",
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
                onClick = onClick,
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
                contentPadding = PaddingValues(all = 15.dp),
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(x = (-0.5).dp,
                        y = 325.dp)
                    .requiredWidth(width = 320.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .requiredWidth(width = 320.dp)
                ) {
                    Text(
                        text = "SIGN IN ",
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
                        y = 530.dp)
                    .requiredWidth(width = 320.dp)
                    .requiredHeight(height = 45.dp)
                    .clip(shape = RoundedCornerShape(5.dp))
                    .border(border = BorderStroke(1.dp, Color.Black),
                        shape = RoundedCornerShape(5.dp))
                    .padding(all = 15.dp)
            ) {
                Text(
                    text = "Sign In With Google",
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
                        y = 468.dp)
                    .requiredWidth(width = 320.dp)
                    .requiredHeight(height = 45.dp)
                    .clip(shape = RoundedCornerShape(5.dp))
                    .border(border = BorderStroke(1.dp, Color.Black),
                        shape = RoundedCornerShape(5.dp))
                    .padding(all = 15.dp)
            ) {
                Text(
                    text = "Sign In With Facebook",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium))
            }
            TextField(
                value = "",
                onValueChange = {},
                label = {
                    Text(
                        text = "Email Here",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Medium))
                },
                supportingText = {
                    Text(
                        text = "youremail@gmail.com",
                        color = Color(0xff6c6c6c),
                        style = TextStyle(
                            fontSize = 12.sp))
                },
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 13.dp,
                        y = 138.dp)
                    .requiredWidth(width = 320.dp)
                    .requiredHeight(height = 61.dp))
            TextField(
                value = "",
                onValueChange = {},
                label = {
                    Text(
                        text = "Password",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Medium))
                },
                supportingText = {
                    Text(
                        text = "*************************",
                        color = Color(0xff6c6c6c),
                        style = TextStyle(
                            fontSize = 12.sp),
                        modifier = Modifier
                            .requiredWidth(width = 150.dp)
                            .requiredHeight(height = 8.dp))
                },
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 13.dp,
                        y = 220.dp)
                    .requiredWidth(width = 320.dp)
                    .requiredHeight(height = 61.dp))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 35.dp,
                        y = 434.dp)
                    .requiredWidth(width = 276.dp)
                    .requiredHeight(height = 18.dp)
            ) {
                Text(
                    text = "Or Sign In with",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 14.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopCenter)
                        .offset(x = 0.dp,
                            y = 0.dp))
                Divider(
                    color = Color(0xff6c6c6c).copy(alpha = 0.65f),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 9.dp)
                        .requiredWidth(width = 75.dp)
                        .rotate(degrees = -180f))
                Divider(
                    color = Color(0xff6c6c6c).copy(alpha = 0.65f),
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
                    .offset(x = 64.dp,
                        y = 645.dp)
                    .requiredWidth(width = 219.dp)
                    .requiredHeight(height = 15.dp)
            ) {
                Text(
                    textDecoration = TextDecoration.Underline,
                    text = buildAnnotatedString {
                        withStyle(style = SpanStyle(
                            color = Color(0xff6c6c6c),
                            fontSize = 12.sp)) {append("Don’t have an  Account? ")}
                        withStyle(style = SpanStyle(
                            color = Color.Black,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold)
                        ) {append("Sign Up here")}},
                    modifier = Modifier
                        .align(alignment = Alignment.TopCenter)
                        .offset(x = 0.dp,
                            y = 0.dp))
            }
            Text(
                text = "Forgot Password?",
                color = Color(0xff6c6c6c),
                style = TextStyle(
                    fontSize = 11.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 236.dp,
                        y = 287.dp))
        }
        IconButton(
            onClick = { },
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 21.dp,
                    y = 55.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 24.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.vector),
                    contentDescription = "Vector",
                    modifier = Modifier
                        .fillMaxSize())
            }
        }
    }
}

@Preview(widthDp = 390, heightDp = 844)
@Composable
private fun SignInScreenPreview() {
    SignInScreen(Modifier, {})
}