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
public class PaySystem {
    private double hour, payrate;

    public PaySystem(double hour, double payrate) {
        this.hour = hour;
        this.payrate = payrate;
    }
    
    public double getPay(){
        return this.hour*this.payrate;
    }
    
}
