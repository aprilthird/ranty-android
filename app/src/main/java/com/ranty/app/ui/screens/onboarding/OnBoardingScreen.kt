package com.ranty.app.ui.screens.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ranty.app.navigation.Routes
import com.ranty.app.R
import com.ranty.uikit.compose.button.SecondaryButton

class OnBoardingScreen {
    companion object {
        val route = Routes.Screens.ON_BOARDING

        @Composable
        fun screen() {
            Box {
                Image(
                    modifier = Modifier.fillMaxHeight(),
                    painter = painterResource(id = R.mipmap.img_on_boarding),
                    contentDescription = stringResource(id = R.string.onboarding_content_description)
                )
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Image(
                        modifier = Modifier.height(50.dp),
                        painter = painterResource(id = R.mipmap.img_logo),
                        contentDescription = stringResource(id = R.string.logo_content_description)
                    )
                    Spacer(
                        modifier = Modifier.weight(1.0f)
                    )
                    SecondaryButton(
                        modifier = Modifier.fillMaxWidth(),
                        onClick = { }
                    ) {
                        Text(
                            text = stringResource(id = R.string.start_button_text)
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun OnBoardingPreview() {
    OnBoardingScreen.screen()
}