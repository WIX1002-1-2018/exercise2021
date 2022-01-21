/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13;

/**
 *
 * @author Badrul
 */
public class SavingAccount implements Interest{

   private double balance;
   public SavingAccount(double a) { balance = a; }
   
   public void display() {
      System.out.println("Saving Account Balance: " + balance);
      System.out.println("This month interest: " + ComputeInterest());
   }

    @Override
    public double ComputeInterest() {
         return balance * 0.005 /12;
    }
}

