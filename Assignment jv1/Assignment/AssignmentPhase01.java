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
public class AssignmentPhase01 {
    static Scanner p = new Scanner(System.in);
    public static void main(String[] args) {
        QuanLyHocVien q = new QuanLyHocVien();
        while(true){
            menu();
            int select = p.nextInt();
            switch(select){
                case 1: q.y01();break;
                case 2: q.y02();break;
                case 3: q.y03();break;
                case 4: q.y04();break;
                case 5: q.y05();break;
                case 6: q.y06();break;
                case 7: q.y07();break;
                case 8: q.y08();break;
                case 9: q.y09();break;
                case 10: q.y010();break;
                case 11: System.exit(0);break;
                default: System.out.println("Chức năng chọn không hợp lệ"); break;
            }
        }
    }
   public static void menu(){
       System.out.println("+----------------------------------------------------+");
       System.out.println("1. Nhập danh sách học viên");
       System.out.println("2. Xuất danh sách học viên");
       System.out.println("3. Tìm kiếm học viên trong khoảng điểm");
       System.out.println("4. Tìm kiếm học viên theo học lực");
       System.out.println("5. Tìm kiếm học viên theo mã số và cập nhật thông tin");
       System.out.println("6. Sắp xếp theo điểm");
       System.out.println("7. Xuất 5 học viên điểm cao nhất");
       System.out.println("8. Tính điểm TB của lớp");
       System.out.println("9. Xuất học viên có điểm trên ĐTB của cả lớp");
       System.out.println("10. Tổng hợp số học viên theo học lực");
       System.out.println("11. Thoát khỏi chương trình");
       System.out.println("+----------------------------------------------------+");
       System.out.print("Chọn chức năng: ");
   } 
}
