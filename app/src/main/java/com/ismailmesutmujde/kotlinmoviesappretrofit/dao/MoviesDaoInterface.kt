package com.ismailmesutmujde.kotlinmoviesappretrofit.dao

import com.ismailmesutmujde.kotlinmoviesappretrofit.model.MoviesResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface MoviesDaoInterface {

    @POST("filmler/filmler_by_kategori_id.php")
    @FormUrlEncoded
    fun allMoviesByCategoryId(@Field("kategori_id") category_id:Int) : Call<MoviesResponse>

}