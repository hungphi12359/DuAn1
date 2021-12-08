/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.view;

import com.mycompany.duan1.X.MsgBox;
import com.mycompany.duan1.X.Validate;
import com.mycompany.duan1.dao.ChuyenNganhDao;
import com.mycompany.duan1.dao.LopHocDAO;
import com.mycompany.duan1.dao.NhanVienDao;
import com.mycompany.duan1.dao.SinhVienDao;
import com.mycompany.duan1.model.ChuyenNganh;
import com.mycompany.duan1.model.LopHoc;
import com.mycompany.duan1.model.NhanVien;
import java.awt.Color;
import static java.awt.Color.red;
import static java.awt.Color.white;
import java.util.List;
import javax.swing.JOptionPane;
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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author Admin
 */
public class QuanLyLopHoc extends javax.swing.JPanel {
    SinhVienDao svDao = new SinhVienDao();
    Validate vld = new Validate();
    public static String MaLH = null;
    /**
     * Creates new form quanlilophoc
     */
    public QuanLyLopHoc() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Scrollbar = new javax.swing.JScrollPane();
        tblbang = new rojeru_san.complementos.RSTableMetro();
        jPanel1 = new javax.swing.JPanel();
        jdcNgayDangKy = new com.toedter.calendar.JDateChooser();
        txtmalh = new textfield.MaLopHoc();
        jLabel3 = new javax.swing.JLabel();
        txttenlh = new textfield.TenLopHoc();
        btnnew = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover3 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover2 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover1 = new rojeru_san.complementos.RSButtonHover();
        btnExel5 = new rojeru_san.complementos.RSButtonHover();
        btnPrint = new rojeru_san.complementos.RSButtonHover();
        cbbMaNhanVien = new combobox.MaNhanVien();
        RDONOTHD = new javax.swing.JRadioButton();
        RDOHD = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        cbbCHuyenNganh = new combobox.CBBMaChuyenNganh();
        timkiem1 = new textfield.timkiem();

        setBackground(new java.awt.Color(255, 255, 255));

