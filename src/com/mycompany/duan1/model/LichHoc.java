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
public class LichHoc {
    private int MaLichHoc;
    private Date Ngay;
    private String ThoiGian;
    private String MaMonHoc;
    private String MaLopHoc;
    private String MaChuyenNganh;
    private String MaNhanVien;
    private String MaPhongHoc;

    public LichHoc() {
    }

    public LichHoc(int MaLichHoc, Date Ngay, String ThoiGian, String MaMonHoc, String MaLopHoc, String MaChuyenNganh, String MaNhanVien, String MaPhongHoc) {
        this.MaLichHoc = MaLichHoc;
        this.Ngay = Ngay;
        this.ThoiGian = ThoiGian;
        this.MaMonHoc = MaMonHoc;
        this.MaLopHoc = MaLopHoc;
        this.MaChuyenNganh = MaChuyenNganh;
        this.MaNhanVien = MaNhanVien;
        this.MaPhongHoc = MaPhongHoc;
    }

    public int getMaLichHoc() {
        return MaLichHoc;
    }

    public void setMaLichHoc(int MaLichHoc) {
        this.MaLichHoc = MaLichHoc;
    }

    public Date getNgay() {
        return Ngay;
    }

    public void setNgay(Date Ngay) {
        this.Ngay = Ngay;
    }

    public String getThoiGian() {
        return ThoiGian;
    }

    public void setThoiGian(String ThoiGian) {
        this.ThoiGian = ThoiGian;
    }

    public String getMaMonHoc() {
        return MaMonHoc;
    }

    public void setMaMonHoc(String MaMonHoc) {
        this.MaMonHoc = MaMonHoc;
    }

    public String getMaLopHoc() {
        return MaLopHoc;
    }

    public void setMaLopHoc(String MaLopHoc) {
        this.MaLopHoc = MaLopHoc;
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

    public String getMaPhongHoc() {
        return MaPhongHoc;
    }

    public void setMaPhongHoc(String MaPhongHoc) {
        this.MaPhongHoc = MaPhongHoc;
    }

   
}
