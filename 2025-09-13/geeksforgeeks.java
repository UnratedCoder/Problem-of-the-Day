import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public static int minCost(int n, int m, int[] x, int[] y) {
        // code here
        int h = 0, v = 0, hp = 1, vp = 1, cost = 0;
        Arrays.sort(x);
        Arrays.sort(y);
        for (int i = 0; i < x.length / 2; i++) {
            int temp = x[i];
            x[i] = x[x.length - 1 - i];
            x[x.length - 1 - i] = temp;
        }
        for (int i = 0; i < y.length / 2; i++) {
            int temp = y[i];
            y[i] = y[y.length - 1 - i];
            y[y.length - 1 - i] = temp;
        }
        while (v < x.length && h < y.length) {
            if (y[h] <= x[v]) {
                cost += x[v] * hp;
                v++;
                vp++;
            } else {
                cost += y[h] * vp;
                h++;
                hp++;
            }
        }
        while (v < x.length) {
            cost += x[v] * hp;
            v++;
            vp++;
        }
        while (h < y.length) {
            cost += y[h] * vp;
            h++;
            hp++;
        }
        return cost;
    }
}