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
public class LopHocBean {
    private  Date NgayDangKy;
    private  int SoLuongSinhVien;
    private String TenLopHoc;
        private String MaLopHoc;

    public LopHocBean() {
    }

    public LopHocBean(Date NgayDangKy, int SoLuongSinhVien, String TenLopHoc, String MaLopHoc) {
        this.NgayDangKy = NgayDangKy;
        this.SoLuongSinhVien = SoLuongSinhVien;
        this.TenLopHoc = TenLopHoc;
        this.MaLopHoc = MaLopHoc;
    }

    public Date getNgayDangKy() {
        return NgayDangKy;
    }

    public void setNgayDangKy(Date NgayDangKy) {
        this.NgayDangKy = NgayDangKy;
    }

    public int getSoLuongSinhVien() {
        return SoLuongSinhVien;
    }

    public void setSoLuongSinhVien(int SoLuongSinhVien) {
        this.SoLuongSinhVien = SoLuongSinhVien;
    }

    public String getTenLopHoc() {
        return TenLopHoc;
    }

    public void setTenLopHoc(String TenLopHoc) {
        this.TenLopHoc = TenLopHoc;
    }

    public String getMaLopHoc() {
        return MaLopHoc;
    }

    public void setMaLopHoc(String MaLopHoc) {
        this.MaLopHoc = MaLopHoc;
    }

  
    
}
