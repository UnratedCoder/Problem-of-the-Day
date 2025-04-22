public class geeksforgeeks {

    // GfG 160 - 160 Days of Problem Solving (Day 159)
    public int findUnique(int[] arr) {
        // code here
        int xor = 0;
        for (int el : arr) {
            xor ^= el;
        }
        return xor;
    }
}