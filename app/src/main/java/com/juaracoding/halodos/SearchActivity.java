package com.juaracoding.halodos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SearchActivity extends AppCompatActivity {
ImageButton btnDetailDos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        btnDetailDos = findViewById(R.id.btnDetailDos);

        btnDetailDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kedetail = new Intent(SearchActivity.this,DetailDosenActivity.class);
                startActivity(kedetail);
            }
        });

    }
}