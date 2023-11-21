package com.example.cinemaplus.auth

import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.getString
import com.example.cinemaplus.MainActivity
import com.example.cinemaplus.R
import com.example.cinemaplus.ui.theme.CinemaPlusTheme
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthException
import com.google.firebase.firestore.FirebaseFirestore

class Registration {

    companion object {
        @OptIn(ExperimentalMaterial3Api::class)
        @Composable
        fun RegistrationUI() {

            val fullNameValue = remember { mutableStateOf("") }
            val usernameValue = remember { mutableStateOf("") }
            val emailValue = remember { mutableStateOf("") }
            val phoneValue = remember { mutableStateOf("") }
            val locationValue = remember { mutableStateOf("") }
            val passwordValue = remember { mutableStateOf("") }
            val passwordVisibility = remember { mutableStateOf(false) }
            val context = LocalContext.current
            var showLogin by remember { mutableStateOf(false) }
            val user by remember { mutableStateOf(FirebaseAuth.getInstance().currentUser) }

            if (showLogin) {
                Login.LoginUI()
            } else {
                if (user == null) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center,
                    ) {
                        // Registration Form
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Top,
                            modifier = Modifier
                                .fillMaxWidth(0.68f)
                                .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
                                .background(color = MaterialTheme.colorScheme.primary)
                        ) {
                            // Logo and Title side by side
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.logo_250dp),
                                    contentDescription = null,
                                    modifier = Modifier.size(100.dp)
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Text(
                                    text = "Cinema Plus Registration",
                                    style = MaterialTheme.typography.titleLarge,
                                    color = MaterialTheme.colorScheme.onBackground
                                )
                            }
                            Spacer(modifier = Modifier.padding(10.dp))

                            // Registration fields
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                            ) {
                                // Additional fields for registration
                                listOf(
                                    Pair("Full Name", fullNameValue),
                                    Pair("Username", usernameValue),
                                    Pair("Email Address", emailValue),
                                    Pair("Phone Number", phoneValue),
                                    Pair("Location", locationValue)
                                ).forEach { (label, value) ->
                                    OutlinedTextField(
                                        placeholder = { Text(text = label) },
                                        value = value.value,
                                        onValueChange = { value.value = it },
                                        singleLine = true,
                                        modifier = Modifier.fillMaxWidth(),
                                        colors = TextFieldDefaults.outlinedTextFieldColors(
                                            cursorColor = MaterialTheme.colorScheme.onBackground,
                                            focusedBorderColor = MaterialTheme.colorScheme.onBackground,
                                            unfocusedBorderColor = MaterialTheme.colorScheme.onSurface.copy(
                                                alpha = 0.3f
                                            ),
                                            textColor = MaterialTheme.colorScheme.onSurface,
                                        ),
                                    )
                                    Spacer(modifier = Modifier.height(10.dp))
                                }
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
                                        cursorColor = MaterialTheme.colorScheme.onBackground,
                                        focusedBorderColor = MaterialTheme.colorScheme.onBackground,
                                        unfocusedBorderColor = MaterialTheme.colorScheme.onSurface.copy(
                                            alpha = 0.3f
                                        ),
                                        textColor = MaterialTheme.colorScheme.onSurface,
                                    ),
                                )
                                Spacer(modifier = Modifier.height(10.dp))

                                // Registration button
                                Button(
                                    onClick = {
                                        val fullName = fullNameValue.value
                                        val username = usernameValue.value
                                        val email = emailValue.value
                                        val phone = phoneValue.value
                                        val location = locationValue.value
                                        val password = passwordValue.value
                                        registrationLogic(
                                            fullName,
                                            username,
                                            email,
                                            phone,
                                            location,
                                            password,
                                            context,
                                        )
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
                                        text = "Register",
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
                                            contentDescription = "Google sign-up",
                                            tint = Color.Unspecified
                                        )
                                        Spacer(modifier = Modifier.width(8.dp))
                                        Text(
                                            text = "Register with Google",
                                            fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                                            color = MaterialTheme.colorScheme.onBackground
                                        )
                                    }
                                }
                                Spacer(modifier = Modifier.padding(10.dp))

                                Button(
                                    onClick = { showLogin = true },
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
                                            painter = painterResource(id = R.drawable.logo_250dp),
                                            contentDescription = "sign-in",
                                            tint = Color.Unspecified // Removing tint in order to keep the original icon color
                                        )
                                        Spacer(modifier = Modifier.width(8.dp)) // Space between icon and text
                                        Text(
                                            text = "Login Instead",
                                            fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                                            color = MaterialTheme.colorScheme.onBackground
                                        )
                                    }
                                }
                                Spacer(modifier = Modifier.padding(10.dp))
                            }
                        }
                    }
                } else {
                    val intent = Intent(context, MainActivity::class.java)
                    context.startActivity(intent)
                }
            }
        }

        private fun registrationLogic(
            fullName: String,
            username: String,
            email: String,
            phone: String,
            location: String,
            password: String,
            context: Context,
        ) {
            FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        // User account creation successful
                        val firebaseUser = task.result?.user
                        val userData = hashMapOf(
                            "fullName" to fullName,
                            "username" to username,
                            "email" to email,
                            "phone" to phone,
                            "location" to location,
                            "profile_picture" to "",
                            "Role" to "Customer",
                            "Email_Verified" to "false",
                            "Phone_Verified" to "false",
                            "Profile_Complete" to "false",
                        )
                        firebaseUser?.let { user ->
                            FirebaseFirestore.getInstance().collection("users").document(user.uid)
                                .set(userData)
                                .addOnSuccessListener {

                                    firebaseUser.sendEmailVerification()
                                        .addOnCompleteListener { emailTask ->
                                            if (emailTask.isSuccessful) {
                                                Toast.makeText(
                                                    context,
                                                    "Registration Complete. Check your $email account for further instructions",
                                                    Toast.LENGTH_SHORT
                                                ).show()

                                                val intent = Intent(context, MainActivity::class.java)
                                                context.startActivity(intent)

                                            } else {
                                                val verificationError = task.exception
                                                Toast.makeText(
                                                    context,
                                                    "Registration failed. There is an error: $verificationError",
                                                    Toast.LENGTH_SHORT
                                                ).show()
                                            }
                                        }
                                }
                                .addOnFailureListener { e ->
                                    Toast.makeText(
                                        context,
                                        "There is an error: ${e.message}",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                }
                        }
                    } else {
                        // Failed to create user account
                        val exception = task.exception
                        if (exception is FirebaseAuthException) {
                            val errorCode = exception.errorCode
                            if (errorCode == "ERROR_EMAIL_ALREADY_IN_USE") {
                                Toast.makeText(context, "Email already in use.", Toast.LENGTH_LONG)
                                    .show()
                            } else {
                                Toast.makeText(
                                    context,
                                    "Registration failed: ${exception.message}",
                                    Toast.LENGTH_LONG
                                ).show()
                            }
                        }
                    }
                }
        }
    }
}

