package com.example.basicstate

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

/**
 * Muestra cuántos basos de agua te has bebido y proporciona un botón de incremento
 * @param modifier Permite cambiar el aspecto
 */
@Composable
fun WaterCounter(numVasos: Int, onIncrement: () -> Unit, modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        Text(
            text = stringResource(id = R.string.contador_vasos, numVasos),
        )
        
        Button(
            onClick = onIncrement,
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Text(text = stringResource(id = R.string.suma))
        }
    }
}