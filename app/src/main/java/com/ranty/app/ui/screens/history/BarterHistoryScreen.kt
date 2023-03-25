package com.ranty.app.ui.screens.history

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ranty.app.navigation.Routes

class BarterHistoryScreen {
    companion object {
        val route = Routes.Screens.BARTER_HISTORY

        @Composable
        fun screen() {

        }
    }
}

@Preview
@Composable
fun BarterHistoryPreview() {
    BarterHistoryScreen.screen()
}