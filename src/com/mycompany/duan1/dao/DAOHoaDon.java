/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.duan1.dao;


import com.mycompany.duan1.X.DBConnection;
import com.mycompany.duan1.model.HoaDon;
import java.sql.ResultSet;

/**
 *
 * @author CuongNP
 */
public class DAOHoaDon {
    public static ResultSet CountSoHoaDon(String SoHoaDon) {
        String cauTruyVan = "select Count(*) from HoaDon where SoHoaDon like ?";
        return DBConnection.GetData(cauTruyVan);
    }
    
    //7 Hàm lấy theo SoHoaDon
    public static ResultSet GetBySoHoaDon(String SoHoaDon) {
        String cauTruyVan = "select * from HoaDon where SoHoaDon LIKE ?";
        return DBConnection.GetData(cauTruyVan);
    }
    
    public static int ThemHoaDon(HoaDon hd){
        String cauTruyVan = "INSERT INTO [dbo].[HoaDon] ([SoHoaDon] ,[NgayTaoHD],[MaNhanVien] ,[MaSinhVien] ,[MaChuyenNganhSV],[HocPhi],[MaMonHoc],[TinhTrang])VALUES(?,?,?,? ,?,?,? ,?)";
        System.out.println(cauTruyVan);
        return DBConnection.ExecuteTruyVan(cauTruyVan);
    }
}
