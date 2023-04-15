package com.example.basicstate

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier


private fun getListaTareasSaludables() = List(30) { i-> TareaSaludable(
    id = i,
    label = "Tarea # $i"
)
}



@Composable
fun ListaTareasSaludables(
    modifier: Modifier = Modifier,
    list: List<TareaSaludable> = remember { getListaTareasSaludables() }
) {
    LazyColumn(modifier = modifier) {
        items(list) { task -> 
            TareaSaludable(texto = task.label)
        }
    }
}