package com.raulmonteroc.countryflags

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.raulmonteroc.countryflags.CountryAdapter.FlagViewHolder

class CountryAdapter(private val countries: List<Country>) : RecyclerView.Adapter<FlagViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlagViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.country_item, parent,false)

        return FlagViewHolder(view)
    }

    override fun getItemCount() = countries.size
    override fun onBindViewHolder(viewHolder: FlagViewHolder, position: Int) = viewHolder.bind(countries[position])

    class FlagViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val name:TextView = itemView.findViewById(R.id.countryName)
        private val flag:ImageView = itemView.findViewById(R.id.countryFlag)

        fun bind(country : Country) {

            name.text = country.name
            flag.setImageResource(country.flagImageResource)
        }
    }
}

