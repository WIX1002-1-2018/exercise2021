/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week12T09;

/**
 *
 * @author pensyarah
 */
public class SpecialPay extends PaySystem {

    public SpecialPay(double hour, double payrate) {
        super(hour, payrate);
    }
    
    @Override
    public double getPay(){
        return super.getPay()*1.3;
    }
    
    
}
