public class geeksforgeeks {

    public int startStation(int[] gas, int[] cost) {
        // Your code here
        int total = 0;
        int curr = 0;
        int si = 0;
        for (int i = 0; i < gas.length; i++) {
            curr += gas[i] - cost[i];
            total += gas[i] - cost[i];
            if (curr < 0) {
                curr = 0;
                si = i + 1;
            }

        }
        if (total < 0) {
            return -1;
        } else {
            return si;
        }
    }
}