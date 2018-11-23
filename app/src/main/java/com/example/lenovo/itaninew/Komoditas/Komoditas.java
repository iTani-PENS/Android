package com.example.lenovo.itaninew.Komoditas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.lenovo.itaninew.R;

public class Komoditas extends AppCompatActivity {

    ListView lvkomoditas;
    String komoditas[] = {"Padi", "Sawi", "Jagung", "Tebu", "Tomat", "Kentang", "Cabai"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itani_komoditas);

        lvkomoditas = (ListView)findViewById(R.id.lv_komoditas);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.itani_komoditas_listview, R.id.textView, komoditas);
        lvkomoditas.setAdapter(arrayAdapter);
        justifyListViewHeightBasedOnChildren(lvkomoditas);
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
