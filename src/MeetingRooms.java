import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class MeetingRooms {

    public static void main(String[] args) {

        Interval[] meetings = new Interval[3];
        Interval interval1= new Interval(6,10);
        Interval interval2= new Interval(2,8);
        Interval interval3 = new Interval(7,12);

        meetings[0]=interval1;
        meetings[1]=interval2;
        meetings[2]=interval3;

        //Interval[][] meetings[] = new Interval[][]{interval1,interval2,interval3};

       // System.out.println( canAttendAllMeetings( meetings));

        System.out.println(" total number of meeting room "+numberOfMeetingRooms(meetings));


    }

    public  static boolean  canAttendAllMeetings(Interval[] meetings)
    {

        Arrays.sort(meetings,(a,b)->a.starttime-b.starttime);
        Interval prev=meetings[0];
        for(int i=1;i<meetings.length;i++)
        {
            if(meetings[i].starttime<prev.endtime)
            {
                return false;
            }
            prev=meetings[i];
            //return true;
        }

        return true;
    }


    public  static int  numberOfMeetingRooms(Interval[] meetings)
    {

        Arrays.sort(meetings,(a,b)->a.starttime-b.starttime);
        PriorityQueue<Interval>  minHeap = new PriorityQueue<>((a,b)->a.endtime-b.endtime );
        minHeap.add(meetings[0]);

       // int room=0;
        for(int i=1;i<meetings.length;i++)
        {
            Interval curr = meetings[i];
            Interval earliest=minHeap.remove();
            if(curr.starttime>=earliest.endtime){
                earliest.endtime=curr.endtime;
                //
                //room++;
                //return false;
            }
            else {
                minHeap.add(curr);
            }
            minHeap.add(earliest);
            //return true;
        }

        return minHeap.size();
    }
}

class  Interval {

    int starttime;
    int endtime;

    public Interval(int starttime,int endtime)
    {
        this.starttime=starttime;
        this.endtime=endtime;
    }

}
