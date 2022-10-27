// 912. Sort an Array
// version of int[], int[]
// performance 66ms

class Solution {
    public int[] sortArray(int[] nums) {
        return MS(nums);
    }
    
    int[] MS(int[] nums){
        
        if (nums.length == 1) {
            return nums;
        }
        
        int hi = nums.length-1;
        int mi = hi/2;
        int[] left = new int[mi+1];
        int[] right = new int[hi-mi];
        
        for (int i = 0; i<= mi; i++){
            left[i] = nums[i];
        }
        
        for (int j = 0; j< right.length; j++){
            right[j] = nums[j+mi+1];
        }
        
        left = MS(left);
        right = MS(right);
        
        return M(left, right);
    }
    
    /* 
    given nums, get 2 parts to divide
    return s that combine left & right together
    */
    int[] M(int[] left, int[] right){
        int n1 = left.length;
        int n2 = right.length;
        int[] s = new int[n1+n2];
        
        int i=0, j=0, k=0;
        while (i<n1 && j<n2){
            if (left[i] <= right[j]){
                s[k++] = left[i++];
            }
            else{
                s[k++] = right[j++];
            }
        }
        
        while (i<n1){
            s[k++] = left[i++];
        }
        
        while (j<n2){
            s[k++] = right[j++];
        }
        
        return s;
    }
}