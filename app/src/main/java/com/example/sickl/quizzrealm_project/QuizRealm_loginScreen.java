package com.example.sickl.quizzrealm_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class QuizRealm_loginScreen extends AppCompatActivity {

    TextView regTxtV;
    ImageView imgVbTn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_realm_login_screen);

        regTxtV = findViewById(R.id.reg);
        imgVbTn = findViewById(R.id.image_btn);

        regTxtV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startNewActivity = new Intent(v.getContext(), QuizRealm_regScreen.class);
                startActivity(startNewActivity);

            }

        });

        imgVbTn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startNewActivity = new Intent(v.getContext(), QuizRealm_rulesScreen.class);
                startActivity(startNewActivity);

            }

        });

    }
}
