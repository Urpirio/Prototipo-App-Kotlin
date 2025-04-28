package com.example.prototipo_app_kotlin2.Screms.ComponentsHome


data class DataHome(val ProductName: String,val Price: String)

val DataCardHome = listOf(
    DataHome(
        ProductName = "Espresso",
        Price = "1.50"
    ),
    DataHome(
        ProductName = "Americano",
        Price = "2.00"
    ),
    DataHome(
        ProductName = "Latte",
        Price = "3.00"
    ),
    DataHome(
        ProductName = "Cappuccino",
        Price = "3.50"
    ),
    DataHome(
        ProductName = "Macchiato",
        Price = "4.00"
    ),
)