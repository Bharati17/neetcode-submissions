class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        int arrN[] = new int[arr.length];
        for(int i = arr.length-1; i >=0; i--){
            arrN[i] = max;
            max = Math.max(arr[i], max);
            
        }
        return arrN;
    }
}