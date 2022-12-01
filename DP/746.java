// 746. Min Cost Climbing Stairs

// 10-28
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length; // top
        int[] M = new int[n+1]; // start from 0
        
        M[0] = cost[0];
        M[1] = cost[1];
        if (n == 2) return Math.min(M[0], M[1]);
        for (int i = 2; i<n; i++){
            M[i] = Math.min(M[i-1]+cost[i], M[i-2]+cost[i]);
        }
        M[n] = Math.min(M[n-1], M[n-2]);
        return M[n];
    }
}