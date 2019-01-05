package com.example.lenovo.itaninew;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.lenovo.cobagetdata.LogIn.LogInResponse;

public class Home extends AppCompatActivity {

    LogInResponse logInResponse;
    TextView tvResultNama;
    String resultNama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itani_home);

        initComponents();
        Bundle extras = getIntent().getExtras();
        if (extras != null)
            resultNama = extras.getString("NAMA");
        tvResultNama.setText(resultNama);
    }

    private void initComponents(){
        tvResultNama = (TextView) findViewById(R.id.nama);
    }
}
