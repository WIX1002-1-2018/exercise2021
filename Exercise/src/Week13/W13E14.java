/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Badrul
 */
public class W13E14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] number = new int[10];
        try{
            Scanner read = new Scanner(new FileInputStream ("number.txt"));
            for(int i = 0;i<10;i++){
                number[i] = read.nextInt();
            }
            read.close();
        }catch(FileNotFoundException e){
            System.out.println("Error No File Found");
        }
        
        
        Operation operationA = new Operation(number);
        operationA.allOperation();
        operationA.display();
        
        Operation [] operationArray;
        
        operationArray = new Operation[10];
       //each of the object will save each line in the text file.
       //the highest average in between lines; and display which line is the highest.
        double highestAverage  = operationArray[0].getAvg();
        int lines=0;
        
        for(int i=0;i<operationArray.length;i++){
            if(operationArray[i].getAvg() > highestAverage ){
                highestAverage = operationArray[i].getAvg();
                lines = i+1;
            }
            
        }
        
        System.out.println("The highest average is located at lines " + lines + " with value " + highestAverage);
            
        
    }
    
}
