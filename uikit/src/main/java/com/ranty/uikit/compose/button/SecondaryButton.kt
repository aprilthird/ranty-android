package com.ranty.uikit.compose.button

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ranty.uikit.compose.theme.Secondary

@Composable
fun SecondaryButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    content: @Composable () -> Unit = {}
) {
    Button(
        modifier = modifier,
        shape = RoundedCornerShape(percent =20),
        colors = ButtonDefaults.buttonColors(containerColor = Secondary),
        onClick = onClick
    ) {
        content()
    }
}