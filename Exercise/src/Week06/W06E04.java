/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week06;

import java.util.Random;

/**
 *
 * @author askba
 */
public class W06E04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random rand =  new Random();
        
        int count=1;
        
        int [][] scoreTable = new int[3][6]; 
        
        for(int i=0;i<scoreTable.length;i++)
            for(int j=0;j<scoreTable[i].length;j++)
                scoreTable[i][j] = rand.nextInt(500)+50;
         
        for(int i=0;i<scoreTable.length;i++)
            for(int j=0;j<scoreTable[i].length;j++)
                System.out.printf("Value %d Position [%d][%d] is  %d\n", count++,i,j, scoreTable[i][j]);
        
                
    }
    
}
