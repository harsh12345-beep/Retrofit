package com.example.retrofit

import android.annotation.SuppressLint
import interfaces.ApiInterface
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Retroinstance {

    lateinit var instance: Retroinstance

    var api = "https://jsonplaceholder.typicode.com"
    var retrofit = Retrofit.Builder().baseUrl(api).addConverterFactory(GsonConverterFactory.create()).build()
    var inter:ApiInterface = retrofit.create(ApiInterface::class.java)
  fun Riinstance(){
        instance = Retroinstance()
    }

   @SuppressLint("NotConstructor")
   fun Retroinstance(): Retroinstance {

       return instance
    }
}