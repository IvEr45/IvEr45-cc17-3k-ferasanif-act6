package com.example.mycityapp.city

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mycityapp.R

class CityModel : ViewModel() {

    private val _categories = MutableLiveData<List<Category>>()
    val categories: LiveData<List<Category>> = _categories

    init {
        loadCategories()
    }

    private fun loadCategories() {
        _categories.value = listOf(
            Category(1, "Restaurants", R.drawable.baseline_restaurant_24),
            Category(2, "Parks", R.drawable.baseline_park_24),
            Category(3, "Museums", R.drawable.baseline_museum_24),
            Category(4, "Shopping", R.drawable.baseline_shopping_cart_24),
            Category(5, "Nightlife", R.drawable.baseline_sports_bar_24)
        )
    }
}
