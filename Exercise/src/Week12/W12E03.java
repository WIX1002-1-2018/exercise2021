/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week12;

/**
 *
 * @author Badrul
 */
public class W12E03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        animal obanimal = new animal();
        cat obcat = new cat();
        monkey obmonkey = new monkey();
        
        obanimal.sound();
        obcat.sound();
        obmonkey.sound();
        
        animal obcat2 = new cat();
        animal obmonkey2 = new monkey();
        
        System.out.println("\n\n\n");
        obcat2.sound();
        obmonkey2.sound();
        
    }
    
}
