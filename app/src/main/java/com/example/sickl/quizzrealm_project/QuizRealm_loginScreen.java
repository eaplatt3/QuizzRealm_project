package com.example.sickl.quizzrealm_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class QuizRealm_loginScreen extends AppCompatActivity {

    EditText txtLogin;
    EditText txtPassword;
    TextView regTxtV;
    ImageView imgVbTn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_realm_login_screen);

        txtLogin = findViewById(R.id.login_box);
        txtPassword = findViewById(R.id.password_box);
        regTxtV = findViewById(R.id.reg);
        imgVbTn = findViewById(R.id.image_btn);

       final Account acc = new Account();

        regTxtV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String login = txtLogin.getText().toString().trim();

                String password = txtPassword.getText().toString().trim();

                //Validating Input Via Email Pattern
                if (login.length() < 0 || login != acc.getLogin()) {
                    Toast.makeText(QuizRealm_loginScreen.this, "Invalid Input, Re-Enter", Toast.LENGTH_SHORT).show();
                }


                //Validating Input Based on Password Requirements
                if (password == " " || password.length() < 8 || password != acc.getPassword()) {
                    Toast.makeText(QuizRealm_loginScreen.this, "Invalid Input, Re-Enter, Must Be 8 Characters", Toast.LENGTH_SHORT).show();

                }

                else {
                    Intent startNewActivity = new Intent(v.getContext(), QuizRealm_regScreen.class);
                    startActivity(startNewActivity);

                }

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
