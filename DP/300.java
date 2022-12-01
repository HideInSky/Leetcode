import java.util.Arrays;

// 300. Longest Increasing Subsequence

// 10-30
class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] M = new int[nums.length];
        Arrays.fill(M, 1);
        int max = 1;
        for (int j = 1; j<M.length; j++){
            for (int i = 0; i<j; i++){
                if(nums[j] > nums[i])
                    M[j] = Math.max(M[i]+1, M[j]);
            }
            if (M[j] > max) max = M[j];
        }
        return max;
    }
}