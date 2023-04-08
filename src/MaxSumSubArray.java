public class MaxSumSubArray {


    public static void main(String[] args) {

        char c ='4';

        System.out.println("char value is "+(c-'0'));

        int[] arr = {3,-2,4,3};
        System.out.println("max subArray is "+maxSubArray(arr,4));
    }

    public static int maxSubArray(int[] arr, int n)
    {
        int currMax=0;
        int max=0;
        //currMax=arr[0];
        max=arr[0];
        for(int i =0; i<n;i++)
        {
            currMax+=arr[i];
            if(currMax<0) arr[i]=0;
            max = Math.max(max,currMax);
        }
        return max;
    }




























    /*public static void main(String[] args)
    {
        int[] arry =new int[]{1,2,3,4};
        System.out.println("max subArray is "+findMaxSubArray(arry,2));

    }

    public static int findMaxSubArray(int[] array,int size)
    {
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int j=0;j<array.length;j++)
        {
            currentSum+=array[j];
            if(j>=size-1)
            {
                maxSum=Math.max(maxSum,currentSum);
                currentSum-=array[j-(size-1)];
            }

        }
        return maxSum;
    }*/



}
