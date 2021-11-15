/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week05;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author askba
 */
public class W05E05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in); 
        Random r = new Random(); 
        int duty = 0; 
        System.out.print("Enter the number of staff [N] : "); 
        int num = s.nextInt(); 
        for(int i = 1; i<= num;i++){ 
            int id = r.nextInt(99999-10000+1)+10000; 
            System.out.print("\nStaff ID : "+ id); 
            String str = Integer.toString(id); 
            char c1 = str.charAt(1); 
            char c2 = str.charAt(3); 
            if(c1%2 == 1 && c2%2 == 0){ 
                System.out.print("\nWeekend Duty"); 
                duty++; 
            } 
            else 
                System.out.print("\nWeekend Off");  
        } 
        System.out.println("\nThe number of staffs work during weekend is "+duty);
    }
    
}
