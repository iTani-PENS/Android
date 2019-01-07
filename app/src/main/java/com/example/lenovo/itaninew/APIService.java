package com.example.lenovo.itaninew;

import com.example.lenovo.itaninew.Login.LogInResponse;
import com.example.lenovo.itaninew.SignUp.SignUpResponse;
import com.example.lenovo.itaninew.Verification.VerificationResponse;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface APIService {

    @FormUrlEncoded
    @POST("auth/register/")
    Call<SignUpResponse> createUser(
            @Field("nama") String nama,
            @Field("nomor_telpon") String nomor_telpon
    );

    @GET("auth/login/{nomor_telpon}")
    Call<LogInResponse> loginUser(
            @Path("nomor_telpon") String nomor_telpon
    );

    @GET("auth/user-verify/{nomor_telpon}/{code}")
    Call<VerificationResponse> verificationUser(
            @Path("nomor_telpon") String nomor_telpon,
            @Path("code") String code
    );
}
