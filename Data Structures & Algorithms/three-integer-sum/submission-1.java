class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            int l = i+1, r = nums.length -1;
            while(l < r){
                if(nums[i] + nums[l] + nums[r] == 0){
                    set.add(new ArrayList<>(Arrays.asList(nums[i], nums[l], nums[r])));
                    l++;
                } else if (nums[i] + nums[l] + nums[r] < 0){
                    l++;
                } else {
                    r--;
                }
            }
        }
        list.addAll(set);
        return list;
    }
}
