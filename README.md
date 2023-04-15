# Articulo App Android
Se trata de una app Android que muestra un listado de tareas que puedes indicar si las has
realizado o no. Es parte del [tutorial de aprendizaje de Android](https://developer.android.com/codelabs/jetpack-compose-state)

Este proyecto se enfoca en trabajar con estados de la UI (States).

El proyecto se ha realizado en **Android Studio**. Para usar este proyecto puede:
* Clonar este repositorio de git y abrirlo con el IDE
* Abrir el IDE e importar un nuevo proyecto desde VCS

## Rama viewmodel
El estado de la app se ha guardado creando una clase propia ViewModel. Esta guarda la lista de 
tareas, proporciona un método de consulta (solo lectura) y un método para borrar una tarea.

Por tanto el ViewModel guarda el UI State y lo modifica. Pasa el UI State a las funciones
composables.

### Dependencias para el ViewModel
Se añade al fichero build.gradle de app:
```
implementation "androidx.lifecycle:lifecycle-viewmodel-compose:2.5.1"
```



## Versión Android
* API 31 para sdk 12
 
## Solución propuesta por Android
[Solución](https://github.com/googlecodelabs/android-compose-codelabs)
