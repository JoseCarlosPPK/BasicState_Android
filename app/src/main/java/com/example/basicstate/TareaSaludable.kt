package com.example.basicstate

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Checkbox
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * Opción elegante donde usamos la variable checked tal cual si tener
 * que usar task.checked.value (notación específica por usar mutableStateOf)
 */
/*
class WellnessTask(
    val id: Int,
    val label: String,
    initialChecked: Boolean = false
) {
    var checked by mutableStateOf(initialChecked)
}
*/

data class TareaSaludable(
    val id: Int,
    val label: String,
    val checked: MutableState<Boolean> = mutableStateOf(false)
)



@Composable
fun TareaSaludable(
    texto: String,
    onClose: () -> Unit,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            modifier = Modifier
                .weight(1f)
                .padding(start = 16.dp),
            text = texto
        )

        Checkbox(checked = checked, onCheckedChange = onCheckedChange)

        IconButton(onClick = onClose) {
            Icon(Icons.Filled.Close, contentDescription = stringResource(id = R.string.cerrar_tarea))
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun Visualizacion() {
    TareaSaludable(texto = "Prueba", onClose = { /*TODO*/ }, checked = true, onCheckedChange = {})
}