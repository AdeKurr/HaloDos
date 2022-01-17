package com.juaracoding.halodos;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import in.mayanknagwanshi.imagepicker.ImageSelectActivity;

public class ProfileUserActivity extends AppCompatActivity {
    Button btnEditProfileUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_user);

        Toolbar toolbar = findViewById(R.id.toolbaruserprofile);
        setSupportActionBar(toolbar);
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        btnEditProfileUser = findViewById(R.id.btneditprofileuser);

        btnEditProfileUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), EditProfileUserActivity.class);
                startActivity(intent);
            }
        });
    }
}