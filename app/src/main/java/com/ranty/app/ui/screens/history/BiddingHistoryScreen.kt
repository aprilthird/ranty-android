package com.ranty.app.ui.screens.history

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ranty.app.navigation.Routes

class BiddingHistoryScreen {
    companion object {
        val route = Routes.Screens.BIDDING_HISTORY

        @Composable
        fun screen() {

        }
    }
}

@Preview
@Composable
fun BiddingHistoryPreview() {
    BiddingHistoryScreen.screen()
}