package com.example.retrofit.coroutine.data.repository

import com.example.retrofit.coroutine.data.api.ApiService
import com.example.retrofit.coroutine.data.model.User

class MainRepository(private val apiHelper: ApiService) {

    suspend fun getUsers(): List<User> = apiHelper.getUsers()
    suspend fun getUsersX(userName: String): List<User> = apiHelper.getUsersX(userName)
}