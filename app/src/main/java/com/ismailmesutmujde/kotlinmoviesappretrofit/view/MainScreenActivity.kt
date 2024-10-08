package com.ismailmesutmujde.kotlinmoviesappretrofit.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.ismailmesutmujde.kotlinmoviesappretrofit.R
import com.ismailmesutmujde.kotlinmoviesappretrofit.adapter.CategoriesRecyclerViewAdapter
import com.ismailmesutmujde.kotlinmoviesappretrofit.dao.CategoriesDaoInterface
import com.ismailmesutmujde.kotlinmoviesappretrofit.databinding.ActivityMainScreenBinding
import com.ismailmesutmujde.kotlinmoviesappretrofit.model.Categories
import com.ismailmesutmujde.kotlinmoviesappretrofit.model.CategoriesResponse
import com.ismailmesutmujde.kotlinmoviesappretrofit.service.ApiUtils
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainScreenActivity : AppCompatActivity() {

    private lateinit var bindingMainScreen : ActivityMainScreenBinding

    private lateinit var categoryList:ArrayList<Categories>
    private lateinit var adapterCategory: CategoriesRecyclerViewAdapter

    private lateinit var cdi:CategoriesDaoInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMainScreen = ActivityMainScreenBinding.inflate(layoutInflater)
        val view = bindingMainScreen.root
        setContentView(view)

        bindingMainScreen.toolbarCategory.title = "Categories"
        setSupportActionBar(bindingMainScreen.toolbarCategory)

        bindingMainScreen.recyclerViewCategory.setHasFixedSize(true)
        bindingMainScreen.recyclerViewCategory.layoutManager = LinearLayoutManager(this)

        cdi = ApiUtils.getCategoriesDaoInterface()

        /*
        categoryList = ArrayList()

        val c1 = Categories(1,"Science Fiction")
        val c2 = Categories(2,"Drama")
        val c3 = Categories(3,"Action")
        val c4 = Categories(4,"Adventure")
        val c5 = Categories(5,"Fantastic")
        val c6 = Categories(6,"Romantic")
        val c7 = Categories(1,"Comedy")
        val c8 = Categories(2,"Thriller")
        val c9 = Categories(1,"Horror")
        val c10 = Categories(2,"War")

        categoryList.add(c1)
        categoryList.add(c2)
        categoryList.add(c3)
        categoryList.add(c4)
        categoryList.add(c5)
        categoryList.add(c6)
        categoryList.add(c7)
        categoryList.add(c8)
        categoryList.add(c9)
        categoryList.add(c10)

        adapterCategory = CategoriesRecyclerViewAdapter(this, categoryList)
        bindingMainScreen.recyclerViewCategory.adapter = adapterCategory
        */

        allCategories()
    }

    fun allCategories() {
        cdi.allCategories().enqueue(object : Callback<CategoriesResponse>{
            override fun onResponse(
                call: Call<CategoriesResponse>,
                response: Response<CategoriesResponse>
            ) {
                if (response != null) {
                    val list = response.body()!!.categories
                    adapterCategory = CategoriesRecyclerViewAdapter(this@MainScreenActivity, list)
                    bindingMainScreen.recyclerViewCategory.adapter = adapterCategory
                }
            }

            override fun onFailure(call: Call<CategoriesResponse>, t: Throwable) {

            }

        })

    }
}