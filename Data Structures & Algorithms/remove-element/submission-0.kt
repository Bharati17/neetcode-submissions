class Solution {
    // Time complexity O(n)
    // Space Complexity O(1)
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var index = 0;
        var result = 0;
        for(i in nums.indices ){
            if(nums[i]!=`val`){
                nums[index++]=nums[i];
                result++;
            }
        }
        return result;
    }
}
