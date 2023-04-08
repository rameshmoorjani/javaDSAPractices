import java.util.Arrays;

public class SolutionPairWithGivenDifference {
    public int solve(int[] A, int B) {
        Arrays.sort(A);

        int i = 0;
        int j = 1;
        while (i < A.length && j < A.length && j >= i) {
            if (i != j && A[j] - A[i] == B) {
                return 1;
            } else if (A[j] - A[i] < B) {
                j = j + 1;
            } else if (A[j] - A[i] > B) {
                i = i + 1;
                return 0;
            }
        }
        return 0;
    }

       public static void main(String[] args)
       {
           SolutionPairWithGivenDifference solutionPairWithGivenDifference = new SolutionPairWithGivenDifference();
           int[] A = {2,8,10,18,28};
           solutionPairWithGivenDifference.solve(A,10);
       }
}
