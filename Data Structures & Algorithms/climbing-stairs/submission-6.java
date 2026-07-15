class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int prev = 1;
        int last = 1;
        int res = 0;
        for(int i = 2; i <= n; i++){
            res = prev+last;
            last = prev;
            prev = res;
        }
        return prev;
    }
}
