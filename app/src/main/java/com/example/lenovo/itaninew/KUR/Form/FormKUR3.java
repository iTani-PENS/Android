package com.example.lenovo.itaninew.KUR.Form;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;

import com.example.lenovo.itaninew.R;

import java.util.Calendar;

public class FormKUR3 extends AppCompatActivity {

    String jenis_perizinan[]={"Akta Pendirian","Akta Perubahan Terakhir", "Pengesahan MENKEH RI","Lembaran Berita Negara", "Pengesahan dari Pengadilan Negeri", "SIUP", "SITU/HO/UUG", "Surat Ijin Industri", "Surat Ijin Usaha", "TDP", "TDR", "AMDAL", "SIUJK", "SKDP", "API", "Surat Keterangan Kelurahan/Kecamatan", "Lain-lain"};
    String subsektor_ekonomi[]={"Padi","Jagung"};
    String kantor_cabang[]={"Jawa Timur","Jawa Tengah", "Jawa Barat","Nusa Tenggara Barat", "Nusa Tenggara Timur"};
    String prov[]={"Jawa Timur","Jawa Tengah", "Jawa Barat","Nusa Tenggara Barat", "Nusa Tenggara Timur"};
    String kota[]={"Surabaya","Gresik", "Malang","Mojokerto", "Jombang","Kediri"};
    String kec[]={"Sidayu","Dukun", "Panceng","Ujung Pangkah"};

    private DatePicker datePicker;
    private Calendar calendar;
    private EditText et_tgl_usaha;
    private int year, month, day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itani_form_kur3);

        Spinner combo_jenis_perizinan = (Spinner) findViewById(R.id.combo_jenis_perizinan);
        Spinner combo_subsektor_ekonomi = (Spinner) findViewById(R.id.combo_subsektor_ekonommi);
        Spinner combo_kantor_cabang= (Spinner) findViewById(R.id.combo_kantor_cabang);
        Spinner combo_provinsi = (Spinner) findViewById(R.id.combo_provinsi);
        Spinner combo_kota = (Spinner) findViewById(R.id.combo_kota);
        Spinner combo_kecamatan = (Spinner) findViewById(R.id.combo_kecamatan);

        ArrayAdapter<String> AdapterListJenisPerizinan = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,jenis_perizinan);
        AdapterListJenisPerizinan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combo_jenis_perizinan.setAdapter(AdapterListJenisPerizinan);

        ArrayAdapter<String> AdapterListSubSektor = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,subsektor_ekonomi);
        AdapterListSubSektor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combo_subsektor_ekonomi.setAdapter(AdapterListSubSektor);



        ArrayAdapter<String> AdapterListKantorCabang = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,kantor_cabang);
        AdapterListKantorCabang.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combo_kantor_cabang.setAdapter(AdapterListKantorCabang);

        ArrayAdapter<String> AdapterListProv = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,prov);
        AdapterListProv.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combo_provinsi.setAdapter(AdapterListProv);

        ArrayAdapter<String> AdapterListKota = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,kota);
        AdapterListKota.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combo_kota.setAdapter(AdapterListKota);

        ArrayAdapter<String> AdapterListKecamatan = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,kec);
        AdapterListKecamatan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combo_kecamatan.setAdapter(AdapterListKecamatan);

        LinearLayout next = (LinearLayout) findViewById(R.id.simpan);
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
        Intent back = new Intent(this, FormKUR2.class);
        startActivity(back);
    }

    public void next(){
        Intent next = new Intent(this, FormKUR4.class);
        startActivity(next);
    }
}
