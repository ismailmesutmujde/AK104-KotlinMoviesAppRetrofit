package com.ismailmesutmujde.kotlinmoviesappretrofit.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Directors(@SerializedName("yonetmen_id")
                     @Expose
                     var director_id:Int,
                     @SerializedName("yonetmen_ad")
                     @Expose
                     var director_name:String) : Serializable {
}