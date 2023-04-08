public class BinarySearchReverseOrder {

    public static void main(String[] args) {
        int[] arr = {10,9,8,6,4,3,2,1};

        System.out.println("index is "+binarySearch(arr,8));
    }

    public static int binarySearch( int[] arr, int num)
    {
        int start=0;
        int end = arr.length-1;

        while(start<end)
        {
            int mid = start+ (end-start)/2;
            if(num<arr[mid])
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
            if(num==arr[mid])
            {
                break;
            }
        }

        return start;

    }
}
