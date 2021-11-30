/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duan1.dao;

import com.mycompany.duan1.X.XJdbc;

import com.mycompany.duan1.model.TaiKhoan;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author domin
 */
public class TaiKhoanDao extends EduSysDAO<TaiKhoan, String>{

    @Override
    public void insert(TaiKhoan entity) {
          String sql="INSERT INTO TaiKhoan (MaTaiKhoan, TenDangNhap, MatKhau, VaiTro) VALUES( ?, ?, ?,?)";
          XJdbc.update(sql, entity.getMaTK(), entity.getTenTaiKhoan(),entity.getMatKhau(),entity.getVaiTro());
    }

    @Override
    public void update(TaiKhoan entity) {
        String sql = "UPDATE TaiKhoan SET TenDangNhap = ?, MatKhau=?, VaiTro=? WHERE MaTaiKhoan = ?";
         XJdbc.update(sql, entity.getTenTaiKhoan(), entity.getMatKhau(), entity.getVaiTro(), entity.getMaTK());
    }

    @Override
    public void delete(String id) {
         String sql="DELETE FROM TaiKhoan WHERE MaTaiKhoan= ?";
        XJdbc.update(sql, id);
    }

    @Override
    public TaiKhoan selectById(String id) {
                     String sql="SELECT * FROM TaiKhoan WHERE MaTaiKhoan= ?";
        List<TaiKhoan> list = selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<TaiKhoan> selectAll() {
        String sql="select * from TaiKhoan";
        return selectBySql(sql);
    }

    @Override
    protected List<TaiKhoan> selectBySql(String sql, Object... args) {
                List<TaiKhoan> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    TaiKhoan entity = new TaiKhoan();
                    entity.setMaTK(rs.getString(1));
                    entity.setTenTaiKhoan(rs.getString(2));
                    entity.setMatKhau(rs.getString(3));
                    entity.setVaiTro(rs.getInt(4));
                    list.add(entity);
                }
            } 
            finally{
                rs.getStatement().getConnection().close();
            }
        } 
        catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }
    
    public TaiKhoan selectByTenDangNhap(String Ten) {
        String sql = "SELECT * FROM TaiKhoan WHERE TenDangNhap = ?";
        List<TaiKhoan> list = selectBySql(sql, Ten);
        return list.size() > 0 ? list.get(0):null ;
    }
  
    public List<TaiKhoan> selectByMaSV() {
        String sql = "SELECT * FROM TaiKhoan LEFT JOIN SinhVien ON TaiKhoan.MaTaiKhoan = SinhVien.MaTaiKhoan where TaiKhoan.MaTaiKhoan not in (SELECT TaiKhoan.MaTaiKhoan FROM TaiKhoan inner JOIN SinhVien ON TaiKhoan.MaTaiKhoan = SinhVien.MaTaiKhoan where TaiKhoan.VaiTro = 2) And TaiKhoan.VaiTro = 2";
        return selectBySql(sql);
    }
    public List<TaiKhoan> selectByMaNV() {
        String sql = "SELECT * FROM TaiKhoan LEFT JOIN SinhVien ON TaiKhoan.MaTaiKhoan = SinhVien.MaTaiKhoan where TaiKhoan.MaTaiKhoan not in (SELECT TaiKhoan.MaTaiKhoan FROM TaiKhoan inner JOIN SinhVien ON TaiKhoan.MaTaiKhoan = SinhVien.MaTaiKhoan where TaiKhoan.VaiTro = 0) And TaiKhoan.VaiTro = 0";
        return selectBySql(sql);
    }
     public List<TaiKhoan> selectById2(String id) {
                     String sql="SELECT * FROM TaiKhoan LEFT JOIN SinhVien ON TaiKhoan.MaTaiKhoan = SinhVien.MaTaiKhoan where   TaiKhoan.VaiTro  = 2 AND SinhVien.MaTaiKhoan = ?";
         return selectBySql(sql, id);
    }
}