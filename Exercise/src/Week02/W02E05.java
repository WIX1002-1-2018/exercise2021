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
public class W02E05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        
        int randNum01, randNum02;
        
        randNum01 = rand.nextInt(100);
        randNum02 = rand.nextInt(40);
        System.out.println(randNum01 + " " + randNum02);
        
        int randNum03;
        
        randNum03 = rand.nextInt(51) + 50;
        System.out.println("Random Number between 50-100: "  + randNum03);
    }
    
}
