class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        res.get(0).add(1);
        for(int i = 1; i < numRows; i++){
            List<Integer> sub = new ArrayList<>();
            sub.add(1);
            List<Integer> prev = res.get(i-1);
            for(int j = 1; j < prev.size(); j++){
                sub.add(prev.get(j-1)+prev.get(j));
            }
            sub.add(1);
            res.add(sub);
        }
        return res;
    }
}