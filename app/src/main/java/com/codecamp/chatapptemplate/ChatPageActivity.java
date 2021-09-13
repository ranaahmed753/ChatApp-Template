package com.codecamp.chatapptemplate;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.codecamp.chatapptemplate.fragments.ChatsFragment;
import com.codesgood.views.JustifiedTextView;

import java.net.URISyntaxException;

import de.hdodenhof.circleimageview.CircleImageView;

public class ChatPageActivity extends AppCompatActivity {
    private ImageView arrowBackButton,userImageView,callIcon,videoIcon,cameraIcon,photoIcon,voiceIcon,likeIcon;
    private JustifiedTextView userNameTextView;
    private CircleImageView messageReceiverImage;
    private String userName;
    private String userImage;
    private int requestCode = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_page);

        arrowBackButton = findViewById(R.id.arrowBackButtonID);
        messageReceiverImage = findViewById(R.id.messageImageViewID);
        userNameTextView = findViewById(R.id.chatsTextID);
        callIcon = findViewById(R.id.callIconID);
        videoIcon = findViewById(R.id.videoIconID);
        cameraIcon = findViewById(R.id.cameraIconID);
        photoIcon = findViewById(R.id.photosIconID);
        videoIcon = findViewById(R.id.voiceIconID);
        likeIcon = findViewById(R.id.likeIconID);


        userName = getIntent().getStringExtra("userName");
        userImage = getIntent().getStringExtra("userImage");
        userNameTextView.setText(userName);
        //userImageView.setImageURI(Uri.parse(userImage));

        setOnIconClick();
        messageReceiverImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                messageReceiverImage.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in));
                    Intent intent = new Intent(ChatPageActivity.this,MessageReceiverActivity.class);
                    intent.putExtra("receiverName",userName);
                    setResult(Activity.RESULT_OK,intent);
                    finish();
            }
        });
        
        arrowBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrowBackButton.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in));
                startActivity(new Intent(ChatPageActivity.this, MainActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK));
                finish();
            }
        });

    }

    private void setOnIconClick()
    {
        callIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callIcon.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in));
            }
        });
//
//        videoIcon.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                videoIcon.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in));
//            }
//        });
//
        cameraIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cameraIcon.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in));
            }
        });
//
        photoIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                photoIcon.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in));
            }
        });
//
//       voiceIcon.setOnClickListener(new View.OnClickListener() {
//           @Override
//           public void onClick(View v) {
//               voiceIcon.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in));
//           }
//       });

        likeIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                likeIcon.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in));
            }
        });
    }


}