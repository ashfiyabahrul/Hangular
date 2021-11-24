package com.hangular.hangular.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hangular.hangular.R
import com.hangular.hangular.databinding.FragmentMenuBelajarBinding
import com.hangular.hangular.ui.hangul.HangulVocalActivity


class MenuBelajarFragment : Fragment(), View.OnClickListener {

    lateinit var binding: FragmentMenuBelajarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMenuBelajarBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnVokal.setOnClickListener(this)
        binding.btnKonsonan.setOnClickListener(this)
        binding.btnBaca.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_vokal) {
            val intent = Intent(activity,HangulVocalActivity::class.java)
            intent.putExtra(HangulVocalActivity.HANGUL,1)
            startActivity(intent)
        }
        else if (v?.id == R.id.btn_konsonan) {
            val intent = Intent(activity,HangulVocalActivity::class.java)
            intent.putExtra(HangulVocalActivity.HANGUL,2)
            startActivity(intent)
        }

    }
}