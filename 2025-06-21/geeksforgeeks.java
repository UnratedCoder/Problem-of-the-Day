public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int catchThieves(char[] arr, int k) {
        // code here
        int count = 0;
        int i = 0, j = 0;
        while (i < arr.length && j < arr.length) {
            while (i < arr.length && arr[i] != 'P') {
                i++;
            }
            while (j < arr.length && arr[j] != 'T') {
                j++;
            }
            if (i < arr.length && j < arr.length && Math.abs(i - j) <= k) {
                count++;
                i++;
                j++;
            } else if (j < arr.length && j < i) {
                j++;
            } else if (i < arr.length && i < j) {
                i++;
            }
        }
        return count;
    }
}