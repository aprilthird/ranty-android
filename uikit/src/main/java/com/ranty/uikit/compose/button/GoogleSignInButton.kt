package com.ranty.uikit.compose.button

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ranty.uikit.compose.theme.Google
import compose.icons.FontAwesomeIcons
import compose.icons.fontawesomeicons.Brands
import compose.icons.fontawesomeicons.brands.Google

@Composable
fun GoogleSignInButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    content: @Composable () -> Unit = {}
) {
    Button(
        modifier = modifier,
        shape = RoundedCornerShape(percent = 20),
        colors = ButtonDefaults.buttonColors(containerColor = Google),
        onClick = onClick
    ) {
        Icon(
            imageVector = FontAwesomeIcons.Brands.Google,
            contentDescription = null,
            modifier = Modifier.size(ButtonDefaults.IconSize)
        )
        Spacer(
            modifier = Modifier.size(ButtonDefaults.IconSpacing)
        )
        content()
    }
}