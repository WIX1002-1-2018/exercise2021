/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13;

/**
 *
 * @author Badrul
 */
public class CombineDiscount extends DiscountPolicy{

    final private DiscountPolicy policy1;
    final private DiscountPolicy policy2;

    public CombineDiscount(DiscountPolicy policy1, DiscountPolicy policy2) {
        this.policy1 = policy1;
        this.policy2 = policy2;
    }
    
    @Override
    public double computeDiscount(int count, double itemCost) {
       if(this.policy1.computeDiscount(count, itemCost)>this.policy2.computeDiscount(count, itemCost))
           return this.policy1.computeDiscount(count, itemCost);
       else
           return this.policy2.computeDiscount(count, itemCost);
        
    }
    
}
