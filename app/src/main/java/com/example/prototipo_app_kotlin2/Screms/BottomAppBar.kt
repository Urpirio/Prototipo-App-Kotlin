package com.example.prototipo_app_kotlin2.Screms

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.prototipo_app_kotlin2.Navegacion.PathForRender
import com.example.prototipo_app_kotlin2.R




@Composable
public fun BottomAppBar_Home(ColorBtn_NWhite: Color, ColorBtn_NLighBlue: Color,TextL:String,navController: NavController){

    var Location = remember { mutableStateOf(TextL) }

    androidx.compose.material3.BottomAppBar {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            TextButton(//Home
                onClick = {
                    navController.navigate(route = PathForRender.Home.routes)
                }
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    if(Location.value == "Home"){
                        Icon(
                            imageVector = Icons.Default.Home,
                            contentDescription = "Home Btn",
                            tint = ColorBtn_NLighBlue,
                        )
                        Text("Home", style = TextStyle(
                            color = ColorBtn_NLighBlue
                        ) )
                    }else{
                        Icon(
                            imageVector = Icons.Default.Home,
                            contentDescription = "Home Btn",
                            tint = ColorBtn_NWhite,
                        )
                        Text("Home", style = TextStyle(
                            color = ColorBtn_NWhite
                        ) )
                    }
                }
            }
            TextButton(//Menu
                onClick = {
                    navController.navigate(route = PathForRender.Menu.routes)
                }
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    if(Location.value == "Menu"){
                        Icon(
                            painter = painterResource(R.drawable.book_open_regular_240__1_),
                            contentDescription = "Book Open",
                            tint = ColorBtn_NLighBlue,
                            modifier = Modifier
                                .height(25.dp)
                        )
                        Text("Menu", style = TextStyle(
                            color = ColorBtn_NLighBlue
                        ))
                    }else{
                        Icon(
                            painter = painterResource(R.drawable.book_open_regular_240__1_),
                            contentDescription = "Book Open",
                            tint = ColorBtn_NWhite,
                            modifier = Modifier
                                .height(25.dp)
                        )
                        Text("Menu", style = TextStyle(
                            color = ColorBtn_NWhite,
                        )
                        )
                    }

                }
            }
            TextButton(//Favorites
                onClick = {
                    navController.navigate(route = PathForRender.Favorites.routes)
                }
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    if(Location.value == "Favorites"){
                        Icon(
                            imageVector = Icons.Default.FavoriteBorder,
                            contentDescription = "Favorites",
                            tint = ColorBtn_NLighBlue
                        )
                        Text("Favorites", style = TextStyle(
                            color = ColorBtn_NLighBlue
                        )
                        )
                    }else{
                        Icon(
                            imageVector = Icons.Default.FavoriteBorder,
                            contentDescription = "Favorites",
                            tint = ColorBtn_NWhite
                        )
                        Text("Favorites", style = TextStyle(
                            color = ColorBtn_NWhite
                        ))
                    }
                }
            }
            TextButton(//Profile
                onClick = {
                    navController.navigate(route = PathForRender.Profile.routes)
                }
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    if (Location.value == "Profile"){
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = "Profile",
                            tint = ColorBtn_NLighBlue
                        )
                        Text("Profile", style = TextStyle(
                            color = ColorBtn_NLighBlue
                        ))
                    }else{
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = "Profile",
                            tint = ColorBtn_NWhite
                        )
                        Text("Profile", style = TextStyle(
                            color = ColorBtn_NWhite
                        )
                        )
                    }
                }
            }
            TextButton(//Cart
                onClick = {
                    navController.navigate(route = PathForRender.Cart.routes)
                }
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    if(Location.value == "Cart"){
                        Icon(
                            imageVector = Icons.Default.ShoppingCart,
                            contentDescription = "Cart",
                            tint = ColorBtn_NLighBlue
                        )
                        Text("Cart", style = TextStyle(
                            color = ColorBtn_NLighBlue
                        ))
                    }else{
                        Icon(
                            imageVector = Icons.Default.ShoppingCart,
                            contentDescription = "Cart",
                            tint = ColorBtn_NWhite
                        )
                        Text("Cart", style = TextStyle(
                            color = ColorBtn_NWhite
                        ))
                    }
                }
            }
        }
    }
}