/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11;

/**
 *
 * @author pensyarah
 */
public class Payment {
    
    private double amount;
    private String chequeNumber, cardHolderName, cardType;
    private String expirationDate, validationCode;

    public Payment(double amount) {
        this.amount = amount;
        this.paymentTo(amount);
    }

    public Payment() {
    }

    public Payment(double amount, String chequeNumber) {
        this.amount = amount;
        this.chequeNumber = chequeNumber;
        this.paymentTo(amount, chequeNumber);
    }

    public Payment(double amount, String cardHolderName, String cardType, String expirationDate, String validationCode) {
        this.amount = amount;
        this.cardHolderName = cardHolderName;
        this.cardType = cardType;
        this.expirationDate = expirationDate;
        this.validationCode = validationCode;
        this.paymenTo(amount, cardHolderName, cardType, expirationDate, validationCode);
    }
   
    public void paymentTo(double amount){
        this.amount =  amount;
        System.out.println("The payment made by cash amounted :  " + this.amount);
    }
    
    public void paymentTo(double amount, String chequeNumber){
        this.amount = amount;
        this.chequeNumber = chequeNumber;
        
        System.out.println("The payment made by cheque with cheque number : " + this.chequeNumber + " and amounted "  + this.amount);
    }
    
    public void paymenTo(double amount, String cardHolderName, String cardType, String expirationDate, String validationCode){
        this.amount = amount;
        this.cardHolderName = cardHolderName;
        this.cardType = cardType;
        this.expirationDate = expirationDate;
        this.validationCode = validationCode;
        
        System.out.println(this.cardHolderName + " pay " + this.amount + "using credit card");
        System.out.println("The detail of credit card is with credit card type " + this.cardType);
        System.out.println("Expiration Date :" + this.expirationDate);
        System.out.println("Validation Code : " + this.validationCode);
        
        
        
    }
}
