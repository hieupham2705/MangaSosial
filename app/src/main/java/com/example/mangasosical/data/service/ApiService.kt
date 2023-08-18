package com.example.mangasosical.data.service

import com.example.mangasosical.model.Register
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.GET

interface ApiService {
    @GET("register")
    fun callRegister(@Body register: Register): Call<Register>
}