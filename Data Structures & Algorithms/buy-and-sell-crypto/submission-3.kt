class Solution {
    fun maxProfit(prices: IntArray): Int {
        var res = 0
        var minPrice = Int.MAX_VALUE
        for(price in prices){
            minPrice = minOf(price, minPrice)
            res = maxOf(price-minPrice, res)
        }
        return res
    }
}
