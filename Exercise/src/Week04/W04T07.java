/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week04;

import java.util.Scanner;

/**
 *
 * @author askba
 */
public class W04T07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
		System.out.print("Enter value in inch: ");
		double inch = input.nextDouble();
		double ans = (inch*2.54)/100;
		System.out.printf(inch+" inches = %.2f meters",ans);
    }
    
}
