package com.ranty.app.ui.screens.main.settings

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ranty.app.navigation.Routes

class SettingsScreen {
    companion object {
        val route = Routes.Screens.SETTINGS

        @Composable
        fun screen(paddingValues: PaddingValues = PaddingValues(0.dp)) {
            Column(
                modifier = Modifier.padding(paddingValues)
            ) {

            }
        }
    }
}

@Preview
@Composable
fun SettingsPreview() {
    SettingsScreen.screen()
}