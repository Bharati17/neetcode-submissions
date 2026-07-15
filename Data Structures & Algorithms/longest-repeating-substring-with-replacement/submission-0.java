class Solution {
    public int characterReplacement(String s, int k) {
        int maxLength = 0;
        int l = 0, maxF = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) +1);
            maxF = Math.max(maxF, map.get(s.charAt(i)));

            while((i - l + 1) - maxF > k){
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;
            }
            maxLength = Math.max(maxLength, i - l + 1);
        }
        return maxLength;        
    }
}
