/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week11;

/**
 *
 * @author Badrul
 */
public class W11E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        person personA = new person();
        
        personA.age = 20;
        personA.name = "Daus";
        personA.setMatrixNumber("U2002000");
        //personA.printOutput();
        //personA.printPublic();
        //personA.printProtected();
        
        human humanA = new human();
        humanA.age = 30;
        humanA.name = "Human A";
        humanA.setMatrixNumber("UHU200200");
        //humanA.printOutput();
        
       // humanA.printProtected();
       // humanA.printPublic();
        
        
       // personA.printPublic();
       // humanA.printPublic();
       // humanA.printProtected();
        personA.printProtected();
        
        
    }
    
}
