/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThongKePackage;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class MonHocBean {
    private  Date NgayKetThuc;
    private  Date NgayBatDau;
    private  String MaMonHoc;
    private float HocPhi;
    private  String HocKy;

    public MonHocBean() {
    }

    public MonHocBean(Date NgayKetThuc, Date NgayBatDau, String MaMonHoc, float HocPhi, String HocKy) {
        this.NgayKetThuc = NgayKetThuc;
        this.NgayBatDau = NgayBatDau;
        this.MaMonHoc = MaMonHoc;
        this.HocPhi = HocPhi;
        this.HocKy = HocKy;
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

  

    
    
}
