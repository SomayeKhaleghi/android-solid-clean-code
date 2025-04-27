package com.sample.compose_textfield

import androidx.compose.runtime.*
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sample.compose_textfield.ui.theme.ComposetextfieldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposetextfieldTheme {
                MyScreen()

            }
        }
    }
}

@Composable
fun MyScreen() {
    var text by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center // Center content inside Box
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally // Center inside Column
        ) {
            TextField(
                value = text,
                onValueChange = { newText ->
                    text = newText
                },
                label = { Text("Enter text") }
            )

            Spacer(modifier = Modifier.height(24.dp)) // Space between TextField and Text

            Text(
                text = "You typed: $text"
            )
        }
    }

}