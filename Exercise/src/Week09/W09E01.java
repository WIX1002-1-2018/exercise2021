/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;

/**
 *
 * @author Badrul
 */
public class W09E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        
        try{
            
            PrintWriter write = new PrintWriter(new FileOutputStream("c:/temp/integer.txt"));
            
            for(int i=0;i<3;i++){
                int num = rand.nextInt(100);
                System.out.print(num + " ");
                write.print(num);
            }
            
            write.close();
            
        }catch(FileNotFoundException e){
            System.out.println("Error");
        }
        
        
    }
    
}
