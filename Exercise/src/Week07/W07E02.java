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
public class W07E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        int number[] = new int[15];
        for(int i=0;i<number.length;i++){
            number[i]=rand.nextInt(20);
        }
        
        for(int i=0;i<number.length;i++){
            for(int j=0;j<number.length;j++){
                if(i==j)//avoid compare in itself.
                {
                }
                else if(number[j]==number[i])//restart all the loop when it is a same number.
                {
                    number[j]=rand.nextInt(20);
                    i=0;
                    j=0;
                }
            }
        }
        
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();
        
        for(int pass = 1; pass < number.length; pass++){
            for(int j = 0; j < number.length - 1; j++){
                if(number[j] > number[j + 1]){
                    int temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;
                }
            }
        }
         for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
        
        
    }
    
}
