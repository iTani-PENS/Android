package com.example.lenovo.itaninew.SignUp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.lenovo.itaninew.Login.LogIn;
import com.example.lenovo.itaninew.R;
import com.example.lenovo.itaninew.Verification.VerificationCode;

public class SignUp extends AppCompatActivity {

    private EditText etNama;
    private EditText etNoHp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itani_daftar);

        etNama = findViewById(R.id.etNama);
        etNoHp = findViewById(R.id.etNoHp);
        etNama.setBackgroundResource(android.R.color.transparent);
        etNoHp.setBackgroundResource(android.R.color.transparent);
        TextView masuk = (TextView) findViewById(R.id.masuk);
        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                masuk();
            }
        });

        Button daftar = (Button) findViewById(R.id.daftar);
        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                daftar();
            }
        });
    }

    public void masuk() {
        Intent intent = new Intent(this, LogIn.class);
        startActivity(intent);
    }

    public void daftar() {
        Intent intent = new Intent(this, VerificationCode.class);
        startActivity(intent);
    }
}
