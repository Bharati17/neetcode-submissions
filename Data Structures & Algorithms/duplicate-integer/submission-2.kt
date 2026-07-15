class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        var set:MutableSet<Int> = mutableSetOf<Int>()
        for(num in nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }
}
