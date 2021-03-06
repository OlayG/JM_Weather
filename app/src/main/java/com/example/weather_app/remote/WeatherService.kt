package com.example.weather_app.remote

import com.example.weather_app.BuildConfig
import com.example.weather_app.model.WeatherResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

  @GET("data/2.5/forecast")
  suspend fun fetchWeather(
      @Query("q") query : String,
      @Query("units") unit: String = "imperial",
      @Query("appid") apiKey : String = BuildConfig.API_KEY
  ) : Response<WeatherResponse>

}