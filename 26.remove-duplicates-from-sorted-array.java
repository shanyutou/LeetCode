/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
  public int removeDuplicates(int[] nums) {

    if (nums.length == 0) {
      return 0;
    }

    int number = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != nums[number]) {
        number++;
        nums[number] = nums[i];
      }
    }
    number++;
    return number;
  }
}
// @lc code=end
