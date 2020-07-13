/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OddsAndEven;

/**
 *
 * @author user
 */
public class oddNthposition {
    public static void main(String[] args){
        int[] arr=new int[]{1, 2, 3, 4, 5};
        int k=2;
        System.out.println(numberPosition(arr,k));
    //Input: arr[] = {1, 2, 3, 4, 5}, K = 2
    //Output: 3
    }

    private static int numberPosition(int[] arr, int k) {
        int times=0;
        for(int number:arr){
            if(number%2!=0){
               times++;
               if(times==k)
                   return number;
            }
        }
    return 0;
    }
}
