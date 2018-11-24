package com.example.lenovo.itaninew.KUR;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.lenovo.itaninew.R;

public class OpsiKUR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itani_opsi_kur);

        LinearLayout kur = (LinearLayout) findViewById(R.id.kur);
        LinearLayout progres = (LinearLayout) findViewById(R.id.progres);

        progres.setEnabled(false);
        progres.setBackgroundResource(R.drawable.bg_detailbox1);

        kur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kur();
            }
        });
    }

    public void kur(){
        Intent kur = new Intent(this, Persyaratan1.class);
        startActivity(kur);
    }
}
