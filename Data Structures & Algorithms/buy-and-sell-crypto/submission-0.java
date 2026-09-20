class Solution {
    public int maxProfit(int[] prices) {
       int min = prices[0];
       int max = 0;
       for(int i = 1; i < prices.length;i++){
           int price = prices[i] - min;
           max = Math.max(max,price);
           min = Math.min(min,prices[i]);
       }
       return max; 
    }
}
