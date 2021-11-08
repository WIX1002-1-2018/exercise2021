/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week04;

/**
 *
 * @author askba
 */
public class W04E08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        label1:{
        for(int j = 0;j<10;j++){
           for(int i = 0;i < 10; i++){
            if(j==5)
              break label1;
            System.out.println("Value J: " + j + " Value I: " + i);
           }
           System.out.println("Value J:" + j);
          
        }
    }
    
    }
    
    
}
