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
public class FunctionClass {
    Scanner e = new Scanner(System.in);
    HocVien[] t = new HocVien[100];
    public void swap(HocVien[] t, int i, int j){
        HocVien temp = new HocVien();
        temp = t[i];
        t[i] = t[j];
        t[j] = temp;
    }
    public void sortAsc(int n, HocVien[] t){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(t[i].getPoint()>t[j].getPoint()){
                    swap(t,i,j);
                }
            }
        }
    }
    public void sortDesc(int n, HocVien[] t){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(t[i].getPoint()<t[j].getPoint()){
                    swap(t,i,j);
                }
            }
        }
    }
   //GetAveragePoint Func
    public double getAveragePoint(HocVien[] t, double n){
        double sum =0, average;
        for(int i=0;i<n;i++){
            sum+=t[i].getPoint();
        }
        average = sum/n;
        return average;
    }
    //GetRank Func
    public String getRank(double x){
        String rank;
        if(x>=9){
            rank="Xuất sắc";
        }else if(x>=7.5){
            rank="Giỏi";
        }else if(x>=6.5){
            rank="Khá";
        }else if(x>=5){
            rank="Trung bình";
        }else{rank="Kém";}
        return rank;
    }
    //---Countrank Fuc
    public int countRank(HocVien[] t, int n, String y){
        int count = 0;
        for(int i=0;i<n;i++){
            if(getRank(t[i].getPoint()).equalsIgnoreCase(y)){
                count++;
            }
        }
        return count; 
    }
    }
