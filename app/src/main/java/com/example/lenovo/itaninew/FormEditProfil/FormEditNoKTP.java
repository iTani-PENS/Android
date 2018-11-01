package com.example.lenovo.itaninew.FormEditProfil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.lenovo.itaninew.EditProfil;
import com.example.lenovo.itaninew.R;

public class FormEditNoKTP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itani_form_edit_no_ktp);
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
