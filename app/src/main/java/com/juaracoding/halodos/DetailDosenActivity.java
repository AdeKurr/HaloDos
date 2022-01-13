package com.juaracoding.halodos;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class DetailDosenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_dosen);
        Toolbar toolbar = findViewById(R.id.toolbardetaildosen);
        setSupportActionBar(toolbar);
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

    }

    public void balikKehome(View view) {
        Intent backk =new Intent(DetailDosenActivity.this,SearchActivity.class);
        startActivity(backk);
    }

    public void btnBooking(View view) {
        Intent backk =new Intent(DetailDosenActivity.this,BookingActivity.class);
        startActivity(backk);
    }
}