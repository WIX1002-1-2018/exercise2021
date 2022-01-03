/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week11;

/**
 *
 * @author Badrul
 */
public class W11E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        student a = new student();
        student b = new student(1);
        student c = new student("Badrul",40);
        student d = new student();
        student e = new student(20);
        student f = new student("Iman",20);
        student g = new student("Iwan",21,"S20122011");
        
        System.out.println(f.name);
        System.out.println(c.age);
        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(g.name);
        System.out.println(g.getMatrixNumber());
        
        a.age = 21;
        a.name = "Adam";
        
        System.out.println("Object A with value " + a.name + " and " + a.age);
        
        b.name = "Arif";
        b.age = 22;
        b.setMatrixNumber("U212111220");
        
        b.printOutput();
        
        c.name = "Chong";
        c.age = 23;
        c.setMatrixNumber("U2000023");
        
        c.printOutput();
    }
    
}
