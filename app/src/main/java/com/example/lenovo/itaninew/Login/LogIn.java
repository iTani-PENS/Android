package com.example.lenovo.itaninew.Login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.lenovo.itaninew.APIService;
import com.example.lenovo.itaninew.R;
import com.example.lenovo.itaninew.SignUp.SignUp;
import com.example.lenovo.itaninew.Verification.VerificationCode;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LogIn extends AppCompatActivity implements View.OnClickListener {

    private EditText etNomor_Telpon;
    APIService mApiService;
    Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itani_login);


        etNomor_Telpon = findViewById(R.id.etNoHp);
        mContext = this;
        findViewById(R.id.masuk).setOnClickListener(this);
    }

    private void userLogin(){
        String nomor_telpon = etNomor_Telpon.getText().toString().trim();

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

        Call<LogInResponse> call = LogInClient
                .getInstance()
                .getApi()
                .loginUser(nomor_telpon);

        call.enqueue(new Callback<LogInResponse>() {
            @Override
            public void onResponse(Call<LogInResponse> call, Response<LogInResponse> response) {
                LogInResponse logInResponse = response.body();
                //Toast.makeText(LogIn.this, logInResponse.getMessage(), Toast.LENGTH_LONG).show();
                if(logInResponse.getMessage().equals("success")){
                    Intent i = new Intent(LogIn.this, VerificationCode.class);
                    Toast.makeText(LogIn.this, logInResponse.getData().getVerification_code() , Toast.LENGTH_LONG).show();
                    i.putExtra("KODE",logInResponse.getData().getVerification_code() );
                    startActivity(i);
                }else{
                    Toast.makeText(LogIn.this, logInResponse.getMessage(), Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<LogInResponse> call, Throwable t) {
                Log.e("Login ERROR: ", t.getMessage());
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.masuk:
                userLogin();
                break;
            case R.id.daftar:
                Intent intent = new Intent(LogIn.this, SignUp.class);
                startActivity(intent);
                break;
        }
    }


}
