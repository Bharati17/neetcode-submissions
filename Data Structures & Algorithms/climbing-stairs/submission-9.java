class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int prev = 1;
        int last = 2;
        int res = 0;
        for(int i = 3; i <= n; i++){
            res = prev+last;
            prev = last;
            last = res;
        }
        return res;
    }
}
