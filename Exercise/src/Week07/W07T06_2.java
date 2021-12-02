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
public class W07T06_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        int rand0 = rand.nextInt(256);
        System.out.println("Random number = " + rand0);
        
        int [] binary = new int [8];
        
        for(int i=0; i < binary.length; i++){
            binary[i] = rand0 % 2;              
            rand0 = rand0 / 2;                                //renew the value of rand0
        }
        System.out.print("Binary number = ");
        for(int j=binary.length-1; j >=0; j--)         //loop for reverse the position of each binary digit and print it out
            System.out.print(binary[j]);
    }
    
}
