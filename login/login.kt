package com.example.a0502

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Login(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 800.dp)
            .background(color = Color(0xffd4e9c0)),
        contentAlignment = Alignment.TopStart // Aligning content within the Box
    ) {
        Box(
            modifier = Modifier
                .requiredSize(size = 80.dp)
        ) {
            TextButton(
                onClick = { },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 141.dp, y = 613.dp)
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
            }
            TextButton(
                onClick = { },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 141.dp, y = 683.dp)
                    .requiredSize(size = 100.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.register_button1),
                    contentDescription = "Enter button",
                    modifier = Modifier
                        .requiredSize(size = 100.dp)
                        .clip(shape = CircleShape)
                        .border(0.dp, Color.Transparent, CircleShape)
                )
            }
        }
        val containerColor = Color(0xfffafca3)
        OutlinedTextField(
            value = "",
            onValueChange = {},
            colors = TextFieldDefaults.colors(
                focusedContainerColor = containerColor,
                unfocusedContainerColor = containerColor,
                disabledContainerColor = containerColor,
            ),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 76.dp, y = 518.dp)
                .requiredWidth(width = 210.dp)
                .requiredHeight(height = 63.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .border(1.dp, Color.Black, RoundedCornerShape(20.dp))
        )
        val containerColor1 = Color(0xfffafca3)
        OutlinedTextField(
            value = "",
            onValueChange = {},
            colors = TextFieldDefaults.colors(
                focusedContainerColor = containerColor1,
                unfocusedContainerColor = containerColor1,
                disabledContainerColor = containerColor1,
            ),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 76.dp, y = 423.dp)
                .requiredWidth(width = 210.dp)
                .requiredHeight(height = 63.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .border(1.dp, Color.Black, RoundedCornerShape(20.dp))
        )
        Image(
            painter = painterResource(id = R.drawable.red_cycle),
            contentDescription = "red_cycle",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = (0).dp,
                    y = (-64).dp
                )
                .requiredWidth(width = 704.dp)
                .requiredHeight(height = 455.dp))
        Image(
            painter = painterResource(id = R.drawable.yellow_cycle),
            contentDescription = "yellow_cycle",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = (-68).dp,
                    y = (-125).dp
                )
                .requiredWidth(width = 704.dp)
                .requiredHeight(height = 452.dp))
        Image(
            painter = painterResource(id = R.drawable.raccon),
            contentDescription = "raccon",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 48.dp,
                    y = 126.dp
                )
                .requiredWidth(width = 253.dp)
                .requiredHeight(height = 255.dp))
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
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun LoginPreview() {
    Login()
}
