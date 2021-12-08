/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.view;

import com.mycompany.duan1.X.MsgBox;
import com.mycompany.duan1.X.Validate;
import com.mycompany.duan1.dao.ChuyenNganhDao;
import com.mycompany.duan1.model.ChuyenNganh;
import java.awt.Color;
import static java.awt.Color.white;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import scrollbar.ScrollBarCustom;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.JTable;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author ADMIN
 */
public class ChuyenNganhJPanel extends javax.swing.JPanel {
 Validate vld = new Validate();
    /**
     * Creates new form ChuyenNganhJPanel
     */
    public ChuyenNganhJPanel() {
        initComponents();
          load();
        fixTable();
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
        maChuyenNganh1 = new textfield.MaChuyenNganh();
        tenChuyenNganh1 = new textfield.TenChuyenNganh();
        btnSua = new rojeru_san.complementos.RSButtonHover();
        btnThem = new rojeru_san.complementos.RSButtonHover();
        btnXoa = new rojeru_san.complementos.RSButtonHover();
        btnMoi = new rojeru_san.complementos.RSButtonHover();
        Scrollbar = new javax.swing.JScrollPane();
        tblchuyennganh = new rojeru_san.complementos.RSTableMetro();
        txttimkiem = new textfield.timkiem();
        btnExel5 = new rojeru_san.complementos.RSButtonHover();
        btnPrint = new rojeru_san.complementos.RSButtonHover();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnSua.setBackground(new java.awt.Color(204, 0, 51));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/Edit.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(204, 0, 51));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/Add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(204, 0, 51));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/Delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnMoi.setBackground(new java.awt.Color(204, 0, 51));
        btnMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/Create.png"))); // NOI18N
        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        tblchuyennganh.setBackground(new java.awt.Color(204, 0, 51));
        tblchuyennganh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã Chuyên Ngành", "Tên Chuyên Ngành"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblchuyennganh.setColorBackgoundHead(new java.awt.Color(204, 0, 51));
        tblchuyennganh.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblchuyennganh.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tblchuyennganh.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tblchuyennganh.setRowHeight(30);
        tblchuyennganh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblchuyennganhMouseClicked(evt);
            }
        });
        Scrollbar.setViewportView(tblchuyennganh);

        txttimkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttimkiemKeyPressed(evt);
            }
        });

        btnExel5.setBackground(new java.awt.Color(204, 0, 51));
        btnExel5.setText("Exel");
        btnExel5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExel5ActionPerformed(evt);
            }
        });

        btnPrint.setBackground(new java.awt.Color(204, 0, 51));
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(maChuyenNganh1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(tenChuyenNganh1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Scrollbar, javax.swing.GroupLayout.PREFERRED_SIZE, 1071, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maChuyenNganh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tenChuyenNganh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnExel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Scrollbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        try {
                          StringBuilder sb = new StringBuilder();
            checkTrungMa(maChuyenNganh1, sb, "Mã Chuyên Ngành Này Đã Tồn Tại Trên Hệ Thống");
            vld.ValidatorNullJText(tenChuyenNganh1, sb, "Tên Chuyên Ngành Không Được Để Trống");
            vld.ValidatorNullJText(maChuyenNganh1, sb, "Mã Chuyên Ngành Không Được Để Trống");


            if (sb.length() > 0) {
                MsgBox.showErrorDialog(jPanel1, sb.toString(), "Đã Xảy Ra Lỗi");
               return;
        }
            update();
        }
            catch (Exception e) {
        }
    
    }//GEN-LAST:event_btnSuaActionPerformed
    public boolean checkTrungMa(JTextField txt, StringBuilder sb, String errorMessage) {
        txt.setBackground(white);
        if (dao.selectById(txt.getText()) == null) {
            return true;
        } else {
            txt.setBackground(Color.red);
            sb.append(errorMessage).append("\n");
            txt.requestFocus();
            return false;
        }
    }
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        try {
               StringBuilder sb = new StringBuilder();
            checkTrungMa(maChuyenNganh1, sb, "Mã Chuyên Ngành Này Đã Tồn Tại Trên Hệ Thống");
            vld.ValidatorNullJText(tenChuyenNganh1, sb, "Tên Chuyên Ngành Không Được Để Trống");
            vld.ValidatorNullJText(maChuyenNganh1, sb, "Mã Chuyên Ngành Không Được Để Trống");


            if (sb.length() > 0) {
                MsgBox.showErrorDialog(jPanel1, sb.toString(), "Đã Xảy Ra Lỗi");
                return;
            }
              insert();
        } catch (Exception e) {
        }
      
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed

        try {
                           StringBuilder sb = new StringBuilder();

            vld.ValidatorNullJText(maChuyenNganh1, sb, "Mã Chuyên Ngành Không Được Để Trống");


            if (sb.length() > 0) {
                MsgBox.showErrorDialog(jPanel1, sb.toString(), "Đã Xảy Ra Lỗi");
                return;
            }
              delete();
        } catch (Exception e) {
        }
      
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
Reset();        // TODO add your handling code here:
     
    }//GEN-LAST:event_btnMoiActionPerformed

    private void tblchuyennganhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblchuyennganhMouseClicked
    if (evt.getClickCount() == 2) {
            row = tblchuyennganh.getSelectedRow();
       
            edit();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_tblchuyennganhMouseClicked

    private void txttimkiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttimkiemKeyPressed
loadByMa();        // TODO add your handling code here:
    }//GEN-LAST:event_txttimkiemKeyPressed

    private void btnExel5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExel5ActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblchuyennganh.getModel();
        FileOutputStream exelFOU = null;
        BufferedOutputStream exelBOU = null;
        XSSFWorkbook exelJtableExporter = null;
        JFileChooser exelfileChooser = new JFileChooser("D:\\duan1\\DuAn1_Khanh\\Exel");
        exelfileChooser.setDialogTitle("Save As");
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("EXEL FILES", "xls", "xlsx", "xlsm");
        exelfileChooser.setFileFilter(fnef);
        int exelChooser = exelfileChooser.showSaveDialog(null);

        if (exelChooser == JFileChooser.APPROVE_OPTION) {

            try {
                exelJtableExporter = new XSSFWorkbook();
                XSSFSheet exelSheet = exelJtableExporter.createSheet("JTable Sheet");
                for (int i = 0; i < model.getRowCount(); i++) {
                    XSSFRow exelRow = exelSheet.createRow(i);

                    for (int j = 0; j < model.getColumnCount(); j++) {
                        XSSFCell exelCell = exelRow.createCell(j);
                        exelCell.setCellValue(model.getValueAt(i, j).toString());
                    }

                }
                exelFOU = new FileOutputStream(exelfileChooser.getSelectedFile() + ".xls");
                exelBOU = new BufferedOutputStream(exelFOU);
                exelJtableExporter.write(exelBOU);
                JOptionPane.showMessageDialog(this, "Export Successfully !");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(SinhVienJPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(SinhVienJPanel.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    if(exelBOU != null){
                        exelBOU.close();
                    }
                    if(exelFOU != null){
                        exelFOU.close();
                    }
                    if(exelJtableExporter != null){

                    }
                } catch (IOException ex) {

                    Logger.getLogger(SinhVienJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnExel5ActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        MessageFormat header  = new MessageFormat("Item report");

        try {
            tblchuyennganh.print(JTable.PrintMode.NORMAL, header, null);
            JFileChooser pdfChooser = new JFileChooser("D:\\duan1\\DuAn1_Khanh\\Print");
            pdfChooser.setDialogTitle("Save As");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btnPrintActionPerformed
    ChuyenNganh getForm() {
        ChuyenNganh cn = new ChuyenNganh();
        cn.setMaChuyenNganh(maChuyenNganh1.getText());
        cn.setTenChuyenNganh(tenChuyenNganh1.getText());
return cn;

    }
    ChuyenNganhDao dao = new ChuyenNganhDao();
    int row = -1;
        void edit() {
        String ChuyenNganh = (String) tblchuyennganh.getValueAt(row, 0);
        ChuyenNganh nv = dao.selectById(ChuyenNganh);
        setForm(nv);
    }
            void setForm(ChuyenNganh nv) {
        maChuyenNganh1.setText(nv.getMaChuyenNganh());
        tenChuyenNganh1.setText(nv.getTenChuyenNganh());
  
    }
                void loadByMa() {
        try {
            DefaultTableModel model = (DefaultTableModel) tblchuyennganh.getModel();
            model.setRowCount(0);
            String MaCN = txttimkiem.getText();
            List<ChuyenNganh> list = dao.selectByMacn(MaCN);
            for (ChuyenNganh nv : list) {
                Object[] row = {
                    nv.getMaChuyenNganh(),
                    nv.getTenChuyenNganh(),
                  
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu!");
        }
    }
                   void load() {
        DefaultTableModel model = (DefaultTableModel) tblchuyennganh.getModel();
        model.setRowCount(0);
        try {
            List<ChuyenNganh> list = dao.selectAll();
            for (ChuyenNganh nv : list) {
                Object[] row = {
                    nv.getMaChuyenNganh(),
                    nv.getTenChuyenNganh(),
             
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void insert() {
        ChuyenNganh nv1 = getForm();
        try {
            dao.insert(nv1);
            load();
            Reset();
            JOptionPane.showMessageDialog(this, "Thêm thành công");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        void delete() {
        String MaChuyenNganh = maChuyenNganh1.getText();
        try {
            dao.delete(MaChuyenNganh);
            load();
            Reset();
            JOptionPane.showMessageDialog(this, "Xoá thành công");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Xoá thất bại");
        }
    }
            void update() {
        ChuyenNganh model = getForm();
        try {
            dao.update(model);
            Reset();
            JOptionPane.showMessageDialog(this, "Cập nhật thành công");
            load();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void Reset() {
        maChuyenNganh1.setText("");
        tenChuyenNganh1.setText("");
    tenChuyenNganh1.setBackground(Color.white);
        maChuyenNganh1.setBackground(Color.white);
    }
      void fixTable() {
        Scrollbar.getViewport().setBackground(Color.WHITE);
        Scrollbar.setVerticalScrollBar(new ScrollBarCustom());
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        Scrollbar.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        Scrollbar.setBorder(new EmptyBorder(5, 10, 5, 10));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Scrollbar;
    private rojeru_san.complementos.RSButtonHover btnExel1;
    private rojeru_san.complementos.RSButtonHover btnExel2;
    private rojeru_san.complementos.RSButtonHover btnExel3;
    private rojeru_san.complementos.RSButtonHover btnExel4;
    private rojeru_san.complementos.RSButtonHover btnExel5;
    private rojeru_san.complementos.RSButtonHover btnMoi;
    private rojeru_san.complementos.RSButtonHover btnPrint;
    private rojeru_san.complementos.RSButtonHover btnSua;
    private rojeru_san.complementos.RSButtonHover btnThem;
    private rojeru_san.complementos.RSButtonHover btnXoa;
    private javax.swing.JPanel jPanel1;
    private textfield.MaChuyenNganh maChuyenNganh1;
    private rojeru_san.complementos.RSTableMetro tblchuyennganh;
    private textfield.TenChuyenNganh tenChuyenNganh1;
    private textfield.timkiem txttimkiem;
    // End of variables declaration//GEN-END:variables
}
