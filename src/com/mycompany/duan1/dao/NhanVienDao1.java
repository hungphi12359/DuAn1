/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duan1.dao;

import com.mycompany.duan1.X.XJdbc;
import com.mycompany.duan1.model.NhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class NhanVienDao1 extends EduSysDAO<NhanVien, String>{
          public NhanVien readFromResultSet(ResultSet rs) throws SQLException{
        NhanVien model=new NhanVien();
        model.setMaNhanVien(rs.getString("MaNhanVien"));
        model.setTenNhanVien(rs.getString("TenNhanVien"));
        model.setSDT(rs.getString("SDT"));
        model.setEmail(rs.getString("Email"));
        model.setDiaChi(rs.getString("DiaChi"));
        model.setNgaySinh(rs.getDate("NgaySinh"));
        model.setGioiTinh(rs.getBoolean("GioiTinh"));
        model.setMaChuyenNganh(rs.getString("MaChuyenNganh"));
        model.setHinh(rs.getString("Hinh"));
         return model;
    }
    public List<NhanVien> select(String sql,Object...args){
        List<NhanVien> list=new ArrayList<>();
        try {
            ResultSet rs=null;
            try{
                rs=XJdbc.query(sql, args);
                while(rs.next()){
                    list.add(readFromResultSet(rs));
                }
            }finally{
                rs.getStatement().getConnection().close();      //đóng kết nối từ resultSet
            }
        } catch (SQLException ex) {
            throw new RuntimeException();
        }
        return list;
    }
    
    @Override
//    public void insert(NhanVien entity) {
//         String sql="INSERT INTO [dbo].[NhanVien] ([MaNhanVien]  ,[TenNhanVien] ,[SDT]  ,[Email]  ,[DiaChi] ,[NgaySinh]  ,[GioiTinh],[MaChuyenNganh] ,[Hinh]) VALUES(?,?,?,?,?,?,?,?,?)";
//        XJdbc.update(sql, 
//                entity.getMaNhanVien(), 
//                entity.getTenNhanVien(), 
//                entity.getSDT(), 
//                entity.getEmail(),
//                entity.getDiaChi(), 
//                entity.getNgaySinh(), 
//                entity.isGioiTinh(), 
//                entity.getMaChuyenNganh(),
//                entity.getHinh());
//    }
     public void insert(NhanVien entity) {
          
         String sql="INSERT INTO [dbo].[NhanVien] ([MaNhanVien]  ,[TenNhanVien] ,[SDT]  ,[Email]  ,[DiaChi] ,[NgaySinh]  ,[GioiTinh],[MaChuyenNganh] ,[Hinh]) VALUES(?,?,?,?,?,?,?,?,?)";
        XJdbc.update(sql, 
                entity.getMaNhanVien(), 
                entity.getTenNhanVien(), 
                entity.getSDT(), 
                entity.getEmail(),
                entity.getDiaChi(), 
                entity.getNgaySinh(), 
                entity.isGioiTinh(), 
                entity.getMaChuyenNganh(),
                entity.getHinh());
                
    }

    @Override
    public void update(NhanVien entity) {
          String sql="UPDATE [dbo].[NhanVien]SET [TenNhanVien] = ?,[SDT] = ?,[Email] = ? ,[DiaChi] = ?,[NgaySinh] = ? ,[GioiTinh] = ? ,[MaChuyenNganh] = ?  ,[Hinh] = ?\n" +
" WHERE [MaNhanVien] = ? ";
        XJdbc.update(sql, 
                entity.getTenNhanVien(), 
                entity.getSDT(), 
                entity.getEmail(),
                entity.getDiaChi(),
                entity.getNgaySinh(), 
                entity.isGioiTinh(), 
                entity.getMaChuyenNganh(),
                entity.getHinh(),
                entity.getMaNhanVien());
    }

    @Override
    public void delete(String MaNV) {
              String sql="DELETE FROM [dbo].[NhanVien] WHERE MaNhanVien = ?";
        XJdbc.update(sql, MaNV);
    }

    @Override
    public NhanVien selectById(String MaNV) {
                   String sql="SELECT * FROM NhanVien where MaNhanVien = ? ";
     List<NhanVien> list = this.selectBySql(sql, MaNV);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<NhanVien> selectAll() {
               String sql="SELECT * FROM NhanVien";
        return this.selectBySql(sql);
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
     List<NhanVien> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    NhanVien entity=new NhanVien();
                    entity.setMaNhanVien(rs.getString("MaNhanVien"));
                    entity.setTenNhanVien(rs.getString("TenNhanVien"));
                    entity.setSDT(rs.getString("SDT"));
                    entity.setEmail(rs.getString("Email"));
                    entity.setDiaChi(rs.getString("DiaChi"));
                    entity.setNgaySinh(rs.getDate("NgaySinh"));
                    entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                    entity.setMaChuyenNganh(rs.getString("MaChuyenNganh"));     
                    entity.setHinh(rs.getString("Hinh"));
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
    
}
