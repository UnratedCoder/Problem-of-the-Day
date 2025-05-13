public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int nCr(int n, int r) {
        // code here
        double sum = 1;
        for (int i = 1; i <= r; i++) {
            sum = sum * (n - r + i) / i;
        }
        return (int) sum;
    }
}