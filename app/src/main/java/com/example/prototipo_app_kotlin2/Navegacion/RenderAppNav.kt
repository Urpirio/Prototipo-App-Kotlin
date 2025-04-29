package com.example.prototipo_app_kotlin2.Navegacion

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.prototipo_app_kotlin2.Screms.Cart
import com.example.prototipo_app_kotlin2.Screms.Favorites
import com.example.prototipo_app_kotlin2.Screms.Home
import com.example.prototipo_app_kotlin2.Screms.Login
import com.example.prototipo_app_kotlin2.Screms.Menu
import com.example.prototipo_app_kotlin2.Screms.Profile
import com.example.prototipo_app_kotlin2.Screms.Register

@ExperimentalMaterial3Api
@Composable
public fun RenderAppNav(){
    var navController = rememberNavController()
    NavHost(navController = navController, startDestination = PathForRender.Login.routes){
        composable(route = PathForRender.Login.routes){
            Login(navController)
        }
        composable(route = PathForRender.Register.routes){
            Register(navController)
        }
        composable(route = PathForRender.Home.routes){
            Home(navController)
        }
        composable(route = PathForRender.Menu.routes){
            Menu(navController)
        }
        composable(route = PathForRender.Favorites.routes){
            Favorites(navController)
        }
        composable(route = PathForRender.Profile.routes){
            Profile(navController)
        }
        composable(route = PathForRender.Cart.routes){
            Cart(navController)
        }
    }
}