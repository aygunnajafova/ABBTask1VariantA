package com.example.abbtask1varianta.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.abbtask1varianta.R
import com.example.abbtask1varianta.databinding.FragmentDetailBinding
import com.example.abbtask1varianta.databinding.FragmentHomeBinding

class DetailFragment : Fragment() {
    private lateinit var binding: FragmentDetailBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentDetailBinding.inflate(inflater, container, false)

        return binding.root
    }
}