import java.util.HashSet;
import java.util.Set;

class SolutionTravelPlan {
    int[] costs;
    Integer[] memo;
    Set<Integer> dayset;

    public int mincostTickets(int[] days, int[] costs) {
        this.costs = costs;
        memo = new Integer[366];
        dayset = new HashSet();
        for (int d: days) dayset.add(d);

        return dp(1);
    }

    public int dp(int i) {
        if (i > 7)
            return 0;
        if (memo[i] != null)
            return memo[i];

        int ans;
        if (dayset.contains(i)) {
            ans = Math.min(dp(i+1) + costs[0],
                               dp(i+4) + costs[1]);
          //  ans = Math.min(ans, dp(i+30) + costs[2]);
        } else {
            ans = dp(i+1);
        }

        memo[i] = ans;
        return ans;
    }

    public static void main(String[] args) {
        SolutionTravelPlan solutionTravelPlan = new SolutionTravelPlan();
        System.out.println(""+solutionTravelPlan.mincostTickets(new int[]{2,5}, new int[]{3, 7}));

    }

}