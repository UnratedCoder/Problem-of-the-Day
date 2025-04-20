public class geeksforgeeks {

    // GfG 160 - 160 Days of Problem Solving (Day 157)
    public int findDuplicate(int[] arr) {
        // code here
        long num = (long) (arr.length - 1) * (arr.length - 1 + 1) / 2;
        long sum = 0;
        for (int el : arr) {
            sum += el;
        }
        return (int) (sum - num);
    }
}