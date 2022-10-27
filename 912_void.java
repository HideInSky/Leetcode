// 912. Sort an Array
// version of int[], int[]
// performance 55ms

class Solution {
    public int[] sortArray(int[] nums) {
        MS(nums, 0, nums.length-1);
        return nums;
    }
    
    void MS(int[] nums, int lo, int hi){
        if (lo == hi) return;
        int mi = (hi-lo)/2 + lo;
        MS(nums, lo, mi);
        MS(nums, mi+1, hi);
        M(nums, lo, mi, hi);
    }
    
    /* 
    given nums, get 2 parts to divide
    return s that combine left & right together
    */
    void M(int[] nums, int lo, int mi, int hi){
        int n1=mi-lo+1;
        int n2=hi-(mi+1)+1;
        
        int[] left = new int[n1];
        int[] right = new int[n2];
        
        for (int i = 0; i<n1; i++){
            left[i] = nums[lo+i];
        }
        for (int j = 0; j<n2; j++){
            right[j] = nums[mi+1+j];
        }
        
        int i = 0, j = 0;
        int k = lo;
        while (i < n1 && j < n2){
            if (left[i]>right[j]){
                // pick right
                nums[k] = right[j];
                j++;
                k++;
            }
            else{
                nums[k] = left[i];
                i++;
                k++;
            }
        }
        while (i < n1){
            nums[k] = left[i];
            i++;
            k++;
        }
        while (j < n2){
            nums[k] = right[j];
            j++;
            k++;
        }
     
    }
}