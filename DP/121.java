// 121. Best Time to Buy and Sell Stock
// 10-28, 10-29
class Solution {
    public int maxProfit(int[] prices) {
        int[] prf = new int[prices.length];
        int min=prices[0];
        
        prf[0] = 0; // keep track of max all the time
        if (prices.length == 1) return prf[0];
        
        for (int j = 1; j<prices.length; j++){
            min = Math.min(min, prices[j]);
            prf[j] = Math.max(prf[j-1], prices[j]-min);
        }
        return prf[prices.length-1];
    }
}