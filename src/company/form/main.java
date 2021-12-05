/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package company.form;

import com.mycompany.duan1.X.Auth;
import com.mycompany.duan1.bean.DanhMucBean;
import com.mycompany.duan1.controller.Chuyenmanhinhcontroller;

import com.mycompany.view.DangNhap;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.mycompany.duan1.X.XImage;

import com.mycompany.view.KhoiDong1;
import com.mycompany.view.QRCodeCamera;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.statistics.HistogramDataset;

/**
 *
 * @author ADMIN
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        setExtendedState(getExtendedState()|JFrame.MAXIMIZED_BOTH);
        initComponents();
        setTitle("Quản Lý Học Viên");
        Chuyenmanhinhcontroller controller = new Chuyenmanhinhcontroller(jpnView);
        controller.setViews(jpnTrangChu, jlbTrangChu);
        this.openWelcome();
    
        List<DanhMucBean> listItem = new ArrayList<>();
        listItem.add(new DanhMucBean("TrangChu", jpnTrangChu, jlbTrangChu));
        listItem.add(new DanhMucBean("SinhVien", jpnSinhVien, jlbHocVien));
        listItem.add(new DanhMucBean("NhanVien", jpnNhanVien, jlbNhanVien));
        listItem.add(new DanhMucBean("MonHoc", jpnMonHoc, jlbMonHoc));
        listItem.add(new DanhMucBean("TTDV", jpnHocPhi, jlbHocPhi));
        listItem.add(new DanhMucBean("QLDiem", jpnQuanLyDiem, jlbQuanLyDiem));
        listItem.add(new DanhMucBean("QLLopHoc", jpnQuanLyLopHoc, jlbQLLopHoc));
        listItem.add(new DanhMucBean("QLTaiKhoan", jpnQuanLyTaiKhoan, jlbQLTK));
        listItem.add(new DanhMucBean("SendMail", jpnGuiTinNhan, jlbGuiTinNhan));
        listItem.add(new DanhMucBean("LichHoc", jpnLichHoc, jlbLichHoc));
        listItem.add(new DanhMucBean("TKDL", jpnThongKeDuLieu, jlbtkdl));
        listItem.add(new DanhMucBean("DoiMatKhau", jpnDoiMatKhau, jlbDoiMatKhau1));
        listItem.add(new DanhMucBean("ChuyenNganh", jpnChuyenNganh, jlbChuyenNganh));

        controller.setEvent(listItem);
    }

    void openWelcome() {
        new KhoiDong1(this, true).setVisible(true);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbUserName = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jpnNhanVien = new javax.swing.JPanel();
        jlbNhanVien = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jpnTrangChu = new javax.swing.JPanel();
        jlbTrangChu = new javax.swing.JLabel();
        jpnMonHoc = new javax.swing.JPanel();
        jlbMonHoc = new javax.swing.JLabel();
        jpnSinhVien = new javax.swing.JPanel();
        jlbHocVien = new javax.swing.JLabel();
        jpnHocVien1 = new javax.swing.JPanel();
        jlbHocVien1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jpnHocPhi = new javax.swing.JPanel();
        jlbHocPhi = new javax.swing.JLabel();
        jpnLichHoc = new javax.swing.JPanel();
        jlbLichHoc = new javax.swing.JLabel();
        jpnQuanLyDiem = new javax.swing.JPanel();
        jlbQuanLyDiem = new javax.swing.JLabel();
        jpnQuanLyLopHoc = new javax.swing.JPanel();
        jlbQLLopHoc = new javax.swing.JLabel();
        jpnGuiTinNhan = new javax.swing.JPanel();
        jlbGuiTinNhan = new javax.swing.JLabel();
        jpnQuanLyTaiKhoan = new javax.swing.JPanel();
        jlbQLTK = new javax.swing.JLabel();
        jpnThongKeDuLieu = new javax.swing.JPanel();
        jlbtkdl = new javax.swing.JLabel();
        jpnDoiMatKhau = new javax.swing.JPanel();
        jlbDoiMatKhau1 = new javax.swing.JLabel();
        jpnChuyenNganh = new javax.swing.JPanel();
        jlbChuyenNganh = new javax.swing.JLabel();
        jpnView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 0, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1370, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 45)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("l");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/icons8_menu_48px_1.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("BankGothic-Medium", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("edusys app");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 45)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("l");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 45)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("l");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/search_26px.png"))); // NOI18N

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/group_message_26px.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/bell_26px.png"))); // NOI18N

        lbUserName.setFont(new java.awt.Font("Tekton Pro Cond", 0, 18)); // NOI18N
        lbUserName.setForeground(new java.awt.Color(255, 255, 255));
        lbUserName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbUserName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/male_user_50px.png"))); // NOI18N
        lbUserName.setText("Hello, Admin");
        lbUserName.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbUserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbUserNameMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(jLabel6)
                .addGap(0, 0, 0)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel5)
                .addGap(0, 0, 0)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel2))
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lbUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(270, 625));

        jpnNhanVien.setBackground(new java.awt.Color(51, 51, 51));
        jpnNhanVien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbNhanVien.setBackground(new java.awt.Color(0, 0, 0));
        jlbNhanVien.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlbNhanVien.setForeground(new java.awt.Color(204, 204, 204));
        jlbNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/sort_window_24px.png"))); // NOI18N
        jlbNhanVien.setText("Quản Lý Nhân Viên");
        jpnNhanVien.add(jlbNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 240, 40));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/sort_window_24px.png"))); // NOI18N
        jLabel19.setText("Đăng Xuất");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 240, 50));

        jpnNhanVien.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 270, 50));

        jpnTrangChu.setBackground(new java.awt.Color(102, 102, 102));
        jpnTrangChu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbTrangChu.setBackground(new java.awt.Color(0, 0, 0));
        jlbTrangChu.setFont(new java.awt.Font("UTM Avo", 1, 18)); // NOI18N
        jlbTrangChu.setForeground(new java.awt.Color(255, 51, 102));
        jlbTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/home_24px.png"))); // NOI18N
        jlbTrangChu.setText("Trang Chủ");
        jpnTrangChu.add(jlbTrangChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 240, 60));

        jpnMonHoc.setBackground(new java.awt.Color(51, 51, 51));
        jpnMonHoc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbMonHoc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlbMonHoc.setForeground(new java.awt.Color(204, 204, 204));
        jlbMonHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/tiles_26px.png"))); // NOI18N
        jlbMonHoc.setText("Quản Lý Môn Học");
        jpnMonHoc.add(jlbMonHoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 240, 40));

        jpnSinhVien.setBackground(new java.awt.Color(51, 51, 51));
        jpnSinhVien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbHocVien.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlbHocVien.setForeground(new java.awt.Color(204, 204, 204));
        jlbHocVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/grid_24px.png"))); // NOI18N
        jlbHocVien.setText("Quản Lý Sinh Viên");
        jpnSinhVien.add(jlbHocVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 240, 40));

        jpnHocVien1.setBackground(new java.awt.Color(51, 51, 51));
        jpnHocVien1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbHocVien1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlbHocVien1.setForeground(new java.awt.Color(204, 204, 204));
        jlbHocVien1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/grid_24px.png"))); // NOI18N
        jlbHocVien1.setText("Quản Lý Sinh Viên");
        jpnHocVien1.add(jlbHocVien1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 240, 40));

        jpnSinhVien.add(jpnHocVien1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 270, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Công Cụ");

        jpnHocPhi.setBackground(new java.awt.Color(51, 51, 51));
        jpnHocPhi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbHocPhi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlbHocPhi.setForeground(new java.awt.Color(204, 204, 204));
        jlbHocPhi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/grid_24px.png"))); // NOI18N
        jlbHocPhi.setText("Quản Lý Học Phí");
        jpnHocPhi.add(jlbHocPhi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 240, 40));

        jpnLichHoc.setBackground(new java.awt.Color(51, 51, 51));
        jpnLichHoc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbLichHoc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlbLichHoc.setForeground(new java.awt.Color(204, 204, 204));
        jlbLichHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/template_26px.png"))); // NOI18N
        jlbLichHoc.setText("Lịch Học");
        jpnLichHoc.add(jlbLichHoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 240, 40));

        jpnQuanLyDiem.setBackground(new java.awt.Color(51, 51, 51));
        jpnQuanLyDiem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbQuanLyDiem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlbQuanLyDiem.setForeground(new java.awt.Color(204, 204, 204));
        jlbQuanLyDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/categorize_24px.png"))); // NOI18N
        jlbQuanLyDiem.setText("Quản Lý Điểm");
        jpnQuanLyDiem.add(jlbQuanLyDiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 240, 40));

        jpnQuanLyLopHoc.setBackground(new java.awt.Color(51, 51, 51));
        jpnQuanLyLopHoc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbQLLopHoc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlbQLLopHoc.setForeground(new java.awt.Color(204, 204, 204));
        jlbQLLopHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/add_user_group_woman_man_24px.png"))); // NOI18N
        jlbQLLopHoc.setText("Quản Lý Lớp Học");
        jpnQuanLyLopHoc.add(jlbQLLopHoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 240, 40));

        jpnGuiTinNhan.setBackground(new java.awt.Color(51, 51, 51));
        jpnGuiTinNhan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbGuiTinNhan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlbGuiTinNhan.setForeground(new java.awt.Color(204, 204, 204));
        jlbGuiTinNhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/google_forms_24px.png"))); // NOI18N
        jlbGuiTinNhan.setText("Gửi Tin Nhắn");
        jpnGuiTinNhan.add(jlbGuiTinNhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 240, 40));

        jpnQuanLyTaiKhoan.setBackground(new java.awt.Color(51, 51, 51));
        jpnQuanLyTaiKhoan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbQLTK.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlbQLTK.setForeground(new java.awt.Color(204, 204, 204));
        jlbQLTK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/tiles_26px.png"))); // NOI18N
        jlbQLTK.setText("Quản Lý Tài Khoản");
        jpnQuanLyTaiKhoan.add(jlbQLTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 240, 40));

        jpnThongKeDuLieu.setBackground(new java.awt.Color(51, 51, 51));
        jpnThongKeDuLieu.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jpnThongKeDuLieuAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jpnThongKeDuLieu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbtkdl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlbtkdl.setForeground(new java.awt.Color(204, 204, 204));
        jlbtkdl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/account_24px.png"))); // NOI18N
        jlbtkdl.setText("Thống Kê Dữ Liệu");
        jpnThongKeDuLieu.add(jlbtkdl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 240, 40));

        jpnDoiMatKhau.setBackground(new java.awt.Color(51, 51, 51));
        jpnDoiMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnDoiMatKhauMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpnDoiMatKhauMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpnDoiMatKhauMouseExited(evt);
            }
        });
        jpnDoiMatKhau.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbDoiMatKhau1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlbDoiMatKhau1.setForeground(new java.awt.Color(204, 204, 204));
        jlbDoiMatKhau1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/edit_property_24px.png"))); // NOI18N
        jlbDoiMatKhau1.setText("Đổi Mật Khẩu");
        jlbDoiMatKhau1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbDoiMatKhau1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlbDoiMatKhau1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlbDoiMatKhau1MouseExited(evt);
            }
        });
        jpnDoiMatKhau.add(jlbDoiMatKhau1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 240, 40));

        jpnChuyenNganh.setBackground(new java.awt.Color(51, 51, 51));
        jpnChuyenNganh.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbChuyenNganh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlbChuyenNganh.setForeground(new java.awt.Color(204, 204, 204));
        jlbChuyenNganh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/icons/grid_24px.png"))); // NOI18N
        jlbChuyenNganh.setText("Chuyên Ngành");
        jlbChuyenNganh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbChuyenNganhMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlbChuyenNganhMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlbChuyenNganhMouseExited(evt);
            }
        });
        jpnChuyenNganh.add(jlbChuyenNganh, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 240, 40));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnChuyenNganh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpnSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnHocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnLichHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnQuanLyDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnQuanLyLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnGuiTinNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnQuanLyTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnThongKeDuLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jpnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jpnSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnHocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnLichHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnQuanLyDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnQuanLyLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnGuiTinNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnQuanLyTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnThongKeDuLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnChuyenNganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnView.setBackground(new java.awt.Color(255, 255, 255));
        jpnView.setPreferredSize(new java.awt.Dimension(1100, 625));

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpnView, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        setSize(new java.awt.Dimension(1386, 715));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jlbChuyenNganhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbChuyenNganhMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_jlbChuyenNganhMouseClicked

    private void jpnThongKeDuLieuAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jpnThongKeDuLieuAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jpnThongKeDuLieuAncestorMoved

    private void jpnDoiMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnDoiMatKhauMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jpnDoiMatKhauMouseClicked

    private void jpnDoiMatKhauMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnDoiMatKhauMouseEntered
//        jpnDoiMatKhau.setBackground(new Color(159, 182, 205));
//        jpnDoiMatKhau.setBackground(new Color(159, 182, 205));        // TODO add your handling code here:
    }//GEN-LAST:event_jpnDoiMatKhauMouseEntered

    private void jpnDoiMatKhauMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnDoiMatKhauMouseExited
jpnDoiMatKhau.setBackground(new Color(51, 51, 51));
        jpnDoiMatKhau.setBackground(new Color(51, 51, 51));
        // TODO add your handling code here:
    }//GEN-LAST:event_jpnDoiMatKhauMouseExited

    private void jlbChuyenNganhMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbChuyenNganhMouseEntered
        // TODO add your handling code here:
//        jpnDoiMatKhau.setBackground(new Color(159, 182, 205));
//        jpnDoiMatKhau.setBackground(new Color(159, 182, 205));
    }//GEN-LAST:event_jlbChuyenNganhMouseEntered

    private void jlbChuyenNganhMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbChuyenNganhMouseExited
        // TODO add your handling code here:
        jpnDoiMatKhau.setBackground(new Color(51, 51, 51));
        jpnDoiMatKhau.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_jlbChuyenNganhMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            processLogin();
        } catch (Exception e) {
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void lbUserNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbUserNameMouseClicked
        dispose();
        new DangNhap(this, true).setVisible(true);
    }//GEN-LAST:event_lbUserNameMouseClicked

    private void jlbDoiMatKhau1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbDoiMatKhau1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jlbDoiMatKhau1MouseClicked

    private void jlbDoiMatKhau1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbDoiMatKhau1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jlbDoiMatKhau1MouseEntered

    private void jlbDoiMatKhau1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbDoiMatKhau1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jlbDoiMatKhau1MouseExited

    /**
     * @param args the command line arguments
     */
    public void processLogin() {

        lbUserName.setText("Hello," + Auth.user.getTenTaiKhoan());
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel jlbChuyenNganh;
    private javax.swing.JLabel jlbDoiMatKhau1;
    private javax.swing.JLabel jlbGuiTinNhan;
    private javax.swing.JLabel jlbHocPhi;
    private javax.swing.JLabel jlbHocVien;
    private javax.swing.JLabel jlbHocVien1;
    private javax.swing.JLabel jlbLichHoc;
    private javax.swing.JLabel jlbMonHoc;
    private javax.swing.JLabel jlbNhanVien;
    private javax.swing.JLabel jlbQLLopHoc;
    private javax.swing.JLabel jlbQLTK;
    private javax.swing.JLabel jlbQuanLyDiem;
    private javax.swing.JLabel jlbTrangChu;
    private javax.swing.JLabel jlbtkdl;
    private javax.swing.JPanel jpnChuyenNganh;
    private javax.swing.JPanel jpnDoiMatKhau;
    private javax.swing.JPanel jpnGuiTinNhan;
    private javax.swing.JPanel jpnHocPhi;
    private javax.swing.JPanel jpnHocVien1;
    private javax.swing.JPanel jpnLichHoc;
    private javax.swing.JPanel jpnMonHoc;
    private javax.swing.JPanel jpnNhanVien;
    private javax.swing.JPanel jpnQuanLyDiem;
    private javax.swing.JPanel jpnQuanLyLopHoc;
    private javax.swing.JPanel jpnQuanLyTaiKhoan;
    private javax.swing.JPanel jpnSinhVien;
    private javax.swing.JPanel jpnThongKeDuLieu;
    private javax.swing.JPanel jpnTrangChu;
    private javax.swing.JPanel jpnView;
    private javax.swing.JLabel lbUserName;
    // End of variables declaration//GEN-END:variables
}
