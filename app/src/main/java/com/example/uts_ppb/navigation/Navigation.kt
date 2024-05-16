package com.example.uts_ppb.navigation

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.uts_ppb.screens.AuthenticationScreen
import com.example.uts_ppb.screens.ChooseTrainScreen
import com.example.uts_ppb.screens.HomeScreen
import com.example.uts_ppb.screens.ScheduleTrainScreen
import com.example.uts_ppb.screens.SplashScreen

@Composable
fun Navigation(navHost : NavHostController){
    NavHost(navController = navHost, startDestination = "Splash"){
        composable("Splash") {
            SplashScreen(navHost)
        }
        composable("Authentication"){
            AuthenticationScreen(navHost)
        }
        composable("Home"){
            HomeScreen(navHost)
        }
        composable("Schedule"){
            ScheduleTrainScreen(navHost)
        }
        composable("ChosseTrain"){
            ChooseTrainScreen(navHost)
        }
    }
}