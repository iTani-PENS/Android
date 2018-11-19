package com.example.lenovo.itaninew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class FormKUR3 extends AppCompatActivity {

    String jenis_perizinan[]={"Jawa Timur","Jawa Tengah", "Jawa Barat","Nusa Tenggara Barat", "Nusa Tenggara Timur"};
    String sektor_ekonomi[]={"Jawa Timur","Jawa Tengah", "Jawa Barat","Nusa Tenggara Barat", "Nusa Tenggara Timur"};
    String subsektor_ekonomi[]={"Jawa Timur","Jawa Tengah", "Jawa Barat","Nusa Tenggara Barat", "Nusa Tenggara Timur"};
    String kantor_cabang[]={"Jawa Timur","Jawa Tengah", "Jawa Barat","Nusa Tenggara Barat", "Nusa Tenggara Timur"};
    String prov[]={"Jawa Timur","Jawa Tengah", "Jawa Barat","Nusa Tenggara Barat", "Nusa Tenggara Timur"};
    String kota[]={"Surabaya","Gresik", "Malang","Mojokerto", "Jombang","Kediri"};
    String kec[]={"Sidayu","Dukun", "Panceng","Ujung Pangkah"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itani_form_kur3);

        Spinner combo_jenis_perizinan = (Spinner) findViewById(R.id.combo_jenis_perizinan);
        Spinner combo_sektor_ekonomi = (Spinner) findViewById(R.id.combo_sektor_ekonomi);
        Spinner combo_subsektor_ekonomi = (Spinner) findViewById(R.id.combo_subsektor_ekonommi);
        Spinner combo_kantor_cabang= (Spinner) findViewById(R.id.combo_kantor_cabang);
        Spinner combo_provinsi = (Spinner) findViewById(R.id.combo_provinsi);
        Spinner combo_kota = (Spinner) findViewById(R.id.combo_kota);
        Spinner combo_kecamatan = (Spinner) findViewById(R.id.combo_kecamatan);

        ArrayAdapter<String> AdapterListJenisPerizinan = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,jenis_perizinan);
        AdapterListJenisPerizinan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combo_jenis_perizinan.setAdapter(AdapterListJenisPerizinan);

        ArrayAdapter<String> AdapterListSektorEkonomi= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,sektor_ekonomi);
        AdapterListSektorEkonomi.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combo_sektor_ekonomi.setAdapter(AdapterListSektorEkonomi);

        ArrayAdapter<String> AdapterListSubSektorEkonomi = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,subsektor_ekonomi);
        AdapterListSubSektorEkonomi.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combo_subsektor_ekonomi.setAdapter(AdapterListSubSektorEkonomi);

        ArrayAdapter<String> AdapterListKantorCabang = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,kantor_cabang);
        AdapterListKantorCabang.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combo_kantor_cabang.setAdapter(AdapterListKantorCabang);

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

    }

    public void next(){
        Intent next = new Intent(this, FormKUR4.class);
        startActivity(next);
    }
}
