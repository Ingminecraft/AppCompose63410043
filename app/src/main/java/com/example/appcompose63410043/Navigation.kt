package com.example.appcompose63410043

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Nav(){
    val navContorller = rememberNavController()

    NavHost(navController = navContorller, startDestination = "A"){
        composable(route =  "A"){
            Pagehome(navController = navContorller)
        }
        composable(route =  "B"){
            Pageone(navController = navContorller)
        }
        composable(route =  "C"){
            Pagetwo(navController = navContorller)
        }
        composable(route =  "D"){
            Pagethree(navController = navContorller)
        }
        composable(route =  "E"){
            Pagefour(navController = navContorller)
        }
    }
}