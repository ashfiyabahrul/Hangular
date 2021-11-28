package com.hangular.hangular.ui.quiz

import android.content.ContentValues
import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.google.android.gms.tasks.OnCompleteListener
import com.google.android.gms.tasks.Task
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.QueryDocumentSnapshot
import com.google.firebase.firestore.QuerySnapshot
import com.hangular.hangular.R
import com.hangular.hangular.ui.detail.DetailViewModel
import com.hangular.hangular.utils.ViewModelFactory
import java.util.ArrayList

class QuizActivity : AppCompatActivity() {
    lateinit var viewModel: QuizViewModel
    var db: FirebaseFirestore? = null
    var questions = ArrayList<String?>()
    var choices = ArrayList<ArrayList<String>?>()
    var answers = ArrayList<String?>()
    private var mQuestionView //menampilkan pertanyaan
            : ImageView? = null
    private var mButtonChoice1 // jawaban 1
            : Button? = null
    private var mButtonChoice2 // jawaban 2
            : Button? = null
    private var mButtonChoice3 //jawaban 3
            : Button? = null
    private var mButtonChoice4 //jawaban 4
            : Button? = null
    private var mAnswer // untuk cek jawaban benar atau tidaknya
            : String? = null
    private var mScore = 0 // current total score
    private var mQuestionNumber = 0 //
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        //
        db = FirebaseFirestore.getInstance()

        mQuestionView = findViewById(R.id.question)
        mButtonChoice1 = findViewById(R.id.choice1)
        mButtonChoice2 = findViewById(R.id.choice2)
        mButtonChoice3 = findViewById(R.id.choice3)
        mButtonChoice4 = findViewById(R.id.choice4)
        db!!.collection("soal")
            .get()
            .addOnCompleteListener { task: Task<QuerySnapshot> ->
                if (task.isSuccessful) {
                    for (document in task.result!!) {
                        questions.add(document.getString("pertanyaan"))
                        answers.add(document.getString("jawaban"))
                        choices.add(document["pilihan"] as ArrayList<String>?)
                        Log.d(
                            ContentValues.TAG,
                            document.id + " => " + document.data
                        )
                    }
                    updateQuestion()
                } else {
                    Log.w("error", "Error getting documents.", task.exception)
                }
            }
    }

    private fun updateQuestion() {
        //
        if (mQuestionNumber < questions.size) {

            viewModel = obtainViewModel(this)
            viewModel.getByName(questions[mQuestionNumber]!!.uppercase()).observe(this,{
                Log.d(TAG, "Name:" + it.nama)

                Glide.with(this)
                    .load(it.gambar)
                    .into(mQuestionView!!)
            })/*
            viewModel.getByName(questions[mQuestionNumber]!!).observe(this,
                { it ->
                    // update UI
                    Log.d(TAG, "Name:" + it.nama)
                    Glide.with(this)
                        .load(it.gambar)
                        .into(mQuestionView!!)
                })*/
            //mQuestionView.setText(questions.get(mQuestionNumber));
            mButtonChoice1!!.text = choices[mQuestionNumber]!![0]
            mButtonChoice2!!.text = choices[mQuestionNumber]!![1]
            mButtonChoice3!!.text = choices[mQuestionNumber]!![2]
            mButtonChoice4!!.text = choices[mQuestionNumber]!![3]
            mAnswer = answers[mQuestionNumber]
            mQuestionNumber++
        } else {
            Toast.makeText(this@QuizActivity, "It was the last question!", Toast.LENGTH_SHORT)
                .show()
            val intent = Intent(this@QuizActivity, HasilActivity::class.java)
            intent.putExtra("score", mScore) // pass the current score to the second screen
            intent.putExtra("jumlahsoal", questions.size)
            startActivity(intent)
        }
    }

    fun onClick(view: View) {
        //semua logika untuk semua tombol jawaban dalam satu metode
        val answer = view as Button
        // jika jawabannya benar, tingkatkan skornya
        Log.d(
            ContentValues.TAG,
            "answer.getText = " + answer.text.toString() + " mAnswer = " + mAnswer
        )
        if (answer.text.toString() == mAnswer) {
            mScore = mScore + 1
            Toast.makeText(this@QuizActivity, "Benar!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this@QuizActivity, "Salah!", Toast.LENGTH_SHORT).show()
        }
        updateQuestion()
    }

    fun obtainViewModel (activity: AppCompatActivity) : QuizViewModel {
        val factory = ViewModelFactory.getInstance(activity.application)
        return ViewModelProvider(activity,factory).get(QuizViewModel::class.java)
    }

    companion object {
        var EXTRA_HANGUL = "hangul"
    }

}