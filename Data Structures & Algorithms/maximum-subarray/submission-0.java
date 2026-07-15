class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0], curSum = 0;
        for(int i = 0; i < nums.length; i++){
            if(curSum < 0){
                curSum = 0;
            }
            curSum = nums[i] + curSum;
            sum = Math.max(curSum, sum);
        }

        return sum;
    }
}
