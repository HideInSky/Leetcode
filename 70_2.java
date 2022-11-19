// 70. Climbing Stairs

// 11.18

// You are climbing a staircase. It takes n steps to reach the top.

// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

/*
 *       n
 *    n-1 n-2   
 * 
 * 
 */
class Solution {
    
    public int climbStairs(int n) {
        int[] M = new int[n+1];
        M[0] = 1;
        M[1] = 1;
        for (int i= 2; i<n+1; i++){
            M[i] = M[i-1] + M[i-2];
        }

        return M[n];
    }
}