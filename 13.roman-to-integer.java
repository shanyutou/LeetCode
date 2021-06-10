/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        
        int result = 0;

        char oldPop = 0;
        for(int i = 0; i < s.length(); i ++){
            
            char pop = s.charAt(i);
            int intPop = charToInt(pop);
            if (oldPop == 'I'&& (pop == 'V' || pop == 'X')){
                intPop = intPop - charToInt(oldPop) * 2;
                
            }
            if (oldPop == 'X'&& (pop == 'L' || pop == 'C')){
                intPop = intPop - charToInt(oldPop) * 2;
            }
            if (oldPop == 'C'&& (pop == 'D' || pop == 'M')){
                intPop = intPop - charToInt(oldPop) * 2;
            }

            result += intPop;
            oldPop = pop;
        }

        return result;


    }


    public int charToInt(char ch) {

        switch(ch){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;

        }
    }

}
// @lc code=end

