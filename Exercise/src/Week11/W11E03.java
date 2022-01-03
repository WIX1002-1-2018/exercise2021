/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week11;

/**
 *
 * @author Badrul
 */
public class W11E03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        person a = new person();
        person b = new person("Bad", "Badrul Anuar",42, "WEK97256");
        
        System.out.println(b.getMatrixNumber());
        b.printOutput();
        
        b.accessPrivatePrint();
        
    }
    
}
