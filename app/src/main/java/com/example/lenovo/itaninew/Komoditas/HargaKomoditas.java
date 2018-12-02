package com.example.lenovo.itaninew.Komoditas;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.lenovo.itaninew.Home;
import com.example.lenovo.itaninew.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;

import java.util.ArrayList;

public class HargaKomoditas extends AppCompatActivity {

    BarChart chart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itani_komoditas_harga);


        chart = (BarChart) findViewById(R.id.chart);

        YAxis yAxisRight = chart.getAxisRight();
        yAxisRight.setEnabled(false);

        BarData data = new BarData(getXAxisValues(), getDataSet());
        chart.setData(data);
        chart.setDescription("Harga Komoditas");
        chart.animateXY(2000, 2000);
        chart.invalidate();

        LinearLayout ok = (LinearLayout) findViewById(R.id.ok);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                done();
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
        Intent back = new Intent(this, Kabupaten.class);
        startActivity(back);
    }

    public void done() {
        Intent done = new Intent(this, Home.class);
        startActivity(done);
    }

    private ArrayList<IBarDataSet> getDataSet() {
        ArrayList<IBarDataSet> dataSets = null;
        ArrayList<BarEntry> valueSet1 = new ArrayList<>();
        BarEntry v1e1 = new BarEntry(5000, 0); // Jan
        valueSet1.add(v1e1);
        BarEntry v1e2 = new BarEntry(4000, 1); // Feb
        valueSet1.add(v1e2);
        BarEntry v1e3 = new BarEntry(5000, 2); // Mar
        valueSet1.add(v1e3);
        BarEntry v1e4 = new BarEntry(4000, 3); // Apr
        valueSet1.add(v1e4);
        BarEntry v1e5 = new BarEntry(5000, 4); // May
        valueSet1.add(v1e5);
        BarEntry v1e6 = new BarEntry(4000, 5); // Jun
        valueSet1.add(v1e6);
        BarEntry v1e7 = new BarEntry(5000, 6); // Jun
        valueSet1.add(v1e7);
        BarDataSet barDataSet1 = new BarDataSet(valueSet1, "Tomat");
        barDataSet1.setColor(Color.rgb(0, 155, 0));
        dataSets = new ArrayList<>();
        dataSets.add(barDataSet1);
        return dataSets;
    }

    private ArrayList<String> getXAxisValues() {
        ArrayList<String> xAxis = new ArrayList<>();
        xAxis.add("Senin");
        xAxis.add("Selasa");
        xAxis.add("Rabu");
        xAxis.add("Kamis");
        xAxis.add("Jum'at");
        xAxis.add("Sabtu");
        xAxis.add("Minggu");
        return xAxis;
    }

}
