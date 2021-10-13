/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 * 
 * 二分搜索法
 * 
 */

// @lc code=start
class Solution {
  public int searchInsert(int[] nums, int target) {

    if (nums[nums.length - 1] < target)
      return nums.length;
    int left = 0, right = nums.length;
    while (left < right) {
      int mid = left + (right - left)/2;
      if (nums[mid] < target) left = mid + 1;
      else {
        right = mid;
      }
    }
    return right;
  }
}
// @lc code=end
