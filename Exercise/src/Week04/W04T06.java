/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week04;

import java.util.Scanner;

/**
 *
 * @author askba
 */
public class W04T06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double diameter;
        double pi = Math.PI;
        double C; // c- circumference of circle
    Scanner a = new Scanner(System.in);
    
    System.out.print("Enter diameter: ");
    diameter = a.nextDouble();
    
    C = pi*diameter;
    System.out.printf("The circumference of the circle is : %.3f " , C );
    System.out.println(" ");
    }
    
}
