/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week10;

/**
 *
 * @author Badrul
 */
public class W10E04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        fruit newFruit =  new fruit();
        newFruit.setA(10);
        newFruit.setB(20);
        
        newFruit.methodCalculate();
        
        fruit c = new fruit(100,10);
        System.out.println("total value is :"+ c.methodreturnCalculate());
        
    }
    
}
