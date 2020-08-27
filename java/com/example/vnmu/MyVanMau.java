package com.example.vnmu;

public class MyVanMau {
    String title;
    String van_mau;

    public MyVanMau() {

    }

    public MyVanMau(String title, String van_mau) {
        this.title = title;
        this.van_mau = van_mau;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVan_mau() {
        return van_mau;
    }

    public void setVan_mau(String van_mau) {
        this.van_mau = van_mau;
    }
}
