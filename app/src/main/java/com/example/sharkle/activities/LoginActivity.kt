package com.example.sharkle.activities

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sharkle.components.Button
import com.example.sharkle.components.OutlinedTextField

@Composable
fun LoginActivity(modifier: Modifier = Modifier) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Surface(color = MaterialTheme.colorScheme.background, modifier = modifier.fillMaxSize()) {
        Column( verticalArrangement = Arrangement.spacedBy(12.dp), modifier = modifier.padding(20.dp) ) {
            Text(text = "Welcome Back!", fontSize = 24.sp)
            Column {
                Text(text = "Email")
                OutlinedTextField(value = email, onValueChange = { email = it })
            }
            Column {
                Text(text = "Password")
                OutlinedTextField(value = password, onValueChange = { password = it })
            }
            Button()
        }
    }
}