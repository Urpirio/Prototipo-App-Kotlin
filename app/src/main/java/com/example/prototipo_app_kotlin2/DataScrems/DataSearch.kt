package com.example.prototipo_app_kotlin2.DataScrems

import android.icu.text.CaseMap.Title
import androidx.compose.runtime.Composable

data class ObjectData(val Title: String,val Img: Int)

val  DataSearch = listOf(
    ObjectData(
        Title = "Espresso",
        Img = 1
    ),
    ObjectData(
        Title = "Americano",
        Img = 1
    ),
    ObjectData(
        Title = "Cappuccino",
        Img = 1
    ),
    ObjectData(
        Title = "Macchiato",
        Img = 1
    ),
    ObjectData(
        Title = "Flat White",
        Img = 1
    )
)
