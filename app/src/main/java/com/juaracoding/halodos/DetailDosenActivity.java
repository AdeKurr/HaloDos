package com.juaracoding.halodos;

import androidx.appcompat.app.AppCompatActivity;

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

        //transparent statbar
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
        //ending transparent statbar

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