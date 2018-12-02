package com.example.lenovo.itaninew.Komoditas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.lenovo.itaninew.R;

public class Kabupaten extends AppCompatActivity {

    ListView lvkabupaten;
    String kabupaten[] = {"Malang", "Surabaya", "Gresik", "Mojokerto", "Batu", "Kediri", "Tulungagung"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itani_komoditas_kabupaten);

        lvkabupaten = (ListView)findViewById(R.id.lv_kabupaten);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.itani_komoditas_listview, R.id.textView, kabupaten);
        lvkabupaten.setAdapter(arrayAdapter);
        justifyListViewHeightBasedOnChildren(lvkabupaten);

        lvkabupaten.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                next();
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
        Intent back = new Intent(this, Provinsi.class);
        startActivity(back);
    }

    public void next() {
        Intent intent = new Intent(this, HargaKomoditas.class);
        startActivity(intent);
    }

    public void justifyListViewHeightBasedOnChildren (ListView listView) {

        ListAdapter adapter = listView.getAdapter();

        if (adapter == null) {
            return;
        }
        ViewGroup vg = listView;
        int totalHeight = 0;
        for (int i = 0; i < adapter.getCount(); i++) {
            View listItem = adapter.getView(i, null, vg);
            listItem.measure(0, 0);
            totalHeight += listItem.getMeasuredHeight();
        }

        ViewGroup.LayoutParams par = listView.getLayoutParams();
        par.height = totalHeight + (listView.getDividerHeight() * (adapter.getCount() - 1));
        listView.setLayoutParams(par);
        listView.requestLayout();
    }
}
