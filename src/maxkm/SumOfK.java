/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxkm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author user
 */
public class SumOfK {

    public static void main(String[] args) {
        System.out.println(isAnagram("foefety", "toffee"));


    }

  public static boolean isAnagram(String test, String original) {
      if(test.length()!=original.length()){
         return false;
      }
      char testArray[] = test.toCharArray();
      Arrays.sort(testArray);
      
      char originalArray[] = original.toCharArray();
      
      Arrays.sort(testArray);
      Arrays.sort(originalArray);
      
     return Arrays.equals(testArray, originalArray);
      
      
//      int count=0;
//      for (int i=0; i< testArray.length;i++){
//          if(originalArray[i]!=testArray[i]){
//              return false;
//          }
//          if(originalArray[i]==testArray[i]){
//              count=count+1;
//          }
//          if (count==testArray.length){
//              return true;
//          }
//          
//      }
      
      
//    return false;
  }
}