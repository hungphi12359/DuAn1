/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.view;

import com.mycompany.duan1.X.Auth;
import com.mycompany.duan1.X.MsgBox;
import com.mycompany.duan1.X.Validate;
import com.mycompany.duan1.dao.TaiKhoanDao;
import com.mycompany.duan1.model.TaiKhoan;
import java.awt.Color;
import static java.awt.Color.red;
import static java.awt.Color.white;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import scrollbar.ScrollBarCustom;

/**
 *
 * @author quang
 */
public class QLTKPanel extends javax.swing.JPanel {
     Validate vld = new Validate();
   TaiKhoanDao tkDao = new TaiKhoanDao();
    int row = -1;
    /**
     * Creates new form QLTKPanel
     */
    public QLTKPanel() {
        initComponents();
        init();
    }
     void init(){
        FillTable();
        fixTable();
    }
     void fixTable(){
        Scrollbar.getViewport().setBackground(Color.WHITE);
        Scrollbar.setVerticalScrollBar(new ScrollBarCustom());
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        Scrollbar.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        Scrollbar.setBorder(new EmptyBorder(5, 10, 5, 10));
    }
    
    void FillTable() {
        DefaultTableModel model = (DefaultTableModel) tbltaikhoan.getModel();
        model.setRowCount(0);
        List<TaiKhoan> list = tkDao.selectAll();
        for (TaiKhoan tk : list) {
            String temp = "";
            for (int i = 0; i < tk.getMatKhau().length(); i++) {
                if (tk.getMatKhau().length() == temp.length()) {
                    temp = "";
                } else {
                    temp += "*";
                }
            }
            Object[] row = {
                tk.getMaTK(),
                tk.getTenTaiKhoan(),
                temp,
                tk.getVaiTro() == 0 ? "Nh??n Vi??n" : tk.getVaiTro() == 1 ? "Gi???ng Vi??n" : "Sinh Vi??n"
            };
            model.addRow(row);
        }

    }

    void setForm(TaiKhoan model) {
        txt_MaTK.setText(model.getMaTK());
        txt_Tentaikhoan.setText(model.getTenTaiKhoan());
        txt_Matkhau.setText(model.getMatKhau());
        cbbVaitro.setSelectedIndex(model.getVaiTro());
    }

