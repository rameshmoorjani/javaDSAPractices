public class FibonacciMemoizationhExample {
    public static void main(String[] args)
    {
        long starttime= System.currentTimeMillis();
        Long[] memo = new Long[101];
        System.out.println(fib(100,memo));
        System.out.println("total time taken in seconds "+(System.currentTimeMillis()-starttime)/1000);
    }

    public static Long fib(int n,Long[] memo)
    {
        long result=0;
        if(memo[n]!=null && memo[n]!=0)
        {
            return memo[n];
        }

        if(n==1 || n==2)
        {
           memo[n]=1l;
           result=1l;
        }
        else
        {
            memo[n]=fib(n-1,memo)+fib(n-2,memo);
            result=memo[n];
        }
        return result;
    }
}
