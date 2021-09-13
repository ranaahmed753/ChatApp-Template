package com.codecamp.chatapptemplate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.codesgood.views.JustifiedTextView;

public class MessageReceiverActivity extends AppCompatActivity {

    private ImageView arrowBackButton;
    private JustifiedTextView messageReceiverName;
    private RelativeLayout themeRelattiveLayout,emojiRelattiveLayout,nickNameRelattiveLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_receiver);

        arrowBackButton = findViewById(R.id.arrowBackButtonID);
        messageReceiverName = findViewById(R.id.messageReceiverUserNameID);
        themeRelattiveLayout = findViewById(R.id.themeRelattiveLayoutID);
        emojiRelattiveLayout = findViewById(R.id.emojiRelattiveLayoutID);
        nickNameRelattiveLayout = findViewById(R.id.nickNameRelattiveLayoutID);


        messageReceiverName.setText(getIntent().getStringExtra("receiverName"));

        nickNameRelattiveLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nickNameRelattiveLayout.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in));
            }
        });

        emojiRelattiveLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                emojiRelattiveLayout.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in));
            }
        });
        themeRelattiveLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                themeRelattiveLayout.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in));
            }
        });
        arrowBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrowBackButton.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in));
                startActivity(new Intent(MessageReceiverActivity.this,ChatPageActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET));
                finish();
            }
        });
    }
}