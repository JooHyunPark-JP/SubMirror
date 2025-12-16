package com.example.submirror.subMirrorNav

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    navController: NavHostController,
) {

    val context = LocalContext.current
    val currentBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = currentBackStackEntry?.destination?.route

    val topBarColors = TopAppBarDefaults.topAppBarColors(
        containerColor = MaterialTheme.colorScheme.inversePrimary
    )


    when (currentDestination) {
        Screen.Main.route -> {
            CenterAlignedTopAppBar(
                title = { Text("Overview!") },
                colors = topBarColors
            )
        }


                Screen.SubscriptionListScreen.route -> {
                    CenterAlignedTopAppBar(
                        title = { Text("Subscriptions List?") },
                        colors = topBarColors
                    )
                }

    }
}