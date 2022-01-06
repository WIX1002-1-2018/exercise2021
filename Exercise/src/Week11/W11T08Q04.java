/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week11;

/**
 *
 * @author pensyarah
 */
public class W11T08Q04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Payment pay = new Payment();
        pay.paymentTo(100);
        pay.paymentTo(100, "X145858");
        pay.paymenTo(100, "Badrul", "Master card", "08/2022", "R2583969");
        
        Payment cash = new Payment(100);
        Payment cheque = new Payment(100, "ChequeNumber00101");
        Payment creditCard = new Payment(100, "Badrul", "Master card", "08/2022", "R2583969");
        
        
    }
    
}
