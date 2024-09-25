package com.ismailmesutmujde.kotlinmoviesappretrofit.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Movies (@SerializedName("film_id")
                   @Expose
                   var movie_id:Int,
                   @SerializedName("film_ad")
                   @Expose
                   var movie_name:String,
                   @SerializedName("film_yil")
                   @Expose
                   var movie_year:Int,
                   @SerializedName("film_resim")
                   @Expose
                   var movie_poster:String,
                   @SerializedName("kategori")
                   @Expose
                   var category: Categories,
                   @SerializedName("yonetmen")
                   @Expose
                   var director: Directors
) : Serializable {
}