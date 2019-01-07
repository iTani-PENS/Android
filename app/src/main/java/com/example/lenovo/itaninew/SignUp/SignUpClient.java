package com.example.lenovo.itaninew.SignUp;

import com.example.lenovo.itaninew.APIService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SignUpClient {
    private static final String BASE_URL = "http://45.32.112.196:1000/";
    private static SignUpClient mInstance;
    private static Retrofit retrofit;

    private SignUpClient(){
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized  SignUpClient getInstance(){
        if(mInstance == null){
            mInstance = new SignUpClient();
        }
        return mInstance;
    }

    public static APIService getApi(){
        return retrofit.create(APIService.class);
    }
}
