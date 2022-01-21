/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13;

/**
 *
 * @author Badrul
 */
public class OtherDiscount extends DiscountPolicy {

    @Override
    public double computeDiscount(int count, double itemCost) {
        
        if(count > 8)
            return 0.3*itemCost;
        else if(count> 5)
            return 0.2*itemCost;
        else if(count > 2)
            return 0.1*itemCost;
        else
            return 0;
    }
    
}
