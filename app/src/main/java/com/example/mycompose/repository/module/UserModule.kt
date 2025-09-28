package com.example.mycompose.repository.module

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import jakarta.inject.Inject
import jakarta.inject.Singleton
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
/**
 *用户数据模块
 */
@Singleton
class UserModule @Inject constructor() {
  private var num by mutableIntStateOf(0)
  private val numFlow = MutableSharedFlow<Int>()
  suspend fun add(){
    numFlow.emit(++num)
  }
  suspend fun sub(){
    numFlow.emit(--num)
  }
  fun getNumData() = num

  val numState= numFlow.asSharedFlow()

  suspend fun test(){
    numState
  }
}