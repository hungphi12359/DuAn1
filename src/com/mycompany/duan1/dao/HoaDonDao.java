/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duan1.dao;

import com.mycompany.duan1.X.XJdbc;
import com.mycompany.duan1.model.ChuyenDoi;
import com.mycompany.duan1.model.HoaDon;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class HoaDonDao  extends EduSysDAO<HoaDon, String>{

    @Override
    public void insert(HoaDon entity) {
       String sql="set dateformat dmy INSERT INTO [dbo].[HoaDon]([SoHoaDon],[NgayTaoHD] ,[MaNhanVien],[MaSinhVien] ,[MaChuyenNganhSV] ,[HocPhi] ,[TinhTrang],[TongTien],[HocKy])VALUES (?,?,?,?,?,?,?,?,?)";
        XJdbc.update(sql, 
                entity.getSoHoaDon(), 
                ChuyenDoi.DinhDangNgay(entity.getNgayTaoHoaDon()), 
                entity.getMaNhanVien(), 
                entity.getMaSinhVien(),
                entity.getMaChuyenNganhSV(),
                entity.getHocPhi(),
                entity.isTinhTrang(),
                entity.getTongTien(),
                entity.getHocKy());
    }

    @Override
    public void update(HoaDon entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HoaDon selectById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<HoaDon> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected List<HoaDon> selectBySql(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
