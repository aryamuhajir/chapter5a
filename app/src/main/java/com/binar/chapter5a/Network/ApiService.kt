package com.binar.chapter5a.Network

import com.binar.chapter5a.Model.GetAllFilmResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("film")
    fun getAllFilm() : Call<List<GetAllFilmResponse>>
}