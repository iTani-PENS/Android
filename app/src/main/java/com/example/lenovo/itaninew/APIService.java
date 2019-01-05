package com.example.lenovo.itaninew;

import com.example.lenovo.itaninew.Login.LogInResponse;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface APIService {

    @FormUrlEncoded
    @POST("rest-auth/registration/")
    Call<ResponseBody> createUser(
            @Field("email") String email,
            @Field("username") String username,
            @Field("password1") String password1,
            @Field("password2") String password2
    );

    @GET("auth/login/{nomor_telpon}")
    Call<LogInResponse> loginUser(
            @Path("nomor_telpon") String nomor_telpon
    );
}
