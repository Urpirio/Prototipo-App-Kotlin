package com.example.prototipo_app_kotlin2.Screms.ComponentsHome

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.prototipo_app_kotlin2.DataScrems.DataSearch

@ExperimentalMaterial3Api
@Composable
public fun SearchHome(){

    var contextT by remember { mutableStateOf("") }
    var SearchValue by remember { mutableStateOf("") }
    var ActiveBolean by remember { mutableStateOf(false) }
    var ArraySearch = SearchValue.split("");

    SearchBar(
        inputField = {
            SearchBarDefaults.InputField(
                query = SearchValue,
                onQueryChange = {SearchValue= it},
                onSearch = {ActiveBolean = false},
                expanded = ActiveBolean,
                onExpandedChange = {ActiveBolean = it},
                placeholder = { Text("Search") }
            )
        },
        expanded = ActiveBolean,
        onExpandedChange = {ActiveBolean = it}
    ) {
        if(SearchValue.isNotEmpty()){
            var FilterSearch = DataSearch.filter { it.Title.contains(SearchValue,false) }
            FilterSearch.forEach {
                    (Title) -> Box (
                modifier = Modifier
                    .padding(10.dp)
            ) { Text("${Title}", style = TextStyle(fontSize = 20.sp)) }

            }
        }
    }
}