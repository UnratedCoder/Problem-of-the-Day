public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    int[] printKClosest(int[] arr, int k, int x) {
        // code here
        int n = arr.length;
        int si = 0;
        int ei = n - 1;
        int position = -1;
        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (arr[mid] < x) {
                position = mid;
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }
        si = position;
        ei = position + 1;
        if (ei < n && arr[ei] == x) {
            ei++;
        }
        int ans[] = new int[k];
        int count = 0;
        while (si >= 0 && ei < n && count < k) {
            int diffLeft = Math.abs(arr[si] - x);
            int diffRight = Math.abs(arr[ei] - x);
            if (diffLeft < diffRight) {
                ans[count++] = arr[si];
                si--;
            } else {
                ans[count++] = arr[ei];
                ei++;
            }
        }
        while (si >= 0 && count < k) {
            ans[count++] = arr[si];
            si--;
        }
        while (ei < n && count < k) {
            ans[count++] = arr[ei];
            ei++;
        }
        return ans;
    }
}