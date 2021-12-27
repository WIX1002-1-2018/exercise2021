/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10;

/**
 *
 * @author Badrul
 */
public class fruit {
    
    private int a;
    private int b;

    public fruit() {
    }

    public fruit(int a) {
        this.a = a;
    }

    public fruit(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    public void methodCalculate(){
        System.out.println(this.a + this.b);
    }
    
     public int methodreturnCalculate(){
        return this.a + this.b;
    }
    
}
