/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13;

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
    
    public void display(){
        System.out.println("The number from the files :");
        for(int i=0;i<number.length;i++){
            System.out.print(number[0] + " ");
        }
            
    }
    
    

    
}
