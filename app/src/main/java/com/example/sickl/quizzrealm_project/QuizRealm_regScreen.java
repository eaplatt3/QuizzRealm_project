package com.example.sickl.quizzrealm_project;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class QuizRealm_regScreen extends AppCompatActivity {

    TextView ctrBtnTxtV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_realm_reg_screen);

        ctrBtnTxtV = findViewById(R.id.btn_create_account);

    }

    public void create_account(View view) {

        finish();

        }
    }

