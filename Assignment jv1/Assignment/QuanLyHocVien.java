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
public class QuanLyHocVien {
    Scanner e = new Scanner(System.in);
//
    FunctionClass fc= new FunctionClass();
    InputFromKeyboard ifk = new InputFromKeyboard();
    OutputData od = new OutputData();
    ValidateData vd = new ValidateData();
//
    HocVien[] hv = new HocVien[100];
    HocVien[] hv_copy = new HocVien[100];
    String id, name, email, rank;
    double point;
//
    int n;
public void y01(){
    System.out.println("+-------Nhập danh sách học viên---------");
    System.out.print("Nhập số lượng học viên");
    n = Integer.parseInt(e.nextLine());
    for(int i=0;i<n;i++){
        System.out.println("Học viên thứ "+(i+1)+"-----");
        id = vd.validateId();
        name = vd.validatename(i, hv);
        email = vd.validateEmail();
        point = vd.validatePoint();
        rank = fc.getRank(point);
        System.out.println("-------------------------");
        HocVien hvi = new HocVien(id, name, email, point, rank);
        hv[i] = hvi;
        hv_copy[i] = hvi;
    
    }
}
public void y02(){
    System.out.println("+-------Xuất danh sách học viên---------");
    od.OutputTitle();
    for(int i=0;i<n;i++){
        hv[i].OutputData();
    }
    System.out.println("-------------------------");
}
public void y03(){
    System.out.println("+-------Tìm kiếm học viên trong khoảng điểm---------");
    double min, max;
    min = ifk.inputDouble("Nhập điểm nhỏ nhất: ");
    max = ifk.inputDouble("Nhập điểm lớn nhất: ");
    while(true){
        if(min<max){
            break;
        }else{
            System.out.println("Giá trị max phải lớn hơn giá trị min");
            max = ifk.inputDouble("Nhập lại điểm lớn nhất: ");
        }
    }
    System.out.println("+-------Thông tin học viên---------");
    od.OutputTitle();
    for(int i=0;i<n;i++){
        if(hv[i].getPoint()>=min && hv[i].getPoint()<=max){
            hv[i].OutputData();
        }
    }
}
public void y04(){
    System.out.println("+-------Tìm kiếm học viên theo học lực---------");
    String check_rank;
    check_rank = ifk.inputString("Nhập học lực học viên: ");
    System.out.println("+-------Thông tin học viên---------");
    od.OutputTitle();
    for(int i=0;i<n;i++){
        if(fc.getRank(hv[i].getPoint()).equalsIgnoreCase(check_rank)){
            hv[i].OutputData();
        }
    }
    System.out.println("----------------------------------------------");
}
public void y05(){
    System.out.println("+---Tìm kiếm học viên theo mã số và cập nhật thông tin---");
    String check_id;
    check_id=ifk.inputString("Nhập MSCV cần tìm: ");
    for(int i=0;i<n;i++){
        if(hv[i].getId().equalsIgnoreCase(check_id)){
            System.out.println("-----------Thông tin học viên-------------");
            od.OutputTitle();
            hv[i].OutputData();
            System.out.println("---Cập nhật thông tin---");
            int pos = i+1;
            System.out.println("Học viên thứ "+pos);
            id = vd.validateId();
            name = vd.validatename(i, hv);
            email = vd.validateEmail();
            point = vd.validatePoint();
            rank = fc.getRank(point);
            HocVien hvi = new HocVien(id, name,email, point, rank);
            hv[i]=hvi;
            System.out.println("---Thông tin học viên đã cập nhật---");
            od.OutputTitle();
            hv[i].OutputData();
          
        }
    }
    System.out.println("----------------------------------------------"); 
}
public void y06(){
    System.out.println("+--------------Sắp xếp theo điểm--------------");
    System.out.println("1. Sắp xếp điểm tăng dần");
    System.out.println("2. Sắp xếp điểm giảm dần");
    System.out.println("3. Khôi phục lại điểm ban đầu");
    System.out.println("--------------------------------------------");
    int sort_select;
    do{
        sort_select = ifk.inputInt("Nhập chiều sắp xếp: ");
    }while (sort_select<1 || sort_select>3);
    switch(sort_select){
        case 1: fc.sortAsc(n, hv);break;
        case 2: fc.sortDesc(n, hv);break;
        case 3: System.arraycopy(hv_copy,0,hv,0,n);break;
    
    }
    y02();
}
public void y07(){
    System.out.println("+--------------Xuất 5 học viên điểm cao nhất--------------");
    fc.sortDesc(n, hv);
    if(n>=5){
        od.output_b("----5 học viên có điểm cao nhất---------");
        od.OutputTitle();
        for(int i=0;i<n;i++){
            hv[i].OutputData();
        }
    }else{
        System.out.println("-----"+n+" học viên có điểm cao nhất");
        od.OutputTitle();
        for(int i=0;i<n;i++){
            hv[i].OutputData();
        }
    }
    System.out.println("--------------------------------------------");
}
public void y08(){
    System.out.println("+--------------Tính điểm TB của lớp--------------");
    double avg = fc.getAveragePoint(hv, n);
    System.out.printf("Điểm TB của cả lớp là: %.2f\n", avg);
    System.out.println("--------------------------------------------");
}
public void y09(){
    System.out.println("+-----Xuất học viên có điểm trên ĐTB của cả lớp--------");
    double avg;
    od.OutputTitle();
    avg = fc.getAveragePoint(hv, n);
    for(int i=0;i<n;i++){
        if(hv[i].getPoint()>avg){
            hv[i].OutputData();
        }
    }
    
}
public void y010(){
    System.out.println("+-----Tổng hợp số học viên theo học lực--------");
    int sx = fc.countRank(hv, n, "Xuất sắc");
    od.output_a("Số học viên xuất sắc là: ", sx);
    int gi = fc.countRank(hv, n, "Giỏi");
    od.output_a("Số học viên giỏi là: ", gi);
    int kh = fc.countRank(hv, n, "Khá");
    od.output_a("Số học viên khá là: ", kh);
    int tb = fc.countRank(hv, n, "Trung bình");
    od.output_a("Số học viên xuất sắc là: ", tb);
    int y = fc.countRank(hv, n, "Yếu");
    od.output_a("Số học viên xuất sắc là: ", y);
    int k = fc.countRank(hv, n, "Kém");
    od.output_a("Số học viên xuất sắc là: ", k);
}
}


