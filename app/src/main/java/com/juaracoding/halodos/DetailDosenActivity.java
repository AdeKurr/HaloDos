package com.juaracoding.halodos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DetailDosenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_dosen);
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