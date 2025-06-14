public class leetcode {

    // LeetCode Problem
    public int countPoints(String rings) {
        int r[] = new int[10];
        int b[] = new int[10];
        int g[] = new int[10];
        for (int i = 0; i < rings.length(); i += 2) {
            char ch = rings.charAt(i);
            int num = rings.charAt(i + 1) - '0';
            if (ch == 'R') {
                r[num]++;
            } else if (ch == 'G') {
                g[num]++;
            } else {
                b[num]++;
            }
        }
        int count = 0;
        for (int i = 0; i < 10; i++) {
            count += r[i] != 0 && g[i] != 0 && b[i] != 0 ? 1 : 0;
        }
        return count;
    }
}
