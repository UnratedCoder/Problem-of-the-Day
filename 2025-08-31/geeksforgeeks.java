public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int maxWater(int arr[]) {
        // Code Here
        int maxWater = 0;
        int si = 0;
        int ei = arr.length - 1;
        while (si != ei) {
            int height = Math.min(arr[si], arr[ei]);
            int width = ei - si;
            int currWater = height * width;
            maxWater = Math.max(currWater, maxWater);
            if (arr[si] < arr[ei]) {
                si++;
            } else {
                ei--;
            }
        }
        return maxWater;
    }
}