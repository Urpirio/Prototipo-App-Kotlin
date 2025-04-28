package com.example.prototipo_app_kotlin2.Screms

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.prototipo_app_kotlin2.Navegacion.PathForRender
import com.example.prototipo_app_kotlin2.Screms.ComponentsRegister.FormRegister

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@ExperimentalMaterial3Api
@Composable
public fun Register(navController: NavController){
    Scaffold (
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black)
        ) {
            Row (
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier
                    .fillMaxHeight(0.2f)
                    .fillMaxWidth()
                    .background(Color.Black)
                    .padding(20.dp)
            ) {
                IconButton(
                    onClick = {navController.navigate(route = PathForRender.Login.routes)}
                ) {
                    Icon(imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Arrow back",)
                }

                Text("Sign up", style = TextStyle(
                    fontSize = 30.sp
                ), modifier = Modifier
                    .padding(start = 65.dp)
                )
            }
            Column (
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(shape = RoundedCornerShape(topStart = 80.dp))
                    .background(Color.White)
                    .padding(top = 40.dp)
            ) {
                FormRegister()
                Spacer(modifier = Modifier.height(20.dp))
                TextButton(
                    onClick = {},
                    modifier = Modifier
                        .fillMaxWidth(0.9f)
                        .border(width = 1.dp, color = Color.Black,shape = RoundedCornerShape(10.dp))
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(Color.Black)

                ) {
                    Text("Sign up", style = TextStyle(
                        fontSize = 20.sp
                    ))
                }
            }
        }
    }
}