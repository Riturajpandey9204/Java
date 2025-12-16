package DSA.GreedyAlgorithm;

public class BestTimeToBuyAndSellStock2_246 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int profit = 0;
        boolean stockPurchased = false;
        int n = prices.length;
        int buyPrice = 0;
        for (int i = 1; i < n; i++) {
            if(prices[i] > prices[i-1]){
                if(!stockPurchased){
                    buyPrice = prices[i-1];
                    stockPurchased= true;
                }
            } else if (prices[i] < prices[i-1]) {
                if(stockPurchased){
                    profit += (prices[i-1] - buyPrice);
                    stockPurchased = false;
                }
            }
        }
        if(stockPurchased){
            profit += (prices[n-1] - buyPrice);
            stockPurchased = false;
        }
        return profit;
    }
}
