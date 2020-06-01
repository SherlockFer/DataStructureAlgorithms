/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class Algorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a="Mikka";
        String b="Kkami";
        
        char[] a1=a.toLowerCase().toCharArray();
        char[] b1=a.toLowerCase().toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);

if(Arrays.equals(a1, b1)){
    System.out.println("son anagramas");   
}   else{
    System.out.println("No son anagramas");
}     
        
        
  int arr[] = {1, 2, 3}; 
        int m = arr.length;
        int transation=4;
        System.out.println( count(arr, m, transation)); 
        //                            ,3,4
        
        
        
        
        
        int r,sum=0,temp;    
  int n=14541;//It is the number variable to be checked for palindrome  
   temp=n;
   while(n>0){
       r=n%10;
       sum=(sum*10)+r;
       n=n/10;
   }
  
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    

        
        int[] array={4,5,6,7,8};
        int number=9;
        System.out.println(checkNumberArray(array,number));
    }
    
    static public boolean checkNumberArray(int[] array, int number){
        boolean check=false;
        for(int i=0;i<array.length;i++){
        if(array[i]==number){
            check=true;
        }
    }
        return check;
    }
    
    
        // Returns the count of ways we can  
    // sum S[0...nroMonedas-1] coins to get sum transaction 
    //                             3,               4
    static int count( int S[], int nroMonedas, int transaction ) 
    { 
        // If transaction is 0 then there is 1 solution  
        // (do not include any coin) 
        if (transaction == 0) 
            return 1; 
          
        // If transaction is less than 0 then no  
        // solution exists 
        if (transaction < 0) 
            return 0; 
      
        // If there are no coins and transaction  
        // is greater than 0, then no 
        // solution exist 
        if (nroMonedas <=0 && transaction >= 1) 
            return 0; 
      
        // count is sum of solutions (i)  
        // including S[nroMonedas-1] (ii) excluding S[nroMonedas-1] 
        return count(S, nroMonedas - 1, transaction ) + 
               count(S, nroMonedas, transaction-S[nroMonedas-1] ); 
    } 
}
