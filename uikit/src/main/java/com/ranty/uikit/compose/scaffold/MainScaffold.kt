package com.ranty.uikit.compose.scaffold

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsEndWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.ranty.uikit.compose.theme.Secondary
import com.ranty.uikit.structs.NavigationItem
import com.ranty.uikit.R
import compose.icons.FontAwesomeIcons
import compose.icons.fontawesomeicons.Solid
import compose.icons.fontawesomeicons.solid.Camera
import compose.icons.fontawesomeicons.solid.CameraRetro

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScaffold(
    modifier: Modifier = Modifier,
    title: (@Composable () -> Unit)? = null,
    navigationItems: List<NavigationItem> = listOf(),
    onMainActionClick: () -> Unit = {},
    content: @Composable (PaddingValues) -> Unit = {}
) {
    var selectedItem by remember { mutableStateOf(0) }

    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                modifier = Modifier.shadow(elevation = 8.dp),
                title = {
                    Image(
                        modifier = Modifier.height(40.dp),
                        painter = painterResource(id = R.mipmap.img_logo),
                        contentDescription = null
                    )
                    title?.let {
                        Spacer(
                            modifier = Modifier.size(ButtonDefaults.IconSpacing)
                        )
                        it()
                    }
                }
            )
        },
        bottomBar = {
            BottomAppBar(
                containerColor = Color.DarkGray,
                contentColor = Color.DarkGray,
            ) {
                navigationItems.forEachIndexed { index, item ->
                    if(index == 2) {
                        NavigationBarItem(
                            selected = false,
                            colors = NavigationBarItemDefaults.colors(
                                indicatorColor = Color.DarkGray,
                                selectedIconColor = Secondary,
                                unselectedIconColor = Color.LightGray
                            ),
                            onClick = {
                                onMainActionClick.invoke()
                            },
                            icon = { }
                        )
                    }
                    NavigationBarItem(
                        colors = NavigationBarItemDefaults.colors(
                            indicatorColor = Color.DarkGray,
                            selectedIconColor = Secondary,
                            unselectedIconColor = Color.LightGray
                        ),
                        icon = {
                            Icon(
                                modifier = Modifier
                                    .width(40.dp)
                                    .height(40.dp),
                                imageVector = item.icon,
                                contentDescription = item.title
                            )
                        },
                        selected = selectedItem == index,
                        onClick = {
                            selectedItem = index
                            item.onClick.invoke()
                        }
                    )
                }
            }
        },
        floatingActionButtonPosition = FabPosition.Center,
        floatingActionButton = {
            FloatingActionButton(
                modifier = Modifier
                    .width(80.dp)
                    .height(80.dp)
                    .padding(0.dp, 0.dp, 0.dp, 0.dp)
                    .offset(y = 55.dp),
                containerColor = Secondary,
                shape = CircleShape,
                onClick = {
                    onMainActionClick.invoke()
                }
            ) {
                Icon(
                    modifier = Modifier
                        .width(40.dp)
                        .height(40.dp),
                    imageVector = FontAwesomeIcons.Solid.Camera,
                    contentDescription = null,
                    tint = Color.White
                )
            }
        }
    ) {
        content(it)
    }
}