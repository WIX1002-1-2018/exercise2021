/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Badrul
 */
public class W09E06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard =  new Scanner(System.in);
        
        System.out.print("Select the menu: (1) To get the new random number (2) To list the random :");
        int menu = keyboard.nextInt();
        
        if(menu==1){
        
                    System.out.println("");

                    Random rand = new Random();

                    try{

                        PrintWriter write = new PrintWriter(new FileOutputStream("c:/temp/integer.txt"));

                        for(int i=0;i<20;i++){
                            int num = rand.nextInt(100);
                            System.out.print(num + " ");
                            write.print(num + " ");
                        }

                        write.close();

                    }catch(FileNotFoundException e){
                        System.out.println("Error");
                    }
        }else if(menu==2){
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
    
}
