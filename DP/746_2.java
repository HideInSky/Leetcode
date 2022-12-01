// 746. Min Cost Climbing Stairs

// 11-1

// You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.

// You can either start from the step with index 0, or the step with index 1.

// Return the minimum cost to reach the top of the floor.

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] M = new int[cost.length+1];
        M[0] = cost[0];
        M[1] = cost[1];
        for (int i = 2; i<cost.length; i++){
            M[i] = Math.min(M[i-1]+cost[i], M[i-2]+cost[i]);
        }
        return Math.min(M[cost.length-1], M[cost.length-2]);
    }
}