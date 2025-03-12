public class geeksforgeeks {

    static int minCostClimbingStairs(int[] cost) {
        // Write your code here
        if (cost.length == 1) {
            return cost[0];
        }
        int prev2 = cost[0];
        int prev1 = cost[1];
        for (int i = 2; i < cost.length; i++) {
            int temp = cost[i] + Math.min(prev1, prev2);
            prev2 = prev1;
            prev1 = temp;
        }
        return Math.min(prev1, prev2);
    }
}