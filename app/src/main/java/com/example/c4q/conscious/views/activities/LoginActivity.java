package com.example.c4q.conscious.views.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.example.c4q.conscious.R;

public class LoginActivity extends Activity {

    private static final String SHARED_PREFS_KEY = "sharedPrefsTesting";
    private SharedPreferences login;
    private CheckBox rememberMe;
    private EditText user_name;
    private EditText password;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth = FirebaseAuth.getInstance();
        Button login_btn = findViewById(R.id.login_btn);
        Button registration_btn = findViewById(R.id.registration_btn);
        rememberMe = findViewById(R.id.remember_me);
        user_name = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = getApplicationContext().getSharedPreferences(SHARED_PREFS_KEY, MODE_PRIVATE);

        user_name.setText(login.getString("username",""));
        password.setText(login.getString("password",""));

        if (login.getBoolean("isChecked", true)) {
            user_name.setText(login.getString("username", user_name.getText().toString()));
            password.setText(login.getString("password", password.getText().toString()));
            rememberMe.setChecked(login.getBoolean("isChecked", true));

            /**Please make remember me check box ensure that it saves the login credentials for next use, might need database
             * or might need shared prefs or authentication?
             */
        }

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signInWithEmailAndPassword(user_name.getText().toString(), password.getText().toString())
                        .addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // Sign in success, update UI with the signed-in user's information
                                    Log.d("TAG", "signInWithEmail:success");
                                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                                    intent.putExtra("username", user_name.getText().toString());
                                    startActivity(intent);
                                } else {
                                    // If sign in fails, display a message to the user.
                                    Log.w("TAG", "signInWithEmail:failure", task.getException());
                                    Toast.makeText(LoginActivity.this, "Authentication failed.",Toast.LENGTH_SHORT).show();
                                }
                            }
                        });

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

    public static boolean isValid(String user, String pass, Context context){
        if(isEmail(user, context) && goodPass(pass, context)){
            return true;
        }

        return false;
    }

    public static boolean goodPass(String pass, Context context){
        if(pass.length() >= 6){
            return true;
        } else {
            Toast.makeText(context, "Password needs to be atleast 6 characters long!",Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    public static boolean isEmail(String email, Context context){
        if(email.contains("@") && email.contains(".") && email.length() > 4){
            return true;
        } else {
            Toast.makeText(context, "Enter a valid email address!",Toast.LENGTH_SHORT).show();
            return false;
        }
    }
}
