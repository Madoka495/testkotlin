package com.example.myapplication.Common

import com.example.myapplication.Interface.RetrofitService
import com.example.myapplication.Retrofit.RetrofitClient
import retrofit2.create

object Common {
    private val BASE_URL = "https://www.simplifiedcoding.net/demos/"

    val retrofitService: RetrofitService
    get() = RetrofitClient.getClient(BASE_URL).create(RetrofitService::class.java)
}