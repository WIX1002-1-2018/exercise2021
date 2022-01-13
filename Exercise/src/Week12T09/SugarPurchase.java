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
public class SugarPurchase extends PurchaseSystem{
    
    private double weight;

    public SugarPurchase(double weight, String productcode, double unitprice, double quantity) {
        super(productcode, unitprice, quantity);
        this.weight = weight;
    }
    
    public void compute(){
        super.compute();
        super.setTotalprice(super.getTotalprice()*this.weight);
       
    }
    
}
