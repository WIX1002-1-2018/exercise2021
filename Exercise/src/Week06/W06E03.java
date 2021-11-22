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
public class W06E03 {

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
        
        int[] score =  new int[arraySize];
        
        for(int i=0;i<score.length;i++)
             score[i] = rand.nextInt(500)+50;
        
        for(int i=0;i<score.length;i++)
         System.out.println("position index ["+ i + "] is " +  score[i] );
        
       
        
        
        
    }
    
}
