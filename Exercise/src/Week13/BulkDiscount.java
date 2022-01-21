/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13;

/**
 *
 * @author Badrul
 */
public class BulkDiscount extends DiscountPolicy {

    private int minimum;
    private double discountRate;

    public BulkDiscount(int minimum, double discountRate) {
        this.minimum = minimum;
        this.discountRate = discountRate;
    }
    
            
    @Override
    public double computeDiscount(int count, double itemCost) {
        if(count > this.minimum)
            return itemCost * this.discountRate/100;
        else
            return 0;
    }
    
}
