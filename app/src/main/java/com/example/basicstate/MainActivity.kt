package com.example.basicstate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.basicstate.ui.theme.BasicStateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicStateTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    App()
                }
            }
        }
    }
}

/**
 * UI de la aplicación
 * @param modifier Permite cambiar el aspecto
 */
@Composable
fun App(modifier: Modifier = Modifier) {
    var vasosBebidos by rememberSaveable { mutableStateOf(0) }
    
    Column(modifier = modifier) {
        WaterCounter(vasosBebidos, { ++vasosBebidos }, modifier)

        val listaTareas = remember {
            getListaTareasSaludables().toMutableStateList()
        }
        ListaTareasSaludables(list = listaTareas, oncloseTask = { task -> listaTareas.remove(task) })
    }
}


private fun getListaTareasSaludables() = List(30) { i-> TareaSaludable(
    id = i,
    label = "Tarea # $i"
)
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    BasicStateTheme {
        App()
    }
}