/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coins;
import java.util.Arrays;

/**
 *
 * @author user
 */
public class practice {
    public static void main(String args[])
    // Driver program  
    { 
        int arr[] = {1, 2, 3}; 
        int m = arr.length; 
        int n = 4; 
        System.out.println("Nro ways to give coins is : "+countWays(arr, m, n)); 
    }
    
     static long countWays(int S[], int m, int n) 
    { 
        int[] table=new int[n+1];
        for (int i = 0; i <= n; i++) {
            table[i]=0;
        }
        table[0]=1;
        
        for (int i = 0; i < m; i++) {
            for (int j = S[i]; j <= n; j++) {
                table[j]+=table[j-S[i]];
            }
        }
        
    return table[n];      
    }
    
}
