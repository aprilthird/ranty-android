package com.ranty.app.ui.screens.main

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.ranty.app.navigation.NavBuilder.Companion.mainGraph
import com.ranty.app.navigation.Routes
import com.ranty.uikit.compose.scaffold.MainScaffold
import com.ranty.uikit.structs.NavigationItem

class MainScreen {
    companion object {
        val route = Routes.Screens.MAIN

        @Composable
        fun screen() {
            val items = listOf(
                NavigationItem("Home", Icons.Filled.Home) { },
                NavigationItem("Featured", Icons.Filled.Star) { },
                NavigationItem("Notifications", Icons.Filled.Notifications) { },
                NavigationItem("Settings", Icons.Filled.Person) { },
            )

            MainScaffold(
                navigationItems = items
            ) {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = Routes.Screens.HOME
                ) {
                    mainGraph(navController, it)
                }
            }
        }
    }
}

@Preview
@Composable
fun MainPreview() {
    MainScreen.screen()
}
