package com.ismailmesutmujde.kotlinmoviesappretrofit.service

import com.ismailmesutmujde.kotlinmoviesappretrofit.dao.CategoriesDaoInterface
import com.ismailmesutmujde.kotlinmoviesappretrofit.dao.MoviesDaoInterface
import com.ismailmesutmujde.kotlinmoviesappretrofit.retrofit.RetrofitClient

class ApiUtils {
    companion object {
        val BASE_URL = "http://kasimadalan.pe.hu/"
        fun getCategoriesDaoInterface() : CategoriesDaoInterface {
            return  RetrofitClient.getClient(BASE_URL).create(CategoriesDaoInterface::class.java)
        }

        fun getMoviesDaoInterface() : MoviesDaoInterface {
            return  RetrofitClient.getClient(BASE_URL).create(MoviesDaoInterface::class.java)
        }
    }
}