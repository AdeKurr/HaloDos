package com.juaracoding.halodos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.button.MaterialButtonToggleGroup;

public class SignUpActivity extends AppCompatActivity {
Button btnStudent,btnAdvisor;
MaterialButtonToggleGroup materialButtonToggleGroup;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        btnAdvisor = findViewById(R.id.btnAdvisor);
        btnStudent = findViewById(R.id.btnStudent);
        materialButtonToggleGroup = findViewById(R.id.togelGroupSignup);

        //dropdown
        Spinner spinner = findViewById(R.id.spinner);
    ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.secQuestion, android.R.layout.simple_spinner_item);

    adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
    spinner.setAdapter(adapter);
        //akhir dropdown
        materialButtonToggleGroup.addOnButtonCheckedListener(new MaterialButtonToggleGroup.OnButtonCheckedListener() {
            @Override
            public void onButtonChecked(MaterialButtonToggleGroup group, int checkedId, boolean isChecked) {
                if (isChecked) {
                    if (checkedId == 0){
                        checkedId  = R.id.btnAdvisor;
                    } else if (checkedId == 1){
                            checkedId  = R.id.btnStudent;
                    }
                        if (checkedId  == R.id.btnAdvisor){
                            Toast.makeText(getApplicationContext(),"Advisor account", Toast.LENGTH_SHORT).show();
                        } else if (checkedId  == R.id.btnStudent){
                            Toast.makeText(getApplicationContext(),"Student account", Toast.LENGTH_SHORT).show();
                        }
                    }
                 else {
                    if (materialButtonToggleGroup.getCheckedButtonId() == View.NO_ID) {
                        Toast.makeText(getApplicationContext(),"Nothing selected", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }

    public void textOnclicked(View view) {
        Intent cabut = new Intent(SignUpActivity.this,LoginDetailAct.class);
        Toast.makeText(getApplicationContext(),"Selamat Datang dari sign IN ke login", Toast.LENGTH_LONG).show();
        startActivity(cabut);
    }

    public void btnSignup(View view) {

//        if (btnAdvisor.hasFocusable() == true && btnStudent.hasFocusable() != true){
//            Toast.makeText(getApplicationContext(),"Jenis akun advisor, ke login",Toast.LENGTH_LONG).show();
////            Intent dosKelogin = new Intent(SignUpActivity.this,LoginDetailAct.class);
////            startActivity(dosKelogin);
//        } else if (btnStudent.hasFocusable() == true && btnAdvisor.hasFocusable() != true){
//            Toast.makeText(getApplicationContext(),"Jenis akun student, ke login",Toast.LENGTH_LONG).show();
////            Intent stdnKelogin = new Intent(SignUpActivity.this,LoginDetailAct.class);
////            startActivity(stdnKelogin);
//        }
////        else if (btnStudent.isActivated() && btnAdvisor.isActivated()){
////            Toast.makeText(getApplicationContext(),"Jenis akun yang dipilih tidak valid!",Toast.LENGTH_LONG).show();
////        }
    }
}