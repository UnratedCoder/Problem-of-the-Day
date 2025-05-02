public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int findMaximum(int[] arr) {
        // code here
        int n = arr.length;
        if (n == 1 || arr[0] > arr[1]) {
            return arr[0];
        }
        if (arr[n - 1] > arr[n - 2]) {
            return arr[n - 1];
        }
        int si = 1;
        int ei = n - 2;
        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (arr[mid] >= arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return arr[mid];
            }
            if (arr[mid] < arr[mid + 1]) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }
        return arr[ei];
    }
}