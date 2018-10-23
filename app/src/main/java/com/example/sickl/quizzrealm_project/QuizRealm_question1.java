package com.example.sickl.quizzrealm_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class QuizRealm_question1 extends AppCompatActivity {

    Button subBtn;
    CheckBox answer1;
    CheckBox answer2;
    CheckBox answer3;
    CheckBox answer4;

   ScoreHolder score = new ScoreHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_realm_question1);

        subBtn = findViewById(R.id.submitbtn);

        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(answer1.isChecked() && answer3.isChecked()) {

                    score.setScore(1);

                    Intent startNewActivity = new Intent(v.getContext(), QuizRealm_question2.class);
                    startActivity(startNewActivity);

                }

                else{

                    Intent startNewActivity = new Intent(v.getContext(), QuizRealm_question2.class);
                    startActivity(startNewActivity);
                }

            }

        });
    }

    public void q1answer1Clicked(View view) {
        answer1 = (CheckBox)view;
        }

    public void q1answer2Clicked(View view) {
        answer2 = (CheckBox)view;
    }

    public void q1answer3Clicked(View view) {
        answer3 = (CheckBox)view;
    }

    public void q1answer4Clicked(View view) {
        answer4 = (CheckBox)view;
    }
}
