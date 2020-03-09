package com.josemascaro.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.josemascaro.coderswag.Adapters.CategoryAdapter
import com.josemascaro.coderswag.Model.Category
import com.josemascaro.coderswag.R
import com.josemascaro.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this,DataService.categories)
        //categoryListView.adapter = adapter

//        categoryListView.setOnItemClickListener{parent: AdapterView<*>?, view: View?, i: Int, l : Long ->
//            val category = DataService.categories[i]
//            Toast.makeText(this,"You clicked n the ${category.title} cell", Toast.LENGTH_SHORT).show()
//        }
    }
}
