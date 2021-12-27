/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week10;

/**
 *
 * @author Badrul
 */
public class W10E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        person a = new person(22);
        person b = new person();
        person c = new person();
        
        a.aPublic = 10;
        a.displayVariable();
        
        System.out.println("Public Display in main : " + a.aPublic);
        System.out.println("Private Display in main : " + a.getaPrivate());
        
        b.aPublic = 100;
        b.setaPrivate(101);
        b.displayVariable();
        System.out.println("This is private value :" + b.getaPrivate());
        
        person bwihouta =  new person(0,20);
        
        System.out.println("Object A :" + a.aPublic);
        System.out.println("Object B :" + b.aPublic);
        System.out.println("Object bwihouta :" + bwihouta.aPublic);
        
        a.display();
        a.display(100);
       
        
        
         
    }
    
}
