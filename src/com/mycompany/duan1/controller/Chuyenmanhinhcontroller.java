/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.duan1.controller;

import com.mycompany.duan1.X.Auth;
import com.mycompany.duan1.X.MsgBox;
import com.mycompany.duan1.bean.DanhMucBean;

import com.mycompany.view.ChinhSuaThongTin;



import com.mycompany.view.LichHocJPanel;
import com.mycompany.view.MonHocJPanel;
import com.mycompany.view.NhanVienPanel;
import com.mycompany.view.QLTKPanel;
import com.mycompany.view.QuanLyDiemJPanel;
import com.mycompany.view.QuanLyLopHoc;
import com.mycompany.view.SendMail;
import com.mycompany.view.SinhVienJPanel;
import com.mycompany.view.ThanhToanDichVu;
import com.mycompany.view.ThongKeDuLieu;




import com.mycompany.view.TrangChuPanel;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ADMIN
 */
public class Chuyenmanhinhcontroller {
    private JPanel Root;
    private String kindSelected = "";
    private List<DanhMucBean> listItem = null;

    public Chuyenmanhinhcontroller() {
    }

    public Chuyenmanhinhcontroller(JPanel jpnRoot) {
        this.Root = jpnRoot;
    }
    public void setViews(JPanel jpnItem, JLabel jlbItem){
        kindSelected = "TrangChu";
        jpnItem.setBackground(new Color(28 ,28 ,28));
         jlbItem.setBackground(new Color(240, 4, 86));
         Root.removeAll();
         Root.setLayout(new BorderLayout());
         Root.add(new TrangChuPanel());
         Root.validate();
         Root.repaint();
         
    }
    public void setEvent(List<DanhMucBean> listItem){
this.listItem = listItem;
        
       for (DanhMucBean item : listItem) {
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }
    class LabelEvent implements MouseListener{
        private JPanel node;
        private String kind;
        private JPanel jpnItem;
        private JLabel jlbItem;

      
        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
        
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }

      

        @Override
        public void mouseClicked(MouseEvent e) {
          switch(kind){
              case "TrangChu":
                  
                  node = new TrangChuPanel();
                  break;
                   case "SinhVien":
                       if(Auth.isSinhVien()){
            MsgBox.alert(null, "BẠN K CÓ QUYỀN TRUY CẬP");
            return;
         }else{
          node = new SinhVienJPanel();           
                      }
               
                      break;
                  case "NhanVien":
                  node = new NhanVienPanel();
                  break;
                    case "MonHoc":
                  node = new MonHocJPanel();
                  break;
                    case "TTDV":
                  node = new ThanhToanDichVu();
                  break;
                    case "LichHoc":
                  node = new LichHocJPanel();
                  break;
                    case "QLDiem":
                  node = new QuanLyDiemJPanel();
                  break;
                    case "QLLopHoc":
                  node = new QuanLyLopHoc();
                  break;
                    case "SendMail":
                  node = new SendMail();
                  break;
                    case "QLTaiKhoan":
                  node = new QLTKPanel();
                  break;
                    case "TKDL":
                  node = new ThongKeDuLieu();
                  break;
                     case "DoiMatKhau":
                  node = new ChinhSuaThongTin();
                  break;

        

           
          }
          Root.removeAll();
          Root.setLayout(new BorderLayout());
          Root.add(node);
          Root.validate();
          Root.repaint();
        }

        @Override
        public void mousePressed(MouseEvent e) {
           kindSelected = kind;
           jpnItem.setBackground(new Color(159, 182 ,205));
           jlbItem.setBackground(new Color(159 ,182, 205)); 
          }
        @Override
        public void mouseReleased(MouseEvent e) {
               kindSelected = kind;
             jpnItem.setBackground(new Color(51,51,51));
              jlbItem.setBackground(new Color(51,51,51));
        }

        @Override
        public void mouseEntered(MouseEvent e) {
                kindSelected = kind;
             jpnItem.setBackground(new Color(51,51,51));
           jlbItem.setBackground(new Color(51,51,51));
        }

        @Override
        public void mouseExited(MouseEvent e) {
          if(!kindSelected.equals(kind)){
              jpnItem.setBackground(new Color(51,51,51));
              jlbItem.setBackground(new Color(51,51,51));
          }
        }
        private void setChangeBackgruond(String kind){
            for (DanhMucBean item : listItem) {
                if(item.getKind().equalsIgnoreCase(kind)){
                    item.getJpn().setBackground(new Color(255 ,222, 173));
                    item.getJlb().setBackground(new Color(255 ,222, 173));
                }else{
                    item.getJpn().setBackground(new Color(255 ,222, 173));
                    item.getJlb().setBackground(new Color(255 ,222, 173));
                }
            }
        }
        
    }
}
