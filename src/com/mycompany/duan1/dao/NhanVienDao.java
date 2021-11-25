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

/**
 *
 * @author ADMIN
 */
public class NhanVienDao extends EduSysDAO<NhanVien, String>{

    @Override
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
          String sql="UPDATE [dbo].[NhanVien] SET [TenNhanVien] = ?,[SDT] = ?,[Email] = ? ,[DiaChi] = ?,[NgaySinh] = ? ,[GioiTinh] = ? ,[MaChuyenNganh] = ?,[Hinh] = ? WHERE [MaNhanVien] = ? ";
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
       public List<NhanVien> selectByMaNV(String id) {
           String sql="select * from NhanVien where MaNhanVien like ?";
        return this.selectBySql(sql, "%"+id+"%");
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
  public List<NhanVien> selectTnByMaNV(String id) {
           String sql="  select TenNhanVien from NhanVien where MaNhanVien like ?";
       return this.selectBySql(sql, "%"+id+"%");
    }
    public List<NhanVien> selectByMaCN(String id) {
        String sql = "  select * from NhanVien where MaChuyenNganh like ?";
        return this.selectBySql(sql, id);
    }
    
}
