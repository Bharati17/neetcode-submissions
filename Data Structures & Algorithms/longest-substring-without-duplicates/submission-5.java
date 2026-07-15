class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int start = 0, end = 0; end < s.length(); end++){
            
            if(map.get(s.charAt(end)) != null){
                start = Math.max(map.get(s.charAt(end))+1, start);
            }
            map.put(s.charAt(end), end);
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
}
