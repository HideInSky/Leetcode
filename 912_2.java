// 912. Sort an Array
// 11-6
// Given an array of integers nums, sort the array in ascending order and return it.

// You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.

class Solution {
    public int[] sortArray(int[] nums) {
        MergeSort(nums, 0, nums.length-1);
        return nums;
    }

    void MergeSort(int[] nums, int lo, int hi){
        if (lo == hi) return;
        int mi = (hi - lo)/2 + lo;
        MergeSort(nums, lo, mi);
        MergeSort(nums, mi+1, hi);
        Merge(nums, lo, mi, hi);
    }

    void Merge(int[] nums, int lo, int mi, int hi){
        int n1 = mi-lo+1;
        int n2 = hi-(mi+1)+1;
        int[] left = new int[n1];
        int[] right = new int[n2];
      

        for (int i = 0; i<n1; i++){
            left[i] = nums[lo+i];
        }
        for (int j = 0; j<n2; j++){
            right[j] = nums[mi+1+j];
        }
        int k=lo;
        int i,j;
        i = 0; j=0;
        while (i<n1 && j<n2){
            int le = left[i];
            int ri = right[j];
            if (le < ri){
                nums[k++] = le;
                i++;
            }
            else{
                nums[k++] = ri;
                j++;
            }
        }      
        while (i<n1){
            nums[k++] = left[i++];
        }
        while (j<n2){
            nums[k++] = right[j++];
        }
    }
    
 
}