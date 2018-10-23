package com.example.sickl.quizzrealm_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class QuizRealm_question3 extends AppCompatActivity {

    Button subBtn;
    RadioButton answerT;
    RadioButton answerF;

    ScoreHolder score = new ScoreHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_realm_question3);


        subBtn = findViewById(R.id.submitbtn);

        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(answerT.isChecked()) {

                   // score.scoreCount();

                    Intent startNewActivity = new Intent(v.getContext(), QuizRealm_question4.class);
                    startNewActivity.putExtra("q3", 1);
                    startActivity(startNewActivity);

                }

                else {

                    Intent startNewActivity = new Intent(v.getContext(), QuizRealm_question4.class);
                    startNewActivity.putExtra("q3", 0);
                    startActivity(startNewActivity);

                }

            }

        });
    }

    public void q3answerT(View view) {
        answerT = (RadioButton) view;
    }

    public void q3answerF(View view) {
        answerF = (RadioButton) view;
    }
}