import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class leetcode {

    // Problem 1
    public int sum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public boolean hasSameDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() != 2) {
            String temp = "";
            for (int i = 0; i < sb.length() - 1; i++) {
                int curr = Integer.parseInt(sb.substring(i, i + 2));
                int sum = sum(curr) % 10;
                temp += Integer.toString(sum);
            }
            sb = new StringBuilder(temp);
        }
        if (sb.charAt(0) == sb.charAt(1)) {
            return true;
        }
        return false;
    }

    // Problem 2
    public void reverse(int arr[]) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public long maxSum(int[][] grid, int[] limits, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < grid.length; i++) {
            Arrays.sort(grid[i]);
            reverse(grid[i]);
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < limits[i]; j++) {
                pq.add(grid[i][j]);
            }
        }
        long ans = 0;
        while (k-- > 0) {
            ans += pq.remove();
        }
        return ans;
    }
}
