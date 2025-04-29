package com.example.prototipo_app_kotlin2.Screms

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.prototipo_app_kotlin2.ui.theme.ColorB
import com.example.prototipo_app_kotlin2.ui.theme.ColorGray

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
public fun Favorites(navController: NavController){
    Scaffold(
        topBar = {
            SearchHome()
        },
        bottomBar = {
            BottomAppBar_Home(ColorBtn_NLighBlue = ColorB, ColorBtn_NWhite = ColorGray, TextL = "Favorites", navController = navController)
        }
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 98.dp, bottom = 98.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Text("Favorites")
        }
    }
}