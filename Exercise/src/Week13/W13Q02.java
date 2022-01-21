/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week13;

/**
 *
 * @author Badrul
 */
public class W13Q02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SavingAccount saving = new SavingAccount(12000);
        FixedAccount fixed = new FixedAccount(12000);
        saving.display();   
        fixed.display();
    }
    
}
