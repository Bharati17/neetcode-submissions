class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int start = 0, end = 0; end < s.length(); end++){
            if(map.get(s.charAt(end)) != null){
                System.out.println(map);
                start = Math.max(map.get(s.charAt(end)) + 1, start);
            }
            max = Math.max(max, end - start + 1);
            map.put(s.charAt(end), end);
        }
        return max;
    }
}
