public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int power(int base, int expo) {
        int result = 1;
        while (expo > 0) {
            if ((expo & 1) != 0) {
                result *= base;
            }
            base *= base;
            expo >>= 1;
        }
        return result;
    }

    public int countValid(int n, int[] arr) {
        // code here
        boolean good[] = new boolean[10];
        for (int d : arr) {
            good[d] = true;
        }
        int f = 0, f0 = 0;
        for (int d = 0; d < 10; d++) {
            if (!good[d]) {
                f++;
                if (d != 0) {
                    f0++;
                }
            }
        }
        int total = 9 * power(10, n - 1);
        int notAllowed = (n == 1) ? f0 : f0 * power(f, n - 1);
        return total - notAllowed;
    }
}