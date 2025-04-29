package com.example.prototipo_app_kotlin2.Navegacion

sealed class PathForRender (val routes: String){
    object Login: PathForRender(routes = "Login")
    object Register: PathForRender(routes = "Register")
    object Home: PathForRender(routes = "Home")
    object Menu: PathForRender(routes = "Menu")
    object Favorites: PathForRender(routes = "Favorites")
    object Profile: PathForRender(routes = "Profile")
    object Cart: PathForRender(routes = "Cart")
}