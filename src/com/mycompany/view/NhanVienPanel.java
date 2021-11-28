/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.view;

import com.mycompany.duan1.X.MsgBox;
import com.mycompany.duan1.X.XDate;
import com.mycompany.duan1.X.XImage;
import com.mycompany.duan1.dao.ChuyenNganhDao;
import com.mycompany.duan1.dao.NhanVienDao;
import com.mycompany.duan1.dao.TaiKhoanDao;
import com.mycompany.duan1.model.ChuyenNganh;
import com.mycompany.duan1.model.NhanVien;
import com.mycompany.duan1.model.SinhVien;
import com.mycompany.duan1.model.TaiKhoan;
import java.awt.Color;
import java.io.File;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import scrollbar.ScrollBarCustom;

/**
 *
 * @author quang
 */
public class NhanVienPanel extends javax.swing.JPanel {

    /**
     * Creates new form NhanVienPanel
     */
    public NhanVienPanel() {
        initComponents();
        load();
        fixTable();
        fillComboBoxChuyenNganh();
        lblhinh.setIcon(XImage.read("noImage.png"));
        fillcomboboxMaTK();
    }
    NhanVienDao dao = new NhanVienDao();
    ChuyenNganhDao cndao = new ChuyenNganhDao();
    NhanVien nv = new NhanVien();
    TaiKhoanDao tkDao = new TaiKhoanDao();
    int row = -1;
    DefaultComboBoxModel model = null;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblhinh = new javax.swing.JLabel();
        Scrollbar = new javax.swing.JScrollPane();
        tblNhanVien = new rojeru_san.complementos.RSTableMetro();
        txtMaNV2 = new textfield.MaNhanVien();
        txtHoTen1 = new textfield.TenNhanVien();
        txtSoDT1 = new textfield.SDT();
        txtEmail = new textfield.Email();
        txtDiaChi = new textfield.DiaChi();
        jdcNgaySinh = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        rSButtonHover1 = new rojeru_san.complementos.RSButtonHover();
        cbbmachuyennganh = new combobox.CBBMaChuyenNganh();
        cbb_MaTK = new combobox.MaTaiKhoan();
        txttimkiem = new textfield.timkiem();

