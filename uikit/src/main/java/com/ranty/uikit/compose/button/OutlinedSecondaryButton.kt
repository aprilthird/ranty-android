package com.ranty.uikit.compose.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ranty.uikit.compose.theme.Secondary

@Composable
fun OutlinedSecondaryButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    content: @Composable () -> Unit = {}
) {
    OutlinedButton(
        modifier = modifier,
        shape = RoundedCornerShape(percent = 20),
        border = BorderStroke(1.dp, Secondary),
        colors = ButtonDefaults.outlinedButtonColors(contentColor = Secondary),
        onClick = onClick
    ) {
        content()
    }
}