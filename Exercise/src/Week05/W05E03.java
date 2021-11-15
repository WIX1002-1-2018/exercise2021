/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week05;

import java.util.Scanner;

/**
 *
 * @author askba
 */
public class W05E03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String durian = "";
        double sales,revenue = 0,total;
        
        while(!durian.equalsIgnoreCase("Quit")){
            System.out.print("Enter the type of durian [Quit] to terminate: ");
            Scanner sc1 = new Scanner(System.in);
            durian = sc1.nextLine();
            
            if(!durian.equalsIgnoreCase("Quit")){
                System.out.print("Enter the sales in kg: ");
            Scanner sc2 = new Scanner(System.in);
            sales = sc2.nextDouble();
            
            if("MK".equalsIgnoreCase(durian)){
                total = sales*25;
                revenue += total;
            }
            else if("HL".equalsIgnoreCase(durian)){
                total = sales*22;
                revenue += total;
            }
            else if("D24".equalsIgnoreCase(durian)){
                total = sales*20;
                revenue += total;
            }
            else if("UM".equalsIgnoreCase(durian)){
                total = sales*18;
                revenue += total;
                
            }
            
            }
            
        }
        System.out.printf("Total Sales: %.2f\n",revenue);
    }
    
}
