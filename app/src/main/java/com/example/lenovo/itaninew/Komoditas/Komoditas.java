package com.example.lenovo.itaninew.Komoditas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import com.example.lenovo.itaninew.Home;
import com.example.lenovo.itaninew.R;

public class Komoditas extends AppCompatActivity {

    String prov[]={"Jawa Timur","Jawa Tengah", "Jawa Barat","Nusa Tenggara Barat", "Nusa Tenggara Timur"};
    String kabupaten[]={"Surabaya","Gresik", "Malang","Mojokerto", "Jombang","Kediri"};
    String komoditas[] = {"Padi", "Sawi", "Jagung", "Tebu", "Tomat", "Kentang", "Cabai"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itani_komoditas);

        Spinner combo_provinsi = (Spinner) findViewById(R.id.combo_provinsi);
        Spinner combo_kabupaten = (Spinner) findViewById(R.id.combo_kabupaten);
        Spinner combo_komoditas = (Spinner) findViewById(R.id.combo_komoditas);

        ArrayAdapter<String> AdapterListProv = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,prov);
        AdapterListProv.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combo_provinsi.setAdapter(AdapterListProv);

        ArrayAdapter<String> AdapterListKota = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,kabupaten);
        AdapterListKota.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combo_kabupaten.setAdapter(AdapterListKota);

        ArrayAdapter<String> AdapterListKecamatan = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,komoditas);
        AdapterListKecamatan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combo_komoditas.setAdapter(AdapterListKecamatan);

        LinearLayout selanjutnya = (LinearLayout) findViewById(R.id.selanjutnya) ;
        selanjutnya.setOnClickListener(new View.OnClickListener() {
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
        Intent back = new Intent(this, Home.class);
        startActivity(back);
    }

    public void next() {
        Intent intent = new Intent(this, HargaKomoditas.class);
        startActivity(intent);
    }


}
