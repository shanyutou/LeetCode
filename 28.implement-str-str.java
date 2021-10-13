/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Implement strStr()
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0){
          return 0;
        }
        if (haystack == null || haystack.length() < needle.length() ){
          return -1;
        }

        char[] result = haystack.toCharArray();
        char[] sub = needle.toCharArray();

        for (int i = 0; i < (result.length - sub.length); i++){
          if (result[i] == sub[0]){
            int j = 1;
            while (j < sub.length) {
              if(result[i + j] != sub[j]){
                break;
              }
              j++;
            }
            if(j >= sub.length){
              return i;
            }
          }

        }
        return -1;

    }
}
// @lc code=end

