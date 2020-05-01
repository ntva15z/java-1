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
public class InputFromKeyboard {
    Scanner e = new Scanner(System.in);
    //input function
    public String inputString(String mess){
        String x;
        System.out.print(mess);
        x=e.nextLine();
        return x;        
    }
    public int inputInt(String mess){
        int x;
        System.out.print(mess);
        x=Integer.parseInt(e.nextLine());
        return x;        
    }
    public double inputDouble(String mess){
        double x;
        System.out.print(mess);
        x=Double.parseDouble(e.nextLine());
        return x;        
    }
}
