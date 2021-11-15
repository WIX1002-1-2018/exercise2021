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
public class W05E06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
            int num,fac;
            int totalsc = 0;
            int score = 0;
            boolean ans;

            while(true){
                System.out.print("Enter a number (-1 to quit) : ");
                num = sc.nextInt();
                if ( num == -1)
                    break;
                System.out.print("Enter a factor : ");
                fac = sc.nextInt();
                System.out.printf("Is %d a factor of %d ? (true/false) : ",fac,num);
                totalsc++;
                ans = sc.nextBoolean();
                if ( (num%fac == 0 && ans == true)||(num%fac != 0 && ans == false)){
                    System.out.println("Your answer is correct.");score++;
                }
                else{
                   System.out.println("Your answer is incorrect."); 
                }
              
            }
            System.out.printf("\nThe final Score is %d/%d\n",score,totalsc);
    }
    
}
