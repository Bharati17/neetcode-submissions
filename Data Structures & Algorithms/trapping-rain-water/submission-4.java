class Solution {
    public int trap(int[] height) {
        int maxArea = 0;
        int leftMax = 0, rightMax = 0;
        int l = 0, r = height.length -1;
        while(l < r){
            if(height[l] < height[r]){
                leftMax = Math.max(leftMax, height[l]);
                maxArea = maxArea  + (leftMax - height[l]);
                l++;
            } else {
                rightMax = Math.max(rightMax, height[r]);
                maxArea = maxArea + rightMax - height[r];
                r--;
            }
        }

        return maxArea;
    }
}