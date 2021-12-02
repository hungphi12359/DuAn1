/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThongKePackage;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.gantt.Task;
import org.jfree.data.gantt.TaskSeries;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author ADMIN
 */
public class QuanLyThongKeController {
    private ThongKeService thongKeService = null;
    public QuanLyThongKeController(){
        thongKeService = new ThongKeServiceImpl();
    }
    public  void setDatatoChart1(JPanel jpnItem){
        List<LopHocBean> listItem = thongKeService.getListByLopHoc();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (LopHocBean item : listItem) {
            dataset.setValue(item.getSoLuongSinhVien(), item.getNgayDangKy(),item.getMaLopHoc());
        }
        JFreeChart chart =  ChartFactory.createBarChart("Thống Kê Số Lượng Sinh Viên Đăng Ký", "Thời Gian", "Số Lượng", dataset,PlotOrientation.VERTICAL,true,true,false);
        ChartPanel chartPanel = new ChartPanel(chart);
                    CategoryPlot categoryPlot = chart.getCategoryPlot();
        chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 300));
        jpnItem.removeAll();
        jpnItem.setLayout(new CardLayout());
        jpnItem.add(chartPanel);
        jpnItem.validate();
        jpnItem.repaint();
              categoryPlot.setBackgroundPaint(Color.WHITE);
    }
    public void setDataToChart2(JPanel jpnItem){
        List<MonHocBean> listItem = thongKeService.getListByDoanhThu();
        if((listItem != null)){
            TaskSeriesCollection ts = new TaskSeriesCollection();
            TaskSeries taskSeries;
            Task task;
            for (MonHocBean item : listItem) {
                taskSeries = new TaskSeries(item.getMaMonHoc());
                task = new Task(String.valueOf(item.getHocPhi()),item.getNgayBatDau(), item.getNgayKetThuc());
                taskSeries.add(task);
                ts.add(taskSeries);
            }
            JFreeChart chart = ChartFactory.createGanttChart("Doanh Thu Theo Từng Môn Học", "Môn Học", "Năm", ts);

            ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(),300));
            jpnItem.removeAll();
            jpnItem.setLayout(new CardLayout());
      
            jpnItem.add(chartPanel);
            jpnItem.validate();
            jpnItem.repaint();
        }
    }
   public  void setDatatoChart3(JPanel jpnItem){
        List<MonHocBean> listItem = thongKeService.getListByDoanhThu();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (MonHocBean item : listItem) {
            dataset.setValue(item.getHocPhi(), item.getNgayTaoHD(),item.getHocKy());
        }
        JFreeChart chart =  ChartFactory.createBarChart("Thống Kê Doanh Thu Theo Các Ngày,Các Kỳ", "Kỳ Học", "Doanh Thu Đạt Được", dataset,PlotOrientation.VERTICAL,true,true,false);
//        ChartPanel chartPanel = new ChartPanel(chart);
//        chartPanel.setVisible(true);
//        chartPanel.setSize(1050,300);
//         ChartPanel     chartPanel1 = new ChartPanel(chart);
//         jpnItem.removeAll();
//         jpnItem.add(chartPanel);
//         jpnItem.updateUI();
        CategoryPlot categoryPlot = chart.getCategoryPlot();
        //categoryPlot.setRangeGridlinePaint(Color.BLUE);
        categoryPlot.setBackgroundPaint(Color.WHITE);
        BarRenderer renderer = (BarRenderer) categoryPlot.getRenderer();
        Color clr3 = new Color(204,0,51);
        renderer.setSeriesPaint(0, clr3);
        
        ChartPanel barpChartPanel = new ChartPanel(chart);
        jpnItem.removeAll();
                barpChartPanel.setSize(1100,300);
        jpnItem.add(barpChartPanel, BorderLayout.CENTER);
        jpnItem.validate();
   
        jpnItem.repaint();

    }
    

}
