package com.example.mycompose.viewmodels

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mycompose.repository.entity.BannerListEntity
import com.example.mycompose.repository.http.ApiService
import com.example.mycompose.repository.module.UserModule
import com.example.mycompose.utils.LogTools
import dagger.hilt.android.lifecycle.HiltViewModel
import jakarta.inject.Inject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@HiltViewModel
class SharedViewModel @Inject constructor(val userModule: UserModule, val apiService: ApiService) : ViewModel() {
    private val _bannerStateFlow = MutableStateFlow<List<BannerListEntity.DataBean>>(
        value = emptyList()
    )
    var bannerFlow= _bannerStateFlow.asStateFlow()

    init {
        Log.e("SharedViewModel init", "SharedViewModel init")
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
                _bannerStateFlow.value = data.body()?.data ?: emptyList()
            }
        }
    }

}