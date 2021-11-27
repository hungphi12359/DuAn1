/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThongKePackage;

import com.mycompany.duan1.X.XJdbc;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ADMIN
 */
public class ThongKeDaoImpl implements ThongKeDao{

    @Override
    public List<LopHocBean> getListByLopHoc() {
        try {
            Connection cons = XJdbc.getConnection();
            String sql = "select NgayDangKy, TenLopHoc  from LopHoc group by NgayDangKy,TenLopHoc";
            List<LopHocBean> list = new ArrayList<>();
            PreparedStatement ps = cons.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                LopHocBean lopHocBean = new LopHocBean(); lopHocBean.setNgayDangKy(rs.getDate("NgayDangKy"));
                lopHocBean.setTenLopHoc(rs.getString("TenLopHoc"));
                list.add(lopHocBean);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public List<MonHocBean> getListByDoanhThu() {
         try {
            Connection cons = XJdbc.getConnection();
            String sql = " select HocPhi,MaMonHoc,NgayBatDau,NgayKetThuc,HocKy from MonHoc where HocKy like 'fall2021' ";
            List<MonHocBean> list = new ArrayList<>();
            PreparedStatement ps = cons.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                MonHocBean monHocBean = new MonHocBean();
                monHocBean.setHocPhi(rs.getFloat("HocPhi"));
                monHocBean.setMaMonHoc(rs.getString("MaMonHoc"));
                monHocBean.setNgayBatDau(rs.getDate("NgayBatDau"));
                monHocBean.setNgayKetThuc(rs.getDate("NgayKetThuc"));
                monHocBean.setHocKy(rs.getString("HocKy"));
                list.add(monHocBean);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
}
