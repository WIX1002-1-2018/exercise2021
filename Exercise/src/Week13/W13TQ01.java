/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week13;

/**
 *
 * @author Badrul
 */
public class W13TQ01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double itemCost = 100;
        int count = 1000;
        BulkDiscount bulk =  new BulkDiscount(100,50);
        OtherDiscount other = new OtherDiscount();
        System.out.println("Item Cost : " + itemCost);
        System.out.println("Quantity : " + count);
        System.out.println("Bulk Discount : " + bulk.computeDiscount(count, itemCost));
        System.out.println("Other Discount : " + other.computeDiscount(count, itemCost));
        CombineDiscount combine = new CombineDiscount(bulk,other);
        System.out.println("Combine Discount : " + combine.computeDiscount(count, itemCost));
        
    }
    
}
