public class geeksforgeeks {

    // GfG 160 - 160 Days of Problem Solving (Day 160)
    public int[] singleNum(int[] arr) {
        // Code here
        int ans[] = new int[2];
        int xor = 0;
        for (int el : arr) {
            xor ^= el;
        }
        xor &= -xor;
        for (int el : arr) {
            if ((el & xor) == 0) {
                ans[0] ^= el;
            } else {
                ans[1] ^= el;
            }
        }
        if (ans[0] > ans[1]) {
            int temp = ans[0];
            ans[0] = ans[1];
            ans[1] = temp;
        }
        return ans;
    }
}