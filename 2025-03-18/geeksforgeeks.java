public class geeksforgeeks {

    static boolean equalPartition(int arr[]) {
        // code here
        int sum = 0;
        for (int el : arr) {
            sum += el;
        }
        if (sum % 2 != 0) {
            return false;
        }
        sum /= 2;
        boolean prev[] = new boolean[sum + 1];
        prev[0] = true;
        boolean curr[] = new boolean[sum + 1];
        for (int i = 1; i <= arr.length; i++) {
            for (int j = 0; j <= sum; j++) {
                if (j < arr[i - 1]) {
                    curr[j] = prev[j];
                } else {
                    curr[j] = prev[j] || prev[j - arr[i - 1]];
                }
            }
            for (int j = 0; j <= sum; j++) {
                prev[j] = curr[j];
            }
        }
        return prev[sum];
    }
}