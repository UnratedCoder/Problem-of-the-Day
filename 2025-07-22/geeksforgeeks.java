public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int missingNumber(int[] arr) {
        // code here
        int n = arr.length;
        boolean containOne = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                containOne = true;
            }
            if (arr[i] <= 0 || arr[i] > n) {
                arr[i] = 1;
            }
        }
        if (!containOne)
            return 1;
        for (int i = 0; i < n; i++) {
            int idx = Math.abs(arr[i]) - 1;
            if (arr[idx] > 0) {
                arr[idx] = -arr[idx];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0)
                return i + 1;
        }
        return n + 1;
    }
}