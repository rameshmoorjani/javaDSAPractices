package designpattern;

class Main
{
    // Function to find the best way to cut a rod of length `n`
    // where the rod of length `i` has a cost `price[i-1]`
    public static int rodCutRecursive(int[] price, int n)
    {
        if (n == 0) {
            return 0;
        }
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            maxProfit = Math.max(maxProfit, price[i - 1] + rodCutRecursive(price, n - i));
        }
        return maxProfit;
    }

    public static int rodCut2D(int[] price, int n)
    {
        if (n == 0) {
            return 0;
        }
        int maxProfit = Integer.MIN_VALUE;
        int[] lengthArray = new int[n];
        for(int i=0;i<lengthArray.length;i++)
        {
            lengthArray[i]=i;
        }

        int[][] t = new int[price.length+1][n+1];

        for (int i = 0; i <=price.length; i++) {
                for (int j = 0; j <= n; j++) {
                    if(i==0 || j==0) {
                        t[i][j] = 0;
                    }
                }
            }

          int W = lengthArray.length;
            //maxProfit = Math.max(maxProfit, price[i - 1] + rodCut(price, n - i));


        for (int i = 0; i <= price.length; i++) {
            for(int j=1;j<=n;j++) {
                if(j>=i) {
                    t[i][j] = Math.max(price[i] + t[i][j -1], t[i-1][j]);
                }
                else
                {
                    t[i][j]=t[i-1][j];
                }
            }

           // max_val = Math.max(max_val,                    price[j] + val[i-j-1]);

            //maxProfit = Math.max(maxProfit, price[i - 1] + rodCut(price, n - i));
        }


        return t[price.length][lengthArray.length];


    }

    public static int rodCut(int[] price, int n)
    {
        if (n == 0) {
            return 0;
        }
        int maxProfit = Integer.MIN_VALUE;
        int[] lengthArray = new int[n];
        for(int i=0;i<lengthArray.length;i++)
        {
            lengthArray[i]=i;
        }

        int[][] t = new int[price.length+1][n+1];

        for (int i = 0; i <price.length+1; i++) {
                for (int j = 0; j < lengthArray.length+1; j++) {
                    if(i==0 || j==0) {
                        t[i][j] = 0;
                    }
                }
            }

          int W = lengthArray.length;
            //maxProfit = Math.max(maxProfit, price[i - 1] + rodCut(price, n - i));


        for (int i = 1; i <= n; i++) {
            for(int j=1;j<i;j++)

               t[i][j]=Math.max(price[j]+t[i][i-j],t[i-1][j]);

           // max_val = Math.max(max_val,                    price[j] + val[i-j-1]);

            //maxProfit = Math.max(maxProfit, price[i - 1] + rodCut(price, n - i));
        }

        /*int cutRod(int price[], int n) {
        int dp[n+1]={0};
        for(int i=1;i<=n;i++)
        {
            dp[i]=price[i-1];
            for(int j=1;j<=i/2;j++)
                dp[i]=max({ dp[i], price[j-1] + price[i-j-1], dp[j] + dp[i-j] });

        }
        return dp[n];
        return t[price.length][lengthArray.length];*/

        int val[] = new int[n+1];
        val[0] = 0;

        // Build the table val[] in bottom up manner and return
        // the last entry from the table
        for (int i = 1; i<=n; i++)
        {
            int max_val = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++)
                max_val = Math.max(max_val,
                        price[j] + val[i-j-1]);
            val[i] = max_val;
        }

        return val[n];
    }


 
    public static void main(String[] args)
    {
        int price[] = { 2, 5, 6,7 };
 
        // rod length
        int n = 4;
 
        System.out.println("Profit recursive way is " + rodCutRecursive(price, n));

        //System.out.println("Profit nonrecursive way is 2D " + rodCut2D(price, n));

        System.out.println("Profit nonrecursive way is " + rodCut(price, n));
    }
}