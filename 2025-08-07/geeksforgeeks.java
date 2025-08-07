public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    private int toSecond(String time) {
        int h = Integer.parseInt(time.substring(0, 2));
        int m = Integer.parseInt(time.substring(3, 5));
        int s = Integer.parseInt(time.substring(6, 8));
        return h * 3600 + m * 60 + s;
    }

    public int minDifference(String[] arr) {
        // code here
        int totalSecond = 24 * 3600;
        boolean seen[] = new boolean[totalSecond];
        for (int i = 0; i < arr.length; i++) {
            int sec = toSecond(arr[i]);
            if (seen[sec]) {
                return 0;
            }
            seen[sec] = true;
        }
        int first = -1, last = -1, prev = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < totalSecond; i++) {
            if (!seen[i]) {
                continue;
            }
            if (prev != -1) {
                min = Math.min(min, i - prev);
            } else {
                first = i;
            }
            prev = i;
            last = i;
        }
        int wrap = first + totalSecond - last;
        min = Math.min(min, wrap);
        return min;
    }
}