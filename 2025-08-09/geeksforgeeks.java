public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    int[] zFunction(String s) {
        int n = s.length();
        int z[] = new int[n];
        int l = 0, r = 0;
        for (int i = 1; i < n; ++i) {
            if (i <= r) {
                z[i] = Math.min(r - i + 1, z[i - l]);
            }
            while (i + z[i] < n && s.charAt(z[i]) == s.charAt(i + z[i])) {
                z[i]++;
            }
            if (i + z[i] - 1 > r) {
                l = i;
                r = i + z[i] - 1;
            }
        }
        return z;
    }

    int getLongestPrefix(String s) {
        // code here
        int n = s.length();
        int z[] = zFunction(s);
        for (int i = n - 1; i > 0; i--) {
            if (z[i] == n - i) {
                return i;
            }
        }
        return -1;
    }
}