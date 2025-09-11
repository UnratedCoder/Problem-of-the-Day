public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int minJumps(int[] arr) {
        // code here
        if (arr[0] == 0) {
            return -1;
        }
        int maxReach = 0;
        int currReach = 0;
        int jump = 0;
        for (int i = 0; i < arr.length; i++) {
            maxReach = Math.max(maxReach, i + arr[i]);
            if (maxReach >= arr.length - 1) {
                return jump + 1;
            }
            if (i == currReach) {
                if (i == maxReach) {
                    return -1;
                } else {
                    jump++;
                    currReach = maxReach;
                }
            }
        }
        return -1;
    }
}