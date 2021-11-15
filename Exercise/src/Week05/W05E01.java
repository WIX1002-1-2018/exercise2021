/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week05;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author askba
 */
public class W05E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number;
        int randomNumber;
        int count=0;
        
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        randomNumber = rand.nextInt(1001)+100; //150-200 //100-2000
        
        do{
            count++;
            System.out.print("Enter a number:");
            number = input.nextInt();
            System.out.println("Input from user:" + number);

            if(number==randomNumber){
                System.out.println("The number entered is similar to the randomNumber after " + count + " times.");
            }else if(number<randomNumber){
                System.out.println("The number entered is less than the randomNumber");
            }else{
                System.out.println("The number entered is larger than the randomNumber");
            }
        }while(number!=randomNumber);
            
        System.out.println("Random value from code:" + randomNumber);
        
        
    }
    
}
