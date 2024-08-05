public class BuyandSell_stocks {

    public static int BuyandSell(int[] prices){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 1; i<prices.length ; i++){
            if (buyprice < prices[i]){   //    profit
                int profit = prices[i]-buyprice;   // Today profit
                maxprofit = Math.max(maxprofit , profit);
            }
            else {
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,6,3,4};
        System.out.println(BuyandSell(prices));

    }
}
