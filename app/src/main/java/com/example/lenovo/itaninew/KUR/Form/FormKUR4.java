package com.example.lenovo.itaninew.KUR.Form;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;

import com.example.lenovo.itaninew.R;

public class FormKUR4 extends AppCompatActivity {

    String yesno[]={"Ya","Tidak"};
    LinearLayout biaya1, biaya2, biaya3, biaya4, biaya5, doc_apik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itani_form_kur4);

        Spinner combo_apik = (Spinner) findViewById(R.id.combo_apik);
        Spinner combo_tempat_usaha = (Spinner) findViewById(R.id.combo_yesno);
        Spinner combo_tanggungan_anak = (Spinner) findViewById(R.id.combo_yesno2);
        Spinner combo_pendapatan_lain = (Spinner) findViewById(R.id.combo_yesno3);
        Spinner combo_yesno4 = (Spinner) findViewById(R.id.combo_yesno4);
        Spinner combo_yesno5 = (Spinner) findViewById(R.id.combo_yesno5);

        ArrayAdapter<String> AdapterListYesNo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,yesno);
        AdapterListYesNo.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combo_apik.setAdapter(AdapterListYesNo);
        combo_tempat_usaha.setAdapter(AdapterListYesNo);
        combo_tanggungan_anak.setAdapter(AdapterListYesNo);
        combo_pendapatan_lain.setAdapter(AdapterListYesNo);
        combo_yesno4.setAdapter(AdapterListYesNo);
        combo_yesno5.setAdapter(AdapterListYesNo);

        doc_apik = (LinearLayout) findViewById(R.id.doc_apik);
        biaya1 = (LinearLayout) findViewById(R.id.biaya1);
        biaya2 = (LinearLayout) findViewById(R.id.biaya2);
        biaya3 = (LinearLayout) findViewById(R.id.biaya3);
        biaya4 = (LinearLayout) findViewById(R.id.biaya4);
        biaya5 = (LinearLayout) findViewById(R.id.biaya5);

        doc_apik.setVisibility(View.GONE);
        biaya1.setVisibility(View.GONE);
        biaya2.setVisibility(View.GONE);
        biaya3.setVisibility(View.GONE);
        biaya4.setVisibility(View.GONE);
        biaya5.setVisibility(View.GONE);

        combo_apik.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        doc_apik.setVisibility(View.VISIBLE);
                    case 1:
                        doc_apik.setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                biaya1.setVisibility(View.GONE);
            }
        });

        combo_tempat_usaha.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        biaya1.setVisibility(View.VISIBLE);
                    case 1:
                        biaya1.setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                biaya1.setVisibility(View.GONE);
            }
        });

        combo_tanggungan_anak.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        biaya2.setVisibility(View.VISIBLE);
                        break;
                    case 1:
                        biaya2.setVisibility(View.GONE);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                biaya2.setVisibility(View.GONE);
            }
        });

        combo_pendapatan_lain.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        biaya3.setVisibility(View.VISIBLE);
                        break;
                    case 1:
                        biaya3.setVisibility(View.GONE);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                biaya3.setVisibility(View.GONE);
            }
        });

        combo_yesno4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        biaya4.setVisibility(View.VISIBLE);
                        break;
                    case 1:
                        biaya4.setVisibility(View.GONE);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                biaya4.setVisibility(View.GONE);
            }
        });

        combo_yesno5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        biaya5.setVisibility(View.VISIBLE);
                        break;
                    case 1:
                        biaya5.setVisibility(View.GONE);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                biaya5.setVisibility(View.GONE);
            }
        });

        LinearLayout next = (LinearLayout) findViewById(R.id.simpan);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next();
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
        Intent back = new Intent(this, FormKUR3.class);
        startActivity(back);
    }

    public void next(){
        Intent next = new Intent(this, FormKUR5.class);
        startActivity(next);
    }
}
