package com.example.cinemaplus.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class Main {
    companion object {
        @Composable
        fun MainUI(fullName: String, userName: String, location: String) {
            //val userData by viewModel.userData.observeAsState()
            //userData?.let {user ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp) // Add padding
                    .wrapContentSize(Alignment.Center)
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Text(
                        text = "Welcome, $fullName",
                        color = MaterialTheme.colorScheme.onSurface // Adapts to theme
                    )
                    // Add more UI components as needed
                    // Example:
                    Text(
                        text = "Username: $userName",
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Text(
                        text = "Location: $location",
                        color = MaterialTheme.colorScheme.onSurface
                    )
                }
            }
            //}
        }
    }
}

