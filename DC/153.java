//153. Find Minimum in Rotated Sorted Array

// 11-6

// Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

// [4,5,6,7,0,1,2] if it was rotated 4 times.
// [0,1,2,4,5,6,7] if it was rotated 7 times.
// Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

// Given the sorted rotated array nums of unique elements, return the minimum element of this array.

// You must write an algorithm that runs in O(log n) time.

class Solution {
    public int findMin(int[] nums) {
        return min(nums, 0, nums.length-1);
    }

    int min(int[] nums, int lo, int hi){
        if (lo == hi) return nums[lo];
        if (nums[lo] < nums[hi]) return nums[lo];
        else{
            int mi = (hi - lo)/2 + lo;
            int min_left = min(nums, lo, mi);
            int min_right = min(nums, mi+1, hi);
            return min_left > min_right ? min_right : min_left;
        }
    }

    
}