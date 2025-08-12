import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public ArrayList<Integer> minMaxCandy(int[] prices, int k) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(prices);
        int n = prices.length;
        int minCost = 0;
        for (int i = 0; i < n; i++) {
            minCost += prices[i];
            n -= k;
        }
        int idx = -1;
        int maxCost = 0;
        for (int i = prices.length - 1; i > idx; i--) {
            maxCost += prices[i];
            idx += k;
        }
        result.add(minCost);
        result.add(maxCost);
        return result;
    }
}