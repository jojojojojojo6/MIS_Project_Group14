package com.example.myapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class AuthViewModel(private val userRepository: UserRepository) : ViewModel() {

    fun logIn(username: String, password: String) {
        viewModelScope.launch {
            //userRepository.logIn(username, password)
        }
    }

    fun signUp(name: String, email: String, password: String, confirmpassword: String) {
        viewModelScope.launch {
            val user = User(name = name, email = email, password = password)
            userRepository.signUp(user)
        }
    }
}
