/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12;

/**
 *
 * @author Badrul
 */
public class monkey extends animal {

    public monkey() {
        System.out.println("This is constructor for monkey");
       // this.publicNumber = 2;
    }
    
    @Override
    public void color(){
        System.out.println("Monkey color = black");
    }
    
    @Override
    public void leg(){
        System.out.println("Monkey has two legs");
    }
    
    public void sound(){
        System.out.println("Monkey says hoot");
    }
    
    
}
