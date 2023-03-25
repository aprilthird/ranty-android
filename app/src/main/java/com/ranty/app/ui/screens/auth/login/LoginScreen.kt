package com.ranty.app.ui.screens.auth.login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ranty.app.R
import com.ranty.app.navigation.Routes
import com.ranty.uikit.compose.button.FacebookSignInButton
import com.ranty.uikit.compose.button.GoogleSignInButton
import com.ranty.uikit.compose.button.OutlinedPrimaryButton
import com.ranty.uikit.compose.button.SecondaryButton

class LoginScreen {
    companion object {
        val route = Routes.Screens.LOGIN

        @Composable
        fun screen(paddingValues: PaddingValues = PaddingValues(0.dp)) {
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .padding(16.dp)
            ) {
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = "",
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Filled.Person,
                            contentDescription = null
                        )
                    },
                    label = {
                        Text(
                            text = stringResource(id = R.string.useroremail_field)
                        )
                    },
                    placeholder = {
                        Text(
                            text = stringResource(id = R.string.useroremail_field)
                        )
                    },
                    onValueChange = {}
                )
                Spacer(
                    modifier = Modifier.height(8.dp)
                )
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = "",
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Filled.Lock,
                            contentDescription = null
                        )
                    },
                    label = {
                        Text(
                            text = stringResource(id = R.string.password_field)
                        )
                    },
                    placeholder = {
                        Text(
                            text = stringResource(id = R.string.password_field)
                        )
                    },
                    onValueChange = {}
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Checkbox(
                        checked = false,
                        onCheckedChange = {}
                    )
                    Text(
                        text = "Recordarme"
                    )
                    Spacer(
                        modifier = Modifier.weight(1.0f)
                    )
                    Text(
                        text = "Olvidé mi contraseña"
                    )
                }
                SecondaryButton(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = { /*TODO*/ }
                ) {
                    Text(
                        text = stringResource(id = R.string.login_button_text)
                    )
                }
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(0.dp, 8.dp),
                    textAlign = TextAlign.Center,
                    text = "ó"
                )
                FacebookSignInButton(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = { /*TODO*/ }
                ) {
                    Text(
                        text = stringResource(id = R.string.login_facebook_button_text)
                    )
                }
                GoogleSignInButton(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = { /*TODO*/ }
                ) {
                    Text(
                        text = stringResource(id = R.string.login_google_button_text)
                    )
                }
                Divider(
                    modifier = Modifier.padding(0.dp, 16.dp)
                )
                OutlinedPrimaryButton(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = { /*TODO*/ }
                ) {
                    Text(
                        text = stringResource(id = R.string.register_button_text)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun LoginPreview() {
    LoginScreen.screen()
}