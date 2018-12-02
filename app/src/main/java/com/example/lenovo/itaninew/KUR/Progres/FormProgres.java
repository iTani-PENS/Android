package com.example.lenovo.itaninew.KUR.Progres;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.lenovo.itaninew.KUR.OpsiKUR;
import com.example.lenovo.itaninew.R;

public class FormProgres extends AppCompatActivity {

    LinearLayout jual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itani_kur_form_progres);

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

        jual = (LinearLayout) findViewById(R.id.ket_jual);
        jual.setVisibility(View.GONE);

        CheckBox checkBox = (CheckBox) findViewById(R.id.cek_penjualan);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true)
                {
                    jual.setVisibility(View.VISIBLE);
                }else{
                    jual.setVisibility(View.GONE);
                }
            }
        });
    }

    public void simpan(){
        Intent simpan = new Intent(this, OpsiKUR.class);
        startActivity(simpan);
    }

    public void back(){
        Intent back = new Intent(this, ProgresKUR.class);
        startActivity(back);
    }
}
