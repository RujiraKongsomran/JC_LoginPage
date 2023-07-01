package com.rujirakongsomran.jc_loginpage

sealed class Screen(val route: String){
    object Login: Screen(route = "login_screen")
    object Overview: Screen(route = "overview_dcreen")
}
