public class TestExceptions {

    public static void main(String[] args) {


        try{
            System.out.println("fibbonacchi");
            System.out.println(fib(3));

        }
        catch (Throwable e)
        {
            //e.printStackTrace();
            System.out.println("stack over flow error ");
        }

        System.out.println("hello ");
        System.out.println("fib 3 ");
        System.out.println(fib2(3));
    }

    public static int fib(int n)
    {

        /*if(n<=1)
        {
            return 1;
        }
        else
        {*/
            return fib(n-2)+fib(n-1);
        //}

    }

    public static int fib2(int n)
    {

        if(n<=1)
        {
            return 1;
        }
        else
        {
        return fib2(n-2)+fib2(n-1);
        }

    }

    public static int fib3(int n)
    {

        return n;
    }

    class Solution {
        public int smallestValue(int n) {
            if(isPrime(n)) return n; // otherwise it will run forever
            int sum = getPrimeFactorSum(n);
            if(sum == n) return n;  // otherwise it will run forever
            return smallestValue(sum);
        }

        public boolean isPrime(int n) { // to check if number is prime
            if(n == 2) return true;
            for(int i = 2; i < Math.sqrt(n) + 1; i++) {
                if(n % i == 0) return false;
            }
            return true;
        }

        public int getFirstPrimeFactor(int n) { // to get first prime number
            if(isPrime(n)) return n;
            for(int i = 2; i < n; i++) {
                if(n % i == 0) return i;
            }
            return n;
        }

        public int getPrimeFactorSum(int n) { //sum of prime factors of a number
            int sum = 0;
            int m = getFirstPrimeFactor(n);
            sum += m;
            n /= m;
            while(!isPrime(n)) {
                m = getFirstPrimeFactor(n);
                n /= m;
                sum += m;
            }
            sum += n; // it will not be included in above loop so adding here
            return sum;
        }

    }
}
