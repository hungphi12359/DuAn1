/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThongKePackage;

import java.util.List;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author ADMIN
 */
public class ThongKeServiceImpl implements ThongKeService{
private ThongKeDao thongkeDAO = null;

    public ThongKeServiceImpl() {
        thongkeDAO = new ThongKeDaoImpl();
    }

    @Override
    public List<LopHocBean> getListByLopHoc() {
      return thongkeDAO.getListByLopHoc();
    }

    @Override
    public List<MonHocBean> getListByDoanhThu() {
       return  thongkeDAO.getListByDoanhThu();
    }
    
}
