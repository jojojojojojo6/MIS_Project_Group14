package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.myapplication.ui.theme.MyApplicationTheme
import java.text.SimpleDateFormat
import java.time.format.TextStyle
import java.util.Calendar
import java.util.Date
import java.util.Locale

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                    GeneratedCode()
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GeneratedCode(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color(0xffd4e9c0))
    ) {
        TextButton(
            onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            modifier = modifier
                .requiredSize(size = 56.dp)
                .offset(x = 270.dp, y = 20.dp)
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
                .offset(x = 40.dp, y = 40.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 64.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.candy_icon),
                    contentDescription = "Vector",
                    modifier = modifier
                        .fillMaxSize()
                        .rotate(degrees = -21.75f)) }
        }

        Text(
            text = "註冊",
            color = Color.Black,
            fontSize = 40.sp,
            modifier = modifier
                .align(Alignment.TopCenter)
                .offset(
                    y = 70.dp
                ))

        Box(
            modifier = modifier
                .requiredWidth(width = 280.dp)
                .requiredHeight(height = 40.dp)
                .align(Alignment.TopCenter)
                .offset(
                    y = 150.dp
                )

        ) {
                val containerColor = Color(0xfffafca3)
                var text by remember { mutableStateOf("") }
                OutlinedTextField(
                    value = text,
                    onValueChange = { text = it},
                    label = {Text("請輸入遊戲暱稱")},
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = containerColor,
                        unfocusedContainerColor = containerColor,
                        disabledContainerColor = Color.Transparent),
                    modifier = Modifier
                        .requiredWidth(width = 280.dp)
                        .requiredHeight(height = 60.dp),
                    shape = RoundedCornerShape(20.dp)
                )

        }

        Box(
            modifier = modifier
                .requiredWidth(width = 280.dp)
                .requiredHeight(height = 40.dp)
                .align(Alignment.TopCenter)
                .offset(
                    y = 210.dp
                )

        ) {
            val containerColor = Color(0xfffafca3)
            var text by remember { mutableStateOf("") }
            OutlinedTextField(
                value = text,
                onValueChange = { text = it},
                label = {Text("請輸入電子郵件")},
                //placeholder = {Text("電子")},
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = containerColor,
                    unfocusedContainerColor = containerColor,
                    disabledContainerColor = Color.Transparent),
                modifier = Modifier
                    .requiredWidth(width = 280.dp)
                    .requiredHeight(height = 60.dp),
                shape = RoundedCornerShape(20.dp)
            )

        }

        Box(
            modifier = modifier
                .requiredWidth(width = 280.dp)
                .requiredHeight(height = 40.dp)
                .align(Alignment.TopCenter)
                .offset(
                    y = 270.dp
                )

        ) {
            val containerColor = Color(0xfffafca3)
            var text by remember { mutableStateOf("") }
            OutlinedTextField(
                value = text,
                onValueChange = { text = it},
                label = {Text("請輸入密碼")},
                //placeholder = {Text("電子")},
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = containerColor,
                    unfocusedContainerColor = containerColor,
                    disabledContainerColor = Color.Transparent),
                modifier = Modifier
                    .requiredWidth(width = 280.dp)
                    .requiredHeight(height = 60.dp),
                shape = RoundedCornerShape(20.dp)
            )

        }

        Box(
            modifier = modifier
                .requiredWidth(width = 280.dp)
                .requiredHeight(height = 40.dp)
                .align(Alignment.TopCenter)
                .offset(
                    y = 330.dp
                )

        ) {
            val containerColor = Color(0xfffafca3)
            var text by remember { mutableStateOf("") }
            OutlinedTextField(
                value = text,
                onValueChange = { text = it},
                label = {Text("再次輸入密碼")},
                //placeholder = {Text("電子")},
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = containerColor,
                    unfocusedContainerColor = containerColor,
                    disabledContainerColor = Color.Transparent),
                modifier = Modifier
                    .requiredWidth(width = 280.dp)
                    .requiredHeight(height = 60.dp),
                shape = RoundedCornerShape(20.dp)
            )
        }

        val radioOptions = listOf("男孩","女孩")
        var selectedOption by remember { mutableStateOf(radioOptions[0]) }
        Row(
            modifier = Modifier
                .requiredWidth(width = 280.dp)
                .padding(0.dp, 8.dp)
                .align(Alignment.TopCenter)
                .offset(y = 380.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically

        ) {
            Text(
                text = "我是：",
                fontSize = 15.sp,
                modifier = Modifier

            )
            radioOptions.forEach { gender ->
                Row(verticalAlignment = Alignment.CenterVertically) {
                    RadioButton(
                        selected = (gender == selectedOption),
                        onClick = { selectedOption = gender }
                    )
                    Text(
                        text = gender,
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = Modifier.padding(start = 3.dp)
                    )
                }
            }

        }

        Row (
            modifier = Modifier
                .requiredWidth(width = 280.dp)
                .padding(0.dp, 8.dp)
                .align(Alignment.TopCenter)
                .offset(y = 430.dp),
            horizontalArrangement = Arrangement.spacedBy(3.dp),
            verticalAlignment = Alignment.CenterVertically

        ) {
            Text(text = "我的生日：")

            var dateDialogController by  remember { mutableStateOf(false) }
            val currentDate = remember {
                Calendar.getInstance().apply {
                    set(Calendar.YEAR, 2024)
                    set(Calendar.MONTH, 5)
                    set(Calendar.DAY_OF_MONTH, 13)
                }.timeInMillis
            }
            val dateState = rememberDatePickerState(
                initialSelectedDateMillis = currentDate,
                yearRange = 1990..2024
            )
            var selectedDate by remember { mutableLongStateOf(0L) } //回傳選擇的日期
            Button(onClick = { dateDialogController = true }) {
                Text(text = "選擇日期")
            }
            if (dateDialogController) {
                DatePickerDialog(
                    onDismissRequest = { dateDialogController = false },
                    confirmButton = {
                        TextButton(onClick = {
                            if(dateState.selectedDateMillis != null){
                                selectedDate = dateState.selectedDateMillis!!
                            }
                            dateDialogController = false
                        }) {
                            Text(text = "確認")
                        }
                    },
                    dismissButton = {
                        TextButton(onClick = {
                            dateDialogController = false
                        }) {
                            Text(text = "取消")
                        }
                    }
                ) {
                    DatePicker(
                        state = dateState
                    )
                }
            }

            Text(text = if (selectedDate != 0L) convertLongToDate(selectedDate) else "尚未選擇日期")
            
        }



        Box(
            modifier = modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .offset(
                    y = 250.dp
                )

        ) {
            Image(
                painter = painterResource(id = R.drawable.red_circle),
                contentDescription = "red_cycle",
                modifier = modifier
                    .fillMaxSize()
                    .align(Alignment.BottomCenter)
            )
        }
        Box(
            modifier = modifier
                .requiredWidth(width = 120.dp)
                .requiredHeight(height = 60.dp)
                .align(Alignment.BottomCenter)
                .offset(
                    y = (-50).dp
                )

        ) {
            OutlinedButton(
                onClick = { },
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xfffafca3)),
                border = BorderStroke(1.dp, Color(0xff534e4e)),
                modifier = Modifier
                    .requiredWidth(width = 100.dp)
                    .requiredHeight(height = 50.dp)
                    .align(Alignment.Center)
                    ){}
            Text(
                text = stringResource(R.string.register),
                color = Color.Black.copy(alpha = 0.25f),
                fontSize = 20.sp,
                style = MaterialTheme.typography.displaySmall,
                modifier = Modifier
                    .align(Alignment.Center))
        }


    }
}


fun convertLongToDate(time: Long): String {
    val date = Date(time)
    val format = SimpleDateFormat.getDateInstance(SimpleDateFormat.DEFAULT, Locale.CHINESE)
    return format.format(date)
}


@Preview
@Composable
private fun GeneratedCodePreview() {
    GeneratedCode(Modifier)
}

//@Preview
//@Composable
//private fun TestTextFieldPreview() {
    //TestTextField()
//}