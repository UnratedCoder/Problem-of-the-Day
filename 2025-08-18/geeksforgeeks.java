public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int hIndex(int[] citations) {
        // code here
        int n = citations.length;
        int[] count = new int[n + 1];
        for (int citation : citations) {
            if (citation > n) {
                count[n]++;
            } else {
                count[citation]++;
            }
        }
        int total = 0;
        for (int i = n; i >= 0; i--) {
            total += count[i];
            if (total >= i) {
                return i;
            }
        }
        return 0;
    }
}