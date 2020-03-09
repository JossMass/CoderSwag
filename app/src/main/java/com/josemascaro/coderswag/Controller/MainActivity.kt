package com.josemascaro.coderswag.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.josemascaro.coderswag.Adapters.CategoryAdapter
import com.josemascaro.coderswag.Adapters.CategoryRecycleAdapter
import com.josemascaro.coderswag.Model.Category
import com.josemascaro.coderswag.R
import com.josemascaro.coderswag.Services.DataService
import com.josemascaro.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories) {
            category ->

            val productIntent = Intent(this, ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY,category.title)
            startActivity(productIntent)
        }
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager

        categoryListView.setHasFixedSize(true)

//        categoryListView.setOnItemClickListener{parent: AdapterView<*>?, view: View?, i: Int, l : Long ->
//            val category = DataService.categories[i]
//            Toast.makeText(this,"You clicked n the ${category.title} cell", Toast.LENGTH_SHORT).show()
//        }
    }
}
