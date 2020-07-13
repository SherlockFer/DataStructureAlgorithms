
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TowerHopper;
import java.util.*; 
import java.io.*; 
/**
 *
 * @author user
 */

class TowerHopper { 
    private int findJumps(int[] arr, int startIndex) {
        //if reached to the end...we are done'

        if(startIndex==arr.length-1){
            return 0;
        }
        int size = arr.length;

        int remainingLength = size-startIndex;

        if(remainingLength<=arr[startIndex]){
            //means no further recursion is required
            return 1;
        }
        if(arr[startIndex]==0){
            System.out.println("Cannot move further");
            return Integer.MAX_VALUE;
        }
        int jumps = Integer.MAX_VALUE;
        for (int i = 1; i <=arr[startIndex]; i++) {
            int temp = findJumps(arr, startIndex+i);
            if(temp!=Integer.MAX_VALUE){// check if path from jumps[j] is not blocked, means arr[startIndex]!=0
                jumps = Math.min(jumps, 1 + temp);
            }else{
                //ignore...cannot pass through 0
            }
        }
        return jumps;
    }

    public static void main(String[] args) {

        TowerHopper m = new TowerHopper();
        int arr[] = {2, 5, 8, 9, 2, 6, 7, 6,1, 2, 5, 8, 9, 2, 6, 7, 6, 8, 9, 1, 1,6, 8, 9, 1,1,1};
//        int arr[] = {1,1,0,1,1};
        long startTime  = System.currentTimeMillis();
        System.out.println("Minimum Jumps required: " + m.findJumps(arr,0));
        long end  = System.currentTimeMillis();
        System.out.println("Time taken: " + (end-startTime)/1000 + " seconds");
    }
} 

// This code is contributed by Sahil_Bansall 
  
