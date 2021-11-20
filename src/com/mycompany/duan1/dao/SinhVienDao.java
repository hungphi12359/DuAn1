
package com.mycompany.duan1.dao;

import com.mycompany.duan1.X.XJdbc;
import com.mycompany.duan1.model.SinhVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JTextField;

/**
 *
 * @author ADMIN
 */
public class SinhVienDao extends EduSysDAO<SinhVien, String>{

    @Override
    public void insert(SinhVien entity) {
           String sql="INSERT INTO SinhVien(MaSinhVien, TenSinhVien, NgaySinh , Email, SDT, DiaChi, GioiTinh,  MaChuyenNganh, MaLopHoc, Hinh) VALUES(?, ?, ?,?,?, ?,?,?,?, ?)";
        XJdbc.update(sql,  
                entity.getMaSinhVien(), 
                entity.getTenSinhVien(), 
                entity.getNgaySinh(),
                entity.getEmail(),
                entity.getSDT(),
                entity.getDiaChi(),
                entity.isGioiTinh(),
                entity.getMaChuyenNganh(),
                entity.getMaLopHoc(),
                entity.getHinh());
    }

    @Override
    public void update(SinhVien entity) {
         String sql="UPDATE SinhVien SET TenSinhVien= ?, NgaySinh=?, Email=?,SDT=?, DiaChi=?, GioiTinh= ?,MaChuyenNganh=?, MaLopHoc= ?, Hinh = ? WHERE MaSinhVien = ?";
        XJdbc.update(sql, 
                entity.getTenSinhVien(), 
                entity.getNgaySinh(), 
                entity.getEmail(), 
                entity.getSDT(),
        entity.getDiaChi(),
        entity.isGioiTinh(),
 entity.getMaChuyenNganh(),
        entity.getMaLopHoc(),
        entity.getHinh(),
        entity.getMaSinhVien());
    }

    @Override
    public void delete(String MaHV) {
            String sql="DELETE FROM SinhVien WHERE MaSinhVien= ?";
        XJdbc.update(sql, MaHV);
    }

    @Override
    public SinhVien selectById(String MaHV) {
                String sql="SELECT * FROM SinhVien WHERE MaSinhVien= ?";
        List<SinhVien> list = selectBySql(sql, MaHV);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<SinhVien> selectAll() {
             String sql="SELECT * FROM SinhVien";
        return selectBySql(sql);
    }

    @Override
    protected List<SinhVien> selectBySql(String sql, Object... args) {
               List<SinhVien> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    SinhVien entity=new SinhVien();
                    entity.setMaSinhVien(rs.getString("MaSinhVien"));
                    entity.setTenSinhVien(rs.getString("TenSinhVien"));
                    entity.setNgaySinh(rs.getDate("NgaySinh"));
                    entity.setEmail(rs.getString("Email"));
                     entity.setSDT(rs.getString("SDT"));
                    entity.setDiaChi(rs.getString("DiaChi"));
                    entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                    entity.setMaChuyenNganh(rs.getString("MaChuyenNganh"));
                    entity.setMaLopHoc(rs.getString("MaLopHoc"));
                    entity.setHinh(rs.getString("Hinh"));
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
        public List<SinhVien> selectByKeyword(String keyword){
        String sql="SELECT * FROM SinhVien WHERE TenSinhVien like ? ";
        return this.selectBySql(sql, "%"+keyword+"%");
    }
        public List<SinhVien> selectByMaCNLopHocTen(String id){
        String sql="  SELECT * FROM SinhVien WHERE MaSinhVien LIKE ? OR MaChuyenNganh LIKE ? OR MaLopHoc LIKE ? OR TenSinhVien LIKE ?";
        return this.selectBySql(sql, id,id,id,id);
    }
  
}
