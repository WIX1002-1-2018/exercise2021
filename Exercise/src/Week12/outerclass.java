/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12;

/**
 *
 * @author Badrul
 */
public class outerclass {
    public int a=20;

    public outerclass() {
        System.out.println("this is contructor on outerclass");
    }
    
    @Override
    public String toString(){
        return "From outerclass";
    }
    
    
    public class innerclass{
        public int b =10;

        public innerclass() {
             System.out.println("this is contructor on innerclass");
        }
        
        
    }
}
