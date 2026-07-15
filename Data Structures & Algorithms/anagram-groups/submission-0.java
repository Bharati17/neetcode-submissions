class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] arr = new char[26];
            for(int i = 0; i < str.length(); i++){
                char c = str.toLowerCase().charAt(i);
                arr[c-'a']++;
            }
            String key = Arrays.toString(arr);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        list.addAll(map.values());
        return list;
    }
}
