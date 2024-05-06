package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                    GeneratedCode()
        }
    }
}

@Composable
fun GeneratedCode(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 800.dp)
            .background(color = Color(0xffd4e9c0))
    ) {
        TextButton(
            onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            modifier = modifier
                .requiredSize(size = 56.dp)
                .offset(x = 270.dp, y = 110.dp)
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
                .offset(x = 0.dp, y = 120.dp)
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
                        .rotate(degrees = -21.75f)) }
        }

        Text(
            text = stringResource(R.string.register_text),
            color = Color.Black,
            fontSize = 40.sp,
            modifier = modifier
                .align(Alignment.TopCenter)
                .offset(
                    y = 150.dp
                ))

        Box(
            modifier = modifier
                .requiredWidth(width = 280.dp)
                .requiredHeight(height = 40.dp)
                .align(Alignment.TopCenter)
                .offset(
                    y = 230.dp
                )

        ) {
            Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
            ){
                Text(
                    text = stringResource(R.string.user_name),
                    color = Color.Black,
                    fontSize = 15.sp,
                    modifier = modifier

                )

                Spacer(modifier = Modifier.weight(1f)) //填充剩餘空間

                val containerColor = Color(0xfffafca3)
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = containerColor,
                        unfocusedContainerColor = containerColor,
                        disabledContainerColor = containerColor),
                    modifier = modifier
                        .requiredWidth(width = 200.dp)
                        .requiredHeight(height = 40.dp)
                        .clip(shape = RoundedCornerShape(20.dp))
                        .border(1.dp, Color.Black, RoundedCornerShape(20.dp))
                    )
                }

        }

        Box(
            modifier = modifier
                .requiredWidth(width = 280.dp)
                .requiredHeight(height = 40.dp)
                .align(Alignment.TopCenter)
                .offset(
                    y = 290.dp
                )

        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
            ){
                Text(
                    text = stringResource(R.string.email_text),
                    color = Color.Black,
                    fontSize = 15.sp,
                    modifier = modifier

                )

                Spacer(modifier = Modifier.weight(1f))

                val containerColor = Color(0xfffafca3)
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = containerColor,
                        unfocusedContainerColor = containerColor,
                        disabledContainerColor = containerColor),
                    modifier = modifier
                        .requiredWidth(width = 200.dp)
                        .requiredHeight(height = 40.dp)
                        .clip(shape = RoundedCornerShape(20.dp))
                        .border(1.dp, Color.Black, RoundedCornerShape(20.dp))
                )
            }

        }

        Box(
            modifier = modifier
                .requiredWidth(width = 280.dp)
                .requiredHeight(height = 40.dp)
                .align(Alignment.TopCenter)
                .offset(
                    y = 350.dp
                )

        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
            ){
                Spacer(modifier = Modifier.weight(5f))
                Text(
                    text = stringResource(R.string.password_text),
                    color = Color.Black,
                    fontSize = 15.sp,
                    modifier = modifier

                )

                Spacer(modifier = Modifier.weight(1f))

                val containerColor = Color(0xfffafca3)
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = containerColor,
                        unfocusedContainerColor = containerColor,
                        disabledContainerColor = containerColor),
                    modifier = modifier
                        .requiredWidth(width = 200.dp)
                        .requiredHeight(height = 40.dp)
                        .clip(shape = RoundedCornerShape(20.dp))
                        .border(1.dp, Color.Black, RoundedCornerShape(20.dp))
                )
            }

        }

        Box(
            modifier = modifier
                .requiredWidth(width = 280.dp)
                .requiredHeight(height = 40.dp)
                .align(Alignment.TopCenter)
                .offset(
                    y = 410.dp
                )

        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
            ){
                Spacer(modifier = Modifier.weight(5f))

                Text(
                    text = stringResource(R.string.birth_text),
                    color = Color.Black,
                    fontSize = 15.sp,
                    modifier = modifier

                )

                Spacer(modifier = Modifier.weight(1f))

                val containerColor = Color(0xfffafca3)
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = containerColor,
                        unfocusedContainerColor = containerColor,
                        disabledContainerColor = containerColor),
                    modifier = modifier
                        .requiredWidth(width = 200.dp)
                        .requiredHeight(height = 40.dp)
                        .clip(shape = RoundedCornerShape(20.dp))
                        .border(1.dp, Color.Black, RoundedCornerShape(20.dp))
                )
            }

        }

        Image(
            painter = painterResource(id = R.drawable.red_cycle),
            contentDescription = "red_cycle",
            modifier = modifier
                .align(Alignment.BottomCenter)
                .requiredWidth(width = 480.dp)
                .requiredHeight(height = 426.dp))
        Box(
            modifier = modifier
                .requiredWidth(width = 120.dp)
                .requiredHeight(height = 60.dp)
                .align(Alignment.BottomCenter)
                .offset(
                    y = (-150).dp
                )

        ) {
            OutlinedButton(
                onClick = { },
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xfffafca3)),
                border = BorderStroke(1.dp, Color(0xff534e4e)),
                modifier = Modifier
                    .requiredWidth(width = 120.dp)
                    .requiredHeight(height = 60.dp)
                    ){}
            Text(
                text = stringResource(R.string.register),
                color = Color.Black.copy(alpha = 0.25f),
                fontSize = 25.sp,
                style = MaterialTheme.typography.displaySmall,
                modifier = Modifier
                    .align(Alignment.Center))
        }


    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun GeneratedCodePreview() {
    GeneratedCode(Modifier)
}