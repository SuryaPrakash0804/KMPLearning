package com.example.kmpdemo.ui.Day10Practice.viewModel

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class LoginSignUpViewModel {

    private val _name= MutableStateFlow("")

    val name: StateFlow<String> = _name.asStateFlow()

    fun updateName(newName: String) {
        _name.value = newName
    }

    private val _email= MutableStateFlow("")

    val email: StateFlow<String> = _email.asStateFlow()

    fun updateEmail(newEmail:String){
        _email.value=newEmail
    }

    private val _password= MutableStateFlow("")

    val password: StateFlow<String> = _password.asStateFlow()

    fun updatePassword(newPassword:String){
        _password.value=newPassword
    }






}