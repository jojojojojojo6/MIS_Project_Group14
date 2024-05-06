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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton


@Composable
fun StartScreen(
    modifier: Modifier = Modifier,
    signIn: () -> Unit,
    signUp: () -> Unit
) {
    Box(
        modifier = modifier
            .requiredWidth(width = 390.dp)
            .requiredHeight(height = 844.dp)
            .background(color = Color.White)
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(x = 0.5.dp,
                    y = 136.dp)
                .requiredSize(size = 291.dp)
                .clip(shape = CircleShape)
                .background(color = Color(0xffeeeeee))
                .border(border = BorderStroke(11.240342140197754.dp, Color(0xffe0e0e0)),
                    shape = CircleShape))
        Text(
            text = "Unlock Your Learning Potential",
            color = Color.Black,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(x = 1.5.dp,
                    y = 484.dp)
                .requiredWidth(width = 347.dp))
        Text(
            text = "Your Gateway To Personalized Courses, And Guidance For Success.",
            color = Color(0xff6c6c6c),
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 16.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(x = 1.5.dp,
                    y = 580.dp)
                .requiredWidth(width = 319.dp)
                .requiredHeight(height = 65.dp))
        Button(
            onClick = signIn,
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
            contentPadding = PaddingValues(all = 15.dp),
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(x = (-83).dp,
                    y = 669.dp)
                .requiredWidth(width = 160.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .requiredWidth(width = 160.dp)
            ) {
                Text(
                    text = "SIGN IN ",
                    color = Color.White,
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium))
            }
        }
        OutlinedButton(
            onClick = signUp,
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            contentPadding = PaddingValues(all = 15.dp),
            border = BorderStroke(1.dp, Color.Black),
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(x = 85.dp,
                    y = 669.dp)
                .requiredWidth(width = 160.dp)
                .requiredHeight(height = 50.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .requiredWidth(width = 160.dp)
                    .requiredHeight(height = 50.dp)
            ) {
                Text(
                    text = "SIGN UP ",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium))
            }
        }
    }
}

@Preview(widthDp = 390, heightDp = 844)
@Composable
private fun W5Preview() {
    StartScreen(Modifier, {}, {})
}
