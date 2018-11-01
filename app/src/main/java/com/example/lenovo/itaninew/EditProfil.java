package com.example.lenovo.itaninew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.lenovo.itaninew.FormEditProfil.FormEditAktaNikah;
import com.example.lenovo.itaninew.FormEditProfil.FormEditAktaTanah;
import com.example.lenovo.itaninew.FormEditProfil.FormEditAlamat;
import com.example.lenovo.itaninew.FormEditProfil.FormEditFotoSelfieKTP;
import com.example.lenovo.itaninew.FormEditProfil.FormEditKK;
import com.example.lenovo.itaninew.FormEditProfil.FormEditKTP;
import com.example.lenovo.itaninew.FormEditProfil.FormEditLokasiTanah;
import com.example.lenovo.itaninew.FormEditProfil.FormEditNIK;
import com.example.lenovo.itaninew.FormEditProfil.FormEditNama;
import com.example.lenovo.itaninew.FormEditProfil.FormEditNoKK;
import com.example.lenovo.itaninew.FormEditProfil.FormEditNoKTP;

public class EditProfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itani_profil);

        LinearLayout nama = (LinearLayout) findViewById(R.id.llNama);
        nama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editNama();
            }
        });

        LinearLayout nik = (LinearLayout) findViewById(R.id.llNik);
        nik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editNik();
            }
        });

        LinearLayout noKK = (LinearLayout) findViewById(R.id.llNoKK);
        noKK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editNoKK();
            }
        });

        LinearLayout noKTP = (LinearLayout) findViewById(R.id.llNoKTP);
        noKTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editNoKTP();
            }
        });

        LinearLayout alamat = (LinearLayout) findViewById(R.id.llAlamat);
        alamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editAlamat();
            }
        });

        LinearLayout lokTanah = (LinearLayout) findViewById(R.id.llKoorTanah);
        lokTanah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editLokTanah();
            }
        });

        LinearLayout fotoSelfieKTP = (LinearLayout) findViewById(R.id.llFotoSelfieKTP);
        fotoSelfieKTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editFotoSelfieKTP();
            }
        });

        LinearLayout fotoKTP = (LinearLayout) findViewById(R.id.llFotoKTP);
        fotoKTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editFotoKTP();
            }
        });

        LinearLayout fotoKK = (LinearLayout) findViewById(R.id.llFotoKK);
        fotoKK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editFotoKK();
            }
        });

        LinearLayout fotoAktaTanah = (LinearLayout) findViewById(R.id.llFotoAktaTanah);
        fotoAktaTanah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editFotoAktaTanah();
            }
        });

        LinearLayout fotoAktaNikah = (LinearLayout) findViewById(R.id.llFotoAktaNikah);
        fotoAktaNikah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editFotoAktaNikah();
            }
        });
    }

    public void editNama() {
        Intent intent = new Intent(this, FormEditNama.class);
        startActivity(intent);
    }

    public void editNik() {
        Intent intent = new Intent(this, FormEditNIK.class);
        startActivity(intent);
    }

    public void editNoKK() {
        Intent intent = new Intent(this, FormEditNoKK.class);
        startActivity(intent);
    }

    public void editNoKTP() {
        Intent intent = new Intent(this, FormEditNoKTP.class);
        startActivity(intent);
    }

    public void editAlamat() {
        Intent intent = new Intent(this, FormEditAlamat.class);
        startActivity(intent);
    }

    public void editLokTanah() {
        Intent intent = new Intent(this, FormEditLokasiTanah.class);
        startActivity(intent);
    }

    public void editFotoSelfieKTP() {
        Intent intent = new Intent(this, FormEditFotoSelfieKTP.class);
        startActivity(intent);
    }

    public void editFotoKTP() {
        Intent intent = new Intent(this, FormEditKTP.class);
        startActivity(intent);
    }

    public void editFotoKK() {
        Intent intent = new Intent(this, FormEditKK.class);
        startActivity(intent);
    }

    public void editFotoAktaTanah() {
        Intent intent = new Intent(this, FormEditAktaTanah.class);
        startActivity(intent);
    }

    public void editFotoAktaNikah() {
        Intent intent = new Intent(this, FormEditAktaNikah.class);
        startActivity(intent);
    }

}