        tblbang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã lớp học", "Tên lớp học", "Số lượng sinh viên", "Mã nhân viên", "Ngày đăng kí", "Mã Chuyên Ngành", "Trạng Thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblbang.setColorBackgoundHead(new java.awt.Color(204, 0, 51));
        tblbang.setColorBordeFilas(new java.awt.Color(153, 153, 153));
        tblbang.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblbang.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tblbang.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tblbang.setColorSelBackgound(new java.awt.Color(204, 204, 204));
        tblbang.setFuenteHead(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tblbang.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblbang.setRowHeight(35);
        tblbang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblbangMouseClicked(evt);
            }
        });
        Scrollbar.setViewportView(tblbang);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "QUẢN LÝ LỚP HỌC", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jdcNgayDangKy.setDateFormatString("dd/MM/yyyy");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Ngày đăng kí");

        btnnew.setBackground(new java.awt.Color(204, 0, 51));
        btnnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/Pencil-icon.png"))); // NOI18N
        btnnew.setText("Tạo mới");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });

        rSButtonHover3.setBackground(new java.awt.Color(204, 0, 51));
        rSButtonHover3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/delete-icon.png"))); // NOI18N
        rSButtonHover3.setText("Xóa lớp học");
        rSButtonHover3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover3ActionPerformed(evt);
            }
        });

        rSButtonHover2.setBackground(new java.awt.Color(204, 0, 51));
        rSButtonHover2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/edit_property_24px.png"))); // NOI18N
        rSButtonHover2.setText("Cập nhật lớp học");
        rSButtonHover2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover2ActionPerformed(evt);
            }
        });

        rSButtonHover1.setBackground(new java.awt.Color(204, 0, 51));
        rSButtonHover1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/add_user_group_woman_man_24px.png"))); // NOI18N
        rSButtonHover1.setText("Thêm lớp học");
        rSButtonHover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover1ActionPerformed(evt);
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

        buttonGroup1.add(RDONOTHD);
        RDONOTHD.setText("Không HD");

        buttonGroup1.add(RDOHD);
        RDOHD.setSelected(true);
        RDOHD.setText("Đang HD");

        jLabel1.setText("Trạng Thái");

        cbbCHuyenNganh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbCHuyenNganhActionPerformed(evt);
            }
        });

        timkiem1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                timkiem1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                timkiem1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSButtonHover1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rSButtonHover2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rSButtonHover3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnnew, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtmalh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbbMaNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(txttenlh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jdcNgayDangKy, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(RDOHD)
                                        .addGap(18, 18, 18)
                                        .addComponent(RDONOTHD))
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(timkiem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(688, 688, 688)
                        .addComponent(cbbCHuyenNganh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(126, 126, 126))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmalh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttenlh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbbMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RDOHD)
                            .addComponent(RDONOTHD))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jdcNgayDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(cbbCHuyenNganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(timkiem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rSButtonHover2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rSButtonHover1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rSButtonHover3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnnew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnExel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Scrollbar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Scrollbar, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    public boolean checkTrungMa(JTextField txt, StringBuilder sb, String errorMessage) {
        txt.setBackground(white);
        if (lopHocDAO.selectById(txt.getText()) == null) {
            return true;
        } else {
            txt.setBackground(Color.red);
            sb.append(errorMessage).append("\n");
            txt.requestFocus();
            return false;
        }
    }
    private void rSButtonHover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover1ActionPerformed
        try {
              StringBuilder sb = new StringBuilder();
            checkTrungMa(txtmalh, sb, "Mã Lớp Học Đã Tồn Tại Trên Hệ Thống");
            vld.ValidatorNullJText(txtmalh, sb, "Mã Lớp Học Không Được Để Trống");
            vld.ValidatorNullJText(txttenlh, sb, "Tên Lớp Học Không Được Để Trống");

            if (sb.length() > 0) {
                MsgBox.showErrorDialog(jPanel1, sb.toString(), "Đã Xảy Ra Lỗi");
                return;
            }
            if (jdcNgayDangKy.getDate() == null) {
                jdcNgayDangKy.setBackground(red);
                vld.ValidatorNullJDate(jdcNgayDangKy, sb, "Ngày Sinh Không Được Để Trống");
                MsgBox.showErrorDialog(jPanel1, sb.toString(), "Ngày Sinh Không Được Để Trống");
           return;
            }
             insert();
             clearForm();
        } catch (Exception e) {
             MsgBox.showErrorDialog(this, "Bạn Chưa Nhập Ngày Sinh", "Đã Xảy Ra Lỗi");
            return;
        }
       
    }//GEN-LAST:event_rSButtonHover1ActionPerformed

    private void tblbangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblbangMouseClicked
        if (evt.getClickCount() == 2) {
            row = tblbang.getSelectedRow();
            MaLH = tblbang.getValueAt(row, 0).toString();
            new SLSV(null, true).setVisible(true);
            if(MaLH != null){
                edit();
            }
        }
    }//GEN-LAST:event_tblbangMouseClicked

    private void rSButtonHover3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover3ActionPerformed
        try {
            StringBuilder sb = new StringBuilder();
        
            vld.ValidatorNullJText(txtmalh, sb, "Mã Lớp Học Không Được Để Trống");
    

            if (sb.length() > 0) {
                MsgBox.showErrorDialog(jPanel1, sb.toString(), "Đã Xảy Ra Lỗi");
                return;
            }
           
        delete();
        clearForm(); 
        } catch (Exception e) {
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover3ActionPerformed

    private void rSButtonHover2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover2ActionPerformed
        try {
               StringBuilder sb = new StringBuilder();
     
            vld.ValidatorNullJText(txtmalh, sb, "Mã Lớp Học Không Được Để Trống");
            vld.ValidatorNullJText(txttenlh, sb, "Tên Lớp Học Không Được Để Trống");

            if (sb.length() > 0) {
                MsgBox.showErrorDialog(jPanel1, sb.toString(), "Đã Xảy Ra Lỗi");
                return;
            }
            if (jdcNgayDangKy.getDate() == null) {
                jdcNgayDangKy.setBackground(red);
                vld.ValidatorNullJDate(jdcNgayDangKy, sb, "Ngày Sinh Không Được Để Trống");
                MsgBox.showErrorDialog(jPanel1, sb.toString(), "Ngày Sinh Không Được Để Trống");
           return;
            }
             update();
             clearForm();
        } catch (Exception e) {
        }
               // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover2ActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        clearForm();
    }//GEN-LAST:event_btnnewActionPerformed

    private void btnExel5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExel5ActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblbang.getModel();
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
            tblbang.print(JTable.PrintMode.NORMAL, header, null);
            JFileChooser pdfChooser = new JFileChooser("D:\\duan1\\DuAn1_Khanh\\Print");
            pdfChooser.setDialogTitle("Save As");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void cbbCHuyenNganhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbCHuyenNganhActionPerformed
