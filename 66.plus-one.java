/*
 * @Author: Jiwei
 * @Date: 2021-10-18 09:33:25
 * @LastEditTime: 2021-10-18 10:48:18
 * @LastEditors: Jiwei
 * @Description: 
 * @FilePath: \LeetCode\66.plus-one.java
 * 
 */
/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start
class Solution {
  public int[] plusOne(int[] digits) {
    int iSub = 1;
    for (int i = digits.length - 1; i >= 0; i--) {
      if (iSub > 0) {
        digits[i] = digits[i] + iSub;
        iSub = 0;
      }
      if (digits[i] > 9) {
        digits[i] = 0;
        iSub = 1;
      }
      if (iSub == 0) {
        break;
      }

    }
    if (iSub == 1) {
      int[] result = new int[digits.length + 1];
      result[0] = 1;
      System.arraycopy(digits, 0, result, 1, digits.length);
      return result;
    }
    return digits;

  }
}
// @lc code=end
