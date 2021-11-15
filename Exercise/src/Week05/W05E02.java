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
public class W05E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        
        String ans;
        double add, sum;
        sum = 0.0;
        
        do {
            System.out.print("Enter the type of durian [Quit] to terminate: ");
            ans = in.next();
            
            switch (ans) {
                case "MK" : {
                    System.out.print("Enter the sales in kg: ");
                    add = in.nextDouble();
                    sum += add * 25.0;
                    break;
                }
                case "HL" : {
                    System.out.print("Enter the sales in kg: ");
                    add = in.nextDouble();
                    sum += add * 22.0;
                    break;
                }
                case "D24" : {
                    System.out.print("Enter the sales in kg: ");
                    add = in.nextDouble();
                    sum += add * 20.0;
                    break;
                }
                case "UM" : {
                    System.out.print("Enter the sales in kg: ");
                    add = in.nextDouble();
                    sum += add * 18.0;
                    break;
                }
                default : {
                    break;
                }
            }
        } while (!(ans.equalsIgnoreCase("Quit")));
        
        System.out.printf("Total sales: %.2f\n", sum);
    }
    
}