fillcomboboxMaNHanVien();        // TODO add your handling code here:
    }//GEN-LAST:event_cbbCHuyenNganhActionPerformed

    private void timkiem1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_timkiem1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_timkiem1KeyReleased

    private void timkiem1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_timkiem1KeyPressed
         try {
          
            DefaultTableModel model = (DefaultTableModel) tblbang.getModel();
            model.setRowCount(0);
            String keyword = timkiem1.getText();
            List<LopHoc> list = lopHocDAO.selectLopHocBy(keyword);
            for (LopHoc nh : list) {
                  int SLSV = svDao.selectSLSV(nh.getMaLopHoc()).size();
                model.addRow(new Object[]{
                     nh.getMaLopHoc(),
                nh.getTenLopHoc(),
                SLSV,
                nh.getMaNhanVien(),
                nh.getNgayDangKy(),
                nh.getMaChuyenNganh(),
                nh.isTrangThai()?"Đang Hoạt Động" : "Không Hoạt Động"
              
                });
   
                
             
            }

        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi Truy Vấn");
            e.printStackTrace();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_timkiem1KeyPressed
    void init() {
        load();
        fixTable();
        chonChuyenNganh();
    }

    void fixTable() {
        Scrollbar.getViewport().setBackground(Color.WHITE);
        Scrollbar.setVerticalScrollBar(new ScrollBarCustom());
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        Scrollbar.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        Scrollbar.setBorder(new EmptyBorder(5, 10, 5, 10));
    }
    int row = -1;
    LopHocDAO lopHocDAO = new LopHocDAO();

    void load() {
        DefaultTableModel model = (DefaultTableModel) tblbang.getModel();
        model.setRowCount(0);
        List<LopHoc> list = lopHocDAO.selectAll();
        for (LopHoc lh : list) {
            int SLSV = svDao.selectSLSV(lh.getMaLopHoc()).size();
            Object[] row = {
                lh.getMaLopHoc(),
                lh.getTenLopHoc(),
                SLSV,
                lh.getMaNhanVien(),
                lh.getNgayDangKy(),
                lh.getMaChuyenNganh(),
                lh.isTrangThai()?"Đang Hoạt Động" : "Không Hoạt Động"
            };
            model.addRow(row);
        }
    }

    void insert() {
        LopHoc lh = getmodel();
        try {
            lopHocDAO.insert(lh);
            load();
            JOptionPane.showMessageDialog(this, "Thêm Thành Công");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Thêm Thất Bại");
            e.printStackTrace();
        }
    }

    void edit() {
        String MaLopHoc = (String) tblbang.getValueAt(row, 0);
        LopHoc lh = lopHocDAO.selectById(MaLopHoc);
        setForm(lh);
    }

    void setForm(LopHoc lh) {
        txtmalh.setText(lh.getMaLopHoc());
        txttenlh.setText(lh.getTenLopHoc());
        cbbMaNhanVien.setSelectedItem(lh.getMaNhanVien());
        jdcNgayDangKy.setDate(lh.getNgayDangKy());
        cbbMaNhanVien.setSelectedItem(lh.getMaNhanVien());
        cbbCHuyenNganh.setSelectedItem(lh.getMaChuyenNganh());
                RDOHD.setSelected(lh.isTrangThai()? true : false);
        RDONOTHD.setSelected(lh.isTrangThai()? false : true);
    }

    void update() {
        LopHoc model = getmodel();
        try {
            lopHocDAO.update(model);
            JOptionPane.showMessageDialog(this, "Cap Nhat Thanh Cong");
            load();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    LopHoc getmodel() {
        LopHoc model = new LopHoc();
        model.setMaLopHoc(txtmalh.getText());
        model.setTenLopHoc(txttenlh.getText());
        model.setMaNhanVien(String.valueOf(cbbMaNhanVien.getSelectedItem()));
        model.setNgayDangKy(jdcNgayDangKy.getDate());
        model.setMaChuyenNganh(String.valueOf(cbbCHuyenNganh.getSelectedItem()));
        model.setTrangThai(RDOHD.isSelected() ? true : false);
        return model;
    }

    void delete() {
        String MaLopHoc = txtmalh.getText();
        try {
            lopHocDAO.delete(MaLopHoc);
            load();
            JOptionPane.showMessageDialog(this, "Xoa Thanh Cong");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Xoa That Bai");
        }
    }

    void clearForm() {
           txtmalh.setBackground(white);
        jdcNgayDangKy.setBackground(white);
        txttenlh.setBackground(white);
        txtmalh.setText("");
        jdcNgayDangKy.setDate(null);
        txttenlh.setText("");
      
    }
    ChuyenNganhDao cndao = new ChuyenNganhDao();
    NhanVienDao nvdao = new NhanVienDao();
        void chonChuyenNganh() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbbCHuyenNganh.getModel();
        model.removeAllElements();
        try {
            List<ChuyenNganh> list = cndao.selectAll();
            for (ChuyenNganh cd : list) {
                model.addElement(cd.getMaChuyenNganh());
            }
        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.alert(this, "Lỗi Truy Vấn");
        }
    }
            void fillcomboboxMaNHanVien() {
        try {
            DefaultComboBoxModel model = (DefaultComboBoxModel) cbbMaNhanVien.getModel();
            model.removeAllElements();
            try {
                String chuyenNganh = cbbCHuyenNganh.getSelectedItem().toString();
                List<NhanVien> list = nvdao.selectByMaCN(chuyenNganh);
                for (NhanVien cd : list) {
                    model.addElement(cd.getMaNhanVien());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.alert(this, "Lỗi Truy Vấn");
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RDOHD;
    private javax.swing.JRadioButton RDONOTHD;
    private javax.swing.JScrollPane Scrollbar;
    private rojeru_san.complementos.RSButtonHover btnExel5;
    private rojeru_san.complementos.RSButtonHover btnPrint;
    private rojeru_san.complementos.RSButtonHover btnnew;
    private javax.swing.ButtonGroup buttonGroup1;
    private combobox.CBBMaChuyenNganh cbbCHuyenNganh;
    private combobox.MaNhanVien cbbMaNhanVien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser jdcNgayDangKy;
    private rojeru_san.complementos.RSButtonHover rSButtonHover1;
    private rojeru_san.complementos.RSButtonHover rSButtonHover2;
    private rojeru_san.complementos.RSButtonHover rSButtonHover3;
    private rojeru_san.complementos.RSTableMetro tblbang;
    private textfield.timkiem timkiem1;
    private textfield.MaLopHoc txtmalh;
    private textfield.TenLopHoc txttenlh;
    // End of variables declaration//GEN-END:variables
}
