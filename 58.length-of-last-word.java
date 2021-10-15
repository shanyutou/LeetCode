/*
 * @Author: Jiwei
 * @Date: 2021-10-15 09:07:08
 * @LastEditTime: 2021-10-15 09:58:47
 * @LastEditors: Jiwei
 * @Description: 
 * @FilePath: \LeetCode\58.length-of-last-word.java
 * 
 */
/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
  public int lengthOfLastWord(String s) {
    // String[] subStrings = s.split(" ");
    // return subStrings[subStrings.length - 1].length();

    int maxLength = 0;

    for (int i = s.length() - 1; i >= 0; i--) {
      char c = s.charAt(i);
      if (c == ' ' && maxLength != 0) {
        break;
      } else if (c != ' ') {
        maxLength++;
      } else {

      }
    }
    return maxLength;

  }
}
// @lc code=end
