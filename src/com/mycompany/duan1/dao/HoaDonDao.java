/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duan1.dao;

import com.mycompany.duan1.X.XJdbc;
import com.mycompany.duan1.model.ChuyenDoi;
import com.mycompany.duan1.model.HoaDon;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author ADMIN
 */
public class HoaDonDao  extends EduSysDAO<HoaDon, String>{

    @Override
    public void insert(HoaDon entity) {
       String sql="INSERT INTO [dbo].[HoaDon] ([NgayTaoHD] ,[MaNhanVien] ,[MaSinhVien] ,[MaChuyenNganhSV] ,[TinhTrang] ,[HocKy] ) VALUES (?,?,?,?,?,?)";
        XJdbc.update(sql,
                ChuyenDoi.DinhDangNgay(entity.getNgayTaoHoaDon()), 
                entity.getMaNhanVien(), 
                entity.getMaSinhVien(),
                entity.getMaChuyenNganh(),
                entity.isTinhTrang(),
                entity.getHocKy()
 
        );
    }

    @Override
    public void update(HoaDon entity) {
        String sql = "UPDATE [dbo].[HoaDon] SET [TinhTrang] = ?,[TongTien] = ? WHERE [MaHoaDon] = ?" ;
        XJdbc.update(sql, entity.isTinhTrang(),entity.getTongTien(), entity.getMaHoaDon());
    }

    @Override
    public void delete(String id) {
        String sql = "DELETE FROM [dbo].[HoaDon] WHERE MaHoaDon = ?";
        XJdbc.update(sql, id);
    }

    @Override
    public HoaDon selectById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<HoaDon> selectAll() {
        String sql = "SELECT * FROM [dbo].[HoaDon]";
        return selectBySql(sql);
    }

    @Override
    protected List<HoaDon> selectBySql(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    HoaDon entity = new HoaDon();
                    entity.setMaHoaDon(rs.getInt(1));
                    entity.setNgayTaoHoaDon(rs.getDate(2));
                    entity.setMaNhanVien(rs.getString(3));
                    entity.setMaSinhVien(rs.getString(4));
                    entity.setMaChuyenNganh(rs.getString(5));
                    entity.setTinhTrang(rs.getBoolean(6));
                    entity.setHocKy(rs.getString(7));
                    list.add(entity);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }
    public List<HoaDon> selectByMaSV(String MaSV) {
        String sql = "SELECT * FROM [dbo].[HoaDon] WHERE TinhTrang = 0 AND MaSinhVien like ?";
        return selectBySql(sql, MaSV);
    }
       public HoaDon selectMaSinhVienANDHocKyIN(String MaSV, String HocKy) {
        String sql = "select * from HoaDon where MaSinhVien Like ? AND HocKy LIKE ?";
        List<HoaDon> list = selectBySql(sql, MaSV,HocKy);
        return list.size() > 0 ? list.get(0) : null;
    }
      
}
