package com.ranty.app.ui.screens.auth

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.ranty.app.R
import com.ranty.app.navigation.NavBuilder.Companion.authGraph
import com.ranty.app.navigation.Routes
import com.ranty.uikit.compose.scaffold.AuthScaffold

class AuthScreen {
    companion object {
        val route = Routes.Screens.AUTH

        @Composable
        fun screen() {
            AuthScaffold(
                hasBackAction = true,
                onBackClick = {

                },
                title = {
                    Text(
                        text = stringResource(id = R.string.login_title)
                    )
                }
            ) {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = Routes.Screens.LOGIN) {
                    authGraph(navController, it)
                }
            }
        }
    }
}


@Preview
@Composable
fun AuthPreview() {
    AuthScreen.screen()
}