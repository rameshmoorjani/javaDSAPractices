import java.util.HashMap;
import java.util.Map;

public class KTHSmallest {

    public static void main(String[] args) {

        int N =4;
        int k =4;
        int[] A = {1,3,4,5}; //  0,2,6,7,8
        // 3rd smallest number  is 6
        System.out.println(""+solve(N,k,A));
    }

    static  int solve(int N, int K, int[] A)
    {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i =0;i<A.length;i++)
        {
            map.put(A[i],i);
        }

        for(int i =0;;i++)
        {
            if(!map.containsKey(i))K--;

            if(K==0) return i;
        }


    }
}
