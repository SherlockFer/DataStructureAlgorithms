package ExerHashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author user
 */
public class firstDuplicate {
    public static void main(String[] args) {
        String str = "geksforgks"; 
        char[] arr = str.toCharArray(); 
        System.out.println(firstRepeating(arr)); 
    }
    
    static char firstRepeating(char[] arr){
           HashMap<Character,Integer> map1=new HashMap<>();
           
           for(int i=0;i<arr.length;i++){
               if(!map1.containsKey(arr[i])){
                 map1.put(arr[i],1);
               }else return arr[i];
           }
           
           
        return ' ';
    }
    
}
