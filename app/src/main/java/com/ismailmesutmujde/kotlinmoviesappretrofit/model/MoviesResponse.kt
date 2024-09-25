package com.ismailmesutmujde.kotlinmoviesappretrofit.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class MoviesResponse (@SerializedName("filmler")
                      @Expose
                      var movies : List<Movies>,
                      @SerializedName("success")
                      @Expose
                      var success:Int) {
}