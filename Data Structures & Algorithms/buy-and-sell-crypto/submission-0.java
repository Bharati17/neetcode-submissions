class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0], maxDiff = 0;
        for(int i = 1; i < prices.length; i++){
            min = Math.min(min, prices[i]);
            maxDiff = Math.max(maxDiff, prices[i] - min);
        }
        return maxDiff;
    }
}
