/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13;

/**
 *
 * @author Badrul
 */
public class FixedAccount implements Interest{

    private double balance;

    public FixedAccount(double balance) {
        this.balance = balance;
    }
    
    
    @Override
    public double ComputeInterest() {
        return this.balance*0.03/12;
        
    }
    
    public void display(){
        System.out.println("Fixed Account Balance " + this.balance);
        System.out.println("Interest " + this.ComputeInterest());
    }
    
  
    
}
