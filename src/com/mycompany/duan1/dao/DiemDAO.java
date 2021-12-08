/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.duan1.dao;

import com.mycompany.duan1.X.XJdbc;
import com.mycompany.duan1.model.Diem;
import com.mycompany.duan1.model.MonHoc;
import com.mycompany.duan1.model.SinhVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */


  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ACER
 */
public class DiemDAO extends EduSysDAO<Diem, String> {

    @Override
    public void insert(Diem entity) {
          String sql="INSERT INTO [dbo].[DIEM]([DiemLab1],[DiemLab2],[DiemLab3],[DiemLab4],[DiemLab5],[DiemLab6],[DiemLab7],[DiemLab8] ,[DiemAssgnmentGD1],[DiemAssgnmentGD2],[DiemDoc],[MaSV],[MaMH])VALUES (?,? ,?,?,? ,?,?,? ,? ,? ,? ,?,?)";
          XJdbc.update(sql, 
                  entity.getDiemLab1()
                  ,entity.getDiemLab2()
                  ,entity.getDiemLab3()
                  ,entity.getDiemLab4()
                  ,entity.getDiemLab5()
                  ,entity.getDiemLab6()
                  ,entity.getDiemLab7()
                  ,entity.getDiemLab8()
                  ,entity.getDiemAsmGD1()
                  ,entity.getDiemAsmGD2()
                  ,entity.getDiemDoc()
               
                  ,entity.getMaSV()
                  ,entity.getMaMH());
    }

    @Override
    public void update(Diem entity) {
         String sql="UPDATE [dbo].[DIEM] SET [DiemLab1] = ?,[DiemLab2] = ?,[DiemLab3] = ? ,[DiemLab4] = ?,[DiemLab5] = ? ,[DiemLab6] = ?,[DiemLab7] = ?,[DiemLab8] = ?,[DiemAssgnmentGD1] = ?,[DiemAssgnmentGD2] = ?,[DiemDoc] = ?,[MaSV] = ? ,[MaMH] = ? WHERE MaDiem = ?";
         XJdbc.update(sql, 
                 entity.getDiemLab1(), 
                 entity.getDiemLab2(), 
                 entity.getDiemLab3(),
                 entity.getDiemLab4(),
                 entity.getDiemLab5(),
                   entity.getDiemLab6(),
                     entity.getDiemLab7(),
                       entity.getDiemLab8(),
                         entity.getDiemAsmGD1(),
                           entity.getDiemAsmGD2(),
                             entity.getDiemDoc(),
                            
                                 entity.getMaSV(),
                                   entity.getMaMH(),
                 entity.getMaDiem());
    }

    @Override
    public void delete(String id) {
                String sql="DELETE FROM [dbo].[DIEM] WHERE MaDiem = ?";
        XJdbc.update(sql, id);
    }
       public void delete2(int id) {
                String sql="DELETE FROM [dbo].[DIEM] WHERE MaDiem = ?";
        XJdbc.update(sql, id);
    }

    @Override
    public Diem selectById(String id) {
                         String sql="select * from DIEM where MaDiem = ?";
     List<Diem> list = this.selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }
     public Diem selectByMaDiem(Integer id) {
                         String sql="select * from DIEM where MaDiem = ?";
     List<Diem> list = this.selectBySql(sql, id);
return list.size() > 0 ? list.get(0) : null;
    }
       public List<Diem> selectByMaSV(String id) {
           String sql="select * from DIEM where MaSV like ?";
        return this.selectBySql(sql, "%"+id+"%");
    }

    @Override
    public List<Diem> selectAll() {
           String sql="SELECT * FROM DIEM";
        return this.selectBySql(sql);
    }

    @Override
    protected List<Diem> selectBySql(String sql, Object... args) {
       List<Diem> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    Diem entity=new Diem();
                    entity.setMaDiem(rs.getInt("MaDiem"));
                    entity.setDiemLab1(rs.getFloat("DiemLab1"));
                    entity.setDiemLab2(rs.getFloat("DiemLab2"));
                    entity.setDiemLab3(rs.getFloat("DiemLab3"));
                    entity.setDiemLab4(rs.getFloat("DiemLab4"));
                    entity.setDiemLab5(rs.getFloat("DiemLab5"));
                    entity.setDiemLab6(rs.getFloat("DiemLab6"));
                    entity.setDiemLab7(rs.getFloat("DiemLab7"));
                    entity.setDiemLab8(rs.getFloat("DiemLab8"));
                    entity.setDiemAsmGD1(rs.getFloat("DiemAssgnmentGD1"));
                    entity.setDiemAsmGD2(rs.getFloat("DiemAssgnmentGD2"));
                    entity.setDiemDoc(rs.getFloat("DiemDoc"));
                    entity.setMaSV(rs.getString("MaSV"));
                    entity.setMaMH(rs.getString("MaMH"));
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

          public List<Diem> selectByMaSVandMaMonHoc(String MaHV, String MaMonHoc) {
        String sql = "SELECT * FROM DIEM WHERE MaSV LIKE ? and MaMH like ?";
           return this.selectBySql(sql, MaHV, MaMonHoc);
    }


}