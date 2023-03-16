package com.example.abb_additional_hw_1.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.abb_additional_hw_1.ProfileActivity
import com.example.abb_additional_hw_1.databinding.FragmentSettingsBinding


class SettingsFragment : Fragment() {

    private lateinit var binding: FragmentSettingsBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentSettingsBinding.inflate(inflater, container, false)

        binding.toProfile.setOnClickListener {
            startActivity(Intent(activity, ProfileActivity::class.java))
        }
        return binding.root


    }

    }
