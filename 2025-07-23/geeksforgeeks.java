public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int subarraySum(int[] arr) {
        // code here
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += (arr[i] * (i + 1) * (arr.length - i));
        }
        return result;
    }
}