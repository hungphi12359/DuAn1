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
public class HoaDon {
    int MaHoaDon;
    Date NgayTaoHoaDon ;
    String MaNhanVien;
    String MaSinhVien;
    String MaChuyenNganh;
    boolean TinhTrang;
    String HocKy;
    double TongTien ;

    public HoaDon() {
    }

    public HoaDon(int MaHoaDon, Date NgayTaoHoaDon, String MaNhanVien, String MaSinhVien, String MaChuyenNganh, boolean TinhTrang, String HocKy, double TongTien) {
        this.MaHoaDon = MaHoaDon;
        this.NgayTaoHoaDon = NgayTaoHoaDon;
        this.MaNhanVien = MaNhanVien;
        this.MaSinhVien = MaSinhVien;
        this.MaChuyenNganh = MaChuyenNganh;
        this.TinhTrang = TinhTrang;
        this.HocKy = HocKy;
        this.TongTien = TongTien;
    }

    public int getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(int MaHoaDon) {
        this.MaHoaDon = MaHoaDon;
    }

    public Date getNgayTaoHoaDon() {
        return NgayTaoHoaDon;
    }

    public void setNgayTaoHoaDon(Date NgayTaoHoaDon) {
        this.NgayTaoHoaDon = NgayTaoHoaDon;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(String MaSinhVien) {
        this.MaSinhVien = MaSinhVien;
    }

    public String getMaChuyenNganh() {
        return MaChuyenNganh;
    }

    public void setMaChuyenNganh(String MaChuyenNganh) {
        this.MaChuyenNganh = MaChuyenNganh;
    }

    public boolean isTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(boolean TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public String getHocKy() {
        return HocKy;
    }

    public void setHocKy(String HocKy) {
        this.HocKy = HocKy;
    }

    public double getTongTien() {
        return TongTien;
    }

    public void setTongTien(double TongTien) {
        this.TongTien = TongTien;
    }

    
}