package com.example.submirror.subMirrorNav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.submirror.subMirrorMainFunction.subscrption.SubMirrorOverviewScreen
import com.example.submirror.subMirrorMainFunction.subscrption.SubscriptionListScreen

@Composable
fun NavGraph(
    startDestination: String,
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = startDestination) {
        composable(Screen.Main.route) {
            SubMirrorOverviewScreen(navController)
        }

        composable(Screen.SubscriptionListScreen.route) {
            SubscriptionListScreen(navController)
        }


        composable(Screen.SubscriptionReviewScreen.route) {
/*            SavedAddressAdd(
                navController = navController,
                savedAddressViewModel = savedAddressViewModel,
                noteViewModel = noteViewModel,
                geofenceViewModel = geofenceViewModel
            )*/
        }
    }
}