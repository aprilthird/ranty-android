package com.ranty.app.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.ranty.app.ui.screens.auth.AuthScreen
import com.ranty.app.ui.screens.auth.login.LoginScreen
import com.ranty.app.ui.screens.auth.register.RegisterScreen
import com.ranty.app.ui.screens.barter.BarterScreen
import com.ranty.app.ui.screens.bidding.BiddingScreen
import com.ranty.app.ui.screens.history.BarterHistoryScreen
import com.ranty.app.ui.screens.history.BiddingHistoryScreen
import com.ranty.app.ui.screens.main.MainScreen
import com.ranty.app.ui.screens.main.featured.FeaturedScreen
import com.ranty.app.ui.screens.main.home.HomeScreen
import com.ranty.app.ui.screens.main.notifications.NotificationsScreen
import com.ranty.app.ui.screens.main.settings.SettingsScreen
import com.ranty.app.ui.screens.onboarding.OnBoardingScreen
import com.ranty.app.ui.screens.payment.PaymentMethodFormScreen
import com.ranty.app.ui.screens.payment.PaymentMethodsScreen
import com.ranty.app.ui.screens.post.PostScreen
import com.ranty.app.ui.screens.preferences.CategoryPreferencesScreen
import com.ranty.app.ui.screens.preferences.NotificationPreferencesScreen
import com.ranty.app.ui.screens.profile.ProfileScreen

class NavBuilder {
    companion object {
        fun NavGraphBuilder.globalGraph(navController: NavController) {
            navigation(
                startDestination = OnBoardingScreen.route,
                route = Routes.Graph.GLOBAL)
            {
                composable(OnBoardingScreen.route) { OnBoardingScreen.screen() }

                composable(AuthScreen.route) { AuthScreen.screen() }
                composable(MainScreen.route) { MainScreen.screen() }

                composable(BarterScreen.route) { BarterScreen.screen() }
                composable(BiddingScreen.route) { BiddingScreen.screen() }
                composable(PostScreen.route) { PostScreen.screen() }

                composable(BiddingHistoryScreen.route) { BiddingHistoryScreen.screen() }
                composable(BarterHistoryScreen.route) { BarterHistoryScreen.screen() }
                composable(ProfileScreen.route) { ProfileScreen.screen() }
                composable(PaymentMethodsScreen.route) { PaymentMethodsScreen.screen() }
                composable(PaymentMethodFormScreen.route) { PaymentMethodFormScreen.screen() }

                composable(CategoryPreferencesScreen.route) { CategoryPreferencesScreen.screen() }
                composable(NotificationPreferencesScreen.route) { NotificationPreferencesScreen.screen() }
            }
        }

        fun NavGraphBuilder.authGraph(navController: NavController, paddingValues: PaddingValues) {
            navigation(
                startDestination = LoginScreen.route,
                route = Routes.Graph.AUTH)
            {
                composable(LoginScreen.route) { LoginScreen.screen(paddingValues = paddingValues) }
                composable(RegisterScreen.route) { RegisterScreen.screen(paddingValues = paddingValues) }
            }
        }

        fun NavGraphBuilder.mainGraph(navController: NavController, paddingValues: PaddingValues) {
            composable(HomeScreen.route) { HomeScreen.screen(paddingValues = paddingValues) }
            composable(FeaturedScreen.route) { FeaturedScreen.screen(paddingValues = paddingValues) }
            composable(NotificationsScreen.route) { NotificationsScreen.screen(paddingValues = paddingValues) }
            composable(SettingsScreen.route) { SettingsScreen.screen(paddingValues = paddingValues) }
        }
    }
}