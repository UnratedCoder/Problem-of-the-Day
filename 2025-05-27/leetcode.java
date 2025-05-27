public class leetcode {

    // LeetCode Problem (Problem of the Day)
    public int differenceOfSums(int n, int m) {
        int divByM = 0;
        int divByNonM = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                divByM += i;
            } else {
                divByNonM += i;
            }
        }
        return divByNonM - divByM;
    }
}
