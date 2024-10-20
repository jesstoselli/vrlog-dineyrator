package com.jessto.dineyrator.android.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jessto.dineyrator.android.ui.screens.HomeScreen
import com.jessto.dineyrator.android.ui.screens.Screens

@Composable
fun AppScaffold() {
    val navController = rememberNavController()

    Scaffold {
        AppNavHost(
            navController = navController,
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
        )
    }
}

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        TopBar(
            onProfileClick = { navController.navigate(Screens.USER_PROFILE.route) },
            onMenuClick = { navController.popBackStack() }
        )
        NavHost(
            navController = navController,
            startDestination = Screens.HOME.route,
            modifier = modifier,
        ) {
            composable(Screens.HOME.route) {
                HomeScreen(
//                onAboutButtonClick = { navController.navigate(Screens.ABOUT_DEVICE.route) }
                )
            }

//        composable(Screens.ABOUT_DEVICE.route) {
//            AboutScreen(
//                onUpButtonClick = { navController.popBackStack() }
//            )
//        }
        }
    }
}