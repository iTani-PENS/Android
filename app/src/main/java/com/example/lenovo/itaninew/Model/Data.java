package com.example.lenovo.itaninew.Login;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {
    @SerializedName("profile")
    @Expose
    private Profil profile;
    @SerializedName("verification_code")
    @Expose
    private String verification_code;

    public String getVerification_code() {
        return verification_code;
    }

    public void setVerification_code(String verification_code) {
        this.verification_code = verification_code;
    }

    public Profil getProfile() {
        return profile;
    }
}
