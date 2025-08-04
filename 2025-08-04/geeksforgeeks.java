public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int kadaneAlgo(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int el : arr) {
            currSum += el;
            if (maxSum < currSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }

    public int maxRectSum(int mat[][]) {
        // code here
        int maxSum = Integer.MIN_VALUE;
        int arr[] = new int[mat.length];
        for (int left = 0; left < mat[0].length; left++) {
            for (int i = 0; i < mat.length; i++) {
                arr[i] = 0;
            }
            for (int right = left; right < mat[0].length; right++) {
                for (int i = 0; i < mat.length; i++) {
                    arr[i] += mat[i][right];
                }
                int sum = kadaneAlgo(arr);
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}