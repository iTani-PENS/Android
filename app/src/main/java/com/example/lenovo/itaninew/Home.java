package com.example.lenovo.itaninew;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

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
                //itani_komoditas();
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
      Intent intent = new Intent(this, FormKUR.class);
      startActivity(intent);
  }
//
//    public void daftar() {
//        Intent intent = new Intent(this, Daftar.class);
//        startActivity(intent);
//    }



}
