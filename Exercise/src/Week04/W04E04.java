/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week04;

import java.util.Random;

/**
 *
 * @author askba
 */
public class W04E04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random rand = new Random();
        
        int num;
        int count =0;
        
        do{
            num = rand.nextInt();
            count++;
        }while(num<0);
        
        System.out.println("After " + count + " loop. The value of num (positive): " + num);
        
        count =0;
        do{
            num = rand.nextInt();
            count++;
        }while(num % 2 == 0);
        
        System.out.println("After " + count + " loop. The value of num (odd): " + num);
        count =0;
        do{
            num = rand.nextInt();
            count++;
        }while(!((num > 0) && (num % 2 == 0)));
        
        System.out.println("After " + count + " loop. The value of num (Positive and Even): " + num);
        
    }
    
}
