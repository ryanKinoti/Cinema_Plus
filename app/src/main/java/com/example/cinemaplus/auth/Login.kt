package com.example.cinemaplus.auth

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.example.cinemaplus.R
import com.google.firebase.auth.FirebaseAuth

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginUI() {

    val emailValue = remember { mutableStateOf("") }
    val passwordValue = remember { mutableStateOf("") }
    val passwordVisibility = remember { mutableStateOf(false) }
    val context = LocalContext.current

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        // Background and Logo
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colorScheme.primary),
            contentAlignment = Alignment.TopCenter,
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_250dp),
                contentDescription = null
            )
        }

        // Login Form
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .fillMaxWidth(0.68f)
                .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
                .background(color = MaterialTheme.colorScheme.primary)
        ) {
            //form title
            Text(
                text = "Welcome to Cinema Plus Login!",
                style = MaterialTheme.typography.titleLarge,
                color = MaterialTheme.colorScheme.onBackground
            )
            Spacer(modifier = Modifier.padding(10.dp))

            //text and password fields
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {

                OutlinedTextField(
                    label = { Text(text = "Email Address") },
                    value = emailValue.value,
                    onValueChange = { emailValue.value = it },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        cursorColor = MaterialTheme.colorScheme.onBackground, // Choose a color that stands out against the TextField background
                        focusedBorderColor = MaterialTheme.colorScheme.onBackground, // Primary color for the focused border
                        unfocusedBorderColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.3f), // Custom alpha for the unfocused border
                        textColor = MaterialTheme.colorScheme.onSurface, // Ensuring text color stands out against the TextField background
                    ),
                )
                Spacer(modifier = Modifier.padding(10.dp))
                OutlinedTextField(
                    label = { Text(text = "Password") },
                    value = passwordValue.value,
                    onValueChange = { passwordValue.value = it },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    visualTransformation = if (passwordVisibility.value) VisualTransformation.None else PasswordVisualTransformation(),
                    trailingIcon = {
                        IconButton(onClick = {
                            passwordVisibility.value = !passwordVisibility.value
                        }) {
                            Icon(
                                painter = painterResource(id = if (passwordVisibility.value) R.drawable.password_hide else R.drawable.password_show),
                                contentDescription = if (passwordVisibility.value) "Hide password" else "Show password",
                                tint = MaterialTheme.colorScheme.onBackground
                            )
                        }
                    },
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        cursorColor = MaterialTheme.colorScheme.onBackground, // Choose a color that stands out against the TextField background
                        focusedBorderColor = MaterialTheme.colorScheme.onBackground, // Primary color for the focused border
                        unfocusedBorderColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.3f), // Custom alpha for the unfocused border
                        textColor = MaterialTheme.colorScheme.onSurface, // Ensuring text color stands out against the TextField background
                    ),
                )
                Spacer(modifier = Modifier.padding(10.dp))

                //login button
                Button(
                    onClick = {
                        loginLogic(emailValue.value, passwordValue.value, context)
                    },
                    modifier = Modifier
                        .fillMaxWidth(0.8f)
                        .clip(RoundedCornerShape(10.dp))
                        .height(50.dp),
                    shape = RoundedCornerShape(10.dp),
                    enabled = emailValue.value.isNotEmpty() && passwordValue.value.isNotEmpty(),
                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondary)
                ) {
                    Text(
                        text = "Login",
                        fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                        color = if (emailValue.value.isNotEmpty() && passwordValue.value.isNotEmpty())
                            MaterialTheme.colorScheme.onBackground
                        else
                            MaterialTheme.colorScheme.onSecondary,

                        )
                }
                Spacer(modifier = Modifier.padding(10.dp))

                Button(
                    onClick = { /* TODO: Implement Google Sign-In logic */ },
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .clip(RoundedCornerShape(10.dp))
                        .height(40.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondary)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxWidth(0.8f),
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.google_logo),
                            contentDescription = "Google sign-in",
                            tint = Color.Unspecified // Removing tint in order to keep the original icon color
                        )
                        Spacer(modifier = Modifier.width(8.dp)) // Space between icon and text
                        Text(
                            text = "Continue with Google",
                            fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                            color = MaterialTheme.colorScheme.onBackground
                        )
                    }
                }
                Spacer(modifier = Modifier.padding(10.dp))

                Text(
                    text = "Don't have an account? Sign up",
                    modifier = Modifier.clickable(onClick = { /*TODO*/ }),
                    color = MaterialTheme.colorScheme.onBackground
                )
                Spacer(modifier = Modifier.padding(10.dp))
            }
        }
    }
}

private fun loginLogic(email: String, password: String, context: Context) {
    if (FirebaseAuth.getInstance().currentUser != null) {
        // User is already logged in, proceed to the main part of your app
    } else {
        // No user is logged in, show the login screen
        FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    val firebaseUser = task.result?.user

                    if (firebaseUser != null && firebaseUser.isEmailVerified) {
                        // Email is verified, proceed with the login
                    } else {
                        // Email is not verified
                        // Prompt user to verify email or resend verification email
                    }
                } else {
                    // Handle login failure
                }
            }
    }

}