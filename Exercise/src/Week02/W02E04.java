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
public class W02E04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int num01, num02;
        
        System.out.print("Enter two numbers: ");
        num01 = input.nextInt();
        num02 = input.nextInt();
        System.out.printf("The value entered : %d %d\n", num01,num02);
        System.out.printf("%d + %d = %d", num01,num02, num01+num02);
    }
    
}
