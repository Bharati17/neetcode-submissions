class Solution {
    fun isPalindrome(s: String): Boolean {
        var left = 0
        var right = s.length-1
        while(left < right){
            while(left<right && !s[left].isLetterOrDigit()){
                left++
            }
            while(right>left && !s[right].isLetterOrDigit()){
                right--
            }
            if(s[left].lowercase()!=s[right].lowercase()){
                return false;
            }
            right--
            left++
        }
        return true;
    }
}
