package com.example.mycityapp.recommend

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mycityapp.R

class Recommend : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: RecommendAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_recommend, container, false)
        recyclerView = view.findViewById(R.id.recyclerViewRecommend)

        adapter = RecommendAdapter { itemName ->

            val bundle = Bundle().apply {
                putString("itemName", itemName)
            }
            findNavController().navigate(R.id.category, bundle)
        }

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)

        val categoryId = arguments?.getInt("categoryId") ?: -1
        loadItems(categoryId)

        return view
    }

    private fun loadItems(categoryId: Int) {
        val items = when (categoryId) {
            1 -> listOf("Grumpy Joe", "Craft Burgers", "Chef's Home","Balai Inasal","Mahii Indian Cuisine")
            2 -> listOf("Burnham Park", "Botanical Garden", "Mines View Park", "Wright Park", "Camp John Hay Park")
            3 -> listOf("BenCab Museum", "Baguio Museum", "Museo Kordilyera", "Bell House Library Museum", "Galleria De Potenciana by Arca’s Yard")
            4 -> listOf("SM City Baguio", "Baguio Center Mall", "Porta Vaga Mall", "Abanao Square", "Sky World Commercial Center")
            5 -> listOf("The Camp", "Spade Superclub", "Alberto's Bar", "The Ampersand", "Amarillo Music Bar")
            else -> emptyList()
        }

        adapter.submitList(items)
    }
}
