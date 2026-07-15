class Solution {
    public int maxProduct(int[] nums) {
        int maxProd = nums[0];

        int min = nums[0], max = nums[0];
        for(int i = 1; i < nums.length; i++){
            int tempMax = Math.max(nums[i], Math.max(nums[i]*max, nums[i]*min));
            min = Math.min(nums[i], Math.min(nums[i]*min, nums[i]*max ));
            max = tempMax;
            maxProd= Math.max(maxProd, max);
        }

        return maxProd;
    }
}
