public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int countConsec(int n) {
        // code here
        int prev0 = 1, prev1 = 1;
        for (int i = 2; i <= n; i++) {
            int curr0 = prev0 + prev1;
            int curr1 = prev0;
            prev0 = curr0;
            prev1 = curr1;
        }
        int total = 1 << n;
        int noConsecutive = prev0 + prev1;
        return total - noConsecutive;
    }
}