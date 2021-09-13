package com.codecamp.chatapptemplate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.codecamp.chatapptemplate.fragments.ChatsFragment;
import com.codecamp.chatapptemplate.fragments.PeopleFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    private ImageView cameraIcon,editIcon;
    private CircleImageView userImageView;
    private RelativeLayout parentLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayoutID,new ChatsFragment()).commit();
        bottomNavigationView = findViewById(R.id.bottomNavigationViewID);
        cameraIcon = findViewById(R.id.cameraIconID);
        editIcon = findViewById(R.id.editIconID);
        userImageView = findViewById(R.id.messageImageViewID);
        parentLayout = findViewById(R.id.parentLayoutID);

        userImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userImageView.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in));
                startActivity(new Intent(MainActivity.this,CurrentUserActivity.class));
                finish();
            }
        });

        cameraIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cameraIcon.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in));
            }
        });

        editIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editIcon.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in));
            }
        });

        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                Fragment fragment = null;

                switch (item.getItemId())
                {
                    case R.id.chatID:
                        fragment = new ChatsFragment();
                        break;
                    case R.id.peopleID:
                        fragment = new PeopleFragment();
                        break;

                }
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayoutID,fragment).commit();

            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();
        parentLayout.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left));
    }
}