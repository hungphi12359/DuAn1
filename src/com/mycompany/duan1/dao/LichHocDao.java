/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duan1.dao;

import com.mycompany.duan1.X.XJdbc;
import com.mycompany.duan1.model.LichHoc;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class LichHocDao extends EduSysDAO<LichHoc, String>{

    @Override
    public void insert(LichHoc entity) {
           String sql="INSERT INTO [dbo].[LichHoc]([Ngay],[ThoiGian] ,[MaMonHoc]  ,[MaLopHoc] ,[MaChuyenNganh] ,[MaNhanVien] ,[MaPhongHoc]) VALUES   (?,?,?,?,?,?,?)";
           XJdbc.update(sql, 
           entity.getNgay(),
           entity.getThoiGian(),
           entity.getMaMonHoc(),
           entity.getMaLopHoc(),
           entity.getMaChuyenNganh(),
           entity.getMaNhanVien(),
           entity.getMaPhongHoc()
           );
    }

    @Override
    public void update(LichHoc entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LichHoc selectById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<LichHoc> selectAll() {
                    String sql="SELECT Ngay,ThoiGian,TenPhongHoc,TenMonHoc,TenLopHoc,TenNhanVien FROM LichHoc INNER JOIN MonHoc ON LichHoc.MaMonHoc = MonHoc.MaMonHoc INNER JOIN LopHoc   ON LichHoc.MaLopHoc = LopHoc.MaLopHoc INNER JOIN PhongHoc   ON LichHoc.MaPhongHoc = PhongHoc.MaPhongHoc INNER JOIN NhanVien  ON LichHoc.MaNhanVien = NhanVien.MaNhanVien";
        return this.selectBySql(sql);
    }

    @Override
    protected List<LichHoc> selectBySql(String sql, Object... args) {
             List<LichHoc> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    LichHoc entity=new LichHoc();
                    entity.setNgay(rs.getDate("Ngay"));
                    entity.setThoiGian(rs.getString("ThoiGian"));
                    entity.setTenPhongHoc(rs.getString("TenPhongHoc"));
                    entity.setTenMonHoc(rs.getString("TenMonHoc"));
                    entity.setTenLopHoc(rs.getString("TenLopHoc"));
                    entity.setTenNhanVien(rs.getString("TenNhanVien"));
                    
                    list.add(entity);
                }
            } 
            finally{
                rs.getStatement().getConnection().close();
            }
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }
     public List<LichHoc> selectByTenLopHoc(String tenlophoc){
        String sql="SELECT Ngay,ThoiGian,TenPhongHoc,TenMonHoc,TenLopHoc,TenNhanVien FROM LichHoc INNER JOIN MonHoc ON LichHoc.MaMonHoc = MonHoc.MaMonHoc INNER JOIN LopHoc   ON LichHoc.MaLopHoc = LopHoc.MaLopHoc INNER JOIN PhongHoc   ON LichHoc.MaPhongHoc = PhongHoc.MaPhongHoc INNER JOIN NhanVien  ON LichHoc.MaNhanVien = NhanVien.MaNhanVien WHERE TenLopHoc LIKE ?";
        return this.selectBySql(sql, tenlophoc);
    }
}
