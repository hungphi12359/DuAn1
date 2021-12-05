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
            String sql = "SELECT  SinhVien.MaLopHoc , LopHoc.NgayDangKy, COUNT(SinhVien.MaLopHoc) AS 'Số Lượng Sinh Viên' FROM SinhVien   INNER JOIN LopHoc  ON SinhVien.MaLopHoc = LopHoc.MaLopHoc GROUP BY SinhVien.MaLopHoc, LopHoc.NgayDangKy";
            List<LopHocBean> list = new ArrayList<>();
            PreparedStatement ps = cons.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                LopHocBean lopHocBean = new LopHocBean();
                lopHocBean.setMaLopHoc(rs.getString("MaLopHoc"));
                lopHocBean.setNgayDangKy(rs.getDate("NgayDangKy"));
                
                lopHocBean.setSoLuongSinhVien(rs.getInt("Số Lượng Sinh Viên"));
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
            String sql = " select sum(TongTien) as N'HocPhi', NgayTaoHD, HocKy from HoaDon group by NgayTaoHD, HocKy";
            List<MonHocBean> list = new ArrayList<>();
            PreparedStatement ps = cons.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                MonHocBean monHocBean = new MonHocBean();
                monHocBean.setHocPhi(rs.getDouble("HocPhi"));
                monHocBean.setNgayTaoHD(rs.getDate("NgayTaoHD"));
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
