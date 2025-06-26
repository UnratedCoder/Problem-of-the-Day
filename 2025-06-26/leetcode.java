import java.util.*;

public class leetcode {

    // LeetCode Problem
    public int minimumSum(int num) {
        int digit[] = new int[4];
        for (int i = 0; i < 4; i++) {
            digit[i] = num % 10;
            num /= 10;
        }
        Arrays.sort(digit);
        int part1 = digit[0] * 10 + digit[2];
        int part2 = digit[1] * 10 + digit[3];
        return part1 + part2;
    }
}
