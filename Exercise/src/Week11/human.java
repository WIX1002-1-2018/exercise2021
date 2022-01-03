/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11;

/**
 *
 * @author Badrul
 */
public class human extends person{

    public human() {
        System.out.println("This is constructor from child class (human)");
    }

    public human(String nickName, String name, int age, String matrixNumber) {
        super(nickName, name, age, matrixNumber);
    }
    
    
    
    
    
    @Override
    public void printPublic(){
      System.out.println("This is a public method from child class (human)");
   }
    
}
