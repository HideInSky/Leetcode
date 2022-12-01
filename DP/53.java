// 53. Maximum Subarray
// 10-25, 10-30

// O(n), space O(n)
class Solution {
    public int maxSubArray(int[] nums) {
        int[] M = new int[nums.length];
        M[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i<M.length; i++){
            M[i] = Math.max(nums[i], M[i-1]+nums[i]);
            max = max < M[i] ? M[i] : max;
        }
        return max;
}
}