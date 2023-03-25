package com.ranty.uikit.compose.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ranty.uikit.compose.theme.Primary

@Composable
fun OutlinedPrimaryButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    content: @Composable () -> Unit = {}
) {
    OutlinedButton(
        modifier = modifier,
        shape = RoundedCornerShape(percent = 20),
        border = BorderStroke(1.dp, Primary),
        colors = ButtonDefaults.outlinedButtonColors(contentColor = Primary),
        onClick = onClick
    ) {
        content()
    }
}