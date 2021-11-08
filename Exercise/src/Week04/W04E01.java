/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week04;

/**
 *
 * @author askba
 */
public class W04E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = 1;
        
        while(number <=10)
            System.out.println("While :" + number++);
        
        int numberwhile = 11;
        
        while(numberwhile <=10)
            System.out.println(numberwhile++);
        
        int numberdo = 11;
        
        do{
            System.out.println(numberdo++);
        }while(numberdo <= 10);   
        
        
        for(int numberfor = 1; numberfor < 10; numberfor++)
            System.out.println("For loop: " + numberfor);
        
            
    }
    
}
