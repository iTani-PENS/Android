package com.example.lenovo.itaninew.KUR.Proses;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.lenovo.itaninew.KUR.OpsiKUR;
import com.example.lenovo.itaninew.KUR.Progres.FormProgres;
import com.example.lenovo.itaninew.R;

public class ProsesDataKUR extends AppCompatActivity {

    ListView lvpetani;
    String petani[] = {"Toni", "Anton", "Yatno", "Rahma", "Andi"};
    ArrayAdapter<String> arrayAdapter;
    EditText et_cari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itani_kur_proses_data);

        lvpetani = (ListView)findViewById(R.id.lv_petani);
        arrayAdapter = new ArrayAdapter<String>(this, R.layout.itani_komoditas_listview, R.id.textView, petani);
        lvpetani.setAdapter(arrayAdapter);
        justifyListViewHeightBasedOnChildren(lvpetani);

        lvpetani.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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

        et_cari = (EditText) findViewById(R.id.et_cari);
        et_cari.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                ProsesDataKUR.this.arrayAdapter.getFilter().filter(s);
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }

    public void next() {
        Intent intent = new Intent(this, DetilDataPetani.class);
        startActivity(intent);
    }

    public void back(){
        Intent back = new Intent(this, OpsiKUR.class);
        startActivity(back);
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
