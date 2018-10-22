package com.example.lenovo.itaninew;

/**
 * Created by apple on 15/03/16.
 *
 * //********LISTVIEW************
 */
public class OpsiKurBeanclassList {

    private int img;
    private String name;
    private String sub_name;


    public OpsiKurBeanclassList(int img, String name, String sub_name) {
        this.img = img;
        this.name = name;
        this.sub_name = sub_name;
    }

    public int getImg() {

        return img;
    }

    public void setImg(int img) {

        this.img = img;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getSub_name() {

        return sub_name;
    }

    public void setSub_name(String sub_name) {

        this.sub_name = sub_name;
    }
}
