package com.example.abb_additional_hw_1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.abb_additional_hw_1.R
import com.example.abb_additional_hw_1.databinding.FragmentIngredientsBinding


class IngredientsFragment : Fragment() {

    private lateinit var binding: FragmentIngredientsBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentIngredientsBinding.inflate(inflater, container, false)
        arguments?.getInt("image")?.let { binding.imageView2.setImageResource(it) }
        binding.calorieAmount.text=arguments?.getString("calorie")
        binding.ingredient1.text = arguments?.getString("ingredient1")
        binding.ingredient2.text = arguments?.getString("ingredient2")
        binding.ingredient3.text = arguments?.getString("ingredient3")

        binding.toSpecialDicounts.setOnClickListener {
            findNavController().navigate(R.id.toDiscountFragment)
        }


        return binding.root
    }


}
