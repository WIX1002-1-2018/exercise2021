/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week03;

/**
 *
 * @author askba
 */
public class W03E03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String stringA = "Hello World";
        String stringB = "hello world";
        
        if(stringA.equalsIgnoreCase(stringB))
            System.out.println("The strings are equal");
        else
            System.out.println("The strings are not equal");
        
        
        if(stringA.equals(stringB))
            System.out.println("With the case sensitivity, the strings are equal");
        else
            System.out.println("With the case sensitivity, the strings are not equal");
         
    }
    
}
