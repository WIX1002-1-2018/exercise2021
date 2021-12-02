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
public class W07T06_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Random rand = new Random();
        int r = rand.nextInt(256);
        r =1;
        System.out.println(r);
        
        String s = Integer.toBinaryString(r);
        char[] array = new char[8];
        
        if (s.length() == 8) {
            for (int i = 0; i < s.length(); i++) {
                array[i] = s.charAt(i);
            }
        }
        else if (s.length() == 7) {
            for (int i = 1, j = 0; i < (s.length() + 1); i++, j++) {
                array[i] = s.charAt(j);
            }
            array[0] = '0';
        }
        else if (s.length() == 6) {
            for (int i = 2, j = 0; i < (s.length() + 2); i++, j++) {
                array[i] = s.charAt(j);
            }
            array[0] = '0';
            array[1] = '0';
        }
        else if (s.length() == 5) {
            for (int i = 3, j = 0; i < (s.length() + 3); i++, j++) {
                array[i] = s.charAt(j);
            }
            array[0] = '0';
            array[1] = '0';
            array[2] = '0';
        }
        else if (s.length() == 4) {
            for (int i = 4, j = 0; i < (s.length() + 4); i++, j++) {
                array[i] = s.charAt(j);
            }
            array[0] = '0';
            array[1] = '0';
            array[2] = '0';
            array[3] = '0';
        }
        else if (s.length() == 3) {
            for (int i = 5, j = 0; i < (s.length() + 5); i++, j++) {
                array[i] = s.charAt(j);
            }
            array[0] = '0';
            array[1] = '0';
            array[2] = '0';
            array[3] = '0';
            array[4] = '0';
        }
        else if (s.length() == 2) {
            for (int i = 6, j = 0; i < (s.length() + 6); i++, j++) {
                array[i] = s.charAt(j);
            }
            array[0] = '0';
            array[1] = '0';
            array[2] = '0';
            array[3] = '0';
            array[4] = '0';
            array[5] = '0';
        }
        else if (s.length() == 1) {
            for (int i = 7, j = 0; i < (s.length() + 7); i++, j++) {
                array[i] = s.charAt(j);
            }
            array[0] = '0';
            array[1] = '0';
            array[2] = '0';
            array[3] = '0';
            array[4] = '0';
            array[5] = '0';
            array[6] = '0';
        }
        
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]);
        }
    
    }
    
}
