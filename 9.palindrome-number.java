/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {

        /**
         * 负值和结尾为0的不是
         *
         */
        if(x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }

        int origin = x;
        int result = 0;
        /**
         * 优化，只计算一半
         */
        while(origin > result){
            int pop = origin % 10;
            result  = result * 10 + pop;
            origin = origin / 10;
        }
        /**
         * 第一个判断的length是偶数的
         * 第二个判断的是length是奇数的，x = 12321  origin = 12  result = 123
         */
        return origin == result || origin == result / 10;
    }
}
// @lc code=end

