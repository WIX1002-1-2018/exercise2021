/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week02;

import java.util.Random;

/**
 *
 * @author askba
 */
public class W02T01Q06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Random rand =  new Random();
     
       int min=0,max=0;
       
       for(int i=0;i<10;i++){
           int number = rand.nextInt(1000);
           if(i==0){
               min = number;
               max = number;
           }
           if(number<min)
               min = number;
           
           if(number>max)
               max = number;
           
             System.out.print("Random Number " + i + ": " + number + "\n"); 
             //System.out.print("Random Number " + i + ": " + number + " and the minimum number now is " + min + "\n"); 
         
       }
        System.out.println("The minimum " + min);
        System.out.println("The maximum " + max);
   }
    
}
