class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
         for(int i = 0; i < nums.length; i++){
            int l = i+1, r = nums.length -1;
            if(i > 0 && nums[i] == nums[i-1] ){
                continue;
            }
            while(l < r && l>=0 && r < nums.length){
                if(nums[i]+nums[l]+nums[r] == 0){
                    List<Integer> child = new ArrayList<>();
                    child.add(nums[i]);
                    child.add(nums[l]);
                    child.add(nums[r]);
                    list.add(child);
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                } else if (nums[i]+nums[l]+nums[r] < 0){
                    l++;
                } else {
                    r--;
                }
            }
        }
        return list;
    }
}
