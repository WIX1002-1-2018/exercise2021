/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week02;

/**
 *
 * @author askba
 */
public class W02E06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String myName = "Nor Badrul Anuar";
        String FirstName = "Abu";
        String LastName = "Bakar";
        
        String FullName = FirstName + "+" + LastName;
        
        System.out.println(myName);
        System.out.println(myName.charAt(5));// will print the 5th character
        
        System.out.println(FullName);
        
        int num = 1234567;
        String numToString = Integer.toString(num);
        System.out.println(numToString.charAt(6));
        
    }
    
}
