/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week12;

/**
 *
 * @author Badrul
 */
public class W12E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        animal ob1 = new animal();
        cat obcat1 = new cat();
        
        System.out.println(obcat1.publicNumber);
        
        monkey obMonkey = new monkey();
        System.out.println(obMonkey.publicNumber);
        
        obcat1.color();
        obMonkey.color();
        
        obcat1.leg();
        obMonkey.leg();
    }
    
}
