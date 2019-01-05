package com.example.lenovo.itaninew.Verification;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lenovo.itaninew.Home;
import com.example.lenovo.itaninew.R;

public class VerificationCode extends AppCompatActivity {

    private Button verifikasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itani_verifikasi_kode);

        verifikasi = findViewById(R.id.verifikasi);
        verifikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getVerifikasi();
            }
        });
    }

    public void getVerifikasi() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}
