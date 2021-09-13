package com.codecamp.chatapptemplate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import de.hdodenhof.circleimageview.CircleImageView;

public class CurrentUserActivity extends AppCompatActivity {
    private RelativeLayout messageRequestTopRelativeLayout,messageRequestMiddleRelativeLayout,archiveChatRelativeLyout;
    private ImageView arrowBackButton;
    private RelativeLayout profileTopRelativeLayout,profileBottomRelativeLayout;
    private RelativeLayout preferenceTopRelativeLayout,avatarRelativeLayout,notificationRelativeLayout,dataSavarRelativeLayout,storyRelativeLayout,photosRelativeLayout;
    private RelativeLayout switchAccountRelativeLayout,accountSettingRelativeLayout,technicalProblemRelativeLayout,helpRelativeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_user);

        messageRequestTopRelativeLayout = findViewById(R.id.messageRequestTopRelativeLayoutID);
        messageRequestMiddleRelativeLayout = findViewById(R.id.messageRequestMiddleRelativeLayoutID);
        archiveChatRelativeLyout = findViewById(R.id.archiveChatRelativeLyoutID);
        arrowBackButton = findViewById(R.id.arrowBackButtonID);
        profileTopRelativeLayout = findViewById(R.id.profileTopRelativeLayoutID);
        profileBottomRelativeLayout = findViewById(R.id.profileBottomRelativeLayoutID);
        preferenceTopRelativeLayout = findViewById(R.id.preferenceTopRelativeLayoutID);
        avatarRelativeLayout = findViewById(R.id.avatarRelativeLayoutID);
        notificationRelativeLayout = findViewById(R.id.notificationRelativeLayoutID);
        dataSavarRelativeLayout = findViewById(R.id.dataSavarRelativeLayoutID);
        storyRelativeLayout = findViewById(R.id.storyRelativeLayoutID);
        photosRelativeLayout = findViewById(R.id.photosRelativeLayoutID);
        accountSettingRelativeLayout = findViewById(R.id.accountSettingRelativeLayoutID);
        switchAccountRelativeLayout = findViewById(R.id.switchAccountRelativeLayoutID);
        technicalProblemRelativeLayout = findViewById(R.id.technicalProblemRelativeLayoutID);
        helpRelativeLayout = findViewById(R.id.helpRelativeLayoutID);



        setOnItemClick();

    }

    private void setOnItemClick()
    {
        arrowBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrowBackButton.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in));
                startActivity(new Intent(CurrentUserActivity.this,MainActivity.class));
                finish();
            }
        });

        archiveChatRelativeLyout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                archiveChatRelativeLyout.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in));
            }
        });
        messageRequestMiddleRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                messageRequestMiddleRelativeLayout.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in));
            }
        });

        messageRequestTopRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                messageRequestTopRelativeLayout.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in));
            }
        });

        profileTopRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                profileTopRelativeLayout.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in));
            }
        });

        profileBottomRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                profileBottomRelativeLayout.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in));
            }
        });
        preferenceTopRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preferenceTopRelativeLayout.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in));
            }
        });
        avatarRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avatarRelativeLayout.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in));
            }
        });
        notificationRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notificationRelativeLayout.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in));
            }
        });
        dataSavarRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataSavarRelativeLayout.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in));
            }
        });
        storyRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storyRelativeLayout.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in));
            }
        });
        photosRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                photosRelativeLayout.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in));
            }
        });
        switchAccountRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchAccountRelativeLayout.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in));
            }
        });
        accountSettingRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                accountSettingRelativeLayout.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in));
            }
        });
        technicalProblemRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                technicalProblemRelativeLayout.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in));
            }
        });
        helpRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helpRelativeLayout.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in));
            }
        });
    }
}