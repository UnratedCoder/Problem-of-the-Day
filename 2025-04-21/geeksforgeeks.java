public class geeksforgeeks {

    // GfG 160 - 160 Days of Problem Solving (Day 158)
    int missingNum(int arr[]) {
        // code here
        long n = arr.length + 1;
        long sumOfN = n * (n + 1) / 2;
        long sum = 0;
        for (int el : arr) {
            sum += el;
        }
        return (int) (sumOfN - sum);
    }
}