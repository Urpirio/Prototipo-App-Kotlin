package com.example.prototipo_app_kotlin2.Screms

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.prototipo_app_kotlin2.Screms.ComponentsLogin.FormLogin
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.navigation.NavController
import com.example.prototipo_app_kotlin2.Navegacion.PathForRender

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@ExperimentalMaterial3Api
@Composable
public fun Login(navController: NavController){
    var Change by remember { mutableStateOf(true) }
    var TextChange by remember { mutableStateOf( "I'don't have a Account?") }
        Column (
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black)
        ) {
            Row (//Header
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .background(Color.Black)
                    .fillMaxWidth()
                    .fillMaxHeight(0.3f)

            ) {
                Image(
                    painter = painterResource(com.example.prototipo_app_kotlin2.R.drawable.logo),
                    contentDescription = "Logo-App",
                    Modifier
                        .height(150.dp)
                        .width(150.dp)
                )
            }
            Column (//Formulario
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top,
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(topStart = 80.dp))
                    .background(Color.White)
                    .fillMaxHeight()
                    .fillMaxWidth()
            ) {
                Row (//titulo-Formulario
                    modifier = Modifier
                        .padding(30.dp)
                ) {
                    Text("Login", style = TextStyle(
                        color = Color.Black,
                        fontSize = 40.sp,
                        fontWeight = FontWeight.Bold
                    ))
                }
                FormLogin(navController)//Input-Formulario
                Row (
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(" $TextChange")
                    TextButton(
                        onClick = { navController.navigate(route = PathForRender.Register.routes)}
                    ) {
                        Text("Sign up", style = TextStyle(

                        ))
                    }
                }

            }
        }
}