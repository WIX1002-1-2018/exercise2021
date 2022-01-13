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
public class PurchaseSystem {
    private String productcode;
    private double unitprice, quantity, totalprice;

    public PurchaseSystem(String productcode, double unitprice, double quantity) {
        this.productcode = productcode;
        this.unitprice = unitprice;
        this.quantity = quantity;
    }
    
    public void compute(){
        this.totalprice = this.unitprice * this.quantity;
    }
    
    public void display() {
        System.out.println("Total price is : " + this.totalprice);
    }

    public double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }
    
    
}
    

