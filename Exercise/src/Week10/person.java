/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10;

/**
 *
 * @author Badrul
 */
public class person {
    
    private int aPrivate;
    private int bPrivate;
    protected int cProtected;
    public int aPublic;
    
    public person() {
        System.out.println("Constructor created");
    }

    public person(int aPrivate) {
        this.aPrivate = aPrivate;
        System.out.println("Constructor created with argument");
    }
    
    public person(int aPrivate, int bPrivate){
        this.bPrivate = bPrivate;
        this.aPrivate = aPrivate;
        System.out.println("Constructor created with two arguments");
    }
  
    public void displayVariable(){
        System.out.println("This is the private variable:" + this.aPrivate);
        System.out.println("This is the public variable:"+ this.aPublic);
    }
    
    public void display(int a){
        System.out.println("Display Me");
        System.out.println(this.calculate(a));
    }
    
    public void display(){
        System.out.println("displayWithoudCalculate");
    }
    
    private int calculate(int a){
       return a+a;
    }

    public int getaPrivate() {
        return aPrivate;
    }

    public void setaPrivate(int aPrivate) {
        this.aPrivate = aPrivate;
    }
    
    
    
    
    
    
}
