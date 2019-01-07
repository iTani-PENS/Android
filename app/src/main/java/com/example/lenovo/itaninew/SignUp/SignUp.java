package com.example.lenovo.itaninew.SignUp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lenovo.itaninew.APIService;
import com.example.lenovo.itaninew.Login.LogIn;
import com.example.lenovo.itaninew.R;
import com.example.lenovo.itaninew.Verification.VerificationCode;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SignUp extends AppCompatActivity {

    private EditText etNama;
    private EditText etNomor_Telpon;
    private String status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itani_daftar);

        etNama= findViewById(R.id.etNama);
        etNomor_Telpon = findViewById(R.id.etNomor_Telpon);
        etNama.setBackgroundResource(android.R.color.transparent);
        etNomor_Telpon.setBackgroundResource(android.R.color.transparent);
        TextView masuk = (TextView) findViewById(R.id.masuk);
        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                masuk();
            }
        });

        Button daftar = (Button) findViewById(R.id.daftar);
        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                daftar();
            }
        });
    }

    public void masuk() {
        Intent intent = new Intent(this, LogIn.class);
        startActivity(intent);
    }

    public void daftar() {
        String nomor_telpon = etNomor_Telpon.getText().toString().trim();
        String nama = etNama.getText().toString().trim();
        status = "daftar";
        if(nomor_telpon.isEmpty()){
            etNomor_Telpon.setError("Password required");
            etNomor_Telpon.requestFocus();
            return;
        }

        if(nomor_telpon.length() < 13){
            etNomor_Telpon.setError("nomor kurang dari 13");
            etNomor_Telpon.requestFocus();
        }

        if(nomor_telpon.length() > 13){
            etNomor_Telpon.setError("nomor lebih dari 13");
            etNomor_Telpon.requestFocus();
        }

        Call<SignUpResponse> call = SignUpClient.getInstance().getApi().createUser(nama,nomor_telpon);

        call.enqueue(new Callback<SignUpResponse>() {
            @Override
            public void onResponse(Call<SignUpResponse> call, Response<SignUpResponse> response) {
                SignUpResponse signUpResponse = response.body();
                if(signUpResponse.getMessage().equals("created")){
                    Intent i = new Intent(SignUp.this, VerificationCode.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("KODE",signUpResponse.getData().getVerification_code());
                    bundle.putString("NAMA",signUpResponse.getData().getProfile().getNama());
                    bundle.putString("NOMOR",signUpResponse.getData().getProfile().getNomor_telpon());
                    bundle.putString("STATUS",status);
                    bundle.putInt("ID",signUpResponse.getData().getProfile().getId());
                    i.putExtras(bundle);
                    startActivity(i);
                }else{
                    Toast.makeText(SignUp.this, signUpResponse.getMessage(), Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<SignUpResponse> call, Throwable t) {
                Log.e("Login ERROR: ", t.getMessage());
            }
        });
    }
}
