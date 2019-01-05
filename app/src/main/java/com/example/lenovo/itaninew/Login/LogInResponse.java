package com.example.lenovo.itaninew.Login;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LogInResponse{

    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("profile")
    @Expose
    private Profil profile;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private Integer status;

    public String getMessage() {
        return message;
    }

    public Integer getStatus() {
        return status;
    }

    public Data getData() {
        return data;
    }

    public Profil getProfile() {
        return profile;
    }

}
