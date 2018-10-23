package com.example.sickl.quizzrealm_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

//Earl Platt III
//BCS421 - Android
//10/22/2018
//Quiz Realm App
/////////////////////////////////
//Input: User Enters
//       -Username & Password
//       -First Name, Last Name,
//        Date of Birth, Email,
//Output: Allows User to Register & Login

public class QuizRealm_regScreen extends AppCompatActivity {

    TextView ctrBtnTxtV;
    EditText txtUsername;
    EditText txtPassword;
    EditText txtEmail;
    EditText txtFirstName;
    EditText txtLastName;
    EditText txtDob;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"; //Pattern Required For Email Validation

    Person pers = new Person();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_realm_reg_screen);

        ctrBtnTxtV = findViewById(R.id.btn_create_account);
        txtUsername = findViewById(R.id.username_box);
        txtPassword = findViewById(R.id.password_box);
        txtEmail = findViewById(R.id.email_box);
        txtFirstName = findViewById(R.id.first_name_box);
        txtLastName = findViewById(R.id.last_name_box);
        txtDob = findViewById(R.id.dob_box);

    }

    //Method to read info from text fields
    public void create_account(View view) {

        //Retrieving Info from Text Fields
        String username = txtUsername.getText().toString().trim();
        String password = txtPassword.getText().toString().trim();
        String firstname = txtFirstName.getText().toString().trim();
        String lastname = txtLastName.getText().toString().trim();
        String email = txtEmail.getText().toString().trim();
        String dob = txtDob.getText().toString().trim();


        //Validating User Input
        if(username == " " || username.length() < 3 || username.length() > 15){
            Toast.makeText(QuizRealm_regScreen.this,"Invalid Input, Re-Enter", Toast.LENGTH_SHORT).show();
        }

        if(firstname == " " || firstname.length() < 3 || firstname.length() > 30){
            Toast.makeText(QuizRealm_regScreen.this,"Invalid Input, Re-Enter", Toast.LENGTH_SHORT).show();
        }

        if(lastname == " " || lastname.length() < 3 || lastname.length() > 30){
            Toast.makeText(QuizRealm_regScreen.this,"Invalid Input, Re-Enter", Toast.LENGTH_SHORT).show();
        }

        if(dob == " " || dob.length() != 8){
            Toast.makeText(QuizRealm_regScreen.this,"Invalid Input, Re-Enter", Toast.LENGTH_SHORT).show();
        }

        //Validating Input Via Email Pattern
        if(email == " " || email.length() > 30 || Patterns.EMAIL_ADDRESS.matcher(emailPattern).matches()) {
            Toast.makeText(QuizRealm_regScreen.this,"Invalid Input, Re-Enter", Toast.LENGTH_SHORT).show();
        }

        if(password == " " || password.length() < 8){
            Toast.makeText(QuizRealm_regScreen.this,"Invalid Input, Re-Enter", Toast.LENGTH_SHORT).show();
        }

        else {

            //Storing User Info In Person Class
            pers.setFirstname(firstname);
            pers.setLastname(lastname);
            pers.setBirthDate(Double.parseDouble(dob));
            pers.setEmail(email);
            pers.setPassword(password);

            finish(); //Guarantee Return to Previous Activity

        }

    }
}
