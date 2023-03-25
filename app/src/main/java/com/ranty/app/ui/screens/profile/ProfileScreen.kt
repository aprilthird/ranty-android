package com.ranty.app.ui.screens.profile

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ranty.app.navigation.Routes

class ProfileScreen {
    companion object {
        val route = Routes.Screens.PROFILE

        @Composable
        fun screen() {

        }
    }
}

@Preview
@Composable
fun ProfilePreview() {
    ProfileScreen.screen()
}