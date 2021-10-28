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
public class W02T01Q02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        
        int randomNumber = rand.nextInt();
        String con = "smaller";
        
        System.out.printf("Random number is %d ", randomNumber);
        
        if(randomNumber > 50)
          con = "greater";
        else
          con = "smaller";
        
        System.out.printf("and it is %s than 50", con, randomNumber);
        
    }
    
}
