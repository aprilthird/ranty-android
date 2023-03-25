package com.ranty.app.navigation

class Routes {
    class Screens {
        companion object {
            val ON_BOARDING = "onboarding"

            val AUTH = "auth"
            val LOGIN = "login"
            val REGISTER = "register"

            val MAIN = "main"
            val HOME = "home"
            val FEATURED = "featured"
            val NOTIFICATIONS = "notifications"
            val SETTINGS = "settings"

            val BARTER = "barter"
            val BIDDING = "bidding"

            val POST = "post"

            val BIDDING_HISTORY = "biddinghistory"
            val BARTER_HISTORY = "barterhistory"
            val PROFILE = "profile"
            val PAYMENT_METHODS = "paymentmethods"
            val PAYMENT_METHOD_FORM = "paymentmethodform"

            val CATEGORY_PREFERENCES = "categorypreferences"
            val NOTIFICATION_PREFERENCES = "notificationpreferences"
        }
    }

    class Graph {
        companion object {
            val GLOBAL = "global"
            val AUTH = "auth"
        }
    }
}