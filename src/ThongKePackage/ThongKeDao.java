/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThongKePackage;

import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface ThongKeDao {
    public List<LopHocBean> getListByLopHoc();
    public List<MonHocBean> getListByDoanhThu();
}
