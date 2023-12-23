package com.example.mywishlist.ui.Screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.mywishlist.ui.theme.UiState

@Composable
fun DetailScreen(uiState:UiState){
    Column (verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier= Modifier.fillMaxSize())
    {
        Text(text = "Detail Screen ")
        Text(text = uiState.selectedItem?.title ?: "")
    }
}