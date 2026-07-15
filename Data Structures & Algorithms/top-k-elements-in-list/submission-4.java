class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        List<Integer>[] listArray = new List[nums.length+1];
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(listArray[entry.getValue()] == null){
                listArray[entry.getValue()] = new ArrayList<>();
            }
            listArray[entry.getValue()].add(entry.getKey());
        }

int count = 0;
        for(int i = listArray.length -1; i >= 0; i--){
            if(listArray[i] != null){
                for(int num : listArray[i]){
                    res[count++] = num;
                    if(count == k){
                    return res;
                }
                }
            }
        }
        return res;
    }
}
