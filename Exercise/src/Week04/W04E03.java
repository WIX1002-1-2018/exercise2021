/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week04;

/**
 *
 * @author askba
 */
public class W04E03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = 100;
        
        while(number>=50){
             System.out.println("while :" + number);
             number = number - 1;
        }
        
        for(int x=100;x>49;x--){
           System.out.println("For = "+(x));
        }
        
        number = 100;
        
        do{
             System.out.println("Do while :" + number);
             number = number - 1;
        }while(number>=50);
    }
    
}
