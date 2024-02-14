# Articulo App Android
Se trata de una app Android que muestra un listado de tareas que puedes indicar si las has
realizado o no. Es parte del [tutorial de aprendizaje de Android](https://developer.android.com/codelabs/jetpack-compose-state)

Este proyecto se enfoca en trabajar con estados de la UI (States).

El proyecto se ha realizado en **Android Studio**. Para usar este proyecto puede:
* Clonar este repositorio de git y abrirlo con el IDE
* Abrir el IDE e importar un nuevo proyecto desde VCS

## Rama remember_mutable_compose
El estado de la app se ha guardado usando:
* remember y rememberSaveable
* mutableStateOf y toMutableStateList

Con rememberSaveable no podemos guardar estruturas de datos complejas, como listas.
Por tanto donde usamos remember para la lista de tareas, vamos a tener un comportamiento no deseado:
Las tareas se borran correctamente pero cuando se produce un cambio de configuración (cambio de orientción
de la pantalla, cambio de idioma, modo oscuro/claro...) las tareas borradas vuelven a aparecer.

Para realizar correctamente la app se va a diseñar e implementar un **ViewModel**, un componente que
indica al UI State cómo actuar ante diferentes eventos. Para ello vaya a la rama **viewmodel**.

## Versión Android
* API 31 para sdk 12
 
## Solución propuesta por Android
[Solución](https://github.com/googlecodelabs/android-compose-codelabs)
