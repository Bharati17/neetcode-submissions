class Solution {
    // Time Complexity O(n)
    // Space Complexity O(n)
    fun getConcatenation(nums: IntArray): IntArray {
        var arr = IntArray(2*nums.size)
        for(i in nums.indices){
            arr[i]=nums[i]
            arr[i+nums.size]=nums[i]
        }
        return arr
    }
}
