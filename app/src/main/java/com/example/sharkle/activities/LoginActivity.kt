package com.example.sharkle.activities

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.sharkle.components.Button
import com.example.sharkle.components.OutlinedTextField

@Composable
fun LoginActivity(modifier: Modifier = Modifier) {
    Surface(color = MaterialTheme.colorScheme.background, modifier = modifier.fillMaxSize()) {
        Column( verticalArrangement = Arrangement.spacedBy(4.dp), modifier = modifier.padding(20.dp) ) {
            Text(text = "Welcome Back!")
            Text(text = "Email")
            OutlinedTextField()
            Text(text = "Password")
            OutlinedTextField()
            Button()
        }
    }
}