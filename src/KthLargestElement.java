import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElement {

    public static void main(String[] args) {

        solve();
    }

    public static void solve()
    {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        /*maxHeap.add(5);
        maxHeap.add(3);
        maxHeap.add(7);
        maxHeap.add(9);
        maxHeap.add(2);
        maxHeap.add(1);*/

    //    System.out.println("top element is "+maxHeap.peek());


        int[] arr = {5,3,7,9,2,10};

        for(int i=0; i< arr.length;i++)
        {

            maxHeap.add(arr[i]);

            if(maxHeap.size()>3)
            {
                maxHeap.remove();
            }

        }

        System.out.println("3rd element is "+maxHeap.peek());

    }
}
