import java.util.Arrays;

public class MinSteps {

    public static void main(String[] args)
    {

       // System.out.println(getMinStatusMemo(10000,new int[10000+1]));

        getMinStatusTab(5);
        //System.out.println(getMinStatusTab(5));
    }


    static int getMinStatusTab(int n){
        int[] table = new int[n+1];
        Arrays.fill(table,n);

        for ( int i =0; i <table.length;i++)
        {
            System.out.println(table[i]);
        }
        return table[n];
    }


    static int getMinStatusMemo(int n,int [] memo)
    {
        if(n==1){
            return 0;
        }
        if(memo[n]!=0){
            return memo[n];
        }
        int result = getMinStatusMemo(n-1,memo);
        if(n%2==0){
            result= Math.min(result,getMinStatusMemo(n/2,memo));
        }
        if(n%3==0)
        {
            result=Math.min(result,getMinStatusMemo(n/3,memo));
        }
        memo[n]= result+1;
        return memo[n];
    }

    static int getMinStatus(int n)
    {
        if(n==1){
            return 0;
        }
        int result = getMinStatus(n-1);
        if(n%2==0){
            result= Math.min(result,getMinStatus(n/2));
        }
        if(n%3==0)
        {
            result=Math.min(result,getMinStatus(n/3));
        }

        return result+1;
    }
}
