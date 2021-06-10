/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i ++){
            int first = nums[i];
            for(int j = i + 1; j < nums.length; j ++){
                int second = nums[j];
                if (first + second == target){
                    result[0] = i;
                    result[1] = j;
                    break;
                }

            }
        }
        return result;

    }
}
// @lc code=end

