/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11;

/**
 *
 * @author Badrul
 */
public class person extends student{
    
   public String nickName;

    public person() {
         System.out.println("This constructor from child class (person)");
    }

    public person(String nickName, String name, int age, String matrixNumber) {
        super(name, age, matrixNumber);
        this.nickName = nickName;
    }
    
   @Override
    public void printOutput(){
          System.out.println("Object with value " + super.name + " and " + super.age + " with matrix number " + super.getMatrixNumber() + " with nickname " + this.nickName);
    }
   
   
    
   @Override
   public void printPublic(){
      System.out.println("This is a public method from child class (Person)");
   }
   
   @Override
    protected void printProtected(){
        super.printProtected();
        System.out.println("This is a protected method from child class (person)");
    }
    
}
