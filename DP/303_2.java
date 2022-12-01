// 303. Range Sum Query - Immutable

// 11.18

/*
 * Given an integer array nums, handle multiple queries of the following type:

Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
Implement the NumArray class:


NumArray(int[] nums) Initializes the object with the integer array nums.
int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).

 */

class NumArray {
    
    private int[] M;
    public NumArray(int[] nums) {
        M = new int[nums.length];
        M[0] = nums[0];
        for (int i = 1; i<nums.length; i++){
            M[i] = M[i-1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if (left == 0){
            return M[right];
        }
        else{
            return M[right] - M[left-1];
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */