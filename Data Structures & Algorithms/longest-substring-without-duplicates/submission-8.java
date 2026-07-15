class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int start = 0, end = 0; end < s.length(); end++){
            if(map.containsKey(s.charAt(end))){
                start = Math.max(map.get(s.charAt(end))+1, start);
            }
            maxLen = Math.max(maxLen, end - start+1);
            map.put(s.charAt(end), end);
            
        }

        return maxLen;
    }
}
