import java.util.Arrays;
import java.util.Collections;

public class MaximumMinized {

    public static void main(String[] args) {

        int[] A = {-3,-2,-5,-1,5,6,7,9};
        int N =8;
        int[] B = new int[N/2];

        System.out.println(""+solve(A,N,B));
    }

    static int solve(int[] A, int N, int[] B)
    {
        Arrays.sort(A);
        int cnt=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]<0) cnt++;
        }

        if(2*cnt==N) {

            for(int i=0,j=N/2-1;i<j;i++,j--)
            {
                int temp=A[i];
                A[i]=A[j];
                A[j]=temp;
            }
        }
            int max = Integer.MIN_VALUE;
            for(int i =0;i<N/2;i++)
            {
                max = Math.max(max,A[i]*A[N-i-1] );
            }

            return max;

    }
}
