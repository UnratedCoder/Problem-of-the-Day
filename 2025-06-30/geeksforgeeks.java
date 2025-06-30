public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public boolean isPossible(int arr[], int k, int w, int maxHeight) {
        int water[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                water[i] = water[i - 1];
            }
            int currHeight = arr[i] + water[i];
            if (i >= w) {
                currHeight -= water[i - w];
            }
            if (currHeight < maxHeight) {
                int add = maxHeight - currHeight;
                water[i] += add;
                k -= add;
            }
            if (k < 0) {
                return false;
            }
        }
        return true;
    }

    public int maxMinHeight(int[] arr, int k, int w) {
        // code here
        int low = arr[0];
        for (int i = 1; i < arr.length; i++) {
            low = Math.min(low, arr[i]);
        }
        int high = low + k;
        int result = low;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(arr, k, w, mid)) {
                result = Math.max(result, mid);
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
}