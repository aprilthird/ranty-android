package com.ranty.app.ui.screens.post

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ranty.app.navigation.Routes

class PostScreen {
    companion object {
        val route = Routes.Screens.POST

        @Composable
        fun screen() {

        }
    }
}

@Preview
@Composable
fun PostPreview() {
    PostScreen.screen()
}