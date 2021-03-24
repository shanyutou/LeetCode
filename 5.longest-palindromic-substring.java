import java.security.DrbgParameters.Reseed;

import javax.naming.spi.DirStateFactory.Result;

/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {

        /**
         * 1、转化为char
         * 2、查找字符串
         */

        char[] sChar = s.toCharArray();


        return middle(sChar);

        
    }

    public static String middle(char[] array) {


        int maxLength = 0;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            int length = maxLengthMiddle(array, i);
            int length2 = maxLengthMiddle2(array, i);
            if(length > maxLength){
                index = i;
                maxLength = length;
            }

            if(length2 > maxLength){
                index = i;
                maxLength = length2;
            }

        }

        String reuslt;
        if(maxLength %2 != 0) {
            reuslt =String.valueOf(array, index - (maxLength - 1)/2, maxLength);
        }else{
            reuslt =String.valueOf(array, index - maxLength/2, maxLength);
        }
        return reuslt;
        
    }

    public static int maxLengthMiddle(char[] array, int index){
        int length = 1;
        int j = 1;

        /**
         * 查找最长长度
         */

         while((index - j) >= 0 && (index + j) < array.length && array[index - j] == array[index + j]) {
             length += 2;
             j++;
         }

         return length;

    }

    public static int maxLengthMiddle2(char[] array, int index){
        int length = 0;
        int j = 1;

        /**
         * 查找最长长度
         */

         while((index - j) >= 0 && (index + j - 1) < array.length && array[index - j] == array[index + j -1]) {
             length += 2;
             j++;
         }

         return length;

    }

}
// @lc code=end

