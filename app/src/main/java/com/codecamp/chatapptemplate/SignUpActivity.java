package com.codecamp.chatapptemplate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.RelativeLayout;

import com.codesgood.views.JustifiedTextView;

public class SignUpActivity extends AppCompatActivity {
    private EditText nameEditText,emailEditText,passwordEditText;
    private RelativeLayout signupButton,parentLayout;
    private JustifiedTextView loginTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sign_up);

        nameEditText = findViewById(R.id.nameEditTextID);
        emailEditText = findViewById(R.id.emailEditTextID);
        passwordEditText = findViewById(R.id.passwordEditTextID);
        signupButton = findViewById(R.id.signupButtonID);
        parentLayout = findViewById(R.id.signupRelativeLayoutID);
        loginTextView = findViewById(R.id.loginTextID);

        loginTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginTextView.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in));
                startActivity(new Intent(SignUpActivity.this,LoginActivity.class));
                finish();
            }
        });

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signupButton.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in));
                startActivity(new Intent(SignUpActivity.this,LoginActivity.class));
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        parentLayout.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),R.anim.signup_anim));
    }
}