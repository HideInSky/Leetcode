// 169. Majority Element
// 10-24, 11-2
// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
class Solution {
    public int majorityElement(int[] nums) {
        return MS(nums, 0, nums.length-1);
    }

    // return the majority element between lo & hi
    int MS(int[] nums, int lo, int hi){
        if (lo == hi) return nums[lo];
        int mi = (hi-lo)/2+lo;
        int left = MS(nums, lo, mi);
        int right = MS(nums, mi+1, hi);
        if (left == right) return left;
        else{
            int leftFreq = M(nums, left, lo, hi);
            int rightFreq = M(nums, right, lo, hi);
            if (leftFreq > rightFreq) return left;
            else return right;
        }
    }

    // return the frequency of given number between lo & hi
    int M(int[] nums, int val, int lo, int hi){
        int count = 0;
        for (int i = lo; i<hi+1; i++){
            if (nums[i]==val) count++;
        }
        return count;
    }
}