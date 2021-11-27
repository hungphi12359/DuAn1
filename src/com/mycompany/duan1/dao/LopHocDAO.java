/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.duan1.dao;

import com.mycompany.duan1.X.XJdbc;
import com.mycompany.duan1.model.LopHoc;
import com.mycompany.duan1.model.NhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class LopHocDAO extends EduSysDAO<LopHoc, String>{

   
    @Override
    public void insert(LopHoc entity) {
         String sql="INSERT INTO [dbo].[LopHoc] ([MaLopHoc] ,[TenLopHoc],[MaNhanVien],[NgayDangKy]) VALUES(?  ,?,? ,? ,?)";
        XJdbc.update(sql, 
                entity.getMaLopHoc(), 
                entity.getTenLopHoc(), 
        
                entity.getMaNhanVien(),
                entity.getNgayDangKy());
    }

    @Override
    public void update(LopHoc entity) {
          String sql="UPDATE [dbo].[LopHoc] SET [TenLopHoc] = ?,[MaNhanVien] = ?,[NgayDangKy] = ?  WHERE [MaLopHoc] = ?";
        XJdbc.update(sql, 
             entity.getTenLopHoc(), 
   
                entity.getMaNhanVien(), 
                entity.getNgayDangKy(),
                    entity.getMaLopHoc());
    }

    @Override
    public void delete(String MaLH) {
              String sql="DELETE FROM [dbo].[LopHoc] WHERE MaLopHoc = ?";
        XJdbc.update(sql, MaLH);
    }

    @Override
    public LopHoc selectById(String MaLH) {
                   String sql="SELECT * FROM LopHoc where MaLopHoc = ? ";
     List<LopHoc> list = this.selectBySql(sql, MaLH);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<LopHoc> selectAll() {
             String sql="SELECT * FROM LopHoc";
        return this.selectBySql(sql);
    }

    @Override
    protected List<LopHoc> selectBySql(String sql, Object... args) {
     List<LopHoc> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    LopHoc entity=new LopHoc();
                    entity.setMaLopHoc(rs.getString("MaLopHoc"));
                    entity.setTenLopHoc(rs.getString("TenLopHoc"));
             
                    entity.setMaNhanVien(rs.getString("MaNhanVien"));
                    entity.setNgayDangKy(rs.getDate("NgayDangKy"));
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
         public List<LopHoc> selectByChuyenNganh(String MaCN){
        String sql="select * from LopHoc where MaChuyenNganh like ?";
        return this.selectBySql(sql, MaCN);
    }
    
  
}

