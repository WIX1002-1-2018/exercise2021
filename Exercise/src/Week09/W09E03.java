/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week09;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Random;

/**
 *
 * @author Badrul
 */
public class W09E03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        try{
            
            ObjectOutputStream output = new ObjectOutputStream (new FileOutputStream("c:/temp/integer.dat"));
            for(int i=0;i<10;i++){
                int num = rand.nextInt(100);
                System.out.print(num + " ");
                output.writeInt(num);
            }
            
            output.close();
        }catch(IOException e){
            System.out.println("Error");
        }
    }
    
}
