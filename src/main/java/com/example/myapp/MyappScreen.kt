package com.example.myapp


import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.room.Room

enum class MyappScreen() {
    StartScreen,
    SignInScreen,
    SignUpScreen,
    GuideScreen
}

@Composable
fun Myapp(
    authViewModel: AuthViewModel,
    navController: NavHostController = rememberNavController()
) {
    StartScreen(signIn = {navController.navigate(MyappScreen.SignInScreen.name)}, signUp = {navController.navigate(MyappScreen.SignUpScreen.name)})

    NavHost(
        navController = navController,
        startDestination = MyappScreen.StartScreen.name
    ) {
        composable(route = MyappScreen.StartScreen.name) {
            StartScreen(signIn = {navController.navigate(MyappScreen.SignInScreen.name)}, signUp = {navController.navigate(MyappScreen.SignUpScreen.name)})
        }
        composable(route = MyappScreen.SignInScreen.name) {
            SignInScreen(onClick = {navController.navigate(MyappScreen.GuideScreen.name)})
        }
        composable(route = MyappScreen.SignUpScreen.name) {
            SignUpScreen(authViewModel = authViewModel, onClick = {navController.navigate(MyappScreen.GuideScreen.name)})
        }
        composable(route = MyappScreen.GuideScreen.name) {
            GuideScreen()
        }
    }



}
