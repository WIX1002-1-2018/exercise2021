/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week02;

import java.util.Scanner;

/**
 *
 * @author askba
 */
public class W02T01Q01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        
        
        System.out.print("Enter first number: ");
        int number01 = input.nextInt();
        
        System.out.print("Enter first number: ");
        int number02 = input.nextInt();
        
        
        int multiply = number01*number02;
        
        System.out.printf("%d * %d = %d",number01,number02,multiply);
        
        
    }
    
}
