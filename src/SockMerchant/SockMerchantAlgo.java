/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SockMerchant;

import java.util.HashSet;

/**
 *
 * @author user
 */
public class SockMerchantAlgo {
    
    public static void main(String[] args){
        int[] ar=new int[]{2,3,4,5,2,3,4,6};
        System.out.println(sockMerchant(ar));
    }
    
        // Complete the sockMerchant function below.
    static int sockMerchant(int[] ar) {
        HashSet<Integer> unmatched = new HashSet<>();
        int pairs = 0;
        for(int i = 0; i < ar.length; i++) {
            if(unmatched.add(ar[i])==false) {
                unmatched.remove(ar[i]);
                pairs++;
            }
        }
    return pairs;
    }
    
}
