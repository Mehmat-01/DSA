class Solution {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
        int max_profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }else
                max_profit=Math.max(prices[i]-buy,max_profit);
        }
        return max_profit;
    }
}