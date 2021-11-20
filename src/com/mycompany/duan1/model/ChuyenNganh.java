/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duan1.model;

/**
 *
 * @author ADMIN
 */
public class ChuyenNganh {
    private String MaChuyenNganh;
    private String TenChuyenNganh;

    public ChuyenNganh() {
    }

    public ChuyenNganh(String MaChuyenNganh, String TenChuyenNganh) {
        this.MaChuyenNganh = MaChuyenNganh;
        this.TenChuyenNganh = TenChuyenNganh;
    }

    public String getMaChuyenNganh() {
        return MaChuyenNganh;
    }

    public void setMaChuyenNganh(String MaChuyenNganh) {
        this.MaChuyenNganh = MaChuyenNganh;
    }

    public String getTenChuyenNganh() {
        return TenChuyenNganh;
    }

    public void setTenChuyenNganh(String TenChuyenNganh) {
        this.TenChuyenNganh = TenChuyenNganh;
    }

    @Override
    public String toString() {
        return  MaChuyenNganh ;
    }
    
}
