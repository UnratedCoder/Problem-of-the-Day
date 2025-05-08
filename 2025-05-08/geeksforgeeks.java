public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int findMissing(int[] arr) {
        // code here
        int n = arr.length;
        int diff = (arr[1] - arr[0] == arr[n - 1] - arr[n - 2]) ? arr[1] - arr[0]
                : ((arr[1] - arr[0] == (arr[n - 1] - arr[0]) / n) ? arr[1] - arr[0] : arr[n - 1] - arr[n - 2]);
        if (diff == 0) {
            return arr[0];
        }
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ((arr[mid] - arr[0]) / diff == mid) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return arr[high] + diff;
    }
}