    void clearForm() {
        try {
            TaiKhoan tk = new TaiKhoan();
            this.setForm(tk);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "L???i truy tr???n");
        }
    }

    public TaiKhoan getForm() {
        TaiKhoan tk = new TaiKhoan();
        if (txt_MaTK.getText().equals("") || txt_Matkhau.getText().equals("") || txt_Tentaikhoan.getText().equals("")) {
            return null;
        } else {
            tk.setMaTK(txt_MaTK.getText());
            tk.setTenTaiKhoan(txt_Tentaikhoan.getText());
            tk.setMatKhau(new String(txt_Matkhau.getPassword()));
            tk.setVaiTro(cbbVaitro.getSelectedIndex());
            return tk;
        }
    }

    void Edit() {
        try {
            String MaTK = (String) tbltaikhoan.getValueAt(this.row, 0);
            TaiKhoan model = tkDao.selectById(MaTK);
            if (model != null) {
                setForm(model);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "L???i truy v???n d??? li???u");
        }
    }

    void insert() {
        TaiKhoan tk = getForm();
        if (tk == null) {
            MsgBox.alert(this, "Th??ng tin kh??ng ???????c b??? tr???ng");
        } else {
            try {
                tkDao.insert(tk);
                this.FillTable();
                this.clearForm();
                MsgBox.alert(this, "Th??m th??nh c??ng");
            } catch (Exception e) {
                MsgBox.alert(this, "Th??m th???t b???i");
            }
        }
    }

    void update() {
        TaiKhoan tk = getForm();
        if (tk == null) {
            MsgBox.alert(this, "Th??ng tin kh??ng ???????c ????? tr???ng");
        } else {
            try {
                tkDao.update(tk);
                MsgBox.alert(this, "C???p nh???t th??nh c??ng");
                this.FillTable();
            } catch (Exception e) {
                e.printStackTrace();
                MsgBox.alert(this, "C???p nh???t th???t b???i");
            }
        }
    }
    TaiKhoan tk = new TaiKhoan();

    void delete() {
        String matk = txt_MaTK.getText();
        if (matk.equals(Auth.user.getMaTK())) {
            MsgBox.alert(this, "B???n kh??ng th??? xo?? ch??nh b???n");
        } else if (MsgBox.confirm(this, "Ban th???c s??? mu???n xo?? t??i kho???n n??y ?")) {
            try {
                tkDao.delete(matk);
                this.FillTable();
                this.clearForm();
                MsgBox.alert(this, "Xo?? th??nh c??ng");
            } catch (Exception e) {
                e.printStackTrace();
                MsgBox.alert(this, "Xo?? th???t b???i");
            }
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

        rSCalendarBeanInfo1 = new rojeru_san.componentes.RSCalendarBeanInfo();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_MaTK = new javax.swing.JTextField();
        txt_Matkhau = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        Scrollbar = new javax.swing.JScrollPane();
        tbltaikhoan = new rojeru_san.complementos.RSTableMetro();
        jLabel11 = new javax.swing.JLabel();
        cbbVaitro = new javax.swing.JComboBox<>();
        txt_Tentaikhoan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        timkiem1 = new textfield.timkiem();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.MatteBorder(null));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)), "QU???N L?? T??I KHO???N", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("M?? t??i kho???n");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 20));

        txt_MaTK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_MaTK.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txt_MaTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 250, 30));

        txt_Matkhau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_Matkhau.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txt_Matkhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 290, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("M???t kh???u");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 70, 20));

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/Add.png"))); // NOI18N
        btnThem.setText("Th??m");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel1.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 100, 40));

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/Delete.png"))); // NOI18N
        btnXoa.setText("Xo??");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel1.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 70, 100, 40));

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/Refresh.png"))); // NOI18N
        btnSua.setText("S???a");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, 100, 40));

        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/Properties.png"))); // NOI18N
        btnLamMoi.setText("L??m m???i");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });
        jPanel1.add(btnLamMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 70, 100, 40));

        tbltaikhoan.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 51)));
        tbltaikhoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "M?? t??i kho???n", "T??n ????ng Nh???p", "M???t Kh???u", "Vai tr??"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbltaikhoan.setColorBackgoundHead(new java.awt.Color(204, 0, 51));
        tbltaikhoan.setColorBordeFilas(new java.awt.Color(204, 0, 51));
        tbltaikhoan.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tbltaikhoan.setRowHeight(45);
        tbltaikhoan.setRowMargin(-1);
        tbltaikhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbltaikhoanMouseClicked(evt);
            }
        });
        Scrollbar.setViewportView(tbltaikhoan);

        jPanel1.add(Scrollbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 168, 1080, 410));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Vai tr??");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 60, 30));

        cbbVaitro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbbVaitro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nh??n Vi??n", "Gi???ng Vi??n", "Sinh Vi??n" }));
        cbbVaitro.setBorder(null);
        jPanel1.add(cbbVaitro, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 290, 30));

        txt_Tentaikhoan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_Tentaikhoan.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txt_Tentaikhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 250, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("T??n t??i kho???n");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 90, 30));

        timkiem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timkiem1ActionPerformed(evt);
            }
        });
        timkiem1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                timkiem1KeyPressed(evt);
            }
        });
        jPanel1.add(timkiem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 110, 240, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbltaikhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbltaikhoanMouseClicked
this.row = tbltaikhoan.getSelectedRow();
        Edit();        // TODO add your handling code here:
    }//GEN-LAST:event_tbltaikhoanMouseClicked
  
    public boolean checkTrungMa(JTextField txt, StringBuilder sb, String errorMessage) {
        txt.setBackground(white);
        if (tkDao.selectById(txt.getText()) == null) {
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
            checkTrungMa(txt_MaTK, sb, "M?? T??i Kho???n N??y ???? T???n T???i Tr??n H??? Th???ng");
            vld.ValidatorNullJText(txt_MaTK, sb, "M?? L???p H???c Kh??ng ???????c ????? Tr???ng");
            vld.ValidatorNullJText(txt_Tentaikhoan, sb, "T??n L???p H???c Kh??ng ???????c ????? Tr???ng");
            vld.ValidatorNullJText(txt_Matkhau, sb, "T??n L???p H???c Kh??ng ???????c ????? Tr???ng");

            if (sb.length() > 0) {
                MsgBox.showErrorDialog(jPanel1, sb.toString(), "???? X???y Ra L???i");
                return;
            }
            insert(); 
        } catch (Exception e) {
              MsgBox.showErrorDialog(jPanel1, "C?? L???i X???y Ra", "???? X???y Ra L???i");
              e.printStackTrace();
        }
             // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        try {
                        StringBuilder sb = new StringBuilder();
         
            vld.ValidatorNullJText(txt_MaTK, sb, "M?? L???p H???c Kh??ng ???????c ????? Tr???ng");
            vld.ValidatorNullJText(txt_Tentaikhoan, sb, "T??n L???p H???c Kh??ng ???????c ????? Tr???ng");
            vld.ValidatorNullJText(txt_Matkhau, sb, "T??n L???p H???c Kh??ng ???????c ????? Tr???ng");
            vld.checkMaNV(txt_MaTK, sb, "M?? T??i Kho???n Kh??ng ???????c Q??a 7 K?? T???");
            if (sb.length() > 0) {
                MsgBox.showErrorDialog(jPanel1, sb.toString(), "???? X???y Ra L???i");
                return;
            }
            update();
        } catch (Exception e) {
        }
                // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        try {
                        StringBuilder sb = new StringBuilder();
         
            vld.ValidatorNullJText(txt_MaTK, sb, "M?? T??i Kho???n Kh??ng ???????c ????? Tr???ng");

            if (sb.length() > 0) {
                MsgBox.showErrorDialog(jPanel1, sb.toString(), "???? X???y Ra L???i");
                return;
            }
            delete(); 
        } catch (Exception e) {
                MsgBox.showErrorDialog(jPanel1, "L???i X???y Ra", "???? X???y Ra L???i");
        }
               // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
