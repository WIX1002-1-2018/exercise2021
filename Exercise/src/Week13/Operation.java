/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13;

import java.util.Arrays;

/**
 *
 * @author Badrul
 */
public class Operation {
    
    private int[] number, sortedNumber;
    private int max, min;
    private double avg;

    public Operation(int[] number) {
        this.number = number;
    }
    
    public void allOperation(){
        this.sortedNumber = new int[this.number.length];
        this.sortedNumber =  this.number.clone();
        max = number[0];
        min = number[0];
        Arrays.sort(sortedNumber);
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            if (number[i] > max) {
                max = number[i];
            }
            
            if (number[i] < min) {
                min = number[i];
            }
            
            sum += number[i];
        }
        
        avg = sum / (double)number.length;
        
    }

    public double getAvg() {
        return avg;
    }
    
    public void display(){
        System.out.print("The number from the files :");
        for(int i=0;i<number.length;i++){
            System.out.print(number[i] + " ");
        }
        System.out.println();
        
        System.out.print("The sorted number :");
        for(int i=0;i<sortedNumber.length;i++){
            System.out.print(sortedNumber[i] + " ");
        }
        System.out.println();
        
        System.out.println("The maximum number : " + this.max);
        System.out.println("The minimum number : " + this.min);
        System.out.println("The average : " + this.avg);
            
    }
    
    

    
}
