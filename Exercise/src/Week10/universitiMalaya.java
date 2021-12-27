/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10;

/**
 *
 * @author Badrul
 */
public class universitiMalaya {
    
    private int a;
    private String name;
    String matrix;

    public universitiMalaya() {
    }

    public universitiMalaya(String name) {
        this.name = name;
    }

    public universitiMalaya(int a) {
        this.a = a;
    }

    public universitiMalaya(int a, String name) {
        this.a = a;
        this.name = name;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
