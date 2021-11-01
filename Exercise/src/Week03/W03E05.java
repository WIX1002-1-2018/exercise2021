/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week03;

import java.util.Scanner;

/**
 *
 * @author askba
 */
public class W03E05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scaner = new Scanner(System.in);
        System.out.print("Enter Year :");
        int year = scaner.nextInt(); 
        
        if (year % 4 == 0 && !(year % 100 == 0) || year % 400 == 0  )
            System.out.println("the year is a leap year");
        else
            System.out.println("the year is not a leap year");
    }
    
}
