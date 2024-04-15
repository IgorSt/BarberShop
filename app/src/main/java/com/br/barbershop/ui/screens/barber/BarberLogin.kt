package com.br.barbershop.ui.screens.barber

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.br.barbershop.R
import com.br.barbershop.ui.theme.BarberShopTheme

@Composable
fun BarberLoginScreen(navController: NavController) {
    BarberShopTheme {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            UserText()
            UserPassword()
            ContinueButton()
        }
    }
}

@Composable
fun UserText() {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        modifier = Modifier
            .padding(bottom = 8.dp)
            .fillMaxWidth()
            .padding(horizontal = 36.dp),
        value = text,
        onValueChange = { text = it },
        singleLine = true,
        label = { Text(text = stringResource(R.string.barber_login),) }
    )
}

@Composable
fun UserPassword() {
    var password by remember { mutableStateOf("") }

    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 36.dp),
        value = password,
        onValueChange = { password = it },
        label = { Text(text = stringResource(R.string.barber_password)) },
        visualTransformation = PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
    )
}

@Composable
fun ContinueButton() {
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 36.dp)
            .padding(top = 16.dp),
        onClick = { /*TODO*/ }
    ) {
        Text(text = stringResource(R.string.barber_enter))
    }
}

@Preview(showBackground = true)
@Composable
fun BarberLoginScreenPreview() {
    BarberLoginScreen(rememberNavController())
}