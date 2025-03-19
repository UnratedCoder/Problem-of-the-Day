public class geeksforgeeks {

    static int maxProfit(int prices[], int k) {
        // code here
        if (prices.length == 0 || k == 0) {
            return 0;
        }
        int curr[][] = new int[k + 1][2];
        int next[][] = new int[k + 1][2];
        for (int i = prices.length - 1; i >= 0; i--) {
            for (int j = 1; j <= k; j++) {
                curr[j][0] = Math.max(prices[i] + next[j - 1][1], next[j][0]);
                curr[j][1] = Math.max(-prices[i] + next[j][0], next[j][1]);
            }
            for (int j = 0; j <= k; j++) {
                next[j][0] = curr[j][0];
                next[j][1] = curr[j][1];
            }
        }
        return curr[k][1];
    }
}