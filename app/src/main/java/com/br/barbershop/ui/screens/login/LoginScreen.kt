package com.br.barbershop.ui.screens.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.br.barbershop.R
import com.br.barbershop.ui.navigation.Screens
import com.br.barbershop.ui.theme.BarberShopTheme

@Composable
fun LoginScreen(navController: NavController) {
    BarberShopTheme {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 36.dp)
                    .padding(bottom = 8.dp),
                onClick = { navController.navigate(Screens.BarberLogin.route)}
            ) {
                Text(stringResource(R.string.login_barber))
            }
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 36.dp),
                onClick = { /*TODO*/ }
            ) {
                Text(stringResource(R.string.login_client))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen(rememberNavController())
}