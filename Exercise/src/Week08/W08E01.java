/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week08;

/**
 *
 * @author Badrul
 */
public class W08E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println(maximum(25,8,100));
        
       int a = maximum(25,8,9);
       System.out.println(a); 
        
    }
    
    public static int maximum(int num1, int num2, int num3){
         int max=num1;
        if(num2>max){
            max=num2;
        }
        if (num3>max){
            max=num3;
        }
        return max;
    }
}
