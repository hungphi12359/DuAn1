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
public class SinhVien {
    private String MaSinhVien ;
    private String TenSinhVien ;
    private Date NgaySinh ;
    private String Email ;
    private String SDT ;
    private String DiaChi ;
    private Boolean GioiTinh ;
    private String MaChuyenNganh;
    private String MaLopHoc;
    private String Hinh;
    private String MaTK;

    public Boolean getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(Boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getMaTK() {
        return MaTK;
    }

    public void setMaTK(String MaTK) {
        this.MaTK = MaTK;
    }

    public SinhVien(String MaSinhVien, String TenSinhVien, Date NgaySinh, String Email, String SDT, String DiaChi, Boolean GioiTinh, String MaChuyenNganh, String MaLopHoc, String Hinh, String MaTK) {
        this.MaSinhVien = MaSinhVien;
        this.TenSinhVien = TenSinhVien;
        this.NgaySinh = NgaySinh;
        this.Email = Email;
        this.SDT = SDT;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
        this.MaChuyenNganh = MaChuyenNganh;
        this.MaLopHoc = MaLopHoc;
        this.Hinh = Hinh;
        this.MaTK = MaTK;
    }

    public SinhVien() {
    }

    public String getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(String MaSinhVien) {
        this.MaSinhVien = MaSinhVien;
    }

    public String getTenSinhVien() {
        return TenSinhVien;
    }

    public void setTenSinhVien(String TenSinhVien) {
        this.TenSinhVien = TenSinhVien;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

  

    public String getMaChuyenNganh() {
        return MaChuyenNganh;
    }

    public void setMaChuyenNganh(String MaChuyenNganh) {
        this.MaChuyenNganh = MaChuyenNganh;
    }

    public String getMaLopHoc() {
        return MaLopHoc;
    }

    public void setMaLopHoc(String MaLopHoc) {
        this.MaLopHoc = MaLopHoc;
    }

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }

    @Override
    public String toString() {
        return MaSinhVien ;
    }

    
    
}
