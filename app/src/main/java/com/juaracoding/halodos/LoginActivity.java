package com.juaracoding.halodos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.button.MaterialButtonToggleGroup;

public class LoginActivity extends AppCompatActivity {
Button btnLogin;
MaterialButtonToggleGroup materialButtonToggleGroup;
private int alamatdaritogel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        materialButtonToggleGroup = findViewById(R.id.togelGroupLogin);

        //transparent statbar
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
        //ending transparent statbar

        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (alamatdaritogel == 1){
                    Intent cuskeMain = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(cuskeMain);
                } else  if (alamatdaritogel == 2){
                    Intent cuskeMainads = new Intent(LoginActivity.this,MainAdvisorsActivity.class);
                    startActivity(cuskeMainads);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Ups togel belum dipilih gan", Toast.LENGTH_SHORT).show();
                }
            }
        });


        materialButtonToggleGroup.addOnButtonCheckedListener(new MaterialButtonToggleGroup.OnButtonCheckedListener() {
            @Override
            public void onButtonChecked(MaterialButtonToggleGroup group, int checkedId, boolean isChecked) {
                if (isChecked) {
                    if (checkedId == 0){
                        checkedId  = R.id.btnAdvisorLogin;
                    } else if (checkedId == 1){
                        checkedId  = R.id.btnStudentLogin;
                    }
                    if (checkedId  == R.id.btnAdvisorLogin){
                        alamatdaritogel = 2;
                    } else if (checkedId  == R.id.btnStudentLogin){
                        alamatdaritogel = 1;
                    }
                } else {
                    if (materialButtonToggleGroup.getCheckedButtonId() == View.NO_ID) {
                        alamatdaritogel = 0;
                        Toast.makeText(getApplicationContext(),"Nothing account type selected", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    public void textOnclicked(View view) {
        Intent cabut = new Intent(LoginActivity.this,SignUpActivity.class);
        Toast.makeText(getApplicationContext(),"Selamat Datang dari Login ke SignUp", Toast.LENGTH_SHORT).show();
        startActivity(cabut);
    }

    public void forgotText(View view) {
        Intent cabut2 = new Intent(LoginActivity.this,ForgotActivity.class);
        Toast.makeText(getApplicationContext(),"Selamat Datang dari Login ke Forgot", Toast.LENGTH_SHORT).show();
        startActivity(cabut2);
    }
}