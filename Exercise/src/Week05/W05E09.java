/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week05;

import java.util.Scanner;

/**
 *
 * @author askba
 */
public class W05E09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int compare=0;
        System.out.print("Enter how many numbers:");
        int loop = input.nextInt();
        System.out.print("Enter a number : ");
        int max = input.nextInt();
        for(int i=0;i<loop-1;i++){
            compare = input.nextInt();
            if(compare>max)
                max = compare;
        }
        
        System.out.println("The largest number is " + compare);
            
            
        
    }
    
}
