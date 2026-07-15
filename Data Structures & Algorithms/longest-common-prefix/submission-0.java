class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pref = strs[0];
        for(String str : strs){
            while(str.indexOf(pref) != 0){
                pref = pref.substring(0, pref.length()-1);
                if(pref == ""){
                    return "";
                }
            }
        }
        return pref;
    }
}