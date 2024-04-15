package com.br.barbershop.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.br.barbershop.ui.screens.barber.BarberLoginScreen
import com.br.barbershop.ui.screens.login.LoginScreen

@Composable
fun NavHostBarberShop(
    navController: NavHostController,
    startDestination: String
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(route = Screens.MainScreen.route) {
            LoginScreen(navController)
        }
        composable(route = Screens.BarberLogin.route) {
            BarberLoginScreen(navController)
        }
    }
}