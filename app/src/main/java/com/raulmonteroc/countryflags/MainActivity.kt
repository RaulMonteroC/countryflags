package com.raulmonteroc.countryflags

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var countryRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViews()
        init()
    }

    private fun findViews() {
        countryRecyclerView = findViewById(R.id.countryRecyclerView)
    }

    private fun init(){
        countryRecyclerView.layoutManager = LinearLayoutManager(this)
        countryRecyclerView.adapter = CountryAdapter(CountrySeed().seed())
    }

}
