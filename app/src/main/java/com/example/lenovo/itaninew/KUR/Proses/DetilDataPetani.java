package com.example.lenovo.itaninew.KUR.Proses;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.lenovo.itaninew.Home;
import com.example.lenovo.itaninew.R;

public class DetilDataPetani extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itani_kur_detil_data);

        ImageView back = (ImageView) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back();
            }
        });

        LinearLayout ok = (LinearLayout) findViewById(R.id.simpan);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ok();
            }
        });
    }

    public void back() {
        Intent intent = new Intent(this, ProsesDataKUR.class);
        startActivity(intent);
    }

    public void ok() {
        Intent intent = new Intent(this, ProsesDataKUR.class);
        startActivity(intent);
    }
}
