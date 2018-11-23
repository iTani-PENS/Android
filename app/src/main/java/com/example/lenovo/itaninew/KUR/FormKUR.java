package com.example.lenovo.itaninew.KUR;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;

import com.example.lenovo.itaninew.R;

public class FormKUR extends AppCompatActivity {

    ImageView help;
    String jk[]={"Laki-Laki","Perempuan"};
    String pendidikan[]={"SD Sederajat","SMP Sederajat", "SMA Sederajat","Diploma 3", "S1","S2", "S3"};
    String prov[]={"Jawa Timur","Jawa Tengah", "Jawa Barat","Nusa Tenggara Barat", "Nusa Tenggara Timur"};
    String kota[]={"Surabaya","Gresik", "Malang","Mojokerto", "Jombang","Kediri"};
    String kec[]={"Sidayu","Dukun", "Panceng","Ujung Pangkah"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itani_form_kur1);

        Spinner combo_jk = (Spinner) findViewById(R.id.combo_jk);
        Spinner combo_pendidikan = (Spinner) findViewById(R.id.combo_pendidikan);
        Spinner combo_provinsi = (Spinner) findViewById(R.id.combo_provinsi);
        Spinner combo_kota = (Spinner) findViewById(R.id.combo_kota);
        Spinner combo_kecamatan = (Spinner) findViewById(R.id.combo_kecamatan);

        ArrayAdapter<String> AdapterListJK = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,jk);
        AdapterListJK.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combo_jk.setAdapter(AdapterListJK);

        ArrayAdapter<String> AdapterListPendidikan = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,pendidikan);
        AdapterListPendidikan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combo_pendidikan.setAdapter(AdapterListPendidikan);

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
        Intent next = new Intent(this, FormKUR2.class);
        startActivity(next);
    }

}
