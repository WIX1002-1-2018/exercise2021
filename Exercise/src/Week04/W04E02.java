/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week04;

/**
 *
 * @author askba
 */
public class W04E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number;
        
        for(number=0;number<10;number=number+2)
            System.out.println(number);
        
        for(number=0;number<=100;number=number+10)
            System.out.println(number);
        
        number = 0;
        
        while(number<=100){
             System.out.println("while :" + number);
             number = number + 10;
        }
            
         
    }
    
}
