/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week06;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author askba
 */
public class W06E06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int arraySize;
         int position =-1;
         int count=1;
         int searchKey;
         
        Scanner input = new Scanner(System.in);
        Random rand =  new Random();
        
        System.out.print("Enter array size: ");
        arraySize = input.nextInt();
        
        int[] number =  new int[arraySize];
        
        for(int i=0;i<number.length;i++)
             number[i] = rand.nextInt(500)+50;
        
        System.out.print("Before sort: ");
        for(int i=0;i<number.length;i++)
            System.out.print(number[i] + " ");
        
        System.out.print("\nEnter value for searching: ");
        searchKey = input.nextInt();
        
        for (int cnt=0; cnt< number.length; cnt++ ){
            if (number[cnt] == searchKey){
                    position = cnt;
                    break;
        }
        count++;
        }
	
       
        if(position != -1)
            System.out.println("(Linear Search) The value " + searchKey + " is found in the index position " + position + " after " + count + " loops");
        else
            System.out.println("(Linear Search) The value is NOT found");

        //binary search;
        
          for(int pass = 1; pass < number.length; pass++ ) 
            for( int i = 0; i < number.length - 1; i++ ) 
		if (number[i] > number[i+1]){
               	int hold = number[i];        
		number[i] = number[i+1];  
		number[i+1] = hold;
		}
        
        System.out.print("After Bubble sort: ");
        for(int i=0;i<number.length;i++)
          System.out.print(number[i] + " ");
        System.out.println();
        
        int low = 0;   // low element subscript
        int high = number.length - 1;  // high element subscript
        int middle;    // middle element subscript
        count=0;
        position =-1;
        
        while (low <= high){
		middle = (low+high)/2;
		if (searchKey == number[middle]) {
                    position = middle;
                    break;
                }
		else if ( searchKey < number[middle])
                    high = middle - 1;  
		else
                    low = middle + 1;  
            count++;
        }
        
        if(position != -1)
            System.out.println("(Binary Search) The value " + searchKey + " is found in the index position " + position + " after " + count + " loops");
        else
            System.out.println("(Binary Search) The value is NOT found");
   
  
          
          
    }
    
}
