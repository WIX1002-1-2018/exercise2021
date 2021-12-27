/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week10;

/**
 *
 * @author Badrul
 */
public class W10E05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        universitiMalaya um = new universitiMalaya();
        universitiMalaya umiwthInt = new universitiMalaya(10);
        universitiMalaya umwithString = new universitiMalaya("badrul");
        universitiMalaya umwithboth = new universitiMalaya(190,"Anuar");
        
        System.out.println(umwithboth.getName());
        um.setA(10);
        System.out.println(um.getA());
        um.matrix = "WEK11111";
        
        System.out.println(um.matrix);
        
        
        
    }
    
}
