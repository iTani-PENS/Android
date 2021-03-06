package com.example.lenovo.itaninew.KUR.Form;

import android.app.DatePickerDialog;
import android.app.Dialog;
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
import android.widget.Toast;

import com.example.lenovo.itaninew.R;
import java.util.Calendar;

public class FormKUR extends AppCompatActivity {

    ImageView help;
    String jk[]={"Laki-Laki","Perempuan"};
    String pendidikan[]={"SD Sederajat","SMP Sederajat", "SMA Sederajat","Diploma 3", "S1","S2", "S3"};
    String prov[]={"Jawa Timur","Jawa Tengah", "Jawa Barat","Nusa Tenggara Barat", "Nusa Tenggara Timur"};
    String kota[]={"Surabaya","Gresik", "Malang","Mojokerto", "Jombang","Kediri"};
    String kec[]={"Sidayu","Dukun", "Panceng","Ujung Pangkah"};

    private DatePicker datePicker;
    private Calendar calendar;
    private EditText et_tgl;
    private int year, month, day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itani_form_kur1);

        Spinner combo_jk = (Spinner) findViewById(R.id.combo_jk);
        Spinner combo_pendidikan = (Spinner) findViewById(R.id.combo_pendidikan);
        Spinner combo_provinsi = (Spinner) findViewById(R.id.combo_provinsi);
        Spinner combo_kota = (Spinner) findViewById(R.id.combo_kota);
        Spinner combo_kecamatan = (Spinner) findViewById(R.id.combo_kecamatan);

        ArrayAdapter<String> AdapterListJK = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,jk);
        AdapterListJK.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combo_jk.setAdapter(AdapterListJK);

        ArrayAdapter<String> AdapterListPendidikan = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,pendidikan);
        AdapterListPendidikan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combo_pendidikan.setAdapter(AdapterListPendidikan);

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

        et_tgl = (EditText) findViewById(R.id.et_tgl);
        calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);

        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        showDate(year, month + 1, day);
    }

    @SuppressWarnings("deprecation")
    public void setDate(View view) {
        showDialog(999);
        //akan menampilkan teks ketika kalendar muncul setelah menekan tombol
        Toast.makeText(getApplicationContext(), "Pilih Tangal", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        // TODO Auto-generated method stub
        if (id == 999) {
            return new DatePickerDialog(this, myDateListener, year, month, day);
        }
        return null;
    }

    private DatePickerDialog.OnDateSetListener myDateListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker arg0, int arg1, int arg2, int arg3) {
            // TODO Auto-generated method stub
            // arg1 = year
            // arg2 = month
            // arg3 = day
            showDate(arg1, arg2+1, arg3);
        }
    };

    private void showDate(int year, int month, int day) {
        et_tgl.setText(new StringBuilder().append(day).append("/").append(month).append("/").append(year));
    }

    public void back(){
        Intent back = new Intent(this, PengajuanBaru.class);
        startActivity(back);
    }


    public void next(){
        Intent next = new Intent(this, FormKUR2.class);
        startActivity(next);
    }

}
