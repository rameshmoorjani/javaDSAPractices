import java.util.ArrayList;
import java.util.List;

public class FindContiguousURLHistory {

 public static List findContiguousHistory(String user1[], String user2[]) {

    List result = new ArrayList<>();
    if (user1.length == 0 || user2.length == 0) {
     return result;
    }
    int[][] dp = new int[user1.length + 1][user2.length + 1];
    int max = Integer.MIN_VALUE;
    int endIndex = -1;
    for (int i = user1.length - 1; i >= 0; i--) {
     for (int j = user2.length - 1; j >= 0; j--) {
      if (user1[i].equals(user2[j])) {
       dp[i][j] = dp[i + 1][j + 1] + 1;
       if (max < dp[i][j]) {
        max = dp[i][j];
        endIndex = j;
       }
       break;
      }
     }
    }
    if (max == Integer.MIN_VALUE) {
     return result;
    }
    for (int i = endIndex; i < endIndex + max; i++) {
     result.add(user2[i]);
    }

    return result;
   }

}