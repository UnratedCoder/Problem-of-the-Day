public class geeksforgeeks {

    public int findMaxSum(int arr[]) {
        // code here
        if (arr.length == 0) {
            return 0;
        }
        if (arr.length == 1) {
            return arr[0];
        }
        int ans = 0;
        int last = arr[0];
        int secLast = 0;
        for (int i = 1; i < arr.length; i++) {
            ans = Math.max(arr[i] + secLast, last);
            secLast = last;
            last = ans;
        }
        return ans;
    }
}