class Solution {
    public int rob(int[] nums) {
        if(nums.length ==1){
            return nums[0];
        }
        int res1 = 0;
        int rob1 = 0;
        int rob2 = 0;
        int res2 = 0;

        for(int i = 0; i < nums.length -1; i++){
            res1 = Math.max(rob1+nums[i], rob2);
            rob1 = rob2;
            rob2 = res1;
        }

        rob1=0;
        rob2=0;

        for(int i = 1; i < nums.length; i++){
            res2 = Math.max(rob1+nums[i], rob2);
            rob1 = rob2;
            rob2 = res2;
        }

        return Math.max(res1, res2);
    }
}
