/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

/**
 *
 * @author Windows
 */
public class HocVien {
    private String id, name, email, rank;
    private double point;
    FunctionClass fc = new FunctionClass();
    public HocVien(){}
    public HocVien(String id, String name, String email, double point, String rank){
        this.id = id;
        this.name = name;
        this.email = email;
        this.point = point;
        this.rank = rank;
    }
   public String getId(){return id;}
   public void setId(String id){this.id=id;}
   public String getName(){return name;}
   public void setName(String name){this.name=name;}
   public String getEmail(){return email;}
   public void setEmail(String email){this.email=email;}
   public double getPoint(){return point;}
   public void setPoint(double point){this.point = point;}
   public String getRank(){return rank;}
   public void setRank(String rank){this.rank= rank;}
   public void OutputData(){
       System.out.printf("%-10s %-20s %-20s, %-10s %-10s\n", id, name, email, point, rank);
     }
 }
    
    

