package com.hangular.hangular.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hangular.hangular.databinding.FragmentMenuQuizBinding

class MenuQuizFragment : Fragment() {

    lateinit var binding: FragmentMenuQuizBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMenuQuizBinding.inflate(inflater,container,false)
        return binding.root
    }
}