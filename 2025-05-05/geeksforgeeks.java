public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int findTarget(int arr[], int target) {
        // code here
        int si = 0;
        int ei = arr.length - 1;
        while (ei >= si) {
            int mid = si + (ei - si) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (mid > si && arr[mid - 1] == target) {
                return mid - 1;
            }
            if (mid < ei && arr[mid + 1] == target) {
                return mid + 1;
            }
            if (arr[mid] > target) {
                ei = mid - 2;
            } else {
                si = mid + 2;
            }
        }
        return -1;
    }
}