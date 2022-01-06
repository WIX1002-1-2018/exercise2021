/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11;

/**
 *
 * @author pensyarah
 */
public class Digit {
    
    private int num;

    public Digit(int num) {
        this.num = num;
    }
    
    public int digitMultiplication(){
        int num = this.num;
        int ans = 1;
        while(num!=0){
            ans *= num%10;
            num /= 10;
        }
        return ans;
    }
    
    public void display(){
    System.out.print("The digit multiplication of : " + this.num + " is " + this.digitMultiplication());
    }
    
    
    
}
