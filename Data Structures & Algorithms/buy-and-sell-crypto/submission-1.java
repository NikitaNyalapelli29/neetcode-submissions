class Solution {
    public int maxProfit(int[] prices) {
        
        int maxProfit = 0;
        int n = prices.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                int currProfit = prices[j] - prices[i];
                maxProfit = currProfit > maxProfit ? currProfit : maxProfit;
            }
        }
        return maxProfit;
    }
}
