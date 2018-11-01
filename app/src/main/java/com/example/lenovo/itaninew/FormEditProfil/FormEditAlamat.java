package com.example.lenovo.itaninew.FormEditProfil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.lenovo.itaninew.EditProfil;
import com.example.lenovo.itaninew.R;

public class FormEditAlamat extends AppCompatActivity {

    TextView selection;
    String[] desa = { "Amerika", "Argentina", "Brazil", "Indonesia", "Inggris", "Malaysia", "Pilipina" };
    String[] kec = { "Amerika", "Argentina", "Brazil", "Indonesia", "Inggris", "Malaysia", "Pilipina" };
    String[] kota = { "Amerika", "Argentina", "Brazil", "Indonesia", "Inggris", "Malaysia", "Pilipina" };
    String[] prov = { "Amerika", "Argentina", "Brazil", "Indonesia", "Inggris", "Malaysia", "Pilipina" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itani_form_edit_alamat);

        Spinner spinnerdesa = (Spinner) findViewById(R.id.spinner_desa);
        ArrayAdapter<String> AdapterList1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,desa);
        spinnerdesa.setAdapter(AdapterList1);

        Spinner spinnerkec = (Spinner) findViewById(R.id.spinner_kec);
        ArrayAdapter<String> AdapterList2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,kec);
        spinnerkec.setAdapter(AdapterList2);

        Spinner spinnerkota = (Spinner) findViewById(R.id.spinner_kota);
        ArrayAdapter<String> AdapterList3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,kota);
        spinnerkota.setAdapter(AdapterList3);

        Spinner spinnerprov = (Spinner) findViewById(R.id.spinner_prov);
        ArrayAdapter<String> AdapterList4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,prov);
        spinnerprov.setAdapter(AdapterList4);

        ImageView back = (ImageView) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back();
            }
        });

        LinearLayout simpan = (LinearLayout) findViewById(R.id.simpan);
        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simpan();
            }
        });
    }

    public void back() {
        Intent intent = new Intent(this, EditProfil.class);
        startActivity(intent);
    }

    public void simpan() {
        Intent intent = new Intent(this, EditProfil.class);
        startActivity(intent);
    }

}
