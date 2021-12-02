/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.duan1.dao;


import com.mycompany.duan1.X.DatabaseConnection;
import com.mycompany.duan1.X.XJdbc;
import com.mycompany.duan1.model.MonHoc;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
import java.sql.ResultSet;
/**
 *
 * @author Admin
 */
public class MonHocDao extends EduSysDAO<MonHoc, String>{
final String INSERT_SQL = "INSERT INTO [dbo].[MonHoc]([MaMonHoc],[TenMonHoc],[NgayBatDau],[NgayKetThuc],[MaChuyenNganh],[MaNhanVien] ,[HocPhi],[HocKy])VALUES(? ,?,?,? ,? ,?,?,?)";
final String UPDATE_SQL = "UPDATE [dbo].[MonHoc] SET [TenMonHoc] = ?,[NgayBatDau]=?,[NgayKetThuc]=?,[MaChuyenNganh]=?,[MaNhanVien]=?,[HocPhi]=?,[HocKy]=? WHERE [MaMonHoc] = ?";
final String DELETE_SQL = "DELETE FROM [dbo].[MonHoc] WHERE [MaMonHoc] = ?  ";
final String SELECT_ALL_SQL = "SELECT*FroM [dbo].[MonHoc]";
final String SELECT_BY_ID_SQL = "SELECT * FROM [dbo].[MonHoc] WHERE [MaMonHoc] = ? ";
final String SELECT_BY_ID_MaChuyenNganh = "select * from MonHoc where MaChuyenNganh like ?";
    @Override
    public void insert(MonHoc entity) {
       XJdbc.update(INSERT_SQL, entity.getMaMonHoc(), entity.getTenMonHoc()
               ,entity.getNgayBatDau(),entity.getNgayKetThuc()
               ,entity.getMaChuyenNganh(),entity.getMaNhanVien()
               ,entity.getHocPhi(),entity.getHocKy()
               
       );
    }
///ok đc rồi chỉ sai vị trí thôi
    // ok ông, phiền ông quá, nghỉ ngơi nhé 
    //okcamr ơn ông

    @Override
    public void update(MonHoc entity) {
        XJdbc.update(UPDATE_SQL,  entity.getTenMonHoc()
               ,entity.getNgayBatDau(),entity.getNgayKetThuc()
               ,entity.getMaChuyenNganh(),entity.getMaNhanVien()
               ,entity.getHocPhi(),entity.getHocKy(), entity.getMaMonHoc()
               
       );
  
    }

    @Override
    public void delete(String id) {
         XJdbc.update(DELETE_SQL,id);
        
    }

    @Override
    public MonHoc selectById(String id) 
    {
//        List<MonHoc> list = selectById(SELECT_BY_ID_SQL, id);
        List<MonHoc> list = selectBySql(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return  null;
        }
        return list.get(0);
    }

    @Override
    public List<MonHoc> selectAll() {
     String sql="SELECT * FROM MonHoc";
        return this.selectBySql(sql);
    }

    @Override
    protected List<MonHoc> selectBySql(String sql, Object... args) {
         List<MonHoc> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    MonHoc entity=new MonHoc();
                    entity.setMaMonHoc(rs.getString("MaMonHoc"));
                    entity.setTenMonHoc(rs.getString("TenMonHoc"));
                    entity.setNgayBatDau(rs.getDate("NgayBatDau"));
                    entity.setNgayKetThuc(rs.getDate("NgayKetThuc"));
                     entity.setMaChuyenNganh(rs.getString("MaChuyenNganh"));
                    entity.setMaNhanVien(rs.getString("MaNhanVien"));
                    entity.setHocPhi(rs.getFloat("HocPhi"));
                    entity.setHocKy(rs.getString("HocKy"));
                     
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
  public List<MonHoc> selectByChuyenNganh(String MaCN){
        String sql="select * from MonHoc where MaChuyenNganh like ?";
        return this.selectBySql(sql, MaCN);
    }
    public List<MonHoc> selectByHocKy(String MaHK){
        String sql="select * from MonHoc where HocKy like ?";
        return this.selectBySql(sql, MaHK);
    }
    
    
}
