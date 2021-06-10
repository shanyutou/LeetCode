/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }

        StringBuilder result = new StringBuilder();
        result.append("");

        Boolean noEnd = false;
        for(int i  = 0; i < strs[0].length(); i ++){
            char value = strs[0].charAt(i);
            /**
             * 遍历字符串，该字符是否符合要求
             */

            for (int j = 1; j < strs.length; j++) {
                if(i >= strs[j].length()){
                    noEnd = true;
                    break;
                }
                char pop = strs[j].charAt(i);
                if(value != pop){
                    noEnd = true;
                    break;
                }
            }
            if(!noEnd){
                result.append(value);
            }
            
        }
        return result.toString();

    }
}
// @lc code=end

