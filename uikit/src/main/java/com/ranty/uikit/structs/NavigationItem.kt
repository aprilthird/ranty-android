package com.ranty.uikit.structs

import androidx.compose.ui.graphics.vector.ImageVector

data class NavigationItem(
    val title: String,
    val icon: ImageVector,
    val onClick: () -> Unit,
)
