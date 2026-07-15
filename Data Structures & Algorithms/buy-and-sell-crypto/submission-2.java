class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int least = prices[0];

        for(int i = 1; i < prices.length; i++){
            int currMax = prices[i]-least;
            least = Math.min(least, prices[i]);
            max = Math.max(currMax, max);
        }

        return max;
    }
}
