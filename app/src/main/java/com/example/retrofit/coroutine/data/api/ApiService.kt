package com.example.retrofit.coroutine.data.api

import com.example.retrofit.coroutine.data.model.User
import retrofit2.http.Field
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>

    @GET("usersX")
    suspend fun getUsersX(@Field("username") userName: String): List<User>

}