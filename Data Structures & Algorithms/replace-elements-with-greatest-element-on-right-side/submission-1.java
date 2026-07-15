class Solution {
    public int[] replaceElements(int[] arr) {
        int right = -1;
        int res[] = new int[arr.length];
        for(int i = arr.length-1; i >= 0; i--){
            res[i]=right;
            right = Math.max(right, arr[i]);
        }
        return res;
    }
}