class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] changeArray = new int[amount+1];
        Arrays.fill(changeArray, amount+1);
        changeArray[0] = 0;
        for(int i = 1; i <= amount; i++){
            for(int j = 0; j < coins.length; j++){
                if(i >= coins[j]){
                    changeArray[i] = Math.min(changeArray[i], 1+changeArray[i-coins[j]]);
                }
            }
        }
        if(changeArray[amount] > amount){
            return -1;
        }
        return changeArray[amount];
    }
}
