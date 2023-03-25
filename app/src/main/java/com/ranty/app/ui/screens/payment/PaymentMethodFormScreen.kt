package com.ranty.app.ui.screens.payment

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ranty.app.navigation.Routes

class PaymentMethodFormScreen {
    companion object {
        val route = Routes.Screens.PAYMENT_METHOD_FORM

        @Composable
        fun screen() {

        }
    }
}

@Preview
@Composable
fun PaymentMethodFormPreview() {
    PaymentMethodFormScreen.screen()
}