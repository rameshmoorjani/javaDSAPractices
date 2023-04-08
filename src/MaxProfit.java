public class MaxProfit {

    public static void  main(String[] args)
    {
        int[] prices= {2,5,6,9,6,23};
        System.out.println(maxProfit(prices));
    }

    static int maxProfit(int[] prices)
    {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<minPrice)
            {
                minPrice=prices[i];
            }
            else if(prices[i]-minPrice>maxProfit)
            {
                maxProfit=prices[i]-minPrice;
            }
        }
        return maxProfit;
    }
}
