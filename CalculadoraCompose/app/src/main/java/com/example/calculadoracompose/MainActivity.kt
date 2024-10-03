package com.example.calculadoracompose

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val textState = rememberSaveable { mutableStateOf("")}
            val configuration = LocalConfiguration.current
            when (configuration.orientation) {
                Configuration.ORIENTATION_LANDSCAPE -> {
                    CalculadoraAppHorizontal(textState = textState)
                }

                else -> {
                    CalculatorAppVertical(textState = textState)
                }
            }
        }
    }
}
@Preview(
    showBackground = true, showSystemUi = true,
    device = "spec:width=411dp,height=891dp,orientation=landscape"
)
@Composable
fun CalculadoraAppHorizontal(textState: MutableState<String> = rememberSaveable { mutableStateOf("") }) {

    val buttonModifier = Modifier
        .size(70.dp)
        .padding(4.dp)

    val buttonColors = ButtonDefaults.buttonColors(
        containerColor = Color.Blue,
        contentColor = Color.White
    )

    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .border(2.dp, Color.Black)
                .padding(16.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Text(
                text = textState.value,
                modifier = Modifier.fillMaxWidth(),
                fontSize = 24.sp,
                textAlign = TextAlign.Center
            )
        }
        Row {
            Button(
                onClick = { textState.value += "1" },
                modifier = buttonModifier,
                colors = buttonColors
            ) {
                Text("1")
            }
            Button(
                onClick = { textState.value += "2" },
                modifier = buttonModifier,
                colors = buttonColors
            ) {
                Text("2")
            }
            Button(
                onClick = { textState.value += "3" },
                modifier = buttonModifier,
                colors = buttonColors
            ) {
                Text("3")
            }
            Button(
                onClick = { textState.value += "+" },
                modifier = buttonModifier,
                colors = buttonColors
            ) {
                Text("+")
            }
        }

        Row {
            Button(
                onClick = { textState.value += "4" },
                modifier = buttonModifier,
                colors = buttonColors
            ) {
                Text("4")
            }
            Button(
                onClick = { textState.value += "5" },
                modifier = buttonModifier,
                colors = buttonColors
            ) {
                Text("5")
            }
            Button(
                onClick = { textState.value += "6" },
                modifier = buttonModifier,
                colors = buttonColors
            ) {
                Text("6")
            }
            Button(
                onClick = { textState.value += "-" },
                modifier = buttonModifier,
                colors = buttonColors
            ) {
                Text("-")
            }
        }

        Row {
            Button(
                onClick = { textState.value += "7" },
                modifier = buttonModifier,
                colors = buttonColors
            ) {
                Text("7")
            }
            Button(
                onClick = { textState.value += "8" },
                modifier = buttonModifier,
                colors = buttonColors
            ) {
                Text("8")
            }
            Button(
                onClick = { textState.value += "9" },
                modifier = buttonModifier,
                colors = buttonColors
            ) {
                Text("9")
            }
            Button(
                onClick = { textState.value += "*" },
                modifier = buttonModifier,
                colors = buttonColors
            ) {
                Text("*")
            }
        }

        Row {
            Button(
                onClick = { textState.value = "" },
                modifier = buttonModifier,
                colors = buttonColors
            ) {
                Text("C")
            }
            Button(
                onClick = { textState.value += "0" },
                modifier = buttonModifier,
                colors = buttonColors
            ) {
                Text("0")
            }
            Button(
                onClick = { textState.value += "=" },
                modifier = buttonModifier,
                colors = buttonColors
            ) {
                Text("=")
            }
            Button(
                onClick = { textState.value += "/" },
                modifier = buttonModifier,
                colors = buttonColors
            ) {
                Text("/")
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CalculatorAppVertical(textState: MutableState<String> = rememberSaveable { mutableStateOf("") }) {
    val buttonModifier = Modifier
        .size(70.dp)
        .padding(4.dp)

    val buttonColors = ButtonDefaults.buttonColors(
        containerColor = Color.Blue,
        contentColor = Color.White
    )

    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .border(2.dp, Color.Black)
                .padding(16.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Text(
                text = textState.value,
                modifier = Modifier.fillMaxWidth(),
                fontSize = 24.sp,
                textAlign = TextAlign.Center
            )
        }

        Row {
            Button(
                onClick = { textState.value += "1" },
                modifier = buttonModifier,
                colors = buttonColors
            ) {
                Text("1")
            }
            Button(
                onClick = { textState.value += "2" },
                modifier = buttonModifier,
                colors = buttonColors
            ) {
                Text("2")
            }
            Button(
                onClick = { textState.value += "3" },
                modifier = buttonModifier,
                colors = buttonColors
            ) {
                Text("3")
            }
            Button(
                onClick = { textState.value += "+" },
                modifier = buttonModifier,
                colors = buttonColors
            ) {
                Text("+")
            }
        }

        Row {
            Button(
                onClick = { textState.value += "4" },
                modifier = buttonModifier,
                colors = buttonColors
            ) {
                Text("4")
            }
            Button(
                onClick = { textState.value += "5" },
                modifier = buttonModifier,
                colors = buttonColors
            ) {
                Text("5")
            }
            Button(
                onClick = { textState.value += "6" },
                modifier = buttonModifier,
                colors = buttonColors
            ) {
                Text("6")
            }
            Button(
                onClick = { textState.value += "-" },
                modifier = buttonModifier,
                colors = buttonColors
            ) {
                Text("-")
            }
        }

        Row {
            Button(
                onClick = { textState.value += "7" },
                modifier = buttonModifier,
                colors = buttonColors
            ) {
                Text("7")
            }
            Button(
                onClick = { textState.value += "8" },
                modifier = buttonModifier,
                colors = buttonColors
            ) {
                Text("8")
            }
            Button(
                onClick = { textState.value += "9" },
                modifier = buttonModifier,
                colors = buttonColors
            ) {
                Text("9")
            }
            Button(
                onClick = { textState.value += "*" },
                modifier = buttonModifier,
                colors = buttonColors
            ) {
                Text("*")
            }
        }

        Row {
            Button(
                onClick = { textState.value = "" },
                modifier = buttonModifier,
                colors = buttonColors
            ) {
                Text("C")
            }
            Button(
                onClick = { textState.value += "0" },
                modifier = buttonModifier,
                colors = buttonColors
            ) {
                Text("0")
            }
            Button(
                onClick = { textState.value += "=" },
                modifier = buttonModifier,
                colors = buttonColors
            ) {
                Text("=")
            }
            Button(
                onClick = { textState.value += "/" },
                modifier = buttonModifier,
                colors = buttonColors
            ) {
                Text("/")
            }
        }
    }
}
