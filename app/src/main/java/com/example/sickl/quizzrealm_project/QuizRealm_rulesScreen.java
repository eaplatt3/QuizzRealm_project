package com.example.sickl.quizzrealm_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class QuizRealm_rulesScreen extends AppCompatActivity {

    TextView acceptTxtV;
    TextView declineTxtV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_realm_rules_screen);

        acceptTxtV = findViewById(R.id.accept_quest);
        declineTxtV = findViewById(R.id.decline_quest);

    }

    public void exit(View view) {

        finish();
    }

    public void play(View view) {

        Intent startNewActivity = new Intent(view.getContext(), QuizRealm_question1.class);
        startActivity(startNewActivity);

    }
}
