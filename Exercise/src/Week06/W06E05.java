/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week06;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author askba
 */
public class W06E05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arraySize;
        Scanner input = new Scanner(System.in);
        Random rand =  new Random();
        
        System.out.print("Enter array size: ");
        arraySize = input.nextInt();
        
        int[] number =  new int[arraySize];
        
        for(int i=0;i<number.length;i++)
             number[i] = rand.nextInt(500)+50;
        
        System.out.print("Before sort: ");
        for(int i=0;i<number.length;i++)
            System.out.print(number[i] + " ");
        
        for(int pass = 1; pass < number.length; pass++ ) 
            for( int i = 0; i < number.length - 1; i++ ) 
		if (number[i] > number[i+1]){
               	int hold = number[i];        
		number[i] = number[i+1];  
		number[i+1] = hold;
		}
        
        System.out.print("\nAfter Bubble Sort (Asc): ");
        for(int i=0;i<number.length;i++)
            System.out.print(number[i] + " ");
        
         for(int pass = 1; pass < number.length; pass++ ) 
            for( int i = 0; i < number.length - 1; i++ ) 
		if (number[i] < number[i+1]){
               	int hold = number[i];        
		number[i] = number[i+1];  
		number[i+1] = hold;
		}
        
        System.out.print("\nAfter Bubble Sort (Dec): ");
        for(int i=0;i<number.length;i++)
            System.out.print(number[i] + " ");

        
    }
    
}
