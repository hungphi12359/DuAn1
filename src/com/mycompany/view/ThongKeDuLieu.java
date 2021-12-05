/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.view;

import ThongKePackage.QuanLyThongKeController;
import com.mycompany.duan1.X.Auth;
import com.mycompany.duan1.controller.Chuyenmanhinhcontroller;
import company.form.main;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author ADMIN
 */
public class ThongKeDuLieu extends javax.swing.JPanel {

    /**
     * Creates new form ThongKeDuLieu
     */
    public ThongKeDuLieu() {
        initComponents();
       
        QuanLyThongKeController controller = new  QuanLyThongKeController();
        controller.setDatatoChart1(jpnView1);
        controller.setDatatoChart3(jpnview2);
        if(Auth.isSinhVien()){
            this.Tabs.setEnabledAt(0, false);
            this.Tabs.setSelectedIndex(1);
           
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Tabs = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jpnView1 = new javax.swing.JPanel();
        jpnview2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_BangDiem = new rojeru_san.complementos.RSTableMetro();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jpnView1Layout = new javax.swing.GroupLayout(jpnView1);
        jpnView1.setLayout(jpnView1Layout);
        jpnView1Layout.setHorizontalGroup(
            jpnView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
        );
        jpnView1Layout.setVerticalGroup(
            jpnView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        jPanel2.add(jpnView1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1090, 290));

        javax.swing.GroupLayout jpnview2Layout = new javax.swing.GroupLayout(jpnview2);
        jpnview2.setLayout(jpnview2Layout);
        jpnview2Layout.setHorizontalGroup(
            jpnview2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
        );
        jpnview2Layout.setVerticalGroup(
            jpnview2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        jPanel2.add(jpnview2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 1090, 410));

        Tabs.addTab("THỐNG KÊ", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tbl_BangDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Học Kỳ", "Môn", "Mã MH", "Điểm", "Trạng thái"
            }
        ));
        tbl_BangDiem.setColorBackgoundHead(new java.awt.Color(204, 0, 51));
        tbl_BangDiem.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tbl_BangDiem.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tbl_BangDiem.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tbl_BangDiem.setColorSelBackgound(new java.awt.Color(0, 0, 0));
        tbl_BangDiem.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbl_BangDiem.setRowHeight(40);
        tbl_BangDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_BangDiemMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_BangDiem);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1078, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
                .addContainerGap())
        );

        Tabs.addTab("BẢNG ĐIỂM", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tabs)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_BangDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_BangDiemMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_BangDiemMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Tabs;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel jpnView1;
    private javax.swing.JPanel jpnview2;
    private rojeru_san.complementos.RSTableMetro tbl_BangDiem;
    // End of variables declaration//GEN-END:variables
}
