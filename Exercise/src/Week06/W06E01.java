/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week06;

import java.util.Random;

/**
 *
 * @author askba
 */
public class W06E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       double[] score = new double[20];
       Random rand = new Random();
       
       for(int i=0;i<score.length;i++)
           System.out.println("position index ["+ i + "] is " +  score[i] );
       
       score[9] = 100.2;
       
        for(int i=0;i<score.length;i++)
           System.out.println("position index ["+ i + "] is " +  score[i] );
        
        for(int i=0;i<score.length;i++)
             score[i] = rand.nextInt(100);
        
        for(int i=0;i<score.length;i++)
           System.out.println("position index ["+ i + "] is " +  score[i] );
             

    }
    
}
