/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
/**
 *
 * @author user
 */
public class algo {

     static public final  int a=12;

    public static void main(String[] args) {
        int[] result=deleteNth(new int[] {20,37,20,21}, 1);
        for(int ele:result){
        System.out.println(ele);
        }
    }
    
  public static int[] deleteNth(int[] elements, int maxOccurrences) {
    ArrayList<Integer> listResult = new ArrayList<Integer>();
    HashMap<Integer, Integer> occurences = new HashMap<Integer, Integer>();
    
    for(int i = 0; i < elements.length; i++){
    int el = elements[i];
    System.out.println("element "+el);
    //if hash does not have the element
      if(!occurences.containsKey(el)){
        //record the element into the hash
        occurences.put(el, 0);
          System.out.println(occurences.get(el));
                  occurences.put(el, 50);
          System.out.println(occurences.get(el));
          
        
      }
      
      //value of new occur will be the numbers of ocurrencies
      int newOccur = occurences.get(el) + 1;
        System.out.println("newocurr "+newOccur);
      if(newOccur <= maxOccurrences){
        occurences.put(el, newOccur);
        listResult.add(el);
      }
    }
    int newSize = listResult.size();
    int[] intArray = new int[newSize];
    for(int j = 0; j < newSize; j++){
      intArray[j] = listResult.get(j);
    }
    return intArray;
  }

}
