package com.example.mangasosical.ui.register

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mangasosical.base.BaseViewModel
import com.example.mangasosical.data.service.ApiService
import com.example.mangasosical.di.apiModule
import com.example.mangasosical.model.Register
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RegisterViewModel: BaseViewModel() {
    fun CallApiRegister(email : String, password : String){
        ///
        val register = Register(email,password)
        val api = Retrofit.Builder()
            .baseUrl("http://14.225.7.221:7979/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
        api.callRegister(register).enqueue(object : Callback<Register>{
            override fun onResponse(call: Call<Register>, response: Response<Register>) {
                if (response.isSuccessful){
                    Log.d("Status Login" , response.message())
                }
            }

            override fun onFailure(call: Call<Register>, t: Throwable) {
                Log.d("Status Login ", t.message.toString())
            }

        })
    }
}