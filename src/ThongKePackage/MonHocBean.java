/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThongKePackage;

import java.util.Date;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class MonHocBean {
    private  Date NgayKetThuc;
    private  Date NgayBatDau;
    private  String MaMonHoc;
    private double HocPhi;
    private  String HocKy;
    private  double TongTien;
    private Date NgayTaoHD;

    public MonHocBean() {
    }

    public MonHocBean(Date NgayKetThuc, Date NgayBatDau, String MaMonHoc, double HocPhi, String HocKy, double TongTien, Date NgayTaoHD) {
        this.NgayKetThuc = NgayKetThuc;
        this.NgayBatDau = NgayBatDau;
        this.MaMonHoc = MaMonHoc;
        this.HocPhi = HocPhi;
        this.HocKy = HocKy;
        this.TongTien = TongTien;
        this.NgayTaoHD = NgayTaoHD;
    }

    public Date getNgayKetThuc() {
        return NgayKetThuc;
    }

    public void setNgayKetThuc(Date NgayKetThuc) {
        this.NgayKetThuc = NgayKetThuc;
    }

    public Date getNgayBatDau() {
        return NgayBatDau;
    }

    public void setNgayBatDau(Date NgayBatDau) {
        this.NgayBatDau = NgayBatDau;
    }

    public String getMaMonHoc() {
        return MaMonHoc;
    }

    public void setMaMonHoc(String MaMonHoc) {
        this.MaMonHoc = MaMonHoc;
    }

    public double getHocPhi() {
        return HocPhi;
    }

    public void setHocPhi(double HocPhi) {
        this.HocPhi = HocPhi;
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

    public Date getNgayTaoHD() {
        return NgayTaoHD;
    }

    public void setNgayTaoHD(Date NgayTaoHD) {
        this.NgayTaoHD = NgayTaoHD;
    }

    
}
