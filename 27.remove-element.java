/*
 * @Author: your name
 * @Date: 2021-06-24 17:03:54
 * @LastEditTime: 2021-06-24 17:19:19
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \LeetCode\27.remove-element.java
 */
/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
  public int removeElement(int[] nums, int val) {
    if (nums.length == 0) {
      return 0;
    }
    int index = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[index] = nums[i];
        index++;
      }
    }
    return index;
  }
}
// @lc code=end
