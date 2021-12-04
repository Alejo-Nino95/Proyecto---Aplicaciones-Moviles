package com.example.androidapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

//    ArrayList<String> cities = new ArrayList<>();
//    ArrayList<String> imageCities = new ArrayList<>();
//    ArrayList<String> infoCities = new ArrayList<>();
//    ArrayList<String> punctCities = new ArrayList<>();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.boton)
        button.setOnClickListener {
            startActivity(Intent(this,CityActivity::class.java))
        }

        val recycler = findViewById<RecyclerView>(R.id.recycler)
        val adapter = SitesAdapter()
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = adapter

//        JSONObject obj = new JSONObject(loadJSONfromAssets());


    }

    private fun loadJSONfromAssets(): String {
        TODO("Not yet implemented")
    }
}