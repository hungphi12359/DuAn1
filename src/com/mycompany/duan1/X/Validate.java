/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.duan1.X;


import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import static java.awt.Color.pink;
import static java.awt.Color.white;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Sieu Nhan Bay
 */
public class Validate {
    public static boolean checkMaNV(JTextField field,StringBuilder sb,String errorMessage) {
        boolean ok = true;
        field.setBackground(white);
        String id = field.getText();
        String rgx = "[a-zA-Z0-9]{1,7}";
        if (id.matches(rgx)) {
            ok = true;
        } else {
            sb.append(errorMessage).append("\n");
            field.setBackground(pink);
            field.requestFocus();
            
            ok = false;
        }
        return ok;
    }
        public static boolean checkMaNH(JTextField field,StringBuilder sb,String errorMessage) {
        field.setBackground(white);
        String id = field.getText();
        String rgx = "[a-zA-Z0-9]{7}";
        if (id.matches(rgx)) {
            return true;
        } else {
            field.setBackground(pink);
            sb.append(errorMessage).append("\n");
               field.requestFocus();
            return false;
        }
    }
            public static boolean checkMaCD(JTextField field,StringBuilder sb,String errorMessage) {
        field.setBackground(white);
        String id = field.getText();
        String rgx = "[a-zA-Z0-9]{5}";
        if (id.matches(rgx)) {
            return true;
        } else {
            field.setBackground(pink);
           sb.append(errorMessage).append("\n");
               field.requestFocus();
            return false;
        }
    }
                public static boolean checkTenCD(JTextField field,StringBuilder sb,String errorMessage) {
        field.setBackground(white);
        String id = field.getText();
        String rgx = ".{3,50}";
        if (id.matches(rgx)) {
            return true;
        } else {
            field.setBackground(pink);
               sb.append(errorMessage).append("\n");
               field.requestFocus();
//            dialogHelper.alert(txt.getRootPane(), txt.getName() + " phải từ 3-50 kí tự.");
            return false;
        }
    }
                   public static boolean checkMoTaCD(JTextArea field,StringBuilder sb,String errorMessage) {
        field.setBackground(white);
        String id = field.getText();
        String rgx = ".{3,255}";
        if (id.matches(rgx)) {
            return true;
        } else {
            field.setBackground(pink);
//            dialogHelper.alert(txt.getRootPane(), txt.getName() + " phải từ 3-255 kí tự.");
             sb.append(errorMessage).append("\n");
               field.requestFocus();
            return false;
        }
    }
                       //gồm 10 số 
    //các đầu 3 số của nhà mạng
    public static boolean checkSDT(JTextField field,StringBuilder sb,String errorMessage) {
        field.setBackground(white);
        String id = field.getText();
        String rgx = "(086|096|097|098|032|033|034|035|036|037|038|039|089|090|093|070|079|077|078|076|088|091|094|083|084|085|081|082|092|056|058|099|059|094)[0-9]{7}";
        if (id.matches(rgx)) {
            return true;
        } else {
            field.setBackground(pink);
             sb.append(errorMessage).append("\n");
               field.requestFocus();
//            dialogHelper.alert(txt.getRootPane(), txt.getName() + " phải gồm 10 số\nđúng các đầu số của nhà mạng.");
            return false;
        }
    }

    public static boolean checkEmail(JTextField field,StringBuilder sb,String errorMessage) {
        field.setBackground(white);
        String id = field.getText();
        String rgx = "^[a-zA-Z][a-zA-Z0-9_\\.]{2,32}@[a-zA-Z0-9]{2,10}(\\.[a-zA-Z0-9]{2,4}){1,2}$";
        if (id.matches(rgx)) {
            return true;
        } else {
            field.setBackground(pink);
//            dialogHelper.alert(txt.getRootPane(), txt.getName() + " không đúng định dạng");
 sb.append(errorMessage).append("\n");
               field.requestFocus();
            return false;
        }
    }

    //gio là int >0
    public static boolean checkThoiLuong(JTextField field,StringBuilder sb,String errorMessage) {
        field.setBackground(white);
        try {
            int hour = Integer.parseInt(field.getText());
            if (hour >= 0) {
                return true;
            } else {
                field.setBackground(pink);
                 sb.append(errorMessage).append("\n");
               field.requestFocus();
//                dialogHelper.alert(txt.getRootPane(), txt.getName() + " phải lớn hơn bằng 0.");
                return false;
            }
        } catch (NumberFormatException e) {
            field.setBackground(pink);
            sb.append("Thời Lượng nhập vào phải là số nguyên").append("\n");
            return false;
        }
    }

