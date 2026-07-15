class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            int l = i+1, r = nums.length -1;
            while(l < r && l>=0 && r < nums.length){
                if(nums[i]+nums[l]+nums[r] == 0){
                    List<Integer> child = new ArrayList<>();
                    child.add(nums[i]);
                    child.add(nums[l]);
                    child.add(nums[r]);
                    set.add(child);
                    l++;
                    r--;
                } else if (nums[i]+nums[l]+nums[r] < 0){
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
