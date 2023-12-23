package com.example.mywishlist.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mywishlist.ui.Screen.DetailScreen
import com.example.mywishlist.ui.Screen.ListingScreen

enum class Screen {
    Home,
    Detail
}

@Composable
fun MyNavigation(){
    //viewModel object
    val viewModel= viewModel<MyViewModel>()
    // uiState Object
    val uiState = viewModel.uiState.collectAsState()
    //navigation logic
    val navController = rememberNavController()
    //navigation routes
    NavHost(navController = navController, startDestination = Screen.Home.name){
        composable(Screen.Home.name){
            ListingScreen{
                viewModel.onItemSelected(it)
                navController.navigate(Screen.Detail.name)
            }
        }
        composable(Screen.Detail.name){
            DetailScreen(uiState.value)
        }
    }
}

