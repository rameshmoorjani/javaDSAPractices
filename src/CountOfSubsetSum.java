public class CountOfSubsetSum {

    public static void main(String[] args) {

        int[] array = {1,4,5};
        int sum =5;
        int n=array.length;
        System.out.println(findCountOfSubSetSum(array, sum,n,0));
    }

    private static int findCountOfSubSetSum(int[] arry,int sum,int n,int count)
    {
        if(n==0)
        {
            if(sum==0) {
                count++;
            }
            return count;
        }
        count=findCountOfSubSetSum(arry,sum-arry[n-1],n-1,count)+findCountOfSubSetSum(arry,sum,n-1,count);
        //count=findCountOfSubSetSum(arry,sum,n-1,count);
        return count;
    }

}
