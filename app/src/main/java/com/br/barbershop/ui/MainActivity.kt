package com.br.barbershop.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.br.barbershop.ui.navigation.NavHostBarberShop
import com.br.barbershop.ui.navigation.Screens
import com.br.barbershop.ui.theme.BarberShopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BarberShopTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    
                    NavHostBarberShop(
                        navController = navController,
                        startDestination = Screens.MainScreen.route
                    )

                    navController.navigate(Screens.MainScreen.route)
                }
            }
        }
    }
}