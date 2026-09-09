package com.example.myapplication

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun SimpleListExample() {
    val itemsList = listOf("Elemento 1", "Elemento 2", "Elemento 3")
    LazyColumn {
        items(itemsList) { item ->
            Text(text = item)
        }
    }
}