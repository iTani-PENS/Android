package com.example.lenovo.itaninew.Login;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Profil {
    @SerializedName("nomor_telpon")
    @Expose
    private String nomor_telpon;
    @SerializedName("nama")
    @Expose
    private String nama;

    public String getNomor_telpon() {
        return nomor_telpon;
    }

    public void setNomor_telpon(String nomor_telpon) {
        this.nomor_telpon = nomor_telpon;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
