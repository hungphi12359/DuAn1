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
        public static boolean checkLopHoc(JTextField field,StringBuilder sb,String errorMessage) {
        boolean ok = true;
        field.setBackground(white);
        String id = field.getText();
        String rgx = "[a-zA-Z0-9]{1,9}";
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
//            dialogHelper.alert(txt.getRootPane(), txt.getName() + " ph???i t??? 3-50 k?? t???.");
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
//            dialogHelper.alert(txt.getRootPane(), txt.getName() + " ph???i t??? 3-255 k?? t???.");
             sb.append(errorMessage).append("\n");
               field.requestFocus();
            return false;
        }
    }
                       //g???m 10 s??? 
    //c??c ?????u 3 s??? c???a nh?? m???ng
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
//            dialogHelper.alert(txt.getRootPane(), txt.getName() + " ph???i g???m 10 s???\n????ng c??c ?????u s??? c???a nh?? m???ng.");
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
//            dialogHelper.alert(txt.getRootPane(), txt.getName() + " kh??ng ????ng ?????nh d???ng");
 sb.append(errorMessage).append("\n");
               field.requestFocus();
            return false;
        }
    }

    //gio l?? int >0
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
//                dialogHelper.alert(txt.getRootPane(), txt.getName() + " ph???i l???n h??n b???ng 0.");
                return false;
            }
        } catch (NumberFormatException e) {
            field.setBackground(pink);
            sb.append("Th???i L?????ng nh???p v??o ph???i l?? s??? nguy??n").append("\n");
            return false;
        }
    }

    //h???c ph?? l?? float >0
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
//                dialogHelper.alert(txt.getRootPane(), txt.getName() + " ph???i l?? l???n h??n b???ng 0.");
                return false;
            }
        } catch (NumberFormatException e) {
            field.setBackground(pink);
               sb.append("H???c Ph?? nh???p v??o ph???i l?? s??? th???c").append("\n");
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
//                dialogHelper.alert(txt.getRootPane(), txt.getName() + " ph???i l?? trong kho???ng 0-10 ho???c ch??a nh???p (-1).");
                return false;
            }
        } catch (NumberFormatException e) {
            field.setBackground(pink);
              sb.append("??i???m nh???p v??o ph???i l?? s??? th???c").append("\n");
            return false;
        }
    }
        public static boolean checkName(JTextField field,StringBuilder sb,String errorMessage) {
        field.setBackground(white);
        String id = field.getText();
        String rgx = "^[A-Za-z???????????????????????????????????????????????????????????????????????????????????????????-??? ]{3,25}$";
        if (id.matches(rgx)) {
            return true;
        } else {
            field.setBackground(pink);
              sb.append(errorMessage).append("\n");
               field.requestFocus();
//            dialogHelper.alert(txt.getRootPane(), txt.getName() + " ph???i l?? t??n ti???ng vi???t ho???c kh??ng ?????u\nt??? 3-25 k?? t???");
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

    //?????nh d???ng dd/MM/yyyy (ho???c d/M/yyyy n???u l?? s??? 0 ?????ng tr?????c)


      public static boolean ValidatorNullJText(JTextField field,StringBuilder sb,String errorMessage ){//JTextField ki???m tra tr?????ng truy???n v??o,errorMessage th??ng ??i???p khi g???p l???i,StringBuilder sb ch???a th??ng ??i???p l???i
        boolean ok = true;
        if(field.getText().equals("")){
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.pink);
            field.requestFocus();// ????a con tr??? chu???t v??? t???i v??? tr?? c??
            ok = false;
        }else{
            field.setBackground(Color.white);
        }
        return  ok;
    }
            public static boolean ValidatorNullJTextArea(JTextArea field,StringBuilder sb,String errorMessage ){//JTextField ki???m tra tr?????ng truy???n v??o,errorMessage th??ng ??i???p khi g???p l???i,StringBuilder sb ch???a th??ng ??i???p l???i
        boolean ok = true;
        if(field.getText().equals("")){
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.pink);
            field.requestFocus();// ????a con tr??? chu???t v??? t???i v??? tr?? c??
            ok = false;
        }else{
            field.setBackground(Color.white);
        }
        return  ok;
    }
                      public static boolean ValidatorNullJDate(JDateChooser field,StringBuilder sb,String errorMessage ){//JTextField ki???m tra tr?????ng truy???n v??o,errorMessage th??ng ??i???p khi g???p l???i,StringBuilder sb ch???a th??ng ??i???p l???i
        boolean ok = true;
        if(field.getDate().equals("")){
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.pink);
            field.requestFocus();// ????a con tr??? chu???t v??? t???i v??? tr?? c??
            ok = false;
        }else{
            field.setBackground(Color.white);
        }
        return  ok;
    }
            
      public static boolean ValidatorNullJpass(JPasswordField field,StringBuilder sb,String errorMessage ){//JTextField ki???m tra tr?????ng truy???n v??o,errorMessage th??ng ??i???p khi g???p l???i,StringBuilder sb ch???a th??ng ??i???p l???i
         boolean ok = true;
           String password = new String(field.getPassword());
        if(password.equals("")){
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.pink);
            field.requestFocus();// ????a con tr??? chu???t v??? t???i v??? tr?? c??
            ok = false;
        }else{
            field.setBackground(Color.white);
        }
        return  ok;
    }
}
