/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week12;

/**
 *
 * @author Badrul
 */
public class W12E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        animal objectA = new animal();
        System.out.println(objectA.publicNumber);
        objectA.publicNumber = 100;
        System.out.println(objectA.publicNumber);
        
        System.out.println(objectA.getPrivateNumber());
        objectA.setPrivateNumber(199);
        System.out.println(objectA.getPrivateNumber());
        
        System.out.println(objectA.toString());
        
    }
    
}
