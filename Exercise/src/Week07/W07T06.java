/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week07;

import java.util.Random;

/**
 *
 * @author askba
 */
public class W07T06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random num = new Random();
        int a = num.nextInt(255)+0;
        System.out.print("The Random Number Generated between (0 - 255) is : " + a + "\n");
        System.out.print("This Random Number in Binary is : " + Integer.toBinaryString(a));
        
    }
    
}
