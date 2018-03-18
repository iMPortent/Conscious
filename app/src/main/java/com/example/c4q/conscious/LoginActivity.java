package com.example.c4q.conscious;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class LoginActivity extends Activity {

    private static final String SHARED_PREFS_KEY = "sharedPrefsTesting";
    private SharedPreferences login;
    private CheckBox rememberMe;
    private EditText user_name;
    private EditText password;
    private ImageView login_icon;
    private Button login_btn;
    private Button registration_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login_icon = findViewById(R.id.login_icon);
        login_btn = findViewById(R.id.login_btn);
        registration_btn = findViewById(R.id.registration_btn);
        rememberMe = findViewById(R.id.remember_me);
        user_name = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = getApplicationContext().getSharedPreferences(SHARED_PREFS_KEY, MODE_PRIVATE);

        if (login.getBoolean("isChecked", true)) {
            user_name.setText(login.getString("username", user_name.getText().toString()));
            password.setText(login.getString("password", password.getText().toString()));
            rememberMe.setChecked(login.getBoolean("isChecked", true));
        }


        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(user_name.getText().toString().equals("")) {
                    Toast.makeText(LoginActivity.this, "please enter a valid username", Toast.LENGTH_LONG).show();
                }
                if(password.getText().toString().equals("")){
                    Toast.makeText(LoginActivity.this, "please enter a valid password", Toast.LENGTH_LONG).show();
                }
                if(!user_name.getText().toString().equals("")
                        && !password.getText().toString().equals("")
                        && !password.getText().toString().contains(user_name.getText().toString())){
                    SharedPreferences.Editor editor = login.edit();
                    editor.clear();
                    editor.putString("username", user_name.getText().toString());
                    editor.putString("userpassword", password.getText().toString());
                    editor.apply();

                    Intent intent = new Intent(LoginActivity.this, OnboardingActivity.class);
                    intent.putExtra("username", user_name.getText().toString());
                    startActivity(intent);
                }
            }
        });

        registration_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToRegistration = new Intent(LoginActivity.this, RegistrationActivity.class);
                startActivity(intentToRegistration);
            }
        });

    }
}
