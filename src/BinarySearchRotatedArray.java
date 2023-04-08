public class BinarySearchRotatedArray {

    public static void main(String[] args) {

        System.out.println(solve());
    }

    public static int solve()
    {
            int[] arr = {12,14,16,18,20,22,5,8,9,10};

            int length = arr.length;
            int start =0;
            int end= arr.length-1;
           // int target=5;

            int prev=-1;
            int next =-1;
            int mid=0;

            int pivot=-1;


            while(start<=end)
            {
                mid= start+(end-start)/2;
                next= (mid+1)%length;
                prev=(mid+length-1)%length;


                if(arr[mid]<=arr[next] && arr[mid]<=arr[prev])
                {
                    pivot=mid;
                    return mid;
                }

                if(arr[0]<=arr[mid])
                {
                    start=mid+1;
                }
                else if( arr[mid]<=arr[end])
                {
                    end=mid-1;
                }

            }

            return  pivot;
    }
}
