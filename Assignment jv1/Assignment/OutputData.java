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
public class OutputData {
    Scanner e = new Scanner(System.in);
    //Output function
    public void OutputTitle(){
        System.out.printf("%-10s %-20s %-20s %-10s %-10s\n","MSSV","Họ tên","Email","Điểm","Học lực" );
    }
public void output_a(String mess, int x){
    System.out.println(mess + x);
}

public void output_b(String mess){
    System.out.println(mess);
}   
}
