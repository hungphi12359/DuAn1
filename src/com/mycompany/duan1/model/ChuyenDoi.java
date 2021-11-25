package com.mycompany.duan1.model;


import com.mycompany.duan1.X.MsgBox;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ChuyenDoi {

    //Hàm đổi từ số sang chữ có định dạng 
    public static String DinhDangTien(double tien) {
        return NumberFormat.getNumberInstance().format(tien);
    }

    //Hàm chuyển từ chữ sang số để tính toán
    public static double ChuyenTien(String tien) {
        try {
            return NumberFormat.getNumberInstance().parse(tien).doubleValue();
        } catch (ParseException ex) {
//            GUI.frmHeThong.ThongBao("Thông báo", "Lỗi chuyển dữ liệu");

        }
        return 0;
    }

    //Hàm chuyển ngày tháng sang chữ 
    public static String DinhDangNgay(Date ngay) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        return dateFormat.format(ngay);
    }

    //Hàm chuyển chữ sang ngày tháng
    public static Date LayNgay(String ngay) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            return dateFormat.parse(ngay);
        } catch (ParseException ex) {
            MsgBox.alert(null, "Lỗi chuyển dữ liệu");
        }
        return null;
    }
          public static Date now() {
          
        return new Date();   //new Date lấy giờ hiện tại
    }
}
