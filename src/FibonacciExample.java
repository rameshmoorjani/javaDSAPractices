public class FibonacciExample {
    public static void main(String[] args)
    {
        long starttime= System.currentTimeMillis();
        System.out.println(fib(50));
        System.out.println("total time taken in seconds "+(System.currentTimeMillis()-starttime)/1000);
    }

    public static Long fib(int n)
    {
        long result=0;
        if(n==1 || n==2)
        {
           result=1;
        }
        else
        {
            result=fib(n-1)+fib(n-2);
        }
        return result;
    }
}
