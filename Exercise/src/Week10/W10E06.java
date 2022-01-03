/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week10;

import java.util.Scanner;

/**
 *
 * @author samam
 */
public class W10E06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array (max is 10): ");
        int size = sc.nextInt();
        size = 8;
        
        int[] x = new int[size];
        int[] y = new int[size];      
        
     
        System.out.println("Enter the element of array 1: ");
        for(int i = 0; i < x.length; i++)
            x[i] = sc.nextInt();
        
        System.out.println("Enter the element of array 2: ");
        for(int i = 0; i < y.length; i++)
            y[i] = sc.nextInt(); 
        **/
        
        //int [] x = {174,521,24,224,831,179,712,97};
        //int [] y = {281,33,122,415,611,235,737,81};
        
        //int [] x = {2,4,5,7,10};
       // int [] y = {13,14,15,16,17};
        int [] x = {1,2};
        int [] y = {4,5};
        
        System.out.println("The maximum sum of XOR values of two arrays a and b is " + maxSum(x,y));
    }
    
    public static int maxSum(int[] a, int[] b){
        int[][] mul = new int[a.length][b.length];
        int maxSum = 0, ans = 0;        
        int length = b.length;
                
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                mul[i][j] =  a[j] ^ b[i];   
                System.out.print(mul[i][j] + " ");
            } 
            System.out.println("");
        }
        switch(length){
            case 1:
                maxSum = mul[0][0];
                break;
            case 2: 
                for(int i = 0; i < a.length; i++){
                    for(int j = 0; i < a.length; i++){
                        if(j == i){
                             continue;
                        }
                        ans = mul[0][i] + mul[1][j];
                        System.out.println(ans + "=" + "mul[0][" + i + "] + mul[1][" + j + "]");
                        //System.out.println(ans);
                        maxSum = Math.max(maxSum, ans);
                    }
                } 
                break;
            case 3: 
                for(int i = 0; i < a.length; i++){
                    for(int j = 0; j < a.length; j++){
                        //if(j == i)
                          //  continue;
                        for(int k = 0; k < a.length; k++){
                            //if(k == j)
                              //  continue;                             
                            ans = mul[0][i] + mul[1][j] + mul[2][k];
                            System.out.println(ans + "=" + "mul[0][" + i + "] + mul[1][" + j + "] + mul[2][" + k  +"]");
                            maxSum = Math.max(maxSum, ans);       
                        }
                    }
                }
                break;
            case 4:
                for(int i = 0; i < a.length; i++){
                    for(int j = 0; j < a.length; j++){
                        if(j == i)
                            continue;
                        for(int k = 0; k < a.length; k++){
                            if(k == j)
                                continue;
                            for(int l = 0; l < a.length; l++){
                                if(l == k)
                                    continue;
                                ans = mul[0][i] + mul[1][j] + mul[2][k] + mul[3][l];
                                maxSum = Math.max(maxSum, ans);
                            }
                        }
                    }
                }
                break;
            case 5: 
                for(int i = 0; i < a.length; i++){
                    for(int j = 0; j < a.length; j++){
                        if(j == i)
                            continue;
                        for(int k = 0; k < a.length; k++){
                            if(k == j || k == i)
                                continue;
                            for(int l = 0; l < a.length; l++){
                                if(l == k || l == j || l == i)
                                    continue;
                                for(int m = 0; m < a.length; m++ ){
                                    if(m == l || m == k || m == j || m == i)
                                        continue; 
                                    ans = mul[0][i] + mul[1][j] + mul[2][k] + mul[3][l] + mul[4][m];
                                    maxSum = Math.max(maxSum, ans);
                                }
                            }
                        }
                    }
                }
                break;
            case 6:
                for(int i = 0; i < a.length; i++){
                    for(int j = 0; j < a.length; j++){
                        if(j == i)
                            continue;
                        for(int k = 0; k < a.length; k++){
                            if(k == j || k == i)
                                continue;
                            for(int l = 0; l < a.length; l++){
                                if(l == k || l == j || l == i)
                                    continue;
                                for(int m = 0; m < a.length; m++ ){
                                    if(m == l || m == k || m == j || m == i)
                                        continue;
                                    for(int n = 0; n < a.length; n++){
                                        if(n == m || n == l || n == k || n == j || n == i)
                                            continue;
                                        ans = mul[0][i] + mul[1][j] + mul[2][k] + mul[3][l] + mul[4][m] + mul[5][n];
                                        maxSum = Math.max(maxSum, ans);                                        
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 7:
                for(int i = 0; i < a.length; i++){
                    for(int j = 0; j < a.length; j++){
                        if(j == i)
                            continue;
                        for(int k = 0; k < a.length; k++){
                            if(k == j || k == i)
                                continue;
                            for(int l = 0; l < a.length; l++){
                                if(l == k || l == j || l == i)
                                    continue;
                                for(int m = 0; m < a.length; m++ ){
                                    if(m == l || m == k || m == j || m == i)
                                        continue;
                                    for(int n = 0; n < a.length; n++){
                                        if(n == m || n == l || n == k || n == j || n == i)
                                            continue;
                                        for(int o = 0; o < a.length; o++){
                                            if(o == n || o == m || o == l || o == k || o == j || o == i)
                                                continue;
                                            ans = mul[0][i] + mul[1][j] + mul[2][k] + mul[3][l] + mul[4][m] + mul[5][n] + mul[6][o];
                                            maxSum = Math.max(maxSum, ans);
                                        }
                                        
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 8:
                for(int i = 0; i < a.length; i++){
                    for(int j = 0; j < a.length; j++){
                        if(j == i)
                            continue;
                        for(int k = 0; k < a.length; k++){
                            if(k == j || k == i)
                                continue;
                            for(int l = 0; l < a.length; l++){
                                if(l == k || l == j || l == i)
                                    continue;
                                for(int m = 0; m < a.length; m++ ){
                                    if(m == l || m == k || m == j || m == i)
                                        continue;
                                    for(int n = 0; n < a.length; n++){
                                        if(n == m || n == l || n == k || n == j || n == i)
                                            continue;
                                        for(int o = 0; o < a.length; o++){
                                            if(o == n || o == m || o == l || o == k || o == j || o == i)
                                                continue;
                                            for(int p = 0; p < a.length; p++){
                                                if(p == o || p == n || p == m || p == l || p == k || p == j || p == i)
                                                    continue;                                                
                                                ans = mul[0][i] + mul[1][j] + mul[2][k] + mul[3][l] + mul[4][m] + mul[5][n] + mul[6][o] + mul[7][p];
                                                System.out.println(maxSum);
                                                maxSum = Math.max(maxSum, ans);                                                
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                
                break;
            case 9:
                for(int i = 0; i < a.length; i++){
                    for(int j = 0; j < a.length; j++){
                        if(j == i)
                            continue;
                        for(int k = 0; k < a.length; k++){
                            if(k == j || k == i)
                                continue;
                            for(int l = 0; l < a.length; l++){
                                if(l == k || l == j || l == i)
                                    continue;
                                for(int m = 0; m < a.length; m++ ){
                                    if(m == l || m == k || m == j || m == i)
                                        continue;
                                    for(int n = 0; n < a.length; n++){
                                        if(n == m || n == l || n == k || n == j || n == i)
                                            continue;
                                        for(int o = 0; o < a.length; o++){
                                            if(o == n || o == m || o == l || o == k || o == j || o == i)
                                                continue;
                                            for(int p = 0; p < a.length; p++){
                                                if(p == o || p == n || p == m || p == l || p == k || p == j || p == i)
                                                    continue;
                                                for(int q = 0; q < a.length; q++){
                                                    if(q == o || q == n || q == m || q == l || q == k || q == j || q == i)
                                                        continue;                                                    
                                                    ans = mul[0][i] + mul[1][j] + mul[2][k] + mul[3][l] + mul[4][m] + mul[5][n] + mul[6][o] + mul[7][p] + mul[8][q];
                                                    maxSum = Math.max(maxSum, ans);                                                   
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 10:
                for(int i = 0; i < a.length; i++){
                    for(int j = 0; j < a.length; j++){
                        if(j == i)
                            continue;
                        for(int k = 0; k < a.length; k++){
                            if(k == j || k == i)
                                continue;
                            for(int l = 0; l < a.length; l++){
                                if(l == k || l == j || l == i)
                                    continue;
                                for(int m = 0; m < a.length; m++ ){
                                    if(m == l || m == k || m == j || m == i)
                                        continue;
                                    for(int n = 0; n < a.length; n++){
                                        if(n == m || n == l || n == k || n == j || n == i)
                                            continue;
                                        for(int o = 0; o < a.length; o++){
                                            if(o == n || o == m || o == l || o == k || o == j || o == i)
                                                continue;
                                            for(int p = 0; p < a.length; p++){
                                                if(p == o || p == n || p == m || p == l || p == k || p == j || p == i)
                                                    continue;
                                                for(int q = 0; q < a.length; q++){
                                                    if(q == o || q == n || q == m || q == l || q == k || q == j || q == i)
                                                        continue;
                                                    for(int r = 0; r < a.length; r++){
                                                        if(r == q || r == o || r == n || r == m || r == l || r == k || r == j || r == i)
                                                            continue;  
                                                        ans = mul[0][i] + mul[1][j] + mul[2][k] + mul[3][l] + mul[4][m] + mul[5][n] + mul[6][o] + mul[7][p] + mul[8][q] + mul[9][r];
                                                        maxSum = Math.max(maxSum, ans);                                                                                                                    
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            default :
                System.out.println("Error");
                break;           
        }
        return maxSum;                   
    }
    
}