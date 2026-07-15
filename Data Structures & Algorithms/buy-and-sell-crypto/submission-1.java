class Solution {
    public int maxProfit(int[] prices) {
         int min = prices[0], max = 0;
         for(int price : prices) {
            min = Math.min(price, min);
            max = Math.max(max, price - min);
         }
         return max;
    }
}
