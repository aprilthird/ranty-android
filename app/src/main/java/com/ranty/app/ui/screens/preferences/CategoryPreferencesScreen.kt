package com.ranty.app.ui.screens.preferences

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ranty.app.navigation.Routes

class CategoryPreferencesScreen {
    companion object {
        val route = Routes.Screens.CATEGORY_PREFERENCES

        @Composable
        fun screen() {

        }
    }
}

@Preview
@Composable
fun CategoryPreferencesPreview() {
    CategoryPreferencesScreen.screen()
}