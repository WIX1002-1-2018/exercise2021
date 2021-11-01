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
public class W03E04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // A Code to determine whether the number is an odd or an even number
        //int number = 10;
        //System.out.println("The number is " + number);
        int number=0;
        
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter a number :");
        number=input.nextInt();
        
        
        if (number % 2 == 0) {
            System.out.println(number + " is an even number");
        }
        else {
            System.out.println(number + " is an odd number");
        }
        
    }
    
}
