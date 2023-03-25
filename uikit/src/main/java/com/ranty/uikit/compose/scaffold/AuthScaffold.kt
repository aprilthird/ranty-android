package com.ranty.uikit.compose.scaffold

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AuthScaffold(
    modifier: Modifier = Modifier,
    hasBackAction: Boolean = false,
    onBackClick: () -> Unit = {},
    title: @Composable () -> Unit = {},
    content: @Composable (PaddingValues) -> Unit = {}
) {
    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                modifier = Modifier.shadow(elevation = 8.dp),
                navigationIcon = {
                    if(hasBackAction) {
                        IconButton(onClick = onBackClick) {
                            Icon(
                                imageVector = Icons.Filled.ArrowBack ,
                                contentDescription = null
                            )
                        }
                    }
                },
                title = {
                    title()
                }
            )
        }
    ) {
        content(it)
    }
}