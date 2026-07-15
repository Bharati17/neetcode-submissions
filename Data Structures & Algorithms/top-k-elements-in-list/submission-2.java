class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k == nums.length){
            return nums;
        }
        int[] res = new int[k];

        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
System.out.println(map);
        List<Integer>[] list = new List[nums.length+1];
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(list[entry.getValue()] == null)
                list[entry.getValue()] = new ArrayList<>();
            list[entry.getValue()].add(entry.getKey());
        }

        int index= 0;
        for(int i = list.length-1; i > 0; i--){
            if(list[i] != null){
                for(int n : list[i]){
                res[index++] = n;
                if(index == k){
                    return res;
                }
            }
            }
        }
        return res;
    }
}
