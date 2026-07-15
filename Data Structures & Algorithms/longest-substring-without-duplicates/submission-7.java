class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int start = 0, end = 0; end < s.length(); end++ ){
            if(map.containsKey(s.charAt(end))){
                start = Math.max(map.get(s.charAt(end))+1, start);
            }
            map.put(s.charAt(end), end);
            longest = Math.max(longest, map.get(s.charAt(end)) - start +1);

        }

        return longest;
    }
}
