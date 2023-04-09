package com.example.basicstate

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

/**
 * Muestra cuántos basos de agua te has bebido
 * @param modifier Permite cambiar el aspecto
 */
@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    val numVasos = 0

    Text(
        text = stringResource(id = R.string.contador_vasos, numVasos),
        modifier = Modifier.padding(16.dp)
    )
}