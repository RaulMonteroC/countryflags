package com.raulmonteroc.countryflags

class CountrySeed {

    fun seed(): List<Country> {
        val countries = listOf<Country>(
            Country("Brazil", R.drawable.brazil),
            Country("Canada", R.drawable.canada),
            Country("China", R.drawable.china),
            Country("Dominican Republic", R.drawable.dominican_republic),
            Country("Germany", R.drawable.germany),
            Country("India", R.drawable.india),
            Country("Netherlands", R.drawable.netherlands),
            Country("norway", R.drawable.norway),
            Country("Peru", R.drawable.peru),
            Country("Philippines", R.drawable.philipines),
            Country("Poland", R.drawable.poland),
            Country("Romania", R.drawable.romania),
            Country("South Africa", R.drawable.south_africa),
            Country("Spain", R.drawable.spain),
            Country("Sweden", R.drawable.sweden),
            Country("United Kingdom", R.drawable.united_kingdom),
            Country("United States", R.drawable.united_states)
        )

        countries.sortedBy { it.name }

        return countries
    }
}