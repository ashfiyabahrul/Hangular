package com.hangular.hangular.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hangular.hangular.databinding.FragmentMenuBelajarBinding


class MenuBelajarFragment : Fragment() {

    lateinit var binding: FragmentMenuBelajarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMenuBelajarBinding.inflate(inflater,container,false)
        return binding.root
    }
}