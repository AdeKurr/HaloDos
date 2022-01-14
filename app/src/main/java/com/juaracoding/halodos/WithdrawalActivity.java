package com.juaracoding.halodos;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class WithdrawalActivity extends AppCompatActivity {
    LinearLayout lin;
   Button btnWithdraw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_withdrawal);

        Toolbar toolbar = findViewById(R.id.toolbarWithdrawal);
        setSupportActionBar(toolbar);
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);


        lin = (LinearLayout) findViewById(R.id.afterDivider);
        btnWithdraw = findViewById(R.id.btnWithdraw);


        btnWithdraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cus = new Intent(WithdrawalActivity.this,WithdrawConfirmActivity.class);
                startActivity(cus);
            }
        });
    }

    public void lineAddmorebank(View view) {
        lin.removeAllViews();
        Spinner spinnerbank = new Spinner(WithdrawalActivity.this);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.dropdownInsertNewBank, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerbank.setX(20);
        spinnerbank.setY(30);
        spinnerbank.setAdapter(adapter);

        EditText inputnomorbank = new EditText(WithdrawalActivity.this);
        inputnomorbank.setHint(R.string.hintBankAccNumber);;
        inputnomorbank.setInputType(InputType.TYPE_CLASS_NUMBER);
        inputnomorbank.setY(30);
        inputnomorbank.setX(30);

        lin.addView(spinnerbank);
        lin.addView(inputnomorbank);
    }
}