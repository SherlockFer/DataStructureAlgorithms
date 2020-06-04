/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class countingValleys {
    
    
    
    static int countingValley(int n, String s) {
    int level = 0; // 0 is sea-level
    int valleys = 0;

    for (char c : s.toCharArray())
    {
        if (c == 'U') {
            level++;
            if (level == 0)
            {
                valleys++;
            }
        }
        else {
            level--;
        }
    }
    return valleys;
    }
}
