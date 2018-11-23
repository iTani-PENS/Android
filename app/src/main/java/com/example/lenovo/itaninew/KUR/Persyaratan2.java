package com.example.lenovo.itaninew.KUR;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.lenovo.itaninew.R;

public class Persyaratan2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itani_kur_persyaratan2);

        LinearLayout next = (LinearLayout) findViewById(R.id.simpan);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next();
            }
        });

    }

    public void next(){
        Intent next = new Intent(this, FormKUR.class);
        startActivity(next);
    }
}
