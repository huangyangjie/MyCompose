package com.example.mycompose.viewmodels

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mycompose.repository.UserModule
import com.example.mycompose.repository.entity.BannerListEntity
import com.example.mycompose.repository.http.ApiService
import com.example.mycompose.repository.http.RetrofitClient
import com.example.mycompose.utils.LogTools
import dagger.hilt.android.lifecycle.HiltViewModel
import jakarta.inject.Inject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@HiltViewModel
class SharedViewModel @Inject constructor(var userModule: UserModule) : ViewModel() {
    private val apiService: ApiService = RetrofitClient.getInstance().create(ApiService::class.java)
    var bannerList by mutableStateOf(listOf<BannerListEntity.DataBean>())

    init {
        Log.e("SharedViewModel init", "SharedViewModel init")
        viewModelScope.launch {
//            testFlow().filter { it%2 == 0 }.collect { count -> LogTools.e("count: $count") }
            testFlow().map { it%2 == 0 }.collect { count -> LogTools.e("count: $count") }
        }
    }

    var count by mutableIntStateOf(0)

    override fun onCleared() {
        super.onCleared()
        Log.e("SharedViewModel onCleared", "SharedViewModel onCleared")
    }

    fun getBanner() {
        viewModelScope.launch {
            val data = withContext(Dispatchers.IO) {
                apiService.getBannerList("")!!
            }
            if (data.isSuccessful) {
                bannerList = data.body()!!.data
                LogTools.e("getBanner: $bannerList")
            }
        }
    }

    fun testFlow(): Flow<Int> = flow {
        for (i in 1..10){
            delay(1000)
            emit(i)
        }
    }
}