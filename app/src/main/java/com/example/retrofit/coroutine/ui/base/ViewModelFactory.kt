package com.example.retrofit.coroutine.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.retrofit.coroutine.data.api.ApiService
import com.example.retrofit.coroutine.data.repository.MainRepository
import com.example.retrofit.coroutine.ui.main.viewmodel.MainViewModel

class ViewModelFactory(private val apiHelper: ApiService) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}

