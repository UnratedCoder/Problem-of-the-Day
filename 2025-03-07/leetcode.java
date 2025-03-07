import java.util.*;

public class leetcode {

    public int[] closestPrimes(int left, int right) {
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        boolean[] track = new boolean[right + 1];
        Arrays.fill(track, true);
        track[0] = false;
        track[1] = false;
        for (int i = 2; i <= Math.sqrt(right); i++) {
            if (track[i]) {
                for (int j = i * i; j <= right; j += i) {
                    track[j] = false;
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = left; i < right + 1; i++)
            if (track[i]) {
                list.add(i);
            }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size() - 1; i++) {
            int temp = list.get(i + 1) - list.get(i);
            if (temp < min) {
                min = temp;
                ans[0] = list.get(i);
                ans[1] = list.get(i + 1);
            }
        }
        return ans;
    }
}
