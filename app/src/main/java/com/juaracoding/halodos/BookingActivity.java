package com.juaracoding.halodos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BookingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
    }

    public void balikKeDetailDos(View view) {
        Intent backk =new Intent(BookingActivity.this,DetailDosenActivity.class);
        startActivity(backk);
    }

    public void btnBookDos(View view) {
    }
}