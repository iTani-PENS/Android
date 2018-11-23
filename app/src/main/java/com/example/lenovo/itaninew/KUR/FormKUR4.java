package com.example.lenovo.itaninew.KUR;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;

import com.example.lenovo.itaninew.R;

public class FormKUR4 extends AppCompatActivity {

    String yesno[]={"Ya","Tidak"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itani_form_kur4);


        Spinner combo_yesno1 = (Spinner) findViewById(R.id.combo_yesno);
        Spinner combo_yesno2 = (Spinner) findViewById(R.id.combo_yesno2);
        Spinner combo_yesno3 = (Spinner) findViewById(R.id.combo_yesno3);
        Spinner combo_yesno4 = (Spinner) findViewById(R.id.combo_yesno4);
        Spinner combo_yesno5 = (Spinner) findViewById(R.id.combo_yesno5);

        ArrayAdapter<String> AdapterListYesNo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,yesno);
        AdapterListYesNo.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combo_yesno1.setAdapter(AdapterListYesNo);
        combo_yesno2.setAdapter(AdapterListYesNo);
        combo_yesno3.setAdapter(AdapterListYesNo);
        combo_yesno4.setAdapter(AdapterListYesNo);
        combo_yesno5.setAdapter(AdapterListYesNo);

        LinearLayout next = (LinearLayout) findViewById(R.id.simpan);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next();
            }
        });

    }

    public void next(){
        Intent next = new Intent(this, FormKUR5.class);
        startActivity(next);
    }
}
