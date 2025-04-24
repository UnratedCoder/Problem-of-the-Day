public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int getSingle(int[] arr) {
        // code here
        int ans = 0;
        int x;
        int sum;
        for (int i = 0; i < 32; i++) {
            sum = 0;
            x = (1 << i);
            for (int el : arr) {
                if ((el & x) != 0) {
                    sum++;
                }
            }
            if (sum % 3 != 0) {
                ans |= x;
            }
        }
        return ans;
    }
}