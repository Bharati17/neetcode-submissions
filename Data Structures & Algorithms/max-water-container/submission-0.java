class Solution {
    public int maxArea(int[] heights) {
        int amount = 0;
        int l = 0, r = heights.length -1;
        while (l < r){
            int capacity = Math.min(heights[l], heights[r]) * (r - l);
            amount = Math.max(amount, capacity);
            if(heights[l] <= heights[r]){
                l++;
            } else {
                r--;
            }
        }
        return amount;
    }
}
