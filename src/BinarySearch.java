public class BinarySearch {

    private static int[] list = new int [] {2,3,5,6};

    public static void main(String[] args) {

        if(binarySearch(list,4))
        {
            System.out.println("found 5");
        }
        /*if(!binarySearch(list,13))
        {
            System.out.println("not found 13");
        }*/

    }

    public static boolean binarySearch(int[] arr, int target)
    {
        int first =0;
        int last= arr.length-1;
        int middle= (first+last)/2;
        while (first<=last)
        {
            if(arr[middle]<target)
            {
                first=middle+1;
            }
            else if( arr[middle]==target)
            {
                return true;
            }
            else
            {
                last =middle-1;
            }

            middle=(first+last)/2;

        }
        return  false;
    }
}
