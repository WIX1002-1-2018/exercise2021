/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11;

/**
 *
 * @author Badrul
 */
public class student {
    
    public String name;
    public int age;
    private String matrixNumber;

    public student() {
        System.out.println("This is the constructor");
    }
    
    public student(int age) {
        System.out.println("This is the constructor with parameter " + age);
        this.age = age;
    }
    
    public student(String name, int age) {
        System.out.println("This is the constructor with parameter " + name + " and " + age );
        this.name = name;
        this.age = age;
    }

    public student(String name, int age, String matrixNumber) {
        System.out.println("This is the constructor with parameter " + name + " , " + age + " and " + matrixNumber );
        this.name = name;
        this.age = age;
        this.matrixNumber = matrixNumber;
    }

    public String getMatrixNumber() {
        return matrixNumber;
    }

    public void setMatrixNumber(String matrixNumber) {
        this.matrixNumber = matrixNumber;
    }
    
    public void printOutput(){
          System.out.println("Object with value " + this.name + " and " + this.age + " with matrix number " + this.matrixNumber);
    }
    
    public void printAge(){
            System.out.println("The age is :" + this.age);
    }
    
    public void colorBasedOnAge(){
        if(this.age %2 ==0)
            System.out.println("Blue");
        else
            System.out.println("Red");
    }
    
    public String colorBasedOnAgeReturn(){
        if(this.age %2 ==0)
           return "Blue";
        else
           return "Red";
    }
    
    
    
    
    
    
}
