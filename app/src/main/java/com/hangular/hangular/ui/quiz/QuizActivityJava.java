package com.hangular.hangular.ui.quiz;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.hangular.hangular.R;

import java.util.ArrayList;

public class QuizActivityJava extends AppCompatActivity {

    public static String EXTRA_HANGUL = "hangul";
    QuizViewModel viewModel = new ViewModelProvider(this).get(QuizViewModel.class);


    public FirebaseFirestore db;
    public ArrayList<String> questions = new ArrayList<>();
    public ArrayList<ArrayList<String>> choices = new ArrayList<>();
    public ArrayList<String> answers = new ArrayList<>();
    private ImageView mQuestionView;  //menampilkan pertanyaan
    private Button mButtonChoice1; // jawaban 1
    private Button mButtonChoice2; // jawaban 2
    private Button mButtonChoice3; //jawaban 3
    private Button mButtonChoice4; //jawaban 4

    private String mAnswer;  // untuk cek jawaban benar atau tidaknya
    private int mScore = 0;  // current total score
    private int mQuestionNumber = 0; //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        //
        this.db = FirebaseFirestore.getInstance();
        mQuestionView = findViewById(R.id.question);
        mButtonChoice1 = findViewById(R.id.choice1);
        mButtonChoice2 = findViewById(R.id.choice2);
        mButtonChoice3 = findViewById(R.id.choice3);
        mButtonChoice4 = findViewById(R.id.choice4);

        db.collection("soal")
                .get()
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        for (QueryDocumentSnapshot document : task.getResult()) {
                            questions.add(document.getString("pertanyaan"));
                            answers.add(document.getString("jawaban"));
                            choices.add((ArrayList<String>) document.get("pilihan"));
                            Log.d(TAG, document.getId() + " => " + document.getData());
                        }
                        updateQuestion();
                    } else {
                        Log.w("error", "Error getting documents.", task.getException());
                    }
                });


    }

    private void updateQuestion(){
        //
        if(mQuestionNumber<questions.size() ){
            viewModel.getByName(questions.get(mQuestionNumber)).observe(this, it -> {
                // update UI
                Glide.with(this)
                        .load(it.getGambar())
                        .into(mQuestionView);
            });
            //mQuestionView.setText(questions.get(mQuestionNumber));
            mButtonChoice1.setText(choices.get(mQuestionNumber).get(0));
            mButtonChoice2.setText(choices.get(mQuestionNumber).get(1));
            mButtonChoice3.setText(choices.get(mQuestionNumber).get(2));
            mButtonChoice4.setText(choices.get(mQuestionNumber).get(3));
            mAnswer = answers.get(mQuestionNumber);
            mQuestionNumber++;
        }
        else {
            Toast.makeText(QuizActivityJava.this, "It was the last question!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(QuizActivityJava.this, HasilActivity.class);
            intent.putExtra("score", mScore); // pass the current score to the second screen
            intent.putExtra("jumlahsoal", questions.size());
            startActivity(intent);
        }
    }

    public void onClick(View view) {
        //semua logika untuk semua tombol jawaban dalam satu metode
        Button answer = (Button) view;
        // jika jawabannya benar, tingkatkan skornya
        Log.d(TAG, "answer.getText = "+answer.getText().toString()+" mAnswer = "+mAnswer);
        if (answer.getText().toString().equals(mAnswer)){
            mScore = mScore + 1;
            Toast.makeText(QuizActivityJava.this, "Benar!", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(QuizActivityJava.this, "Salah!", Toast.LENGTH_SHORT).show();
        }
        updateQuestion();
    }

}