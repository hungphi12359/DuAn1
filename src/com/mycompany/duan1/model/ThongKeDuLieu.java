/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duan1.model;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.IntervalCategoryDataset;

/**
 *
 * @author ADMIN
 */
public class ThongKeDuLieu extends JPanel {
    public ThongKeDuLieu(){
        setLayout(new BorderLayout());
    }
    public void setDataser(IntervalCategoryDataset dataset, String title, String x_label, String y_label){
        removeAll();
        JFreeChart chart = ChartFactory.createGanttChart(title, y_label, x_label, dataset);
        ChartPanel panel = new ChartPanel(chart);
        add(panel);
        repaint();
        revalidate();
    }
}
