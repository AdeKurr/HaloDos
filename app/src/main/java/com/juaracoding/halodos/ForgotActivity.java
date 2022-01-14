package com.juaracoding.halodos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class ForgotActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);

//        Spinner spinnerLanguages=findViewById(R.id.spinner_languages);
//        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this, R.array.languages, android.R.layout.simple_spinner_item);
//
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
//        AlertDialog.Builder spinnerLangauges;
//        spinnerLanguages.setAdapter(adapter);

    }

    public void textOnclicked(View view) {
        Toast.makeText(getApplicationContext(),"Harusnya kelogin",Toast.LENGTH_SHORT).show();
    }
}