package com.juaracoding.halodos;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailSaldoActivity extends AppCompatActivity {
Button btnWithdraw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_saldo);
        btnWithdraw = findViewById(R.id.btnWithdraw);


        Toolbar toolbar = findViewById(R.id.toolbarDetailSaldo);
        setSupportActionBar(toolbar);
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        btnWithdraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cus = new Intent(DetailSaldoActivity.this,WithdrawalActivity.class);
                startActivity(cus);
            }
        });

    }

    public void keTransactionHistory(View view) {
        Intent cus = new Intent(DetailSaldoActivity.this,RiwayatTransaksiActivity.class);
        startActivity(cus);
    }
}