class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int res = nums[0];
        int min = res, max = res;

        for(int i=1; i < nums.length; i++ ){
            int curr = nums[i];
            int tempMax = Math.max(curr, Math.max(max*curr, min*curr));
            min = Math.min(curr, Math.min(max*curr, min*curr));
            max = tempMax;
            res = Math.max(res, max);
        }

        return res;
    }
}
