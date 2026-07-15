class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        var set:MutableSet<Int> = mutableSetOf<Int>()
        nums.forEach{
            if(set.contains(it)){
                return true;
            }
            set.add(it)
        }
        return false;
    }
}
