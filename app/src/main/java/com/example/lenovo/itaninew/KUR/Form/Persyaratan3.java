package com.example.lenovo.itaninew.KUR.Form;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.lenovo.itaninew.R;

public class Persyaratan3 extends AppCompatActivity {

    LinearLayout next;
    CheckBox check1;
    CheckBox check2;
    Boolean check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itani_kur_persyaratan3);

        next = (LinearLayout) findViewById(R.id.simpan);
        next.setEnabled(false);
        next.setBackgroundResource(R.drawable.bg_detailbox1);

        check1 = (CheckBox) findViewById(R.id.cb_check1);
        check2 = (CheckBox) findViewById(R.id.cb_check2);
        check1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true)
                {
                    check = true;
                }else{
                    check = false;
                }
            }
        });

        check2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true && check==true)
                {
                    next.setBackgroundResource(R.drawable.bg_signup);
                    next.setEnabled(true);
                }else{
                    next.setBackgroundResource(R.drawable.bg_detailbox1);
                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
        Intent back = new Intent(this, FormKUR5.class);
        startActivity(back);
    }

    public void next(){
        Intent next = new Intent(this, ProsesKUR.class);
        startActivity(next);
    }
}
