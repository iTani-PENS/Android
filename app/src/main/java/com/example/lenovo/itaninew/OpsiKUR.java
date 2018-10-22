package com.example.lenovo.itaninew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class OpsiKUR extends AppCompatActivity {

    private ListView listview;
    private ArrayList<OpsiKurBeanclassList> Bean;
    private OpsiKurListviewAdapter baseAdapter;

    private int[] img = {R.drawable.kur, R.drawable.monitoring};
    private String[] name = {"Pengajuan KUR", "Monitoring KUR"};
    private String[] sub_name = {"Memudahkan Anda Dalam Mengajukan KUR", "Pengawasan Pengolahan Dana KUR"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itani_opsi_kur);

        listview = (ListView)findViewById(R.id.listview);


        Bean = new ArrayList<OpsiKurBeanclassList>();

        for (int i= 0; i< img.length; i++){

            OpsiKurBeanclassList BeanclassList = new OpsiKurBeanclassList(img[i], name[i], sub_name[i]);
            Bean.add(BeanclassList);

        }

        baseAdapter = new OpsiKurListviewAdapter(this, OpsiKUR.this, Bean) {
        };

        listview.setAdapter(baseAdapter);
    }
}
