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
public class W05E04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Enter the number of staff[N]: ");
        int N = in.nextInt();
        
        int i, num, two, four;
        int count = 0;
        
        for (i = 0; i < N; i++) {
            num = rand.nextInt(99999-10000+1)+10000;// 10000 to 99999
            System.out.println("Staff ID: " + num);
            
            two = (num % 10000)/1000;
            four = (((num % 10000)% 1000)% 100)/ 10;
            
            if (two % 2 == 1 && four % 2 == 0) {
                System.out.println("Weekend Duty");
                count++;
            } else {
                System.out.println("Weekend Off");
            }
        }
        System.out.println("The number of staffs work during weekend is " + count);
    }
    
}
