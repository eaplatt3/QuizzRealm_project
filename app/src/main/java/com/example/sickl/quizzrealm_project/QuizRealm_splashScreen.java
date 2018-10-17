package com.example.sickl.quizzrealm_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class QuizRealm_splashScreen extends AppCompatActivity {

    ImageView imgV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_realm_splash_screen);

        imgV = findViewById(R.id.image_btn);

        imgV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startNewActivity = new Intent(v.getContext(), QuizRealm_loginScreen.class);
                startActivity(startNewActivity);

            }

        });




    }
}
