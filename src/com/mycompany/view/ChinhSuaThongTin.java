/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.view;

import com.mycompany.duan1.X.Auth;
import com.mycompany.duan1.X.MsgBox;
import com.mycompany.duan1.dao.DoiMatKhauDAO;
import java.awt.Color;

/**
 *
 * @author ADMIN
 */
public class ChinhSuaThongTin extends javax.swing.JPanel {

    /**
     * Creates new form ChinhSuaThong
     */
    public ChinhSuaThongTin() {
        initComponents();
    }
   DoiMatKhauDAO dao = new DoiMatKhauDAO();
        
        public void DoiMatKhau(){
        txtConfirm.setBackground(Color.white);
        txtOld.setBackground(Color.white);
        String matKhau=new String(txtOld.getPassword());
        String matKhauMoi=new String(txtNew.getPassword());
        String xacNhanMKM=new String(txtConfirm.getPassword());
        if(matKhau.equals(Auth.user.getMatKhau())){
            if(matKhauMoi.equals(xacNhanMKM)){
                Auth.user.setMatKhau(matKhauMoi);
                dao.update(Auth.user);
                MsgBox.alert(this, "Đổi mật khẩu thành công!!");
             
            }else{
                txtConfirm.setBackground(Color.pink);
                MsgBox.alert(this, "Mật khẩu xác nhận không trùng mật khẩu");
            }
        }else{
            txtOld.setBackground(Color.pink);
            MsgBox.alert(this, "Mật khẩu cũ nhập không chính xác!");
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
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rSButtonHover1 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover2 = new rojeru_san.complementos.RSButtonHover();
        txtOld = new javax.swing.JPasswordField();
        txtNew = new javax.swing.JPasswordField();
        txtConfirm = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Change Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Mật khẩu phải:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setText("Mật khẩu mới");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/metrize.png"))); // NOI18N
        jLabel3.setText("ít nhất 6 kí tự");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel9.setText("Xác nhận mật khẩu");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/metrize.png"))); // NOI18N
        jLabel4.setText("ít nhất 1 chữ cái viết hoa (A ... Z)");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/metrize.png"))); // NOI18N
        jLabel5.setText("ít nhất 1 chữ thường (A ... Z)");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/metrize.png"))); // NOI18N
        jLabel6.setText("ít nhất 1 số (0...9)");

        rSButtonHover1.setText("LƯU");
        rSButtonHover1.setColorHover(new java.awt.Color(0, 112, 192));
        rSButtonHover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover1ActionPerformed(evt);
            }
        });

        rSButtonHover2.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonHover2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        rSButtonHover2.setForeground(new java.awt.Color(204, 204, 204));
        rSButtonHover2.setText("THOÁT");
        rSButtonHover2.setColorHover(new java.awt.Color(255, 255, 255));
        rSButtonHover2.setColorText(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("ĐỔI MẬT KHẨU");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setText("Mật khẩu cũ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(144, 144, 144))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8)
                    .addComponent(txtNew)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(txtOld, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9)
                    .addComponent(txtConfirm)
                    .addComponent(rSButtonHover1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                    .addComponent(rSButtonHover2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel5))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOld, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNew, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonHover1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonHover2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 570, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1090, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonHover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover1ActionPerformed
DoiMatKhau();        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private rojeru_san.complementos.RSButtonHover rSButtonHover1;
    private rojeru_san.complementos.RSButtonHover rSButtonHover2;
    private javax.swing.JPasswordField txtConfirm;
    private javax.swing.JPasswordField txtNew;
    private javax.swing.JPasswordField txtOld;
    // End of variables declaration//GEN-END:variables
}
