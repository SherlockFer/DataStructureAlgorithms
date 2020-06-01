/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ExerHashMap;
import java.util.*;
/**
 *
 * @author user
 */
public class characterRepeated {
    public static void main(String[] args){
        String str = "abcac"; 
        int longString=10;
        System.out.println(countChar(str, 'a',longString));
    }
    
    static int countChar(String str,char ch,int longString){
        
        HashMap<Character,Integer> myMap=new HashMap<>();
        
        while(str.length()<longString){
            str=str+str;
        }
        System.out.println(str.length());
        String str2=str.substring(0,10);
        char[] myChar=str2.toCharArray();
         System.out.println(str2);
        for (int i = 0; i < str2.length(); i++) {
            if(!myMap.containsKey(myChar[i])){
               myMap.put(myChar[i] ,1 );
            }else{
                int tem=myMap.get(myChar[i]);
                myMap.put(myChar[i],tem+1);
            }
        }
        System.out.println(myMap);
        return myMap.get(ch);
    }
    
}
