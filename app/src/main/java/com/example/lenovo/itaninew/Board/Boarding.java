package com.example.lenovo.itaninew.Board;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lenovo.itaninew.Home;
import com.example.lenovo.itaninew.R;
import com.example.lenovo.itaninew.SplashScreen;
import com.example.lenovo.itaninew.Storage.SharedPrefManager;

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

    @Override
    protected void onStart() {
        super.onStart();

        SharedPrefManager sharedPrefManager;
        sharedPrefManager = new SharedPrefManager(this);
        if (sharedPrefManager.getSPSudahLogin()) {
            startActivity(new Intent(Boarding.this, Home.class)
                    .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK));
            finish();
        }
    }
}
