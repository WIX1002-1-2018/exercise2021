/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10;

/**
 *
 * @author Badrul
 */
public class student {
    
    private String name;
    private int age;

    public student(String name) {
        this.name = name;
    }

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void printInfo(){
        System.out.println("Student name : " + this.name);
        System.out.println("Student age : " + this.age );
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    
    
    
}
