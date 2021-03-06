/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.view;

import com.mycompany.duan1.X.MsgBox;
import com.mycompany.duan1.X.Validate;
import com.mycompany.duan1.X.XImage;
import com.mycompany.duan1.dao.ChuyenNganhDao;
import com.mycompany.duan1.dao.LopHocDAO;
import com.mycompany.duan1.dao.SinhVienDao;
import com.mycompany.duan1.dao.TaiKhoanDao;
import com.mycompany.duan1.model.ChuyenNganh;
import com.mycompany.duan1.model.LopHoc;
import com.mycompany.duan1.model.SinhVien;
import com.mycompany.duan1.model.TaiKhoan;
import java.awt.Color;
import static java.awt.Color.red;
import static java.awt.Color.white;
import java.awt.Font;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Hashtable;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.JTable;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import scrollbar.ScrollBarCustom;

/**
 *
 * @author ADMIN
 */
public class SinhVienJPanel extends javax.swing.JPanel {

    private List<SinhVien> sinhvien;
    TaiKhoanDao tkDao = new TaiKhoanDao();
    DefaultComboBoxModel model = null;

    /**
     * Creates new form HocVienJPanel
     */
    public SinhVienJPanel() {
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
        jpnView = new javax.swing.JPanel();
        Scrollbar = new javax.swing.JScrollPane();
        tblStudent = new rojeru_san.complementos.RSTableMetro();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rdonam = new javax.swing.JRadioButton();
        rdonu = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        lblHinh = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMaSinhVien = new textfield.MaSinhVien();
        txtHoTen = new textfield.TenSinhVien();
        cbbmachuyennganh = new combobox.CBBMaChuyenNganh();
        cbbmalophoc = new combobox.CBBMaLopHoc();
        txtDiaChi = new textfield.DiaChi();
        txtSoDienThoai = new textfield.SDT();
        txtEmail = new textfield.Email();
        rSButtonHover1 = new rojeru_san.complementos.RSButtonHover();
        jdcNgaySinh = new com.toedter.calendar.JDateChooser();
        cbb_Mataikhoan = new combobox.MaTaiKhoan();
        btnsubmit = new rojeru_san.complementos.RSButtonHover();
        btnUpdate = new rojeru_san.complementos.RSButtonHover();
        btnNew = new rojeru_san.complementos.RSButtonHover();
        btnXoa = new rojeru_san.complementos.RSButtonHover();
        txtSeach = new textfield.timkiem();
        btnExel1 = new rojeru_san.complementos.RSButtonHover();
        btnPrint = new rojeru_san.complementos.RSButtonHover();

        setBackground(new java.awt.Color(255, 255, 255));

        jpnView.setBackground(new java.awt.Color(255, 255, 255));
        jpnView.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Scrollbar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        tblStudent.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "M?? Sinh Vi??n", "T??n Sinh Vi??n", "Email", "GioiTinh", "M?? CN", "M?? L???p H???c", "M?? T??i Kho???n"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStudent.setColorBackgoundHead(new java.awt.Color(204, 0, 51));
        tblStudent.setColorBordeFilas(new java.awt.Color(153, 153, 153));
        tblStudent.setColorBordeHead(new java.awt.Color(153, 153, 153));
        tblStudent.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblStudent.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tblStudent.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tblStudent.setColorSelBackgound(new java.awt.Color(204, 204, 204));
        tblStudent.setFuenteHead(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tblStudent.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblStudent.setRowHeight(45);
        tblStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentMouseClicked(evt);
            }
        });
        Scrollbar.setViewportView(tblStudent);

        jpnView.add(Scrollbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 325, 1080, 290));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Th??ng Tin Sinh Vi??n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Ng??y Sinh");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 127, 70, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Gi???i T??nh");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 73, -1, -1));

        rdonam.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdonam);
        rdonam.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        rdonam.setForeground(new java.awt.Color(153, 153, 153));
        rdonam.setSelected(true);
        rdonam.setText("Nam");
        jPanel1.add(rdonam, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 92, -1, -1));

        rdonu.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdonu);
        rdonu.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        rdonu.setForeground(new java.awt.Color(153, 153, 153));
        rdonu.setText("N???");
        jPanel1.add(rdonu, new org.netbeans.lib.awtextra.AbsoluteConstraints(691, 92, 167, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 0, 51)));
        jPanel3.setToolTipText("");
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHinh.setBackground(new java.awt.Color(204, 204, 204));
        lblHinh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHinhMouseClicked(evt);
            }
        });
        jPanel3.add(lblHinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 170));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("???nh");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 130, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(921, 19, -1, -1));
        jPanel1.add(txtMaSinhVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 19, 270, -1));
        jPanel1.add(txtHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 73, 270, -1));

        cbbmachuyennganh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbmachuyennganhActionPerformed(evt);
            }
        });
        jPanel1.add(cbbmachuyennganh, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 181, 270, -1));
        jPanel1.add(cbbmalophoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 181, 270, -1));
        jPanel1.add(txtDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 127, 270, -1));
        jPanel1.add(txtSoDienThoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 73, 270, -1));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 19, 270, -1));

        rSButtonHover1.setBackground(new java.awt.Color(204, 0, 51));
        rSButtonHover1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/Zoom.png"))); // NOI18N
        rSButtonHover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonHover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 140, 40, -1));

        jdcNgaySinh.setBackground(new java.awt.Color(255, 255, 255));
        jdcNgaySinh.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jdcNgaySinh.setDateFormatString("dd/MM/yyyy");
        jdcNgaySinh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jdcNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 147, 270, 24));
        jPanel1.add(cbb_Mataikhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 19, 240, 44));

        btnsubmit.setBackground(new java.awt.Color(204, 0, 51));
        btnsubmit.setText("L??u");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 110, -1));

        btnUpdate.setBackground(new java.awt.Color(204, 0, 51));
        btnUpdate.setText("C???p Nh???t");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 120, -1));

        btnNew.setBackground(new java.awt.Color(204, 0, 51));
        btnNew.setText("L??m M???i");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel1.add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 120, -1));

        btnXoa.setBackground(new java.awt.Color(204, 0, 51));
        btnXoa.setText("X??a");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel1.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 110, -1));

        txtSeach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeachActionPerformed(evt);
            }
        });
        txtSeach.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSeachKeyPressed(evt);
            }
        });
        jPanel1.add(txtSeach, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 220, -1));

        btnExel1.setBackground(new java.awt.Color(204, 0, 51));
        btnExel1.setText("Exel");
        btnExel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExel1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnExel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 110, 40));

        btnPrint.setBackground(new java.awt.Color(204, 0, 51));
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 250, 110, -1));

        jpnView.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1080, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentMouseClicked
        if (evt.getClickCount() == 2) {
            row = tblStudent.getSelectedRow();
            this.model = null;

            fillcomboboxMaTK();

            cbb_Mataikhoan.setEnabled(false);
            cbb_Mataikhoan.setBackground(new Color(245, 245, 245));
            edit();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tblStudentMouseClicked

    private void lblHinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhMouseClicked
        chonAnh();        // TODO add your handling code here:
    }//GEN-LAST:event_lblHinhMouseClicked

    private void rSButtonHover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover1ActionPerformed
        fillTableSelectByMa();
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover1ActionPerformed

    private void txtSeachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeachActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        StringBuilder sb = new StringBuilder();
        try {
            vld.ValidatorNullJText(txtMaSinhVien, sb, "M?? Sinh Vi??n Kh??ng ???????c ????? Tr???ng");
            vld.ValidatorNullJText(txtHoTen, sb, "T??n Sinh Vi??n Kh??ng ???????c ????? Tr???ng");
            vld.ValidatorNullJText(txtEmail, sb, "Email Kh??ng ???????c ????? Tr???ng");
            vld.ValidatorNullJText(txtSoDienThoai, sb, "S??? ??i???n Tho???i Kh??ng ???????c ????? Tr???ng");
            vld.ValidatorNullJText(txtDiaChi, sb, "S??? ??i???n Tho???i Kh??ng ???????c ????? Tr???ng");
            vld.ValidatorNullJDate(jdcNgaySinh, sb, "Ng??y Sinh Kh??ng H???p L???");
            vld.checkEmail(txtEmail, sb, "Email Kh??ng ????ng ?????nh D???ng");
            vld.checkSDT(txtSoDienThoai, sb, "S??? ??i???n Tho???i Kh??ng ????ng ?????nh D???ng");
            if (sb.length() > 0) {
                MsgBox.showErrorDialog(jPanel1, sb.toString(), "???? X???y Ra L???i");
                return;
            }
            if (jdcNgaySinh.getDate() == null) {
                jdcNgaySinh.setBackground(red);
                vld.ValidatorNullJDate(jdcNgaySinh, sb, "Ng??y Sinh Kh??ng ???????c ????? Tr???ng");
                MsgBox.showErrorDialog(jPanel1, sb.toString(), "Ng??y Sinh Kh??ng ???????c ????? Tr???ng");

                return;
            }
        } catch (Exception e) {
            MsgBox.showErrorDialog(this, "B???n Ch??a Nh???p Ng??y Sinh", "???? X???y Ra L???i");
            return;
        }
        int x;
        x = JOptionPane.showConfirmDialog(this, "b???n c?? mu???n c???p nh???t kh??ng ?");

        if (x == JOptionPane.YES_NO_OPTION) {
            update();

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtSeachFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSeachFocusGained
        if (txtSeach.getText().equals("Nh???p V??o M?? SV,M?? LH, M?? CN,T??n SV")) {
            txtSeach.setText("");
            txtSeach.requestFocus();
            removePlacehoderStyle(txtSeach);
        }// TODO add your handling code here:
    }//GEN-LAST:event_txtSeachFocusGained

    private void txtSeachFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSeachFocusLost
        if (txtSeach.getText().length() == 0) {
            addPlacehoderStyle(txtSeach);
            txtSeach.setText("Nh???p V??o M?? SV,M?? LH, M?? CN,T??n SV");
    }//GEN-LAST:event_txtSeachFocusLost
    }
    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        clearForm();// TODO add your handling code here:
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        try {
            StringBuilder sb = new StringBuilder();
            vld.ValidatorNullJText(txtMaSinhVien, sb, "M?? Sinh Vi??n Kh??ng ???????c ????? Tr???ng");
            if (sb.length() > 0) {
                MsgBox.showErrorDialog(jPanel1, sb.toString(), "???? X???y Ra L???i");
                return;
            }
            int x;
            x = JOptionPane.showConfirmDialog(this, "b???n c?? mu???n x??a kh??ng ?");

            if (x == JOptionPane.YES_NO_OPTION) {
                delete();
            }
        } catch (Exception e) {
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed

    private void cbbmachuyennganhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbmachuyennganhActionPerformed
        fillcomboboxLopHoc();        // TODO add your handling code here:
    }//GEN-LAST:event_cbbmachuyennganhActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        try {
            
            StringBuilder sb = new StringBuilder();
            checkTrungMa(txtMaSinhVien, sb, "Sinh Vi??n ???? T???n T???i Tr??n H??? Th???ng");
            vld.ValidatorNullJText(txtMaSinhVien, sb, "M?? Sinh Vi??n Kh??ng ???????c ????? Tr???ng");
            vld.ValidatorNullJText(txtHoTen, sb, "T??n Sinh Vi??n Kh??ng ???????c ????? Tr???ng");
            vld.checkEmail(txtEmail, sb, "Email Kh??ng ????ng ?????nh D???ng");
            vld.checkSDT(txtSoDienThoai, sb, "S??? ??i???n Tho???i Kh??ng ????ng ?????nh D???ng");
            vld.ValidatorNullJText(txtEmail, sb, "Email Kh??ng ???????c ????? Tr???ng");
            vld.ValidatorNullJText(txtSoDienThoai, sb, "S??? ??i???n Tho???i Kh??ng ???????c ????? Tr???ng");
            vld.ValidatorNullJText(txtDiaChi, sb, "S??? ??i???n Tho???i Kh??ng ???????c ????? Tr???ng");
            vld.checkMaNV(txtMaSinhVien, sb, "M?? Sinh Vi??n Kh??ng ???????c Q?? 7 K?? T???");
            if (sb.length() > 0) {
                MsgBox.showErrorDialog(jPanel1, sb.toString(), "???? X???y Ra L???i");
                return;
            }
            if (jdcNgaySinh.getDate() == null) {
               
                vld.ValidatorNullJDate(jdcNgaySinh, sb, "Ng??y Sinh Kh??ng ???????c ????? Tr???ng");
                MsgBox.showErrorDialog(jPanel1, sb.toString(), "Ng??y Sinh Kh??ng ???????c ????? Tr???ng");

                return;
            }

            insert();
        } catch (Exception e) {
         
            MsgBox.showErrorDialog(this, "B???n Ch??a Nh???p Ng??y Sinh", "???? X???y Ra L???i");
            return;
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void txtSeachKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSeachKeyPressed
        fillTableSelectByMa();        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeachKeyPressed
    public boolean checkTrungMa(JTextField txt, StringBuilder sb, String errorMessage) {
        txt.setBackground(white);
        if (svdao.selectById(txt.getText()) == null) {
            return true;
        } else {
            txt.setBackground(Color.red);
            sb.append(errorMessage).append("\n");
            txt.requestFocus();
            return false;
        }
    }
    private void btnExel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExel1ActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblStudent.getModel();
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
                    if (exelBOU != null) {
                        exelBOU.close();
                    }
                    if (exelFOU != null) {
                        exelFOU.close();
                    }
                    if (exelJtableExporter != null) {

                    }
                } catch (IOException ex) {

                    Logger.getLogger(SinhVienJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnExel1ActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        MessageFormat header = new MessageFormat("Item report");

        try {
            tblStudent.print(JTable.PrintMode.NORMAL, header, null);
            JFileChooser pdfChooser = new JFileChooser("D:\\duan1\\DuAn1_Khanh\\Print");
            pdfChooser.setDialogTitle("Save As");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }//GEN-LAST:event_btnPrintActionPerformed

    void fixTable() {
        Scrollbar.getViewport().setBackground(Color.WHITE);
        Scrollbar.setVerticalScrollBar(new ScrollBarCustom());
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        Scrollbar.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        Scrollbar.setBorder(new EmptyBorder(5, 10, 5, 10));
    }

    int row = -1;
    SinhVienDao svdao = new SinhVienDao();

    void init() {
        lblHinh.setIcon(XImage.read("noImage.png"));
        filltable();
        chonChuyenNganh();
        chonLopHoc();

        fixTable();
        fillcomboboxMaTK();

    }

    void fillcomboboxMaTK() {
        model = (DefaultComboBoxModel) cbb_Mataikhoan.getModel();
        model.removeAllElements();
        try {
            List<TaiKhoan> list = tkDao.selectByMaSV();
            for (TaiKhoan tk : list) {
                model.addElement(tk.getMaTK());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void edit() {
        String maSV = (String) tblStudent.getValueAt(this.row, 0);
        SinhVien sv = svdao.selectById(maSV);
        setForm(sv);

    }

    void setForm(SinhVien sv) {
        txtMaSinhVien.setText(sv.getMaSinhVien());
        txtHoTen.setText(sv.getTenSinhVien());
        jdcNgaySinh.setDate(sv.getNgaySinh());
        txtEmail.setText(sv.getEmail());
        txtSoDienThoai.setText(sv.getSDT());
        txtDiaChi.setText(sv.getDiaChi());
        cbbmachuyennganh.setSelectedItem(String.valueOf(sv.getMaChuyenNganh()));
        cbbmalophoc.setSelectedItem(String.valueOf(sv.getMaLopHoc()));
        rdonam.setSelected(sv.isGioiTinh() ? true : false);
        rdonu.setSelected(sv.isGioiTinh() ? false : true);
        fillcbbshowMaTK();
        if (sv.getHinh() != null) {
            lblHinh.setToolTipText(sv.getHinh());
            lblHinh.setIcon(XImage.read(sv.getHinh()));
        } else {
            lblHinh.setIcon(XImage.read("noImage.png"));
        }

    }

    SinhVien getForm() {
        SinhVien sv = new SinhVien();
        sv.setMaSinhVien(txtMaSinhVien.getText());
        sv.setTenSinhVien(txtHoTen.getText());
        sv.setNgaySinh(jdcNgaySinh.getDate());
        sv.setEmail(txtEmail.getText());
        sv.setSDT(txtSoDienThoai.getText());
        sv.setMaChuyenNganh(String.valueOf(cbbmachuyennganh.getSelectedItem()));
        sv.setMaLopHoc(String.valueOf(cbbmalophoc.getSelectedItem()));
        sv.setDiaChi(txtDiaChi.getText());
        sv.setGioiTinh(rdonam.isSelected() ? true : false);
        sv.setHinh(lblHinh.getToolTipText());
        sv.setMaTK(cbb_Mataikhoan.getSelectedItem().toString());
        return sv;
    }
    JFileChooser fileChooser = new JFileChooser();

    void chonAnh() {
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            XImage.save(file); // l??u h??nh v??o th?? m???c logos
            ImageIcon icon = XImage.read(file.getName()); // ?????c h??nh t??? logos
            lblHinh.setIcon(icon);
            lblHinh.setToolTipText(file.getName()); // gi??? t??n h??nh trong tooltip
        }
    }

    void filltable() {
        DefaultTableModel model = (DefaultTableModel) tblStudent.getModel();
        model.setRowCount(0);
        List<SinhVien> list = svdao.selectAll();
        for (SinhVien sv : list) {
            Object[] row = {
                sv.getMaSinhVien(),
                sv.getTenSinhVien(),
                //                sv.getNgaySinh(),
                sv.getEmail(),
                //                sv.getSDT(),
                //                sv.getDiaChi(),
                sv.isGioiTinh() ? "Nam" : "N???",
                sv.getMaChuyenNganh(),
                sv.getMaLopHoc(),
                //                sv.getHinh(),
                sv.getMaTK()
            };
            model.addRow(row);
        }
    }

    void insert() {
        SinhVien model = getForm();
        try {
            svdao.insert(model);

            this.clearForm();
            JOptionPane.showMessageDialog(this, "Th??m m???i th??nh c??ng!");
            filltable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Th??m m???i th???t b???i!");
            e.printStackTrace();
        }
    }

    void update() {
        SinhVien model = getForm();
        try {
            svdao.update(model);
            clearForm();
            JOptionPane.showMessageDialog(this, "C???p Nh???t th??nh c??ng!");
            filltable();
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    void delete() {

        String masv = txtMaSinhVien.getText();
        try {
            svdao.delete(masv);
            this.clearForm();
            JOptionPane.showMessageDialog(this, "X??a th??nh c??ng!");
            filltable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Sinh Vi??n ??ang Li??n K???t V???i 1 B???ng Kh??c N??n Kh??ng Th??? X??a");
        }

    }

    void clearForm() {
        txtMaSinhVien.setBackground(Color.WHITE);
        txtHoTen.setBackground(Color.WHITE);
        jdcNgaySinh.setBackground(Color.WHITE);
        txtEmail.setBackground(Color.WHITE);
        txtSoDienThoai.setBackground(Color.WHITE);
        txtDiaChi.setBackground(Color.WHITE);
        rdonu.setBackground(Color.WHITE);
        rdonam.setBackground(Color.WHITE);

        txtMaSinhVien.setText("");
        txtHoTen.setText("");
        jdcNgaySinh.setDate(null);
        txtEmail.setText("");
        txtSoDienThoai.setText("");
        txtDiaChi.setText("");
        rdonu.isSelected();
        lblHinh.setIcon(XImage.read("noImage.png"));
        fillcomboboxMaTK();
        cbb_Mataikhoan.setEnabled(true);
        cbb_Mataikhoan.setBackground(Color.white);
    }
    ChuyenNganhDao cndao = new ChuyenNganhDao();
    LopHocDAO lhdao = new LopHocDAO();
    Validate vld = new Validate();

    void chonChuyenNganh() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbbmachuyennganh.getModel();
        model.removeAllElements();
        try {
            List<ChuyenNganh> list = cndao.selectAll();
            for (ChuyenNganh cd : list) {
                model.addElement(cd.getMaChuyenNganh());
            }
        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.alert(this, "L???i Truy V???n");
        }
    }

    void chonLopHoc() {
        List<LopHoc> list = lhdao.selectAll();
        for (LopHoc lh : list) {
            cbbmalophoc.addItem(lh.getMaLopHoc());
        }
    }

    void fillcomboboxLopHoc() {
//        String MaCN = (String) cbbmachuyennganh.getSelectedItem();
//        List<LopHoc> list = lhdao.selectByChuyenNganh(MaCN);
//        for (LopHoc lh : list) {
//            cbbmalophoc.addItem(lh.getMaLopHoc());
//        }
        try {
            DefaultComboBoxModel model = (DefaultComboBoxModel) cbbmalophoc.getModel();
            model.removeAllElements();
            try {
                String chuyenNganh = cbbmachuyennganh.getSelectedItem().toString();
                List<LopHoc> list = lhdao.selectByChuyenNganh(chuyenNganh);
                for (LopHoc cd : list) {
                    model.addElement(cd.getMaLopHoc());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.alert(this, "L???i Truy V???n");
        }

    }

    void fillTableSelectByMa() {
        try {
            DefaultTableModel model = (DefaultTableModel) tblStudent.getModel();
            model.setRowCount(0);
            String keyword = txtSeach.getText();
            List<SinhVien> list = svdao.selectByMaCNLopHocTen(keyword);
            for (SinhVien nh : list) {
                model.addRow(new Object[]{
                    nh.getMaSinhVien(),
                    nh.getTenSinhVien(),
//                    nh.getNgaySinh(),
                    nh.getEmail(),
//                    nh.getSDT(),
//                    nh.getDiaChi(),
                    nh.isGioiTinh() ? "Nam" : "N???",
                    nh.getMaChuyenNganh(),
                    nh.getMaLopHoc(),
                    nh.getMaTK()});

            }

        } catch (Exception e) {
            MsgBox.alert(this, "L???i Truy V???n");
        }

    }

    public void addPlacehoderStyle(JTextField jTextField) {
        Font font = jTextField.getFont();
        font = font.deriveFont(Font.ITALIC);
        jTextField.setFont(font);
        jTextField.setForeground(Color.gray);
    }

    public void removePlacehoderStyle(JTextField jTextField) {
        Font font = jTextField.getFont();
        font = font.deriveFont(Font.PLAIN | Font.BOLD);
        jTextField.setFont(font);
        jTextField.setForeground(Color.black);
    }

    public void removecbbStyle(JComboBox jcbb) {
        Font font = jcbb.getFont();
        font = font.deriveFont(Font.PLAIN | Font.BOLD);
        jcbb.setFont(font);
        jcbb.setForeground(Color.black);
    }

    public void XuatThongtin() {
        try {

            Hashtable map = new Hashtable();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void fillcbbshowMaTK() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbb_Mataikhoan.getModel();
        model.removeAllElements();
        try {
            model.addElement(tblStudent.getValueAt(row, 6));

        } catch (Exception e) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Scrollbar;
    private rojeru_san.complementos.RSButtonHover btnExel1;
    private rojeru_san.complementos.RSButtonHover btnNew;
    private rojeru_san.complementos.RSButtonHover btnPrint;
    private rojeru_san.complementos.RSButtonHover btnUpdate;
    private rojeru_san.complementos.RSButtonHover btnXoa;
    private rojeru_san.complementos.RSButtonHover btnsubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private combobox.MaTaiKhoan cbb_Mataikhoan;
    private combobox.CBBMaChuyenNganh cbbmachuyennganh;
    private combobox.CBBMaLopHoc cbbmalophoc;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private com.toedter.calendar.JDateChooser jdcNgaySinh;
    private javax.swing.JPanel jpnView;
    private javax.swing.JLabel lblHinh;
    private rojeru_san.complementos.RSButtonHover rSButtonHover1;
    private javax.swing.JRadioButton rdonam;
    private javax.swing.JRadioButton rdonu;
    private rojeru_san.complementos.RSTableMetro tblStudent;
    private textfield.DiaChi txtDiaChi;
    private textfield.Email txtEmail;
    private textfield.TenSinhVien txtHoTen;
    private textfield.MaSinhVien txtMaSinhVien;
    private textfield.timkiem txtSeach;
    private textfield.SDT txtSoDienThoai;
    // End of variables declaration//GEN-END:variables
}
