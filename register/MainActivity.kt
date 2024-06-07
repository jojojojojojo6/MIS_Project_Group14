package com.example.myapplication3

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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TimeInput
import androidx.compose.material3.TimePickerDefaults
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.material3.rememberTimePickerState
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication3.ui.theme.MyApplication3Theme
import java.text.SimpleDateFormat
import java.time.format.TextStyle
import java.util.Calendar
import java.util.Date
import java.util.Locale

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RegisterCode1()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterCode1(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.White)
            .verticalScroll(rememberScrollState())  //使介面可滾動
    ) {
        TextButton( //返回上一頁
            onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            modifier = modifier
                .requiredSize(size = 36.dp)
                .offset( x = 20.dp, y = 20.dp)  //元素對齊
        ) {
            Image(
                painter = painterResource(id = R.drawable.back),  //引入照片
                contentDescription = "back",
                modifier = Modifier
                    .requiredSize(size = 36.dp)
                    .fillMaxSize())
        }

        Image( //泡泡左
            painter = painterResource(id = R.drawable.bubble_1),
            contentDescription = "bubble_1",
            modifier = modifier
                .requiredWidth(width = 74.dp)
                .requiredHeight(height = 60.dp)
                .offset(x = 40.dp, y = 80.dp))

        Image( //泡泡右
            painter = painterResource(id = R.drawable.bubble_2),
            contentDescription = "bubble_2",
            modifier = modifier
                .requiredWidth(width = 99.dp)
                .requiredHeight(height = 78.dp)
                .offset(x = 260.dp, y = 30.dp))

        Text(
            text = "基本資料",
            color = Color.Black,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            modifier = modifier
                .align(Alignment.TopCenter)
                .offset(
                    y = 60.dp
                ))

        Box(
            modifier = modifier
                .requiredWidth(width = 210.dp)
                .requiredHeight(height = 0.dp)
                .align(Alignment.TopCenter)
                .offset(
                    y = 170.dp
                )

        ) {
            val containerColor = Color(0xffb4cfe2)
            var text by remember { mutableStateOf("") }
            OutlinedTextField(
                value = text,
                onValueChange = { text = it},
                label = {Text("姓名", color = Color.Black)},
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

        Box(
            modifier = modifier
                .requiredWidth(width = 210.dp)
                .requiredHeight(height = 0.dp)
                .align(Alignment.TopCenter)
                .offset(
                    y = 230.dp
                )

        ) {
            val containerColor = Color(0xffb4cfe2)
            var text by remember { mutableStateOf("") }
            OutlinedTextField(
                value = text,
                onValueChange = { text = it},
                label = {Text("電子郵件", color = Color.Black)},
                colors = OutlinedTextFieldDefaults.colors(
                    focusedContainerColor = containerColor,
                    unfocusedContainerColor = containerColor,
                    disabledContainerColor = Color.Transparent,
                    unfocusedBorderColor = Color.White,
                    focusedBorderColor = Color.White),
                modifier = Modifier
                    .requiredWidth(width = 210.dp)
                    .requiredHeight(height = 60.dp),
                shape = RoundedCornerShape(15.dp)
            )

        }

        Row (
            modifier = Modifier
                .requiredWidth(width = 210.dp)
                .padding(1.dp, 8.dp)
                .align(Alignment.TopCenter)
                .offset(y = 260.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalAlignment = Alignment.CenterVertically

        ) {
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
            Button(
                onClick = { dateDialogController = true },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xffb4cfe2), contentColor = Color.Black),
                shape = RoundedCornerShape(15.dp)) {
                Text(text = "選擇生日")
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
                .requiredWidth(width = 210.dp)
                .requiredHeight(height = 0.dp)
                .align(Alignment.TopCenter)
                .offset(
                    y = 350.dp
                )

        ) {
            val containerColor = Color(0xffb4cfe2)
            var text by remember { mutableStateOf("") }
            OutlinedTextField(
                value = text,
                onValueChange = { text = it},
                label = {Text("密碼", color = Color.Black)},
                colors = OutlinedTextFieldDefaults.colors(
                    focusedContainerColor = containerColor,
                    unfocusedContainerColor = containerColor,
                    disabledContainerColor = Color.Transparent,
                    unfocusedBorderColor = Color.White,
                    focusedBorderColor = Color.White),
                modifier = Modifier
                    .requiredWidth(width = 210.dp)
                    .requiredHeight(height = 60.dp),
                shape = RoundedCornerShape(15.dp)
            )

        }

        Box( //確認密碼
            modifier = modifier
                .requiredWidth(width = 210.dp)
                .requiredHeight(height = 0.dp)
                .align(Alignment.TopCenter)
                .offset(
                    y = 410.dp
                )

        ) {
            val containerColor = Color(0xffb4cfe2)
            var text by remember { mutableStateOf("") }
            OutlinedTextField(
                value = text,
                onValueChange = { text = it},
                label = {Text("確認密碼", color = Color.Black)},
                colors = OutlinedTextFieldDefaults.colors(
                    focusedContainerColor = containerColor,
                    unfocusedContainerColor = containerColor,
                    disabledContainerColor = Color.Transparent,
                    unfocusedBorderColor = Color.White,
                    focusedBorderColor = Color.White),
                modifier = Modifier
                    .requiredWidth(width = 210.dp)
                    .requiredHeight(height = 60.dp),
                shape = RoundedCornerShape(15.dp)
            )

        }

        Button( //前往下一頁
            onClick = { },
            shape = RoundedCornerShape(15.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
            modifier = modifier
                .requiredWidth(width = 100.dp)
                .requiredHeight(height = 50.dp)
                .align(Alignment.TopCenter)
                .offset(
                    y = 480.dp
                )
        ){
            Text(text = "繼續")
        }

    }
}


fun convertLongToDate(time: Long): String {
    val date = Date(time)
    val format = SimpleDateFormat.getDateInstance(SimpleDateFormat.DEFAULT, Locale.CHINESE)
    return format.format(date)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterCode2(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.White)
            .verticalScroll(rememberScrollState())  //使介面可滾動
    ) {
        TextButton( //返回上一頁
            onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            modifier = modifier
                .requiredSize(size = 36.dp)
                .offset( x = 20.dp, y = 20.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.back),
                contentDescription = "back",
                modifier = Modifier
                    .requiredSize(size = 36.dp)
                    .fillMaxSize())
        }

        Image( //泡泡左
            painter = painterResource(id = R.drawable.bubble_1),
            contentDescription = "bubble_1",
            modifier = modifier
                .requiredWidth(width = 74.dp)
                .requiredHeight(height = 60.dp)
                .offset(x = 40.dp, y = 80.dp))

        Image( //泡泡右
            painter = painterResource(id = R.drawable.bubble_2),
            contentDescription = "bubble_2",
            modifier = modifier
                .requiredWidth(width = 99.dp)
                .requiredHeight(height = 78.dp)
                .offset(x = 260.dp, y = 30.dp))

        Text(
            text = "使用習慣",
            color = Color.Black,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            modifier = modifier
                .align(Alignment.TopCenter)
                .offset(
                    y = 60.dp
                ))

        Text(
            text = "起床時間",
            color = Color.Black,
            fontSize = 20.sp,
            modifier = modifier
                .align(Alignment.TopCenter)
                .offset(
                    y = 150.dp
                ))

        val wakeState = rememberTimePickerState(8, 0, true)
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = modifier
                .align(Alignment.TopCenter)
                .offset(
                    y = 190.dp
                )
        ) {
            TimeInput( //時間輸入框
                state = wakeState,
                colors = TimePickerDefaults.colors(
                    timeSelectorSelectedContainerColor = Color(0xffb4cfe2),
                    timeSelectorSelectedContentColor = Color.Black,
                    timeSelectorUnselectedContainerColor = Color(0xffb4cfe2),
                    timeSelectorUnselectedContentColor = Color.Black
                ))
            //Text(text = " ${wakeState.hour} : ${wakeState.minute}")  //取得時間輸入值
        }

        Text(
            text = "睡覺時間",
            color = Color.Black,
            fontSize = 20.sp,
            modifier = modifier
                .align(Alignment.TopCenter)
                .offset(
                    y = 300.dp
                ))

        val sleepState = rememberTimePickerState(22, 0, true)
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = modifier
                .align(Alignment.TopCenter)
                .offset(
                    y = 340.dp
                )
        ) {
            TimeInput(  //時間輸入框
                state = sleepState,
                colors = TimePickerDefaults.colors(
                    timeSelectorSelectedContainerColor = Color(0xffb4cfe2),
                    timeSelectorSelectedContentColor = Color.Black,
                    timeSelectorUnselectedContainerColor = Color(0xffb4cfe2),
                    timeSelectorUnselectedContentColor = Color.Black
                ))
            //Text(text = " ${sleepState.hour} : ${sleepState.minute}") //取得時間輸入值
        }

        Button( //註冊按鈕
            onClick = { },
            shape = RoundedCornerShape(15.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
            modifier = modifier
                .requiredWidth(width = 100.dp)
                .requiredHeight(height = 50.dp)
                .align(Alignment.TopCenter) //文字對齊
                .offset(
                    y = 480.dp
                )
        ){
            Text(text = "註冊")
        }

        Image( //讀書人圖片
            painter = painterResource(id = R.drawable.reading_man),
            contentDescription = "reading_man",
            modifier = modifier
                .requiredWidth(width = 374.dp)
                .requiredHeight(height = 312.dp)
                .offset(
                    y = 500.dp
                )
        )

    }
}


@Preview
@Composable
private fun Register2Preview() {
    RegisterCode1(Modifier)
}