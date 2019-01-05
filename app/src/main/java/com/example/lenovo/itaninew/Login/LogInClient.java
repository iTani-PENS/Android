package com.example.lenovo.itaninew.Login;

import com.example.lenovo.itaninew.APIService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LogInClient {
    private static final String BASE_URL = "http://45.32.112.196:1000/";
    private static LogInClient mInstance;
    private static Retrofit retrofit;

    private LogInClient(){
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized  LogInClient getInstance(){
        if(mInstance == null){
            mInstance = new LogInClient();
        }
        return mInstance;
    }

    public static APIService getApi(){
        return retrofit.create(APIService.class);
    }
}
