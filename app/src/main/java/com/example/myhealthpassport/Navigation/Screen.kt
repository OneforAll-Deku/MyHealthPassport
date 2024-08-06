package com.example.myhealthpassport.Navigation

sealed class Screen(val route: String) {
    object SignUp : Screen("signup")
    object Login : Screen("login")
    object Home : Screen("home")
    object MainHealthActivity: Screen(route = "main_screen")
    object HealthInfo: Screen(route = "health_info")
    object GetHealthInfo: Screen(route = "get_health_info")
    object PatientDetails: Screen(route = "patient_details/{patientData}")
    object DoctorLogin: Screen(route = "doctor_login")
    object EmergencyContacts: Screen(route = "emergency_contacts")
    object SplashScreen: Screen(route = "splash")
    object HealthAiScreen: Screen(route = "health_ai_screen")
}