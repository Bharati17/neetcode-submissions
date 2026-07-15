class Solution {
    public int rob(int[] nums) {
        int prev2 = 0;
        int prev1 = 0;
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            res = Math.max(prev2 +nums[i], prev1);
            prev2 = prev1;
            prev1 = res;
        }
        return res;
    }
}
