package com.appsian.movieapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.appsian.movieapp.screens.details.DetailsScreen
import com.appsian.movieapp.screens.home.HomeScreen

@Composable
fun MovieNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = MovieScreens.HomeScreen.name
    ) {
        composable(MovieScreens.HomeScreen.name) {
            //here we pass where we should go
            HomeScreen(navController = navController)
        }

        composable(MovieScreens.DetailScreen.name){
            DetailsScreen(navController = navController)
        }
    }
}