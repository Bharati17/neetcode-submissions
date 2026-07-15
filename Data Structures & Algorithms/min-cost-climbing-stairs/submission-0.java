class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] steps = new int[cost.length+1];
        for(int i = 2; i <= cost.length; i++){
            steps[i] = Math.min(steps[i-1]+cost[i-1], steps[i-2]+cost[i-2]);
        }
        return steps[cost.length];
    }
}
