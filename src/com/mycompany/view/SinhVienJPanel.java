/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.view;

import com.mycompany.duan1.X.MsgBox;
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
import java.awt.Font;
import java.io.File;
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
import javax.swing.table.DefaultTableModel;
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

        setBackground(new java.awt.Color(255, 255, 255));

        jpnView.setBackground(new java.awt.Color(255, 255, 255));
        jpnView.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Scrollbar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        tblStudent.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Sinh Viên", "Tên Sinh Viên", "Ngày Sinh", "Email", "SĐT", "DiaChi", "GioiTinh", "Mã CN", "Mã Lớp Học", "Hinh", "Mã Tài Khoản"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
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
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Thông Tin Sinh Viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Ngày Sinh");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 127, 70, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Giới Tính");
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
        rdonu.setText("Nữ");
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
        jLabel4.setText("Ảnh");
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
        jPanel1.add(rSButtonHover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 260, 40, -1));

        jdcNgaySinh.setBackground(new java.awt.Color(255, 255, 255));
        jdcNgaySinh.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jdcNgaySinh.setDateFormatString("dd/MM/yyyy");
        jdcNgaySinh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jdcNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 147, 270, 24));
        jPanel1.add(cbb_Mataikhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 19, 240, 44));

        btnsubmit.setBackground(new java.awt.Color(204, 0, 51));
        btnsubmit.setText("Lưu");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 247, 110, -1));

        btnUpdate.setBackground(new java.awt.Color(204, 0, 51));
        btnUpdate.setText("Cập Nhật");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 247, 120, -1));

        btnNew.setBackground(new java.awt.Color(204, 0, 51));
        btnNew.setText("Làm Mới");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel1.add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 247, 120, -1));

        btnXoa.setBackground(new java.awt.Color(204, 0, 51));
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel1.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 247, 110, -1));

        txtSeach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeachActionPerformed(evt);
            }
        });
        jPanel1.add(txtSeach, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 371, -1));

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
        update();        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtSeachFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSeachFocusGained
        if (txtSeach.getText().equals("Nhập Vào Mã SV,Mã LH, Mã CN,Tên SV")) {
            txtSeach.setText("");
            txtSeach.requestFocus();
            removePlacehoderStyle(txtSeach);
        }// TODO add your handling code here:
    }//GEN-LAST:event_txtSeachFocusGained

    private void txtSeachFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSeachFocusLost
        if (txtSeach.getText().length() == 0) {
            addPlacehoderStyle(txtSeach);
            txtSeach.setText("Nhập Vào Mã SV,Mã LH, Mã CN,Tên SV");
    }//GEN-LAST:event_txtSeachFocusLost
    }
    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        clearForm();// TODO add your handling code here:
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        delete();        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed

    private void cbbmachuyennganhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbmachuyennganhActionPerformed
        fillcomboboxLopHoc();        // TODO add your handling code here:
    }//GEN-LAST:event_cbbmachuyennganhActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        insert();        // TODO add your handling code here:
    }//GEN-LAST:event_btnsubmitActionPerformed

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
        addPlacehoderStyle(txtSeach);
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
            XImage.save(file); // lưu hình vào thư mục logos
            ImageIcon icon = XImage.read(file.getName()); // đọc hình từ logos
            lblHinh.setIcon(icon);
            lblHinh.setToolTipText(file.getName()); // giữ tên hình trong tooltip
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
                sv.getNgaySinh(),
                sv.getEmail(),
                sv.getSDT(),
                sv.getDiaChi(),
                sv.isGioiTinh() ? "Nam" : "Nữ",
                sv.getMaChuyenNganh(),
                sv.getMaLopHoc(),
                sv.getHinh(),
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
            JOptionPane.showMessageDialog(this, "Thêm mới thành công!");
            filltable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Thêm mới thất bại!");
            e.printStackTrace();
        }
    }

    void update() {
        SinhVien model = getForm();
        try {
            svdao.update(model);
            clearForm();
            JOptionPane.showMessageDialog(this, "Cập Nhật thành công!");
            filltable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Cập Nhật  thất bại!");
            e.printStackTrace();
        }
    }

    void delete() {

        String masv = txtMaSinhVien.getText();
        try {
            svdao.delete(masv);
            this.clearForm();
            JOptionPane.showMessageDialog(this, "Xóa thành công!");
            filltable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Xóa Thất Bại!");
        }

    }

    void clearForm() {
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
            MsgBox.alert(this, "Lỗi Truy Vấn");
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
            MsgBox.alert(this, "Lỗi Truy Vấn");
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
                    nh.getNgaySinh(),
                    nh.getEmail(),
                    nh.getSDT(),
                    nh.getDiaChi(),
                    nh.isGioiTinh() ? "Nam" : "Nữ",
                    nh.getMaChuyenNganh(),
                    nh.getMaLopHoc(),
                    nh.getHinh(),});

            }

        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi Truy Vấn");
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
            model.addElement(tblStudent.getValueAt(row, 10));

        } catch (Exception e) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Scrollbar;
    private rojeru_san.complementos.RSButtonHover btnNew;
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
