package com.ismailmesutmujde.kotlinmoviesappretrofit.dao

import com.ismailmesutmujde.kotlinmoviesappretrofit.model.CategoriesResponse
import retrofit2.Call
import retrofit2.http.GET

interface CategoriesDaoInterface {

    @GET("filmler/tum_kategoriler.php")
    fun allCategories() : Call<CategoriesResponse>

}