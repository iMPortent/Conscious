package com.example.c4q.conscious;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistrationActivity extends Activity {

    EditText username_et;
    EditText password_et;
    EditText confirm_password_et;
    Button submit_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        username_et = findViewById(R.id.username_et);
        password_et = findViewById(R.id.password_et);
        confirm_password_et = findViewById(R.id.confirm_password_et);
        submit_btn = findViewById(R.id.submit_btn);

        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToLogin = new Intent(RegistrationActivity.this, LoginActivity.class);
                startActivity(intentToLogin);
            }
        });
    }
}
