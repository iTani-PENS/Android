package com.example.lenovo.itaninew;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.lenovo.itaninew.FormEditProfil.FormEditKTP;

public class FormKUR extends AppCompatActivity {

    AlertDialog alert;
    ImageView help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itani_form_kur1);

        help = (ImageView) findViewById(R.id.help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alert();
            }
        });

        Button next = (Button) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next();
            }
        });

    }

    public void alert(){
        AlertDialog.Builder alertadd = new AlertDialog.Builder(FormKUR.this);
        LayoutInflater factory = LayoutInflater.from(FormKUR.this);
        final View view = factory.inflate(R.layout.itani_alert_foto_selfie, null);
        ImageView image= (ImageView) view.findViewById(R.id.help);
        alertadd.setView(view);
        alertadd.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dlg, int sumthin) {
            }
        });
        alertadd.show();
    }

    public void next(){
        Intent next = new Intent(this, FormKur2.class);
        startActivity(next);
    }

}
