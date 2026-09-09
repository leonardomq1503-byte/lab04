package com.example.myapplication

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SimpleCardExample() {
    Card(modifier = Modifier.padding(16.dp)) {
        Text(text = "Ejemplo de Componente Card", modifier = Modifier.padding(16.dp))
    }
}