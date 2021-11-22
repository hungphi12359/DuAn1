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
                        String sql="SELECT * FROM LichHoc where MaLopHoc = ? ";
     List<LichHoc> list = this.selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<LichHoc> selectAll() {
                    String sql="select * from LichHoc";
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
                     entity.setMaLichHoc(rs.getInt("MaLichHoc"));
                    entity.setNgay(rs.getString("Ngay"));
                    entity.setThoiGian(rs.getString("ThoiGian"));
                    entity.setMaMonHoc(rs.getString("MaMonHoc"));
                    entity.setMaLopHoc(rs.getString("MaLopHoc"));
                    entity.setMaChuyenNganh(rs.getString("MaChuyenNganh"));
                    entity.setMaNhanVien(rs.getString("MaNhanVien"));
                    entity.setMaPhongHoc(rs.getString("MaPhongHoc"));
                    entity.setTenMonHoc(rs.getString("TenMonHoc"));
                    
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
   
      public LichHoc selectByMaLH(Integer MaLH){
        String sql="select * from LichHoc where MaLichHoc like ?";
           List<LichHoc> list = this.selectBySql(sql, MaLH);
        return list.size() > 0 ? list.get(0) : null;
    }
        public LichHoc selectByThoiGian(String thoigian){
        String sql="select * from LichHoc where ThoiGian like  ?";
           List<LichHoc> list = this.selectBySql(sql, thoigian);
        return list.size() > 0 ? list.get(0) : null;
    }


          public List<LichHoc> selectByMaLopHoc(String id) {
           String sql="select * from LichHoc where MaLopHoc like ?";
        return this.selectBySql(sql, "%"+id+"%");
    }
}
