package com.juaracoding.halodos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginDetailAct extends AppCompatActivity {
Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_detail);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cuskeMain = new Intent(LoginDetailAct.this,MainActivity.class);
                startActivity(cuskeMain);
            }
        });
    }

    public void textOnclicked(View view) {
        Intent cabut = new Intent(LoginDetailAct.this,SignUpActivity.class);
        Toast.makeText(getApplicationContext(),"Selamat Datang dari Login ke SignUp", Toast.LENGTH_SHORT).show();
        startActivity(cabut);
    }

    public void forgotText(View view) {
        Intent cabut2 = new Intent(LoginDetailAct.this,ForgotActivity.class);
        Toast.makeText(getApplicationContext(),"Selamat Datang dari Login ke Forgot", Toast.LENGTH_SHORT).show();
        startActivity(cabut2);
    }
}