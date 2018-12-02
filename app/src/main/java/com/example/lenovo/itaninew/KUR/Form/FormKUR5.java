package com.example.lenovo.itaninew.KUR.Form;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;

import com.example.lenovo.itaninew.R;

public class FormKUR5 extends AppCompatActivity {

    String prov[]={"Jawa Timur","Jawa Tengah", "Jawa Barat","Nusa Tenggara Barat", "Nusa Tenggara Timur"};
    String kota[]={"Surabaya","Gresik", "Malang","Mojokerto", "Jombang","Kediri"};
    String kec[]={"Sidayu","Dukun", "Panceng","Ujung Pangkah"};
    String bentukjaminan[] ={"KAS","Emas"};
    String status_pemilik[] ={"Akta Jual Beli"};
    String yesno[]={"Ya","Tidak"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itani_form_kur5);

        Spinner combo_bentuk_jaminan = (Spinner) findViewById(R.id.combo_bentuk_jaminan);
        Spinner combo_pemilik = (Spinner) findViewById(R.id.combo_status_pemilik);
        Spinner combo_provinsi = (Spinner) findViewById(R.id.combo_provinsi);
        Spinner combo_kota = (Spinner) findViewById(R.id.combo_kota);
        Spinner combo_kecamatan = (Spinner) findViewById(R.id.combo_kecamatan);
        Spinner combo_angsuran = (Spinner) findViewById(R.id.combo_angsuran);

        ArrayAdapter<String> AdapterListYesNo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,yesno);
        AdapterListYesNo.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combo_angsuran.setAdapter(AdapterListYesNo);

        ArrayAdapter<String> AdapterListBentukJaminan = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,bentukjaminan);
        AdapterListBentukJaminan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combo_bentuk_jaminan.setAdapter(AdapterListBentukJaminan);

        ArrayAdapter<String> AdapterListStatusPemilik = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,status_pemilik);
        AdapterListStatusPemilik.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combo_pemilik.setAdapter(AdapterListStatusPemilik);

        ArrayAdapter<String> AdapterListProv = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,prov);
        AdapterListProv.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combo_provinsi.setAdapter(AdapterListProv);

        ArrayAdapter<String> AdapterListKota = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,kota);
        AdapterListKota.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combo_kota.setAdapter(AdapterListKota);

        ArrayAdapter<String> AdapterListKecamatan = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,kec);
        AdapterListKecamatan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combo_kecamatan.setAdapter(AdapterListKecamatan);


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
        Intent back = new Intent(this, FormKUR4.class);
        startActivity(back);
    }

    public void next(){
        Intent next = new Intent(this, Persyaratan3.class);
        startActivity(next);
    }
}
