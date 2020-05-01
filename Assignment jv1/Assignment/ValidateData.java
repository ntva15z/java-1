/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class ValidateData {
    Scanner e = new Scanner(System.in);
    InputFromKeyboard ifk = new InputFromKeyboard();
    HocVien[] t = new HocVien[100];
    //khoang trang va null
    public boolean isNullorSpace(String x){
        boolean check;
        check = x.trim().isEmpty() || x.isEmpty();
        return check;
    }
    //validate id, name, email, point Func
    public String validateId(){
        String id = ifk.inputString("Nhập mã số học viên: ");
        while(isNullorSpace(id)==true){
            id = ifk.inputString("Nhập lại mã số học viên");
        }
        return id;
    }
     public String validatename(int i, HocVien[] t){
         String name = ifk.inputString("Nhập họ tên học viên: ");
         while(true){
             boolean ck01 = true, ck02 = true;
             if(isNullorSpace(name)==true){
                 System.out.println("Họ tên bị trùng");
                 ck01=false;
             }else{
                 if(i>0){
                     for(int j=0;j<i;j++){
                         if(name.equals(t[j].getName())==true){
                             System.out.println("Họ tên bị trùng");
                             ck02=false;
                         }
                     }
                 }
             }
             if(ck01==false || ck02==false){
                 name=ifk.inputString("Nhập họ tên: ");
             }else{
                 break;
             }
         }
         return name;
     }
     public String validateEmail(){
         String regrex = "\\w+@\\w+(\\.\\w+){1,2}";
         String email = ifk.inputString("Nhập Email học viên: ");
         while(true){
             boolean ck01 = true, ck02 = true;
             if(isNullorSpace(email)==true){
                 System.out.println("Email bị trùng");
                 ck01=false;
             }else if (email.matches(regrex)==false){
                 System.out.println("Email nhập sai");
                 ck02=false;
             }
             if(ck01==false || ck02==false){
                 email = ifk.inputString("Nhập Email học viên: ");
             }else{
                 break;
             }

     }
         return email;
     }
     public double validatePoint(){
         double point = ifk.inputDouble("Nhập điểm của học viên: ");
         while(point<0 || point>10){
             point = ifk.inputDouble("Nhập lại điểm: ");
         }
         return point;
     }
}
