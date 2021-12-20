/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Badrul
 */
public class W09E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
            int max =0;
            
            Scanner read = new Scanner(new FileInputStream ("c:/temp/integer.txt"));
            
            while(read.hasNextInt()){
                int num = read.nextInt();
                System.out.print(num + " ");
                if(num > max)
                    max = num;
            }
            System.out.println("");
            System.out.println("Maximum number is : " + max);
            read.close();
            
        }catch(FileNotFoundException e){
            System.out.println("File Error");
        }
    }
    
}
