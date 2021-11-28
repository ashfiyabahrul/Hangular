package com.hangular.hangular.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hangular.hangular.ui.quiz.QuizActivity
import com.hangular.hangular.R
import com.hangular.hangular.databinding.FragmentMenuUtamaBinding

class MenuUtamaFragment : Fragment(), View.OnClickListener {

    private lateinit var binding: FragmentMenuUtamaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMenuUtamaBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnBelajar.setOnClickListener(this)
        binding.btnQuiz.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_belajar) {
            val mFragmentManager = parentFragmentManager
            val menuBelajar = MenuBelajarFragment()
            mFragmentManager
                .beginTransaction()
                .apply {
                    replace(R.id.menu_utama,menuBelajar, MenuBelajarFragment::class.java.simpleName)
                    addToBackStack(null)
                    commit()
                }
        } else if (v?.id == R.id.btn_quiz) {
            val intent = Intent(activity, QuizActivity::class.java)
            startActivity(intent)
            /*val mFragmentManager = parentFragmentManager
            val menuQuiz = MenuQuizFragment()
            mFragmentManager
                .beginTransaction()
                .apply {
                    replace(R.id.menu_utama,menuQuiz, MenuQuizFragment::class.java.simpleName)
                    addToBackStack(null)
                    commit()
                }*/
        }
    }
}