    //học phí là float >0
    public static boolean checkHocPhi(JTextField field,StringBuilder sb,String errorMessage) {
        field.setBackground(white);
        try {
            float hp = Float.parseFloat(field.getText());
            if (hp >= 0) {
                return true;
            } else {
                field.setBackground(pink);
                 sb.append(errorMessage).append("\n");
               field.requestFocus();
//                dialogHelper.alert(txt.getRootPane(), txt.getName() + " phải là lớn hơn bằng 0.");
                return false;
            }
        } catch (NumberFormatException e) {
            field.setBackground(pink);
               sb.append("Học Phí nhập vào phải là số thực").append("\n");
            return false;
        }
    }

    public static boolean checkDiem(JTextField field,StringBuilder sb,String errorMessage) {
        field.setBackground(white);
        try {
            float hp = Float.parseFloat(field.getText());
            if ((hp >= 0 && hp <= 10)||hp==-1) {
                return true;
            } else {
                field.setBackground(pink);
                  sb.append(errorMessage).append("\n");
               field.requestFocus();
//                dialogHelper.alert(txt.getRootPane(), txt.getName() + " phải là trong khoảng 0-10 hoặc chưa nhập (-1).");
                return false;
            }
        } catch (NumberFormatException e) {
            field.setBackground(pink);
              sb.append("Điểm nhập vào phải là số thực").append("\n");
            return false;
        }
    }
        public static boolean checkName(JTextField field,StringBuilder sb,String errorMessage) {
        field.setBackground(white);
        String id = field.getText();
        String rgx = "^[A-Za-zÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝàáâãèéêìíòóôõùúýĂăĐđĨĩŨũƠơƯưẠ-ỹ ]{3,25}$";
        if (id.matches(rgx)) {
            return true;
        } else {
            field.setBackground(pink);
              sb.append(errorMessage).append("\n");
               field.requestFocus();
//            dialogHelper.alert(txt.getRootPane(), txt.getName() + " phải là tên tiếng việt hoặc không đấu\ntừ 3-25 kí tự");
            return false;
        }
    }
        public static boolean isDate(JTextField field,StringBuilder sb,String errorMessage){
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            if(!ValidatorNullJText(field, sb, errorMessage)){
                return false;
            }else{
                try {
                    Date date = dateFormat.parse(field.getText().trim());
                } catch (Exception e) {
                      field.setBackground(pink);
                 sb.append(errorMessage).append("\n");
               field.requestFocus();
               return false;
                }
            }
            field.setBackground(white);
                return  true;
        }
public static boolean isValidDate(JTextField inDate,StringBuilder sb,String errorMessage) {

        if (inDate == null) {
              inDate.setBackground(pink);
             sb.append(errorMessage).append("\n");
               inDate.requestFocus();
            return false;
        }else{
            return true;
        }


        
    }

    //định dạng dd/MM/yyyy (hoặc d/M/yyyy nếu là số 0 đứng trước)


      public static boolean ValidatorNullJText(JTextField field,StringBuilder sb,String errorMessage ){//JTextField kiểm tra trường truyền vào,errorMessage thông điệp khi gặp lỗi,StringBuilder sb chứa thông điệp lỗi
        boolean ok = true;
        if(field.getText().equals("")){
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.pink);
            field.requestFocus();// đưa con trỏ chuột về tại vị trí cũ
            ok = false;
        }else{
            field.setBackground(Color.white);
        }
        return  ok;
    }
            public static boolean ValidatorNullJTextArea(JTextArea field,StringBuilder sb,String errorMessage ){//JTextField kiểm tra trường truyền vào,errorMessage thông điệp khi gặp lỗi,StringBuilder sb chứa thông điệp lỗi
        boolean ok = true;
        if(field.getText().equals("")){
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.pink);
            field.requestFocus();// đưa con trỏ chuột về tại vị trí cũ
            ok = false;
        }else{
            field.setBackground(Color.white);
        }
        return  ok;
    }
                      public static boolean ValidatorNullJDate(JDateChooser field,StringBuilder sb,String errorMessage ){//JTextField kiểm tra trường truyền vào,errorMessage thông điệp khi gặp lỗi,StringBuilder sb chứa thông điệp lỗi
        boolean ok = true;
        if(field.getDate().equals("")){
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.pink);
            field.requestFocus();// đưa con trỏ chuột về tại vị trí cũ
            ok = false;
        }else{
            field.setBackground(Color.white);
        }
        return  ok;
    }
            
      public static boolean ValidatorNullJpass(JPasswordField field,StringBuilder sb,String errorMessage ){//JTextField kiểm tra trường truyền vào,errorMessage thông điệp khi gặp lỗi,StringBuilder sb chứa thông điệp lỗi
         boolean ok = true;
           String password = new String(field.getPassword());
        if(password.equals("")){
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.pink);
            field.requestFocus();// đưa con trỏ chuột về tại vị trí cũ
            ok = false;
        }else{
            field.setBackground(Color.white);
        }
        return  ok;
    }
}
