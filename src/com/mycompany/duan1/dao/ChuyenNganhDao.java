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
     String sql="INSERT INTO [dbo].[ChuyenNganh]([MaChuyenNganh],[TenChuyenNganh])VALUES(?,?)";
        XJdbc.update(sql, 
                entity.getMaChuyenNganh(), 
                entity.getTenChuyenNganh());
    }

    @Override
    public void update(ChuyenNganh entity) {
              String sql="UPDATE [dbo].[ChuyenNganh] SET [TenChuyenNganh] = ? WHERE MaChuyenNganh = ?";
        XJdbc.update(sql, 
                entity.getTenChuyenNganh(),entity.getMaChuyenNganh()
        );
    }

    @Override
    public void delete(String id) {
           String sql="DELETE FROM [dbo].[ChuyenNganh] WHERE MaChuyenNganh = ?";
        XJdbc.update(sql, id);
    }

    @Override
    public ChuyenNganh selectById(String id) {
                         String sql="SELECT * FROM ChuyenNganh where MaChuyenNganh = ?";
     List<ChuyenNganh> list = this.selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
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
         public List<ChuyenNganh> selectByMacn(String id) {
           String sql="SELECT * FROM ChuyenNganh where MaChuyenNganh LIKE ?";
        return this.selectBySql(sql, "%"+id+"%");
    }
    
}
