/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week13;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;

/**
 *
 * @author Badrul
 */
public class W13E03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Random rand = new Random();
        
        try{
            PrintWriter write = new PrintWriter(new FileOutputStream("number.txt"));
            for(int j=0;j<10;j++){
                for(int i=0;i<10;i++){
                    int num = rand.nextInt(21);
                    System.out.print(num + " "); //print as output
                    write.print(num + " "); //num will be print in Int txt file
                }
                write.write("\n");
            }
            
            write.close(); //close file
        }catch(FileNotFoundException e){
            System.out.println("Error file");
        }
    }
}
    
