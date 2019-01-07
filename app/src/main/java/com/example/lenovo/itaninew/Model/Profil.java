package com.example.lenovo.itaninew.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Profil {
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("nomor_telpon")
    @Expose
    private String nomor_telpon;
    @SerializedName("nama")
    @Expose
    private String nama;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
