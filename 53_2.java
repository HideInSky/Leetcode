// 53. Maximum Subarray
// 10-25, 10-30

// O(n), space O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        int M = nums[0];
        int max = nums[0];
        for (int i = 1; i<nums.length; i++){
            M = Math.max(nums[i], M+nums[i]);
            max = max < M ? M : max;
        }
        return max;
}
}