package com.example.lenovo.itaninew.Storage;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefManager {
    public static final String SP_SURVEYOR = "spSurveyor";
    public static final String SP_Nomor_Telpon = "spNomor_Telpon";
    public static final String SP_Nama = "spNama";
    public static final String SP_ID = "spID";
    public static final String SP_SUDAH_LOGIN = "spSudahLogin";

    SharedPreferences sp;
    SharedPreferences.Editor spEditor;

    public SharedPrefManager(Context context){
        sp = context.getSharedPreferences(SP_SURVEYOR, Context.MODE_PRIVATE);
        spEditor = sp.edit();
    }

    public void saveSPString(String keySP, String value){
        spEditor.putString(keySP, value);
        spEditor.commit();
    }

    public void saveSPInt(String keySP, int value){
        spEditor.putInt(keySP, value);
        spEditor.commit();
    }

    public void saveSPBoolean(String keySP, boolean value){
        spEditor.putBoolean(keySP, value);
        spEditor.commit();
    }

    public String getSP_Nomor_Telpon(){
        return sp.getString(SP_Nomor_Telpon, "");
    }

    public String getSPNama(){
        return sp.getString(SP_Nama, "");
    }

    public int getSPID(){
        return sp.getInt(String.valueOf(SP_ID), -1);
    }

    public Boolean getSPSudahLogin(){
        return sp.getBoolean(SP_SUDAH_LOGIN, false);
    }
}
