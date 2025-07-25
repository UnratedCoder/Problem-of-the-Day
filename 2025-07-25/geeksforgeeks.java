public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int maxCircularSum(int arr[]) {
        // code here
        int totalSum = 0;
        int currMaxSum = 0, currMinSum = 0;
        int maxSum = arr[0], minSum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            currMaxSum = Math.max(currMaxSum + arr[i], arr[i]);
            maxSum = Math.max(maxSum, currMaxSum);
            currMinSum = Math.min(currMinSum + arr[i], arr[i]);
            minSum = Math.min(minSum, currMinSum);
            totalSum += arr[i];
        }
        int NonCircularSum = maxSum;
        int circularSum = totalSum - minSum;
        if (minSum == totalSum) {
            return NonCircularSum;
        }
        return Math.max(NonCircularSum, circularSum);
    }
}