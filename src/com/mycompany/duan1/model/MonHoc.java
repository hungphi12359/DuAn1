/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duan1.model;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class MonHoc {
    private String MaMonHoc;
    private  String TenMonHoc;
    private Date NgayBatDau;
    private Date NgayKetThuc;
    private String MaChuyenNganh;
    private String MaNhanVien;
    private float HocPhi = 0;
    private String HocKy;

    public MonHoc() {
    }

    public MonHoc(String MaMonHoc, String TenMonHoc, Date NgayBatDau, Date NgayKetThuc, String MaChuyenNganh, String MaNhanVien, float HocPhi, String HocKy) {
        this.MaMonHoc = MaMonHoc;
        this.TenMonHoc = TenMonHoc;
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
        this.MaChuyenNganh = MaChuyenNganh;
        this.MaNhanVien = MaNhanVien;
        this.HocPhi = HocPhi;
        this.HocKy = HocKy;
    }

    public String getMaMonHoc() {
        return MaMonHoc;
    }

    public void setMaMonHoc(String MaMonHoc) {
        this.MaMonHoc = MaMonHoc;
    }

    public String getTenMonHoc() {
        return TenMonHoc;
    }

    public void setTenMonHoc(String TenMonHoc) {
        this.TenMonHoc = TenMonHoc;
    }

    public Date getNgayBatDau() {
        return NgayBatDau;
    }

    public void setNgayBatDau(Date NgayBatDau) {
        this.NgayBatDau = NgayBatDau;
    }

    public Date getNgayKetThuc() {
        return NgayKetThuc;
    }

    public void setNgayKetThuc(Date NgayKetThuc) {
        this.NgayKetThuc = NgayKetThuc;
    }

    public String getMaChuyenNganh() {
        return MaChuyenNganh;
    }

    public void setMaChuyenNganh(String MaChuyenNganh) {
        this.MaChuyenNganh = MaChuyenNganh;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public float getHocPhi() {
        return HocPhi;
    }

    public void setHocPhi(float HocPhi) {
        this.HocPhi = HocPhi;
    }

    public String getHocKy() {
        return HocKy;
    }

    public void setHocKy(String HocKy) {
        this.HocKy = HocKy;
    }

    @Override
    public String toString() {
        return MaMonHoc;
    }
    
    
}
