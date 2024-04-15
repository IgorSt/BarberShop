package com.br.barbershop.ui.navigation

sealed class Screens(val route: String) {
    object MainScreen   : Screens("main_screen")
    object ClientScreen : Screens("client_screen")
    object BarberLogin : Screens("barber_login")
    object BarberScreen : Screens("barber_screen")
}