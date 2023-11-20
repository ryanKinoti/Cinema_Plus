package com.example.cinemaplus

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.cinemaplus.auth.Login
import com.example.cinemaplus.home.Main
import com.example.cinemaplus.ui.theme.CinemaPlusTheme
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CinemaPlusTheme {
                //FirebaseAuth.getInstance().signOut()
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    val context = LocalContext.current
    val user by remember { mutableStateOf(FirebaseAuth.getInstance().currentUser) }
    var showMainUI by remember { mutableStateOf(false) }
    var userData by remember { mutableStateOf(UserData()) }
    var isLoading by remember { mutableStateOf(user != null) } // Initially true if user is not null

    LaunchedEffect(user) {
        if (user != null) {
            FirebaseFirestore.getInstance().collection("users").document(user!!.uid).get()
                .addOnSuccessListener { document ->
                    if (document != null) {
                        userData = UserData(
                            fullName = document.getString("fullName") ?: "",
                            username = document.getString("username") ?: "",
                            location = document.getString("location") ?: ""
                        )
                        showMainUI = true // Set to true on successful data fetch
                    } else {
                        Toast.makeText(context, "Your record does not exist", Toast.LENGTH_SHORT)
                            .show()
                    }
                }.addOnFailureListener { e ->
                    Toast.makeText(context, "Error ${e.message} loading data", Toast.LENGTH_SHORT)
                        .show()
                }.addOnCompleteListener {
                    isLoading = false
                }
        } else {
            isLoading = false // Set to false if there is no user
        }
    }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.primary
    ) {
        when {
            isLoading -> LoadingUI()
            user != null && showMainUI -> Main.MainUI(
                fullName = userData.fullName,
                userName = userData.username,
                location = userData.location
            )

            else -> Login.LoginUI()
        }
    }
}


data class UserData(
    val fullName: String = "",
    val username: String = "",
    val location: String = ""
)

@Composable
fun LoadingUI() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    ) {
        CircularProgressIndicator(
            modifier = Modifier
                .width(64.dp),
            color = MaterialTheme.colorScheme.onSurface,
        )
    }
}
