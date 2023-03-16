package com.example.abb_additional_hw_1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.abb_additional_hw_1.R
import com.example.abb_additional_hw_1.databinding.FragmentProductsBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class ProductsFragment : Fragment() {

    private lateinit var binding: FragmentProductsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentProductsBinding.inflate(inflater, container, false)

        binding.toDetails.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("image", R.drawable.ingredients)
            bundle.putString("calorie", "Calories: 600")
            bundle.putString("ingredient1", "Tomato")
            bundle.putString("ingredient2", "Beef")
            bundle.putString("ingredient3", "Cheese")
            findNavController().navigate(R.id.toProductNav, bundle)

        }




        return binding.root
    }

    }
