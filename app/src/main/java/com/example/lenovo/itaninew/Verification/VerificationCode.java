package com.example.lenovo.itaninew.Verification;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.lenovo.itaninew.Home;
import com.example.lenovo.itaninew.Login.LogIn;
import com.example.lenovo.itaninew.Login.LogInClient;
import com.example.lenovo.itaninew.Login.LogInResponse;
import com.example.lenovo.itaninew.Profil.EditProfil;
import com.example.lenovo.itaninew.R;
import com.example.lenovo.itaninew.SignUp.SignUp;
import com.example.lenovo.itaninew.Storage.SharedPrefManager;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class VerificationCode extends AppCompatActivity implements View.OnClickListener{

    private EditText etKode;
    private Button btnVerifikasi;
    private Bundle extras;
    private String kode;
    private String nama;
    private String nomor;
    private String status;
    private int id;
    SharedPrefManager sharedPrefManager;
    private Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itani_verification_code);

        SharedPrefManager sharedPrefManager;
        sharedPrefManager = new SharedPrefManager(this);
        if (sharedPrefManager.getSPSudahLogin()) {
            startActivity(new Intent(VerificationCode.this, Home.class)
                    .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK));
            finish();
        }
        etKode = findViewById(R.id.etKode);
        Bundle extras = getIntent().getExtras();
        kode = extras.getString("KODE");
        nama = extras.getString("NAMA");
        nomor = extras.getString("NOMOR");
        status = extras.getString("STATUS");
        id = extras.getInt("ID");
        if (extras != null)
            etKode.setText(String.valueOf(kode));
        sharedPrefManager = new SharedPrefManager(this);
        etKode.setEnabled(false);
        findViewById(R.id.verifikasi).setOnClickListener(this);
        findViewById(R.id.kirimUlang).setOnClickListener(this);
        findViewById(R.id.gantiNomor).setOnClickListener(this);
    }

    public void verifikasiUser(){
        sharedPrefManager = new SharedPrefManager(VerificationCode.this);
        sharedPrefManager.saveSPInt(SharedPrefManager.SP_ID, id);
        sharedPrefManager.saveSPString(SharedPrefManager.SP_Nama, nama);
        sharedPrefManager.saveSPBoolean(SharedPrefManager.SP_SUDAH_LOGIN, true);
        startActivity(new Intent(VerificationCode.this, Home.class)
                .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK));
        finish();
    }

    public void kirimUlang(){


        Call<LogInResponse> call = LogInClient
                .getInstance()
                .getApi()
                .loginUser(nomor);

        call.enqueue(new Callback<LogInResponse>() {
            @Override
            public void onResponse(Call<LogInResponse> call, Response<LogInResponse> response) {
                LogInResponse logInResponse = response.body();
                if(logInResponse.getMessage().equals("success")){
                    Intent i = new Intent(VerificationCode.this, VerificationCode.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("KODE",logInResponse.getData().getVerification_code());
                    bundle.putString("NAMA",logInResponse.getData().getProfile().getNama());
                    bundle.putString("NOMOR",logInResponse.getData().getProfile().getNomor_telpon());
                    bundle.putString("STATUS",status);
                    bundle.putInt("ID",logInResponse.getData().getProfile().getId());
                    i.putExtras(bundle);
                    startActivity(i);
                }else{
                    Toast.makeText(VerificationCode.this, logInResponse.getMessage(), Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<LogInResponse> call, Throwable t) {
                Log.e("Login ERROR: ", t.getMessage());
            }
        });
    }

    public void gantiNomor(){
        if(status.equals("login")){
            Intent ganti = new Intent(this, LogIn.class);
            startActivity(ganti);
        }else{
            Intent ganti = new Intent(this, SignUp.class);
            startActivity(ganti);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.verifikasi:
                verifikasiUser();
                break;
            case R.id.kirimUlang:
                kirimUlang();
                break;
            case R.id.gantiNomor:
                gantiNomor();
                break;
        }
    }
}
