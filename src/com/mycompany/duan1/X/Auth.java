package com.mycompany.duan1.X;

import com.mycompany.duan1.model.NhanVien;
import com.mycompany.duan1.model.TaiKhoan;


public class Auth {
    /**
     * Đối tượng này chứa thông tin người sử dụng sau khi đăng nhập
     */
    public static TaiKhoan user = null;
    /**
     * Xóa thông tin của người sử dụng khi có yêu cầu đăng xuất
     */
    public static void clear() {
        Auth.user = null;
    }
    /**
     * Kiểm tra xem đăng nhập hay chưa
     */
    public static boolean isLogin() {
        return Auth.user != null;
    }
     /**
     * Kiểm tra xem có phải là trưởng phòng hay không
     */
public static boolean isGiangVien(){
    return Auth.user != null ;
}
public static boolean isNhanVien(){
    return Auth.user != null ;
}
public static boolean SinhVien(){
    return Auth.user != null ;
}
}
