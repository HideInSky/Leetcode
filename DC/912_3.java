// 912. Sort an Array

// 11.19

/*
Given an array of integers nums, sort the array in ascending order and return it.

You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.
 */

class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }
    
    public void mergeSort(int[] nums, int lo, int hi){
        if (lo == hi) return;
        int mi = (hi-lo)/2 + lo;
        
        mergeSort(nums, lo, mi);
        mergeSort(nums, mi+1, hi);
        
        merge(nums, lo, mi, hi);
    }
    
    public void merge(int[] nums, int lo, int mi, int hi){
        int i, j, k;
        int n1 = mi-lo+1;
        int n2 = hi-(mi+1)+1;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (i = 0; i<left.length; i++){
            left[i] = nums[lo+i];
        }
        for (j = 0; j<right.length; j++){
            right[j] = nums[mi+1+j];
        }
        
        i = 0; j = 0; k = lo;
        // imagion 3 arrays
        // left [ |  |  |]   right [ |  |  |]
        //    nums    [ |  |  |  |  |  |]
        while (i < n1 && j < n2){
            if (left[i] < right[j]){
                nums[k++] = left[i++];
            }
            else{
                nums[k++] = right[j++];
            }
        }
        while (i < n1){
            nums[k++] = left[i++];
        }
        while (j < n2){
            nums[k++] = right[j++];        
        }
    }
}