import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MedianOfStockStream {
    private Queue<Integer> minHeap, maxHeap;

    public static void main(String[] args) {
        MedianOfStockStream medianOfStockStream = new MedianOfStockStream();
        int array[] = {1,3,5};
        for(int i=0;i<array.length;i++)
        {
            medianOfStockStream.add(array[i]);
        }
        System.out.println("median isss "+medianOfStockStream.getMedian());
    }


public  MedianOfStockStream(){

    minHeap= new PriorityQueue<>();
    maxHeap= new PriorityQueue<>(Comparator.reverseOrder());

}

public void add(int num)
{
    if(minHeap.size()==maxHeap.size())
    {
        maxHeap.offer(num);
        minHeap.offer(maxHeap.poll());
    }
    else {
        minHeap.offer(num);
        maxHeap.offer(minHeap.poll());
    }
}

public double getMedian()
{
    double median;
    if(minHeap.size()>maxHeap.size()){
        median=minHeap.peek();
    }else{
        median=(minHeap.peek()+ maxHeap.peek())/2d;
    }
    return median;
}
/*void add(int num) {
    if (!minHeap.isEmpty() && num < minHeap.peek()) {
        maxHeap.offer(num);
        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.offer(maxHeap.poll());
        }
    } else {
        minHeap.offer(num);
        if (minHeap.size() > maxHeap.size() + 1) {
            maxHeap.offer(minHeap.poll());
        }
    }
}

    double getMedian() {
        int median;
        if (minHeap.size() < maxHeap.size()) {
            median = maxHeap.peek();
        } else if (minHeap.size() > maxHeap.size()) {
            median = minHeap.peek();
        } else {
            median = (minHeap.peek() + maxHeap.peek()) / 2;
        }
        return median;
    }*/
}
