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
public class LopHoc {
    private String MaLopHoc;
    private String TenLopHoc;
    private int SoLuongSinhVien;
    private String MaNhanVien;
    private Date NgayDangKy; 

    public LopHoc() {
    }

    public LopHoc(String MaLopHoc, String TenLopHoc, int SoLuongSinhVien, String MaNhanVien, Date NgayDangKy) {
        this.MaLopHoc = MaLopHoc;
        this.TenLopHoc = TenLopHoc;
        this.SoLuongSinhVien = SoLuongSinhVien;
        this.MaNhanVien = MaNhanVien;
        this.NgayDangKy = NgayDangKy;
    }

    public String getMaLopHoc() {
        return MaLopHoc;
    }

    public void setMaLopHoc(String MaLopHoc) {
        this.MaLopHoc = MaLopHoc;
    }

    public String getTenLopHoc() {
        return TenLopHoc;
    }

    public void setTenLopHoc(String TenLopHoc) {
        this.TenLopHoc = TenLopHoc;
    }

    public int getSoLuongSinhVien() {
        return SoLuongSinhVien;
    }

    public void setSoLuongSinhVien(int SoLuongSinhVien) {
        this.SoLuongSinhVien = SoLuongSinhVien;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public Date getNgayDangKy() {
        return NgayDangKy;
    }

    public void setNgayDangKy(Date NgayDangKy) {
        this.NgayDangKy = NgayDangKy;
    }

   
}
