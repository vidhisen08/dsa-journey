public class SellStock {
    public int maxProfit(int[] prices) {
        int minprice = prices[0];
        int currentprofit,maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            }

            currentprofit = prices[i] - minprice;
            maxprofit = Math.max(maxprofit, currentprofit);
        }
        return maxprofit;
    }
}
