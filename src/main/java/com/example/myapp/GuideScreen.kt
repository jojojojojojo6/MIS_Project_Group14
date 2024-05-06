package com.example.myapp

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.ui.text.style.TextDecoration

@Composable
fun GuideScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 390.dp)
            .requiredHeight(height = 844.dp)
            .background(color = Color.White)
    ) {
        Text(
            text = "Enter the World of E-Learning",
            color = Color.Black,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(x = 0.5.dp,
                    y = 422.dp)
                .requiredWidth(width = 347.dp))
        Text(
            text = "Begin Your Educational Journey With Access To A Diverse Range Of Courses.",
            color = Color(0xff6c6c6c),
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 16.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(x = (-0.5).dp,
                    y = 518.dp)
                .requiredWidth(width = 349.dp)
                .requiredHeight(height = 65.dp))
        Button(
            onClick = { },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
            contentPadding = PaddingValues(all = 15.dp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 82.dp,
                    y = 664.dp)
                .requiredWidth(width = 225.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .requiredWidth(width = 225.dp)
            ) {
                Text(
                    text = "CONTINUE ",
                    color = Color.White,
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium))
            }
        }
        Text(
            text = "Skip",
            color = Color(0xff6c6c6c),
            textDecoration = TextDecoration.Underline,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 14.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 180.dp,
                    y = 739.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(x = 0.5.dp,
                    y = 90.dp)
                .requiredSize(size = 291.dp)
                .clip(shape = CircleShape)
                .background(color = Color(0xffeeeeee))
                .border(border = BorderStroke(11.240342140197754.dp, Color(0xffe0e0e0)),
                    shape = CircleShape))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 171.dp,
                    y = 599.dp)
                .requiredWidth(width = 48.dp)
                .requiredHeight(height = 9.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 9.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xff020202)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 13.dp,
                        y = 0.dp)
                    .requiredSize(size = 9.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffc5c5c5)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 26.dp,
                        y = 0.dp)
                    .requiredSize(size = 9.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffc5c5c5)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 39.dp,
                        y = 0.dp)
                    .requiredSize(size = 9.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffc5c5c5)))
        }
    }
}

@Preview(widthDp = 390, heightDp = 844)
@Composable
private fun W1Preview() {
    GuideScreen(Modifier)
}