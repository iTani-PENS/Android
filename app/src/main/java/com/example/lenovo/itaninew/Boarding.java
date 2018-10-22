package com.example.lenovo.itaninew;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import me.relex.circleindicator.CircleIndicator;

public class Boarding extends AppCompatActivity {

    private PagerAdapter_board PagerAdapterboard;

    private ViewPager viewPager;
    private CircleIndicator indicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itani_boarding);

        viewPager = (ViewPager) findViewById(R.id.viewpager);

        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);

        PagerAdapterboard = new PagerAdapter_board(getSupportFragmentManager());

        viewPager.setAdapter(PagerAdapterboard);

        indicator.setViewPager(viewPager);

        PagerAdapterboard.registerDataSetObserver(indicator.getDataSetObserver());
    }
}
