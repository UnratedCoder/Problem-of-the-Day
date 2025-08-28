public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int maxOnes(int arr[], int k) {
        // code here
        int result = 0, count = 0;
        int start = 0, end = 0;
        while (end < arr.length) {
            if (arr[end] == 0) {
                count++;
            }
            while (count > k) {
                if (arr[start] == 0) {
                    count--;
                }
                start++;
            }
            result = Math.max(result, end - start + 1);
            end++;
        }
        return result;
    }
}