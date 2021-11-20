/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duan1.dao;
import java.sql.SQLException;
import com.mycompany.duan1.X.XJdbc;
import com.mycompany.duan1.model.ChuyenNganh;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
/**
 *
 * @author ADMIN
 */
public class ChuyenNganhDao  extends EduSysDAO<ChuyenNganh, String>{

    @Override
    public void insert(ChuyenNganh entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(ChuyenNganh entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ChuyenNganh selectById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ChuyenNganh> selectAll() {
        String sql="select * from ChuyenNganh";
        return this.selectBySql(sql);
    }

    @Override
    protected List<ChuyenNganh> selectBySql(String sql, Object... args) {
        List<ChuyenNganh> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    ChuyenNganh entity=new ChuyenNganh();
                    entity.setMaChuyenNganh(rs.getString("MaChuyenNganh"));
                    entity.setTenChuyenNganh(rs.getString("TenChuyenNganh"));
               
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
