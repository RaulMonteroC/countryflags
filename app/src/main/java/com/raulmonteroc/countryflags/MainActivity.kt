package com.raulmonteroc.countryflags

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.view.ContextMenu
import android.view.Menu
import android.view.View

class MainActivity : AppCompatActivity() {

    lateinit var countryRecyclerView: RecyclerView
    lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViews()
        init()
        setSupportActionBar(toolbar)
    }

    private fun findViews() {
        countryRecyclerView = findViewById(R.id.countryRecyclerView)
        toolbar = findViewById(R.id.toolbar)
    }

    private fun init(){
        countryRecyclerView.layoutManager = LinearLayoutManager(this)
        countryRecyclerView.adapter = CountryAdapter(CountrySeed().seed())
        countryRecyclerView.addItemDecoration(MarginItemDecoration(30))
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu, menu)

        return true
    }
}
