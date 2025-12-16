package com.example.submirror

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.submirror.subMirrorNav.BottomNavBar
import com.example.submirror.subMirrorNav.NavGraph
import com.example.submirror.subMirrorNav.Screen
import com.example.submirror.subMirrorNav.TopBar
import com.example.submirror.ui.theme.SubMirrorTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val startDestination = Screen.Main.route

        setContent {
            SubMirrorTheme {
                val navController = rememberNavController()
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        TopBar(
                            navController = navController,
                        )
                    }, bottomBar = {
                        BottomNavBar(navController = navController)

                    }) { innerPadding ->
                    Column(modifier = Modifier.padding(innerPadding)) {
                        NavGraph(
                            startDestination = startDestination,
                            navController = navController,
                        )
                    }
                }
            }
        }
    }
}