clearForm();        // TODO add your handling code here:
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void timkiem1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_timkiem1KeyPressed
          try {
            DefaultTableModel model = (DefaultTableModel) tbltaikhoan.getModel();
            model.setRowCount(0);
            String keyword = timkiem1.getText();
            List<TaiKhoan> list = tkDao.selectByTenTK(keyword);
            for (TaiKhoan nh : list) {
//                   String temp = "";
//            for (int i = 0; i < tk.getMatKhau().length(); i++) {
//                if (tk.getMatKhau().length() == temp.length()) {
//                    temp = "";
//                } else {
//                    temp += "*";
//                }
//            }
                model.addRow(new Object[]{
                    nh.getMaTK(),
                    nh.getTenTaiKhoan(),
                    //                    nh.getNgaySinh(),
                    nh.getMatKhau(),
                 nh.getVaiTro() == 0 ? "Nh??n Vi??n" : tk.getVaiTro() == 1 ? "Gi???ng Vi??n" : "Sinh Vi??n"
                    //                    nh.getSDT(),
                    //                    nh.getDiaChi(),

              
                });

            }

        } catch (Exception e) {
            MsgBox.alert(this, "L???i Truy V???n");
        }      // TODO add your handling code here:
    }//GEN-LAST:event_timkiem1KeyPressed

    private void timkiem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timkiem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timkiem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Scrollbar;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbbVaitro;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private rojeru_san.componentes.RSCalendarBeanInfo rSCalendarBeanInfo1;
    private rojeru_san.complementos.RSTableMetro tbltaikhoan;
    private textfield.timkiem timkiem1;
    private javax.swing.JTextField txt_MaTK;
    private javax.swing.JPasswordField txt_Matkhau;
    private javax.swing.JTextField txt_Tentaikhoan;
    // End of variables declaration//GEN-END:variables
}
