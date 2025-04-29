package com.example.prototipo_app_kotlin2.Screms

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.prototipo_app_kotlin2.Screms.ComponentsHome.CardsHome1
import com.example.prototipo_app_kotlin2.Screms.ComponentsHome.DataCardHome
import com.example.prototipo_app_kotlin2.Screms.ComponentsHome.CardHome2
import com.example.prototipo_app_kotlin2.Screms.ComponentsHome.DataCardHome2
import com.example.prototipo_app_kotlin2.ui.theme.ColorB
import com.example.prototipo_app_kotlin2.ui.theme.ColorGray



@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@ExperimentalMaterial3Api
@Composable
public fun Home(navController: NavController){


        Scaffold (
            topBar = {
                SearchHome()
            },
            bottomBar = {
                BottomAppBar_Home(
                    ColorBtn_NWhite = ColorGray,
                    ColorBtn_NLighBlue = ColorB,
                    TextL = "Home",
                    navController = navController
                )
            }
        ) {
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 98.dp, bottom = 98.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                CardsHome1(ArrayData = DataCardHome)
                CardHome2(ArrayData = DataCardHome2)
            }
        }

}