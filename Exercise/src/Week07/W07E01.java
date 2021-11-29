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
public class W07E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        int num;
        double numDouble;
            
        for(int i=0;i<10;i++){
            num = rand.nextInt(90 + 1); //0-90
            System.out.print(num + " ");
        }
        System.out.println();
        
        for(int i=0;i<10;i++){
            numDouble = rand.nextDouble()*10;
            System.out.printf("%.2f ",numDouble);
        }
        
        System.out.println();
        for(int i=0;i<10;i++){
           for(int j=0;j<3;j++){
            char c = (char)(rand.nextInt(26)+'A');
            System.out.printf("%c",c);
           }
            System.out.print(" ");
        }
        
        System.out.println();
        
        for(int i=0;i<10;i++){
            num = rand.nextInt(9999 - 1000 + 1) + 1000;
            System.out.print(num + " ");
        }
        
        System.out.println();
        
        for(int i=0;i<10;i++){
            numDouble = rand.nextDouble() * 100 + 500;
            System.out.printf("%.2f ",numDouble);
        }
        
        System.out.println();
        for(int i=0;i<10;i++){
           num = rand.nextInt(1000) + 1000;
           if (num%2!=0)        
                System.out.print(num + " ");
        }
        System.out.println("");
        int count = 0;
        while (count < 10){
        int num2 = rand.nextInt(1000) + 1000 ;
        if (num2 % 2 != 0){
            System.out.print(num2 + " ");
            count++;
            }
        }
        
        System.out.println();
        count = 0;
        while(count<=15){
            num = rand.nextInt(20);
            System.out.printf(num + " ");
            count++;
        }
        
        
        System.out.println();
        count = 0;
        while(count<=15){
            num = rand.nextInt(20);
            System.out.printf(num + " ");
            count++;
        }
        
    }
    
}
