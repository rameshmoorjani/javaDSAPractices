import java.util.Arrays;
import java.util.PriorityQueue;

public class MinimumMeetingRoom {

    public static void main(String[] args) {
        Intervals intervals1 = new Intervals(0,30);
        Intervals intervals2 = new Intervals(40,50);
        Intervals intervals3 = new Intervals(50,60);
        Intervals[] intervallist = new Intervals[3];
        intervallist[0]=intervals1;
        intervallist[1]=intervals2;
        intervallist[2]=intervals3;
        System.out.println(minimumMeetingRoom(intervallist));

    }

    static int minimumMeetingRoom(Intervals[] intervals)
    {
        StringBuilder s=new StringBuilder();
        s=s.append("Ramesh");
        Arrays.sort(intervals,(a,b) -> a.starttime-b.starttime);
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        minHeap.add(intervals[0].endtime);
        for(int i=1;i<intervals.length;i++)
        {
            Intervals current =intervals[i];
            Integer earliest = minHeap.remove();
            if(current.starttime>=earliest)
            {
                //earliest.endtime= current.endtime;
            }
            else {
                minHeap.add(current.endtime);
            }
            minHeap.add(earliest);
        }
        return minHeap.size();
    }
    
    
}

class Intervals {
    int starttime;
    int endtime;


    public Intervals(int starttime,int endtime)
    {
        this.starttime=starttime;
        this.endtime=endtime;
    }



}
