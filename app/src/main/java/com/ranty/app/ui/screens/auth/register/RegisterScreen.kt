package com.ranty.app.ui.screens.auth.register

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ranty.app.navigation.Routes

class RegisterScreen {
    companion object {
        val route = Routes.Screens.REGISTER

        @Composable
        fun screen(paddingValues: PaddingValues = PaddingValues(0.dp)) {
            Column(
                modifier = Modifier.padding(paddingValues)
            ) {
                Text(text = "OOO")
            }
        }
    }
}

@Preview
@Composable
fun RegisterPreview() {
    RegisterScreen.screen()
}