/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week13;

/**
 *
 * @author Badrul
 */
public class W13E01 {

    /**
     * @param args the command line arguments
     */
    public static int methoda(int a,int b){
        System.out.println(a+b);
        return a+b;
    }
    
    public static void methodArray(int [][] a){
        
    }
    
    public static void methodArrayChange(int [] num){
        System.out.println("In the method");
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
            num[i] += num[i];
        }
           
    }
           
    public static void methodInteger(int numberInteger){
        System.out.println("In the method " + numberInteger);
        numberInteger += numberInteger;
         System.out.println("In the method " + numberInteger);
    }
    
    public static int[][] methodDoubleArray(){
        
        int [][] number = {{1,2},{3,4}};
      //  return number;
      return new int[][]{{1,2},{3,4}};
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] num = {1,2,3,4};
        int numberInteger = 10;
        
        System.out.println("in the main : " + numberInteger);
        methodInteger(numberInteger);
        System.out.println("in the main : " + numberInteger);
        
        String str = "Hello World";
        String str2 = "Hello world 2";
     
        String str3 = str + str2;
        
        int [][] doublearray = new int[2][4];
        
        
        //System.out.println(methoda(1,2));
        //methodArray(doublearray);
        methodArrayChange(num);
        System.out.println("In the main");
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
        
        
        
                
    }
    
}
