/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
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
            if (result[1] != 0){
                break;
            }
        }
        return result;
    }
}
// @lc code=end

