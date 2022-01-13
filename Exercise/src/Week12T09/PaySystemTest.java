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
public class PaySystemTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RegularPay rp = new RegularPay(3.00,3.00);
        System.out.println(rp.getPay());
        SpecialPay sp = new SpecialPay(2.00,5.00);
        System.out.println(sp.getPay());
        
        PaySystem rp1 = new RegularPay(5,2);
        System.out.println(rp1.getPay());
        PaySystem rp2 = new SpecialPay(50,2);
        System.out.println(rp2.getPay());
        
        
        
    }
    
}
