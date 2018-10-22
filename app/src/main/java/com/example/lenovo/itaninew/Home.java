package com.example.lenovo.itaninew;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    FragMenu fragMenu;

    private ListView listview;
    private ArrayList<MenuBeanclassList> Bean;
    private MenuListviewAdapter baseAdapter;

    TextView cutprice;

    private int[] img = {R.drawable.icon_kur, R.drawable.icon_komoditas, R.drawable.icon_support};
    private String[] name = {"KUR", "KOMODITAS", "SIPPORT"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itani_home);

        listview = (ListView) findViewById(R.id.listview);


        Bean = new ArrayList<MenuBeanclassList>();

        for (int i = 0; i < img.length; i++) {

            MenuBeanclassList BeanclassList = new MenuBeanclassList(img[i], name[i]);
            Bean.add(BeanclassList);

        }

        baseAdapter = new MenuListviewAdapter(this, Home.this, Bean) {
        };

        listview.setAdapter(baseAdapter);


    }

}
