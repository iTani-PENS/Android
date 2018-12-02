package com.example.lenovo.itaninew.KUR;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.lenovo.itaninew.Home;
import com.example.lenovo.itaninew.KUR.Form.PengajuanBaru;
import com.example.lenovo.itaninew.KUR.Progres.ProgresKUR;
import com.example.lenovo.itaninew.KUR.Proses.ProsesDataKUR;
import com.example.lenovo.itaninew.R;

public class OpsiKUR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itani_opsi_kur);

        LinearLayout kur = (LinearLayout) findViewById(R.id.kur);
        LinearLayout proses = (LinearLayout) findViewById(R.id.proses);
        LinearLayout progres = (LinearLayout) findViewById(R.id.progres);

        //progres.setEnabled(false);
        //progres.setBackgroundResource(R.drawable.bg_detailbox1);

        kur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kur();
            }
        });
        proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proses();
            }
        });
        progres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progres();
            }
        });

        ImageView back = (ImageView) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back();
            }
        });
    }

    public void back(){
        Intent back = new Intent(this, Home.class);
        startActivity(back);
    }

    public void kur(){
        Intent kur = new Intent(this, PengajuanBaru.class);
        startActivity(kur);
    }

    public void proses(){
        Intent proses = new Intent(this, ProsesDataKUR.class);
        startActivity(proses);
    }

    public void progres(){
        Intent progres = new Intent(this, ProgresKUR.class);
        startActivity(progres);
    }
}
