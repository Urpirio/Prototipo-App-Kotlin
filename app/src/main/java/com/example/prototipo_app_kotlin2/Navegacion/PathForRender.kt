package com.example.prototipo_app_kotlin2.Navegacion

sealed class PathForRender (val routes: String){
    object Login: PathForRender(routes = "Login")
    object Register: PathForRender(routes = "Register")
}