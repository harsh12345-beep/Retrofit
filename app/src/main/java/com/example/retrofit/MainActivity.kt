package com.example.retrofit

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.retrofit.databinding.ActivityMainBinding
import interfaces.ApiInterface
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import okhttp3.internal.Internal.instance
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var api = "https://jsonplaceholder.typicode.com"
    var endpoint = "/photos"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
       GlobalScope.launch {
           onResponse( Retroinstance().inter.getQuotes().execute())
       }
    }
    fun onResponse(response:Response<List<model>>){
Log.e("response",response.body().toString())
    }

}