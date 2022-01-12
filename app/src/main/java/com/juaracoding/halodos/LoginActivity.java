package com.juaracoding.halodos;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;


import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;


public class LoginActivity extends AppCompatActivity {

    Button btnLogin;
    CarouselView carouselView;
    TextView textView;
    int[] sampleImages = {R.drawable.a1, R.drawable.a2, R.drawable.a3};
    int[] sampleText = {R.string.title1,R.string.title2,R.string.title3};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //transparent statbar
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
        //ending transparent statbar


        setContentView(R.layout.activity_login);
        btnLogin = findViewById(R.id.btnStarted);
        textView = findViewById(R.id.judul);
        carouselView = findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setPageCount(sampleText.length);
        carouselView.setImageListener(imageListener);


    btnLogin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(LoginActivity.this,LoginDetailAct.class);
            startActivity(intent);
        }
    });

    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(sampleImages[position]);
        }
    };

}