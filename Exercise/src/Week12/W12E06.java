/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week12;

/**
 *
 * @author Badrul
 */
public class W12E06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        outerclass outer = new outerclass();
        System.out.println(outer.a);
        
        outerclass.innerclass inner = outer.new innerclass();
        System.out.println(inner.b);
        inner.b =100;
        
        outerclass.innerclass inner1 = outer.new innerclass();
        System.out.println(inner1.b);
        inner1.b =101;
        
        System.out.println(inner1.b);
        System.out.println(inner.b);
        
        
        
    }
    
}
