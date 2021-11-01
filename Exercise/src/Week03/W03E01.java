/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week03;

/**
 *
 * @author askba
 */
public class W03E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 13;
        System.out.println("the value of A is " + a);
        
        if(a>0 && a<10){
            System.out.println("A is a positive number");
            System.out.println("A is larger than 0 but less than 10");
        }
        else if (a<0){
            System.out.println("A is a negative number");
            System.out.println("A is lesser than 0");
        }else{
            System.out.println("The number is invalid");
        }
        
            
      }
    
}
