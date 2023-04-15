package com.example.basicstate

import androidx.compose.runtime.toMutableStateList

class ViewModel {
    private val _tasks =  getListaTareasSaludables().toMutableStateList()

    // Desde fuera de la clase solo se puede consultar la lista
    public val tasks: List<TareaSaludable>
        get() = _tasks


    fun remove(item: TareaSaludable) {
        _tasks.remove(item)
    }
}


private fun getListaTareasSaludables() = List(30) { i-> TareaSaludable(
    id = i,
    label = "Tarea # $i"
)
}