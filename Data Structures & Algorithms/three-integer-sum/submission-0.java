class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            int j = i+1, k = nums.length -1;
            while (j < k){
                if(nums[i]+nums[j]+nums[k] == 0){
                    set.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k])));
                    k--;
                } else if (nums[i]+nums[j]+nums[k] < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        list.addAll(set);
        return list;
    }
}
