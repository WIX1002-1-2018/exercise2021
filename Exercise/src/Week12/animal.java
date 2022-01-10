/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12;

/**
 *
 * @author Badrul
 */
public class animal {
    
    private int privateNumber;
    public int publicNumber;

    public animal() {
        System.out.println("This is constructor from animal class");
        this.privateNumber = 10;
        this.publicNumber = 10;
    }

    public animal(int publicNumber, int privateNumber) {
        this.publicNumber = privateNumber;
        this.privateNumber = privateNumber;
    }

    public int getPrivateNumber() {
        return privateNumber;
    }

    public void setPrivateNumber(int privateNumber) {
        this.privateNumber = privateNumber;
    }
    
    public void color(){
        System.out.println("Animal color");
    }
    
    public void leg(){
        System.out.println("Animal has legs");
    }
    
    public void print(){
        System.out.println("This is print method from animal Class");
    }
    
    public void sound(){
        System.out.println("Animal creates sounds");
    }
    
}
