import java.util.Collections;
import java.util.PriorityQueue;

public class KTHSmallestHeap {

    //reference https://www.youtube.com/watch?v=3DdP6Ef8YZM&list=PL_z_8CaSLPWdtY9W22VjnPxG30CXNZpI9&index=3
    public static void main(String[] args) {
        int[] array = { 3, 5, 2, 7,8};
        System.out.println("kth smallest element "+smallest(array,2));
    }

    public static  int smallest(int[] array, int k )
    {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();

        for (int i = 0; i < array.length; ++i) {

            // Insert elements into
            // the priority queue
            maxHeap.add(array[i]);

            // If size of the priority
            // queue exceeds k
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        // Print the k largest element
        /*while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.peek() + " ");
            maxHeap.poll();
        }*/

        System.out.println(maxHeap.peek());
        return maxHeap.peek();
    }

}
