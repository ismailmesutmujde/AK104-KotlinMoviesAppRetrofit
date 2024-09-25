package com.ismailmesutmujde.kotlinmoviesappretrofit.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Categories (@SerializedName("kategori_id")
                       @Expose
                       var category_id:Int,
                       @SerializedName("kategori_ad")
                       @Expose
                       var category_name:String) : Serializable {

}