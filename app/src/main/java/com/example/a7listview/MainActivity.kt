package com.example.a7listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView=findViewById<ListView>(R.id.listView)
        val countries = arrayOf("India","Canada","Australia","America","Japan","Russia")

        val arrayAdapter:ArrayAdapter<String> = ArrayAdapter(
            this,android.R.layout.simple_list_item_1,countries
        )
        listView.adapter=arrayAdapter

        listView.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this,"Item Selected : "+countries[i],Toast.LENGTH_LONG).show()
        }
    }
}