class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] check = new int[26];
        for(int i = 0; i < s.length(); i++){
            check[s.charAt(i) - 'a']++;
            check[t.charAt(i) - 'a']--;
        }
        for(int num : check){
            if(num != 0){
                return false;
            }
        }
        return true;
    }
}
