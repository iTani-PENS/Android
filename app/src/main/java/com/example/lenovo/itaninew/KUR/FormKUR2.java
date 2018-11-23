package com.example.lenovo.itaninew.KUR;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;

import com.example.lenovo.itaninew.R;

public class FormKUR2 extends AppCompatActivity {

    String jangka_waktu[]={"12 Bulan","24 Bulan", "36 Bulan"};
    String jenis_pinjam[]={"Kredit Modal Kerja","Kredit Investasi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itani_form_kur2);

        Spinner combo_jangka_waktu = (Spinner) findViewById(R.id.combo_jangka_waktu);
        Spinner combo_jenis_pinjam = (Spinner) findViewById(R.id.combo_jenis_pinjam);

        ArrayAdapter<String> AdapterListJW = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,jangka_waktu);
        AdapterListJW.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combo_jangka_waktu.setAdapter(AdapterListJW);

        ArrayAdapter<String> AdapterListJenisPinjam = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,jenis_pinjam);
        AdapterListJenisPinjam.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combo_jenis_pinjam.setAdapter(AdapterListJenisPinjam);

        LinearLayout next = (LinearLayout) findViewById(R.id.simpan);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next();
            }
        });

    }

    public void next(){
        Intent next = new Intent(this, FormKUR3.class);
        startActivity(next);
    }
}
