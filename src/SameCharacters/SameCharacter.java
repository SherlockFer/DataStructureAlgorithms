/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SameCharacters;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class SameCharacter {

    public static void main(String[] args) {
        String s1="mihaela";
        String s2="ealamih";
        System.out.println(sameChars(s1,s2));
    }

    private static boolean sameChars(String firstStr, String secondStr) {
        char[] first = firstStr.toCharArray();
        char[] second = secondStr.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first, second);
    }
}
