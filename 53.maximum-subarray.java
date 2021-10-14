/*
 * @Author: Jiwei
 * @Date: 2021-10-14 09:50:40
 * @LastEditTime: 2021-10-14 14:19:12
 * @LastEditors: Jiwei
 * @Description: 
 * @FilePath: \LeetCode\53.maximum-subarray.java
 * 
 */

// @lc code=start
class Solution {
  /**
   * @description:
   * @param {int[]} nums
   * @return {*}
   */
  public int maxSubArray(int[] nums) {
    /**
     * 算法1
     */
    // int maxEndHare = 0;
    // int maxSoFar = nums[0];

    // for (int i = 0; i < nums.length; i++){

    // maxEndHare += nums[i];

    // if (maxEndHare > maxSoFar) {
    // maxSoFar = maxEndHare;
    // }

    // if (maxEndHare < 0) {
    // maxEndHare = 0;
    // }
    // }
    // return maxSoFar;

    /**
     * 算法二
     */
    return helper(nums, 0, nums.length - 1);
  }

  int helper(int[] nums, int l, int r) {
    if (l > r) {
      return Integer.MIN_VALUE;
    }

    if (l == r) {
      return nums[l];
    }

    int mid = (l + r) / 2;
    int left = helper(nums, l, mid - 1);
    int right = helper(nums, mid + 1, r);

    int t = nums[mid], max_num = nums[mid];
    // 先向左加到最大，然后接着向右加到最大，这样就得到中间的最大子数组，
    // 往左
    for (int i = mid - 1; i >= l; i--) {
      t += nums[i];
      max_num = Math.max(max_num, t);
    }
    t = max_num;
    // 往右
    for (int i = mid + 1; i <= r; i++) {
      t += nums[i];
      max_num = Math.max(max_num, t);
    }
    return Math.max(Math.max(left, right), max_num);

  }
}
// @lc code=end