        setBorder(new javax.swing.border.MatteBorder(null));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)), "THÔNG TIN NHÂN VIÊN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 0, 51)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ẢNH");

        lblhinh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblhinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblhinhMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblhinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblhinh, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã NV", "Tên NV", "Số điện thoại", "Email", "Địa chỉ", "Ngày Sinh", "Giới Tính", "Mã CN", "Hình"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhanVien.setColorBackgoundHead(new java.awt.Color(204, 0, 51));
        tblNhanVien.setColorBordeFilas(new java.awt.Color(153, 153, 153));
        tblNhanVien.setColorBordeHead(new java.awt.Color(153, 153, 153));
        tblNhanVien.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblNhanVien.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tblNhanVien.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tblNhanVien.setColorSelBackgound(new java.awt.Color(204, 204, 204));
        tblNhanVien.setFuenteHead(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tblNhanVien.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblNhanVien.setRowHeight(45);
        tblNhanVien.getTableHeader().setReorderingAllowed(false);
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        Scrollbar.setViewportView(tblNhanVien);

        jdcNgaySinh.setDateFormatString("dd/MM/yyyy");

        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Ngày Sinh");

        btnXoa.setBackground(new java.awt.Color(255, 255, 255));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/Delete.png"))); // NOI18N
        btnXoa.setText("Xoá");
        btnXoa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(255, 255, 255));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/Refresh.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(255, 255, 255));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/Add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnLamMoi.setBackground(new java.awt.Color(255, 255, 255));
        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/Properties.png"))); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        rdoNam.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoNam);
        rdoNam.setForeground(new java.awt.Color(153, 153, 153));
        rdoNam.setSelected(true);
        rdoNam.setText("Nam");

        rdoNu.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoNu);
        rdoNu.setForeground(new java.awt.Color(153, 153, 153));
        rdoNu.setText("Nữ");
        rdoNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNuActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Giới Tính");

        rSButtonHover1.setBackground(new java.awt.Color(204, 0, 51));
        rSButtonHover1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/Search.png"))); // NOI18N
        rSButtonHover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaNV2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoTen1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoDT1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jdcNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbb_MaTK, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(rdoNam)
                                .addGap(18, 18, 18)
                                .addComponent(rdoNu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbbmachuyennganh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txttimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(rSButtonHover1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(Scrollbar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jdcNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtMaNV2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(txtHoTen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(txtSoDT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(47, 47, 47))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(rdoNam)
                                            .addComponent(rdoNu))
                                        .addGap(17, 17, 17)))
                                .addComponent(cbbmachuyennganh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(cbb_MaTK, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rSButtonHover1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(Scrollbar, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                .addContainerGap())
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

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        if (evt.getClickCount() == 2) {
            row = tblNhanVien.getSelectedRow();
            cbb_MaTK.setEnabled(false);
            cbb_MaTK.setBackground(new Color(245,245,245));
            edit();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        insert();        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        update();        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        delete();        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        Reset();        // TODO add your handling code here:
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void lblhinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblhinhMouseClicked
        chonAnh();        // TODO add your handling code here:
    }//GEN-LAST:event_lblhinhMouseClicked

    private void rdoNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoNuActionPerformed

    private void txttimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttimkiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttimkiemActionPerformed

    private void rSButtonHover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover1ActionPerformed
        loadByMa();        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover1ActionPerformed
    void load() {
        DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();
        model.setRowCount(0);
        try {
            List<NhanVien> list = dao.selectAll();
            for (NhanVien nv : list) {
                Object[] row = {
                    nv.getMaNhanVien(),
                    nv.getTenNhanVien(),
                    nv.getSDT(),
                    nv.getEmail(),
                    nv.getDiaChi(),
                    nv.getNgaySinh(),
                    nv.isGioiTinh() ? "Nam" : "Nữ",
                    nv.getMaChuyenNganh(),
                    nv.getHinh()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void fillcomboboxMaTK() {
        model = (DefaultComboBoxModel) cbb_MaTK.getModel();
        model.removeAllElements();
        try {
            List<TaiKhoan> list = tkDao.selectByMaNV();
            for (TaiKhoan tk : list) {
                model.addElement(tk.getMaTK());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    void fillComboBoxChuyenNganh() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbbmachuyennganh.getModel();
        model.removeAllElements();
        try {
            List<ChuyenNganh> list = cndao.selectAll();
            for (ChuyenNganh cd : list) {
                model.addElement(cd.getMaChuyenNganh()); // đây (2) lúc đầu là model.addElement(cd); // sai chỗ cd
            }
        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.alert(this, "Lỗi Truy Vấn");
        }

    }

    void loadByMa() {
        try {
            DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();
            model.setRowCount(0);
            String MaNV = txttimkiem.getText();
            List<NhanVien> list = dao.selectByMaNV(MaNV);
            for (NhanVien nv : list) {
                Object[] row = {
                    nv.getMaNhanVien(),
                    nv.getTenNhanVien(),
                    nv.getSDT(),
                    nv.getEmail(),
                    nv.getDiaChi(),
                    nv.getNgaySinh(),
                    nv.isGioiTinh() ? "Nam" : "Nữ",
                    nv.getMaChuyenNganh(),
                    nv.getHinh()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void insert() {
        NhanVien nv1 = getForm();
        try {
            dao.insert(nv1);
            load();
            Reset();
            JOptionPane.showMessageDialog(this, "Thêm thành công");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    NhanVien getForm() {
        NhanVien nv = new NhanVien();
        nv.setMaNhanVien(txtMaNV2.getText());
        nv.setTenNhanVien(txtHoTen1.getText());
        nv.setSDT(txtSoDT1.getText());
        nv.setEmail(txtEmail.getText());
        nv.setNgaySinh(jdcNgaySinh.getDate());
        nv.setDiaChi(txtDiaChi.getText());
        nv.setGioiTinh(rdoNam.isSelected());
        nv.setMaChuyenNganh(cbbmachuyennganh.getSelectedItem().toString());
        nv.setHinh(lblhinh.getToolTipText());
        nv.setMaTaiKhoan(cbb_MaTK.getSelectedItem().toString());
        return nv;

    }

    void edit() {
        String MaNhanVien = (String) tblNhanVien.getValueAt(row, 0);
        NhanVien nv = dao.selectById(MaNhanVien);
        setForm(nv);
    }

    void setForm(NhanVien nv) {
        txtMaNV2.setText(nv.getMaNhanVien());
        txtHoTen1.setText(nv.getTenNhanVien());
        txtSoDT1.setText(nv.getSDT());
        txtEmail.setText(nv.getEmail());
        txtDiaChi.setText(nv.getDiaChi());
        cbbmachuyennganh.setSelectedItem(nv.getMaChuyenNganh());
        if (nv.getHinh() != null) {
            lblhinh.setToolTipText(nv.getHinh());
            lblhinh.setIcon(XImage.read(nv.getHinh()));
        } else {
            lblhinh.setIcon(XImage.read("noImage.png"));
        }
        jdcNgaySinh.setDate(nv.getNgaySinh());
        rdoNam.setSelected(!nv.isGioiTinh());
        rdoNu.setSelected(nv.isGioiTinh());
        cbb_MaTK.setSelectedItem(nv.getMaTaiKhoan());
    }

    void delete() {
        String MaNhanVien = txtMaNV2.getText();
        try {
            dao.delete(MaNhanVien);
            load();
            Reset();
            JOptionPane.showMessageDialog(this, "Xoá thành công");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Xoá thất bại");
        }
    }

    JFileChooser fileChooser = new JFileChooser();

    void chonAnh() {
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            XImage.save(file); // lưu hình vào thư mục logos
            ImageIcon icon = XImage.read(file.getName()); // đọc hình từ logos
            lblhinh.setIcon(icon);
            lblhinh.setToolTipText(file.getName()); // giữ tên hình trong tooltip
        }
    }

    void update() {
        NhanVien model = getmodel();
        try {
            dao.update(model);
            Reset();
            JOptionPane.showMessageDialog(this, "Cập nhật thành công");
            load();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    NhanVien getmodel() {
        NhanVien model = new NhanVien();
        model.setMaNhanVien(txtMaNV2.getText());
        model.setTenNhanVien(txtHoTen1.getText());
        model.setSDT(txtSoDT1.getText());
        model.setEmail(txtEmail.getText());
        model.setDiaChi(txtDiaChi.getText());
        model.setNgaySinh(jdcNgaySinh.getDate());
        model.setGioiTinh(rdoNam.isSelected() ? true : false);
        model.setMaChuyenNganh(cbbmachuyennganh.getSelectedItem().toString());
        model.setHinh(lblhinh.getToolTipText());
        return model;
    }

    void Reset() {
        txtMaNV2.setText("");
        txtHoTen1.setText("");
        txtSoDT1.setText("");
        txtEmail.setText("");
        txtDiaChi.setText("");
        jdcNgaySinh.setDate(null);
        rdoNam.isSelected();
        fillComboBoxChuyenNganh();
        lblhinh.setText("");
        fillcomboboxMaTK();
        cbb_MaTK.setEnabled(true);
        cbb_MaTK.setBackground(Color.white);
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
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private combobox.MaTaiKhoan cbb_MaTK;
    private combobox.CBBMaChuyenNganh cbbmachuyennganh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser jdcNgaySinh;
    private javax.swing.JLabel lblhinh;
    private rojeru_san.complementos.RSButtonHover rSButtonHover1;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private rojeru_san.complementos.RSTableMetro tblNhanVien;
    private textfield.DiaChi txtDiaChi;
    private textfield.Email txtEmail;
    private textfield.TenNhanVien txtHoTen1;
    private textfield.MaNhanVien txtMaNV2;
    private textfield.SDT txtSoDT1;
    private textfield.timkiem txttimkiem;
    // End of variables declaration//GEN-END:variables
}
