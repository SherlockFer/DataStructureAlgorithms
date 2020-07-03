/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacherRank;

/**
 *
 * @author user
 */
public class BirthdayCandles {

        public static void main(String args[])
    // Driver program  
    { 
        int arr[] = {2,2,3,3,3}; 
        System.out.println("Max Items : "+getMoneySpent(arr)); 
    }
        
    static int getMoneySpent(int[] ar) {
        int count = 1;                                                     //all values will have at least one  count
        int maxHeight = 0;
        for (int i = 0; i < ar.length; i++) {
            int temp = ar[i];
            if (temp >= maxHeight) {
                if(temp > maxHeight)count=1;
                if (temp == maxHeight) //if the highest num occurs again
                {
                    count++;
                }
                maxHeight = temp;
            }
        }
        return count;
    }

}
