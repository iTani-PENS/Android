package com.example.lenovo.itaninew;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.lenovo.itaninew.FormEditProfil.FormEditKTP;

public class FormKUR extends AppCompatActivity {

    AlertDialog alert;
    ImageView help;
    String jk[]={"Laki-Laki","Perempuan"};
    String pendidikan[]={"SD Sederajat","SMP Sederajat", "SMA Sederajat","Diploma 3", "S1","S2", "S3"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itani_form_kur1);

        Spinner combo_jk = (Spinner) findViewById(R.id.combo_jk);
        Spinner combo_pendidikan = (Spinner) findViewById(R.id.combo_pendidikan);

        ArrayAdapter<String> AdapterListJK = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,jk);
        AdapterListJK.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combo_jk.setAdapter(AdapterListJK);
        ArrayAdapter<String> AdapterListPendidikan = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,pendidikan);
        AdapterListPendidikan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combo_pendidikan.setAdapter(AdapterListPendidikan);

        help = (ImageView) findViewById(R.id.help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alert();
            }
        });

        /*Button next = (Button) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next();
            }
        });*/

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
