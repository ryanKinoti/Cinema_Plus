package com.example.cinemaplus

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.cinemaplus.auth.Login
import com.example.cinemaplus.auth.Registration
import com.example.cinemaplus.ui.theme.CinemaPlusTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CinemaPlusTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.primary
                ) {
                    //uncomment and comment one to switch between the two.

                    //Registration.init(this)
                    //Registration.RegistrationUI()

                    Login.init(this)
                    Login.LoginUI()
                }
            }
        }
    }
}

fun statusChecker() {
    //the following code is to check whether the individual has an account saved on their device if not open the normal sequence of screens
}
