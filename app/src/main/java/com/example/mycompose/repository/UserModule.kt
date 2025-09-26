package com.example.mycompose.repository

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import jakarta.inject.Inject
import jakarta.inject.Singleton

@Singleton
class UserModule @Inject constructor() {
  var userName by mutableStateOf("User")
  var num by mutableIntStateOf(0)
}