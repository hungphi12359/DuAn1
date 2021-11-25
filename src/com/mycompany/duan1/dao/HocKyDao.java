/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duan1.dao;

import com.mycompany.duan1.X.XJdbc;
import com.mycompany.duan1.model.HocKy;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author ADMIN
 */
public class HocKyDao extends EduSysDAO<HocKy, String> {

    @Override
    public void insert(HocKy entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(HocKy entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HocKy selectById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<HocKy> selectAll() {
           String sql = "SELECT * FROM HocKy";
        return this.selectBySql(sql);
    }

    @Override
    protected List<HocKy> selectBySql(String sql, Object... args) {
                List<HocKy> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    HocKy entity = new HocKy();
                    entity.setMaHocKy(rs.getString("MaHocKy"));
                    entity.setTenHocKy(rs.getString("TenHocKy"));
        
                    list.add(entity);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }
    
}
