/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OddsAndEven;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class OddAndEven {
  public static void main(String[] args){
      int arr[]={12, 17, 70, 15, 22, 65, 21, 90};
      System.out.println("Original Array: ");
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
      }
      System.out.println("");
      int[] myArray=separateEvenOddNumbers(arr);
      for(int number:myArray){
          System.out.print(number+" ");
      }
  }

    private static int[] separateEvenOddNumbers(int[] arr) {
        List<Integer> myList=new ArrayList<Integer>();
        for(int number:arr){
            if(number%2!=0){
               myList.add(number);
            }
        }
        int[] myArray=new int[myList.size()];
        for(int i=0;i<myList.size();i++){
           myArray[i]=myList.get(i);
        }
        return myArray;
    }
}
