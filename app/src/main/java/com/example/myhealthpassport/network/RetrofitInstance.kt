package com.example.myhealthpassport.network

import com.example.myhealthpassport.BASE_URL
import com.example.openaiapichatbot.network.AnthropicApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private fun getInstance(): Retrofit{
            return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val anthropicApi : AnthropicApi = getInstance().create(AnthropicApi::class.java)
}
