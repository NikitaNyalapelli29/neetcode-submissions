class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price: prices){
            if(price < minPrice){
               minPrice = price;
            }
            int currProfit = price-minPrice;
            maxProfit = currProfit>maxProfit?currProfit:maxProfit;
        }
        return maxProfit;
    }
}
