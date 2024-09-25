package com.ismailmesutmujde.kotlinmoviesappretrofit.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class CategoriesResponse(@SerializedName("kategoriler")
                         @Expose
                         var categories : List<Categories>,
                         @SerializedName("success")
                         @Expose
                         var success:Int) {

}