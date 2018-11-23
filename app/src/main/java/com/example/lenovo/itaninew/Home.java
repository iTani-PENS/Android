package com.example.lenovo.itaninew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.lenovo.itaninew.KUR.FormKUR;
import com.example.lenovo.itaninew.KUR.Persyaratan1;
import com.example.lenovo.itaninew.Komoditas.Komoditas;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itani_home);

        CardView cv_kur = (CardView) findViewById(R.id.navigation_kur);
        CardView cv_komoditas = (CardView) findViewById(R.id.navigation_komoditas);
        CardView cv_support = (CardView) findViewById(R.id.navigation_support);

        cv_kur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity_kur();
            }
        });

        cv_komoditas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity_komoditas();
            }
        });

        cv_support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //activity_support();
            }
        });
    }

  public void activity_kur() {
      Intent intent = new Intent(this, Persyaratan1.class);
      startActivity(intent);
  }

    public void activity_komoditas() {
        Intent intent = new Intent(this, Komoditas.class);
        startActivity(intent);
    }



}
