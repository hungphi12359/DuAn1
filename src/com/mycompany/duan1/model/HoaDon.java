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
    String SoHoaDon;
    Date NgayTaoHoaDon ;
    String MaNhanVien;
    String MaSinhVien;
    String MaChuyenNganhSV;
    double HocPhi;
    String MaMonHoc;
    int MaHocKy;
    double TongTien;
    boolean TinhTrang;
    String HocKy;

    public HoaDon() {
    }

    public HoaDon(int MaHoaDon, String SoHoaDon, Date NgayTaoHoaDon, String MaNhanVien, String MaSinhVien, String MaChuyenNganhSV, double HocPhi, String MaMonHoc, int MaHocKy, double TongTien, boolean TinhTrang) {
        this.MaHoaDon = MaHoaDon;
        this.SoHoaDon = SoHoaDon;
        this.NgayTaoHoaDon = NgayTaoHoaDon;
        this.MaNhanVien = MaNhanVien;
        this.MaSinhVien = MaSinhVien;
        this.MaChuyenNganhSV = MaChuyenNganhSV;
        this.HocPhi = HocPhi;
        this.MaMonHoc = MaMonHoc;
        this.MaHocKy = MaHocKy;
        this.TongTien = TongTien;
        this.TinhTrang = TinhTrang;
    }

    public int getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(int MaHoaDon) {
        this.MaHoaDon = MaHoaDon;
    }

    public String getSoHoaDon() {
        return SoHoaDon;
    }

    public void setSoHoaDon(String SoHoaDon) {
        this.SoHoaDon = SoHoaDon;
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

    public String getMaChuyenNganhSV() {
        return MaChuyenNganhSV;
    }

    public void setMaChuyenNganhSV(String MaChuyenNganhSV) {
        this.MaChuyenNganhSV = MaChuyenNganhSV;
    }

    public double getHocPhi() {
        return HocPhi;
    }

    public void setHocPhi(double HocPhi) {
        this.HocPhi = HocPhi;
    }

    public String getMaMonHoc() {
        return MaMonHoc;
    }

    public void setMaMonHoc(String MaMonHoc) {
        this.MaMonHoc = MaMonHoc;
    }

    public int getMaHocKy() {
        return MaHocKy;
    }

    public void setMaHocKy(int MaHocKy) {
        this.MaHocKy = MaHocKy;
    }

    public double getTongTien() {
        return TongTien;
    }

    public void setTongTien(double TongTien) {
        this.TongTien = TongTien;
    }

    public boolean isTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(boolean TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public HoaDon(String HocKy) {
        this.HocKy = HocKy;
    }

    public String getHocKy() {
        return HocKy;
    }

    public void setHocKy(String HocKy) {
        this.HocKy = HocKy;
    }

 
}
