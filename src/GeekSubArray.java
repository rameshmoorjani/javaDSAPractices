import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeekSubArray {


    public static void main(String[] args) {
        Integer[] arr = {1,3,2,5,7};
        List<Integer> al=  Arrays.asList(arr);
        ArrayList<Integer> arrayList = new ArrayList<>(al);
        reverseInGroups(arrayList,5,3);
        System.out.println("final list "+arrayList);
    }



//User function Template for Java

        //Function to reverse every sub-array group of size k.
        public static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
            for(int i=0;i<arr.size();i=i+k) {
                int start=i;
                int min=Math.min(i+k-1,arr.size()-1);
                while(start<=min) {
                    int firstIndexEle=arr.get(start);
                    int lastIndexEle=arr.get(min);;
                    arr.set(start,lastIndexEle);

                    arr.set(min,firstIndexEle);
                    start++;
                    min--;
                }

            }
        }
}
