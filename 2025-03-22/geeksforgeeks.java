public class geeksforgeeks {

    int maxValueTabulation(int si, int ei, int arr[]) {
        int prev = Math.max(arr[si], arr[si + 1]);
        int prev2 = arr[si];
        for (int i = si + 2; i <= ei; i++) {
            int takeVal = arr[i] + prev2;
            int takeNoVal = prev;
            int currVal = Math.max(takeVal, takeNoVal);
            prev2 = prev;
            prev = currVal;
        }
        return prev;
    }

    int maxValue(int[] arr) {
        // code here
        if (arr.length == 0) {
            return 0;
        }
        if (arr.length == 1) {
            return arr[0];
        }
        int ans = 0;
        ans = Math.max(ans, maxValueTabulation(0, arr.length - 2, arr));
        ans = Math.max(ans, maxValueTabulation(1, arr.length - 1, arr));
        return ans;
    }
}